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
public class HoaDonServiceimpl implements HoaDonService {

    private final HoaDonRespoointsitory hoadonrs;

    public HoaDonServiceimpl() {
        hoadonrs = new HoaDonRespoointsitory();
    }

    @Override
    public List<HoaDonViewModel> getall() {
        return hoadonrs.getall();
    }

    @Override
    public HoaDonDuAN add(HoaDonDuAN hd) {
        hoadonrs.add(hd);
        return hd;
    }

    @Override
    public String delete(String ma) {
        hoadonrs.delete(ma);
        return ma;
    }

    @Override
    public HoaDonDuAN update(HoaDonDuAN hd) {
        hoadonrs.update(hd);
        return hd;
    }

}
