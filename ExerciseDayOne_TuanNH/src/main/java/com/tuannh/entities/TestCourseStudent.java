package com.tuannh.entities;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import junit.extensions.TestSetup;
import junit.framework.*;

public class TestCourseStudent extends TestCase {
	private static Logger logger = Logger.getLogger(TestCourseStudent.class);
	private static ArrayList<Student> listStudent = new ArrayList<Student>();
	private static ArrayList<Course> listCourse = new ArrayList<Course>();

	// test create list Student
	public void testCreateListStudent() {
		listStudent.add(new Student(1, "tuan", 19));
		assertEquals("1 tuan 19", listStudent.get(0).getAllInfomation());
		listStudent.add(new Student(2, "khoa", 19));
		assertEquals("2 khoa 19", listStudent.get(1).getAllInfomation());
		assertEquals(2, listStudent.size());
		logger.info("List Student");
		for (Student student : listStudent) {
			logger.info(student.getAllInfomation());
		}

	}

	// test create list Course
	public void testCreateListCourse() {
		listCourse.add(new Course(1, "Android"));
		assertEquals("1 Android", listCourse.get(0).getAllInfomation());
		listCourse.add(new Course(2, "Java"));
		assertEquals("2 Java", listCourse.get(1).getAllInfomation());
		assertEquals(2, listCourse.size());
		logger.info("List Course");
		for (Course course : listCourse) {
			logger.info(course.getAllInfomation());
		}

	}

	// test creat course for student
	public void testCreateCourseForStudent() {

		ArrayList<Course> listCourseOne = new ArrayList<Course>();
		listCourseOne.add(listCourse.get(0));
		listCourseOne.add(listCourse.get(1));
		listStudent.get(0).setListCourse(listCourseOne);
		assertEquals(2, listStudent.get(0).getListCourse().size());

		ArrayList<Course> listCourseTwo = new ArrayList<Course>();
		listCourseTwo.add(listCourse.get(0));
		listStudent.get(1).setListCourse(listCourseTwo);
		assertEquals(1, listStudent.get(1).getListCourse().size());

		for (Student student : listStudent) {
			logger.info("List course of " + student.getName());
			for (Course course : student.getListCourse()) {
				logger.info(course.getName());
			}
		}
	}

	// test creat student for course
	public void testCreateStudentForCourse() {

		ArrayList<Student> listStudentOne = new ArrayList<Student>();
		ArrayList<Student> listStudentTwo = new ArrayList<Student>();
		for (Student student : listStudent) {
			ArrayList<Course> list=student.getListCourse();
			for (Course course : list) {
				if (course.getCourseID() == 1)
					listStudentOne.add(student);
				else
					listStudentTwo.add(student);
				
			}
		}
		listCourse.get(0).setListStudent(listStudentOne);
		assertEquals(listStudentOne.size(), listCourse.get(0).getListStudent()
				.size());
		listCourse.get(1).setListStudent(listStudentTwo);
		assertEquals(listStudentTwo.size(), listCourse.get(1).getListStudent()
				.size());

		for (Course course : listCourse) {
			logger.info("List student of " + course.getName());
			for (Student student : course.getListStudent()) {
				logger.info(student.getName());
			}
		}
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(TestCourseStudent.class));
	}
}
