/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import java.sql.*;
import Domain.ChucVu;
import Domain.NhanVien;
import ViewModel.ChucVu_ViewM;
import ViewModel.NhanVien_ViewM;
import java.util.List;
/**
 *
 * @author admin
 */
public interface Inter {
    List<ChucVu_ViewM> bangchucvu();
    List<NhanVien_ViewM> bangNV();
    ChucVu Themcv(ChucVu v);
    ChucVu Suacv(ChucVu v);
    String Xoacv(String ma);
    NhanVien SuaNV(NhanVien v);
    NhanVien ThemNV(NhanVien v);
    String XoaNV(String ma);
}
