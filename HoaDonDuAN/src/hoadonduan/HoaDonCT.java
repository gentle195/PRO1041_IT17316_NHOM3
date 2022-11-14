/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadonduan;

import java.math.BigDecimal;

/**
 *
 * @author dinhq
 */
public class HoaDonCT {

    private String idHdCt, idHd, idChiTietSp, idBh;
    private int soLuong;
    private BigDecimal donGia;

    public HoaDonCT() {
    }

    public HoaDonCT(String idHdCt, String idHd, String idChiTietSp, String idBh, int soLuong, BigDecimal donGia) {
        this.idHdCt = idHdCt;
        this.idHd = idHd;
        this.idChiTietSp = idChiTietSp;
        this.idBh = idBh;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHdCt() {
        return idHdCt;
    }

    public void setIdHdCt(String idHdCt) {
        this.idHdCt = idHdCt;
    }

    public String getIdHd() {
        return idHd;
    }

    public void setIdHd(String idHd) {
        this.idHd = idHd;
    }

    public String getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(String idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    public String getIdBh() {
        return idBh;
    }

    public void setIdBh(String idBh) {
        this.idBh = idBh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }
    
    
}
