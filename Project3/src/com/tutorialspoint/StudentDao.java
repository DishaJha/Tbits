package com.tutorialspoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
   public List<Student> getAllStudents(){
      List<Student> studentList = null;
      try {
         File file = new File("Students.dat");
         if (!file.exists()) {
            Student student = new Student(1, "Mahesh", "Teacher");
            studentList = new ArrayList<Student>();
            studentList.add(student);
            //saveStudentList(studentList);	
            System.out.println(studentList.toString());
         }
         else{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            ois.close();
         }
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }		
      return studentList;
   } 
}
