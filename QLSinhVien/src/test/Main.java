/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.*;
import java.util.List;
import pojo.*;

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

//<editor-fold defaultstate="collapsed" desc="1. Lấy danh sách sinh viên ">
        List<LopHoc> dslh = LopHocDAO.layDanhSachLopHoc();
        for (int i = 0; i < ds.size(); i++) {
            LopHoc lh = dslh.get(i);
            System.out.println("MaLop: " + lh.getMaLop());
        }
        
        List<PhucKhao> dspk = PhucKhaoDAO.GetAll();
        for (int i = 0; i < ds.size(); i++) {
            PhucKhao pk = dspk.get(i);
            System.out.println("TuNgay: " + pk.getTuNgay());
            System.out.println("DenNgay: " + pk.getDenNgay());
            System.out.println("HocKy: " + pk.getHocKyId());
        }
        
        List<HocKy> dshk = HocKyDAO.GetAll();
        for (int i = 0; i < ds.size(); i++) {
            HocKy hk = dshk.get(i);
            System.out.println("TenHocKy: " + hk.getTenHocKy());
            System.out.println("TuNgay: " + hk.getTuNgay());
            System.out.println("DenNgay: " + hk.getDenNgay());
            System.out.println("NienKhoa: " + hk.getNienKhoa());
        }
        
        List<MonHoc> dsmh = MonHocDAO.GetAll();
        for (int i = 0; i < ds.size(); i++) {
            MonHoc mh = dsmh.get(i);
            System.out.println("MaMon: " + mh.getMaMon());
            System.out.println("TenMon: " + mh.getTenMon());
        }
        
        List<HocKy_MonHoc> dshkmh = HocKy_MonHocDAO.GetAll();
        for (int i = 0; i < ds.size(); i++) {
            HocKy_MonHoc hkmh = dshkmh.get(i);
            System.out.println("HocKy: " + hkmh.getHocKyId());
            System.out.println("MonHoc: " + hkmh.getMonHocId());
            System.out.println("PhongHoc: " + hkmh.getPhongHoc());
        }
    }
}
