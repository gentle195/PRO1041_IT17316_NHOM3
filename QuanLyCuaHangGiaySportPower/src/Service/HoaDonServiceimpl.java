/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Domain.HoaDon;
import Repository.HoaDonRepo;
import ViewModel.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author dinhq
 */
public class HoaDonServiceimpl implements HoaDonService {

    private final HoaDonRepo hoadonrs;

    public HoaDonServiceimpl() {
        hoadonrs = new HoaDonRepo();
    }

    @Override
    public List<HoaDonViewModel> getall() {
        return hoadonrs.getall();
    }

    @Override
    public HoaDon add(HoaDon hd) {
        hoadonrs.add(hd);
        return hd;
    }

    @Override
    public String delete(String ma) {
        hoadonrs.delete(ma);
        return ma;
    }

    @Override
    public HoaDon update(HoaDon hd) {
        hoadonrs.update(hd);
        return hd;
    }

}
