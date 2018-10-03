package com.Arminas.Service;

import com.Arminas.Dao.StudentDao;
import com.Arminas.Entity.Student;

import java.util.Collection;

public class StudentsServices {

    private StudentDao studentsDao;


    public Collection<Student> getAllStudents(){
        return studentsDao.getAllStudents();
    }
}
