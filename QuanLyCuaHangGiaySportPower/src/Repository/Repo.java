/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import db.DBContect;
import java.sql.*;
import Domain.ChucVu;
import Domain.NhanVien;
import ViewModel.ChucVu_ViewM;
import ViewModel.NhanVien_ViewM;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Repo {

    Connection con = DBContect.getDatabaseConnection();

    public List<ChucVu_ViewM> bangchucvu() {
        List<ChucVu_ViewM> list = new ArrayList<>();
        String s = "select * from ChucVu order by MaCV asc";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {
                list.add(new ChucVu_ViewM(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4))
                );
            }
            rs.close();
        } catch (SQLException ex) {

            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<NhanVien_ViewM> bangNV() {
        List<NhanVien_ViewM> list = new ArrayList<>();
        String s = "select IdNV,MaNV,HoTenNV,GioiTinh,NgaySinh,DiaChi,Sdt,TenCV from NhanVien left join ChucVu on NhanVien.IdCV=ChucVu.IdCV order by MaNV asc";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(s);
            while (rs.next()) {

                NhanVien_ViewM nv = new NhanVien_ViewM();
                nv.setId(rs.getString("IdNV"));
                nv.setMa(rs.getString("MaNV"));
                nv.setHoten(rs.getString("HoTenNV"));
                nv.setGioiTing(rs.getString("GioiTinh"));
                nv.setNgaySinh(rs.getString("NgaySinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSDT(rs.getString("Sdt"));
                nv.setChucVu(rs.getString("TenCV"));
                list.add(nv);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    public String XoaNV(String ma) {
        try {
            String delete = "declare  @idnv UNIQUEIDENTIFIER\n"
                    + "set @idnv = (select IdNV from NhanVien where MaNV=?)\n"
                    + "update  HoaDon set IdNV=null where IdNV=@idnv\n"
                    + "delete from NhanVien  where IdNV=@idnv";
            PreparedStatement ps = con.prepareStatement(delete);
            ps.setObject(1, ma);
            ps.executeUpdate();

            return "X??a th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "X??a th???t b???i";
        }

    }

    public String SuaNV(NhanVien v) {
        try {
            String insert = "update NhanVien set MaNV=?,HoTenNV=?,GioiTinh=?,NgaySinh=?,DiaChi=?,Sdt=?,IdCV=? where IdNV=?";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getHoten());
            ps.setObject(3, v.getGioiTing());
            ps.setObject(4, v.getNgaySinh());
            ps.setObject(5, v.getDiaChi());
            ps.setObject(6, v.getSDT());
            ps.setObject(7, v.getIdCV());
            ps.setObject(8, v.getId());
            ps.executeUpdate();
            return "S???a th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "S???a th???t b???i";
        }
    }

    public String ThemNV(NhanVien v) {
        try {
            String insert = "insert into NhanVien(MaNV,HoTenNV,GioiTinh,NgaySinh,DiaChi,Sdt,IdCV) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getHoten());
            ps.setObject(3, v.getGioiTing());
            ps.setObject(4, v.getNgaySinh());
            ps.setObject(5, v.getDiaChi());
            ps.setObject(6, v.getSDT());
            ps.setObject(7, v.getIdCV());
            ps.execute();
            return "Th??m th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "Th??m th???t b???i";
        }
    }
    public String Xoacv(String ma) {
        try {
            String delete = "declare  @idcv UNIQUEIDENTIFIER\n"
                    + "set @idcv = (select IdCV from ChucVu where MaCV=?)\n"
                    + "update  NhanVien set IdCV=null where IdCV=@idcv\n"
                    + "delete from ChucVu  where IdCV=@idcv";
            PreparedStatement ps = con.prepareStatement(delete);
            ps.setObject(1, ma);

            ps.executeUpdate();

            return "X??a th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "X??a th???t b???i";
        }

    }

    public String Suacv(ChucVu v) {
        try {
            String insert = "update ChucVu set MaCV=?,TenCV=?,Mota=? where Id=?";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getTen());
            ps.setObject(3, v.getMota());
            ps.setObject(4, v.getId());
            ps.executeUpdate();
            return "S???a th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "S???a th???t b???i";
        }
    }

    public String Themcv(ChucVu v) {
        try {
            String insert = "insert into ChucVu(MaCV,TenCV,Mota) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setObject(1, v.getMa());
            ps.setObject(2, v.getTen());
            ps.setObject(3, v.getMota());
            ps.executeUpdate();
            return "Th??m th??nh c??ng";
        } catch (SQLException ex) {
            Logger.getLogger(Repo.class.getName()).log(Level.SEVERE, null, ex);
            return "Th??m th???t b???i";
        }
    }
    
}
