/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.*;
import pojo.LopHoc;
import pojo.SinhVien;
import util.HibernateUtil;

/**
 *
 * @author HIEU
 */
public class SinhVienDAO {

    public static List<SinhVien> layDanhSachSinhVien() {
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static List<SinhVien> GetByLopId(Integer LopHocId) {
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv where sv.LopHoc.Id = " + LopHocId;
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static List<SinhVien> GetByMSSV(String MSSV) {
        List<SinhVien> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from SinhVien sv where sv.MSSV = " + MSSV;
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static SinhVien layThongTinhSinhVien(Integer Id) {
        SinhVien sv = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            sv = (SinhVien) session.get(SinhVien.class,
                    Id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }

    public static boolean themSinhVien(SinhVien sv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.GetByMSSV(sv.getMSSV()).size() > 0) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}
