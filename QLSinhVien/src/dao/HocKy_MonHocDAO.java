/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import pojo.HocKy_MonHoc;
import util.HibernateUtil;

/**
 *
 * @author hieu
 */
public class HocKy_MonHocDAO {
    public static List<HocKy_MonHoc> GetAll() {
        List<HocKy_MonHoc> ds = null;
        Session session = HibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select p from HocKy_MonHoc p";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
}
