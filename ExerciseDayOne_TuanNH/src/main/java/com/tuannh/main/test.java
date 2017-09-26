package com.tuannh.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tuannh.entities.Course;
import com.tuannh.entities.Student;
import com.tuannh.utils.DBUtils;

public class test {
	
	
	private static boolean themCourse(Course course) {
        boolean check;
        try {
        	
            Session session = DBUtils.getSessionFactory().getCurrentSession();
            Transaction transaction = session.beginTransaction();
            session.save(course);
            transaction.commit();
            check = true;
        } catch (HibernateException h) {
            check = false;
        }
        return check;
    }
 
//  cập nhật sinh viên
 
//    private static boolean capNhatSinhVien(SinhVien sinhVien) {
//        boolean check;
//        try {
//            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//            Transaction transaction = session.beginTransaction();
//            session.update(sinhVien);
//            transaction.commit();
//            check = true;
//        } catch (HibernateException h) {
//            check = false;
//        }
//        return check;
//    }
//    tim kiếm sinh viên theo tên
 
//    private static SinhVien timSinhVien(String tenSinhVien) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction transaction = session.beginTransaction();
//        String hql = "from sinhvien where tenSinhVien= :tenSinhVien";
//        Query query = session.createQuery(hql);
//        query.setString("tenSinhVien", tenSinhVien);
//        SinhVien sinhVien = (SinhVien) query.uniqueResult();
//        transaction.commit();
//        return sinhVien;
//    }
 
    public static void main(String[] args) {

        Set<Student> kh = new HashSet<Student>();
        kh.add(new Student("viet",19));
        kh.add(new Student("tien",20));
 
        Course sv = new Course();
        sv.setNameCourse("C");
        sv.setListStudent(kh);
////        nếu tên sinh viên tồn tại thì cập nhật, không thì thêm mới
//        if (timSinhVien(sv.getTenSinhVien()) != null) {
//            capNhatSinhVien(sv);
//            System.out.println("cập nhật thành công!");
//        } else {
 
            themCourse(sv);
            System.out.println("thêm thành công!");
//        }
        
    }
}
