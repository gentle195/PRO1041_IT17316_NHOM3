/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadonduan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinhq
 */
public class HoaDonCTRespoointsitory {

    public List<HoaDonCTViewModel> getall() {
        List<HoaDonCTViewModel> hoaDonDuANs = new ArrayList<>();
        try {
            String sql = "select IdHoaDonCT,SoLuong,DonGia from ChiTietHoaDon";
            Connection cn = DBcontext1.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hoaDonDuANs.add(new HoaDonCTViewModel(rs.getString(1), rs.getInt(2), rs.getBigDecimal(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoaDonDuANs;
    }

    public void add(HoaDonCT hd) {
        try {
            String sql = "insert into ChiTietHoaDon (SoLuong,DonGia) values(?,?)";
            Connection cn = DBcontext1.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, hd.getSoLuong());
            pstm.setBigDecimal(2, hd.getDonGia());

            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            String sql = " delete from ChiTietHoaDon where IdHoaDonCT =? ";
            Connection cn = DBcontext1.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, ma);
            pstm.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void update(HoaDonCT hd) {
        try {
            String sql = "";
            Connection cn = DBcontext1.getConnection();
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setInt(1, hd.getSoLuong());
            pstm.setBigDecimal(2, hd.getDonGia());

            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
