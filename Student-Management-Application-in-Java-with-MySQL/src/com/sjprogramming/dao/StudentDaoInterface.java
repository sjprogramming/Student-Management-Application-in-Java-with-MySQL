package com.sjprogramming.dao;

import com.sjprogramming.model.Student;

public interface StudentDaoInterface {
    public boolean insertStudent(Student s);
    public boolean delete(int roll);
    public boolean update(int roll,String update,int ch,Student s);
    public void showAllStudent();
    public boolean showStudentById(int roll);
}
