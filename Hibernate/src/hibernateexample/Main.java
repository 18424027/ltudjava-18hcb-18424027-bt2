/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import dao.SinhVienDAO;
import java.util.List;
import pojo.SinhVien;

/**
 *
 * @author HIEU
 */
public class Main {

    public static void main(String[] args) {
//<editor-fold defaultstate="collapsed" desc="1. Lấy danh sách sinh viên ">
        List<SinhVien> ds = SinhVienDAO.layDanhSachSinhVien();
        for (int i = 0; i < ds.size(); i++) {
            SinhVien sv = ds.get(i);
            System.out.println("MSSV: " + sv.getMSSV());
            System.out.println("Họ và tên: " + sv.getHoTen());
            System.out.println("Gới tính: " + sv.getGioiTinh());
            System.out.println("CMND: " + sv.getCMND());
        }
//</editor-fold>
    }
}
