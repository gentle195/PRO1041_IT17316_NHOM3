/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package hoadonduan;

import java.util.List;

/**
 *
 * @author dinhq
 */
public interface HoaDonService {

    List<HoaDonViewModel> getall();

    HoaDonDuAN add(HoaDonDuAN hd);

    String delete(String ma);

    HoaDonDuAN update(HoaDonDuAN hd);
}
