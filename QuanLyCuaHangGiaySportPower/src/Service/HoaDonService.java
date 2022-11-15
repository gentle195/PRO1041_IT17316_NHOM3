/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Domain.HoaDon;
import ViewModel.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author dinhq
 */
public interface HoaDonService {

    List<HoaDonViewModel> getall();

    HoaDon add(HoaDon hd);

    String delete(String ma);

    HoaDon update(HoaDon hd);
}
