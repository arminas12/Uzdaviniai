package com.Arminas.Dao;

import com.Arminas.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private static Map<Integer, Student>students;
    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Said","Computer Science"));
                put(2,new Student(1,"Alex U","Finance"));
                put(3,new Student(1,"Anna","Math"));
            }
        };
    }
    public Collection<Student>getAllStudents(){
        return this.students.values();
    }
}
