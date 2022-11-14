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
public class HoaDonCTViewModel {

    private String idHdCt;
    private int soLuong;
    private BigDecimal donGia;

    public HoaDonCTViewModel() {
    }

    public HoaDonCTViewModel(String idHdCt, int soLuong, BigDecimal donGia) {
        this.idHdCt = idHdCt;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHdCt() {
        return idHdCt;
    }

    public void setIdHdCt(String idHdCt) {
        this.idHdCt = idHdCt;
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
