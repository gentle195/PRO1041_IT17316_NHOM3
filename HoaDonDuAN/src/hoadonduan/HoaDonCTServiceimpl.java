/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoadonduan;

import java.util.List;

/**
 *
 * @author dinhq
 */
public class HoaDonCTServiceimpl implements HoaDonCTService {

    private final HoaDonCTRespoointsitory hoadonrs;

    public HoaDonCTServiceimpl() {
        hoadonrs = new HoaDonCTRespoointsitory();
    }

    @Override
    public List<HoaDonCTViewModel> getall() {
        return hoadonrs.getall();
    }

    @Override
    public HoaDonCT add(HoaDonCT hd) {
        hoadonrs.add(hd);
        return hd;
    }

    @Override
    public String delete(String ma) {
        hoadonrs.delete(ma);
        return ma;
    }

    @Override
    public HoaDonCT update(HoaDonCT hd) {
        hoadonrs.update(hd);
        return hd;
    }

}
