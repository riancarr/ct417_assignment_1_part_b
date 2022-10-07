/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417_assignment1_driver_project;

import ct417_assignment1.*;
import org.joda.time.DateTime;

/**
 *
 * @author Rian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Courses 
        Course c1 = new Course("CS", new DateTime(2022,9,29,12,0), new DateTime(2023,5,20,12,0));
        Course c2 = new Course("IT", new DateTime(2022, 9, 29, 12, 0), new DateTime(2023, 5, 23, 12, 0));
        
        Course[] courseList = new Course[2];
        courseList[0] = c1;
        courseList[1] = c2;
        
        //Students
        Student s1 = new Student("Jimmy Steve", 110, new DateTime(1912,4,30,12,0), 6534, c2);
        Student s2 = new Student("Harold Jameson", 26, new DateTime(1996,6,23,12,0), 4863, c1);
        Student s3 = new Student("James Haroldson", 25, new DateTime(1997,3,16,12,0), 4357, c1);
        Student s4 = new Student("Harry Jamesoldson", 21, new DateTime(2001,1,23,12,0), 6498, c1);
        Student s5 = new Student("Jamie Harryseldestson", 22, new DateTime(2000,9,5,12,0), 1853, c2);
        Student s6 = new Student("Harold Jameson", 26, new DateTime(1996,6,23,12,0), 4863, c1);
        Student s7 = new Student("Brenda Hatesjameses", 24, new DateTime(1998,6,21,12,0), 8499, c1);
        Student s8 = new Student("Jameses Hatesbrendasalot", 20, new DateTime(2002,2,4,12,0), 8355, c1);
        Student s9 = new Student("Liam Lovesall", 19, new DateTime(2003,5,9,12,0), 3333, c1);
        Student s10 = new Student("Pinchy Sharptongue", 19, new DateTime(2003,2,9,12,0), 4267, c2);
        
        //Add students to an array to cycle through them easier 
        Student[] studentsList = new Student[10];
        studentsList[0] = s1;
        studentsList[1] = s2;
        studentsList[2] = s3;
        studentsList[3] = s4;
        studentsList[4] = s5;
        studentsList[5] = s6;
        studentsList[6] = s7;
        studentsList[7] = s8;
        studentsList[8] = s9;
        studentsList[9] = s10;

        //Lecturers
        Lecturer l1 = new Lecturer("Ayjust Loveteaching", 52, new DateTime(1970,5,23,12,0), 1254);
        Lecturer l2 = new Lecturer("Aymindiff Erentonteaching", 61, new DateTime(1961,3,9,12,0), 1028);
        
        //Modules
        CourseModule m1 = new CourseModule("Computers", "CS329", l1); 
        CourseModule m2 = new CourseModule("Physics", "PH302", l2); 
        CourseModule m3 = new CourseModule("Electronics", "EL252", l1); 
        CourseModule m4 = new CourseModule("Professional Skills", "PS320", l2); 
        CourseModule m5 = new CourseModule("Birdwatching", "BD141", l2); 
        CourseModule m6 = new CourseModule("Hardware", "HD399", l1); 
        CourseModule m7 = new CourseModule("Software Engineering", "SW347", l1); 
        CourseModule m8 = new CourseModule("Machine Learning", "ML377", l1); 
        
        
        //add modules to CS course
        c1.getCourseModules().add(m1);
        c1.getCourseModules().add(m3);
        c1.getCourseModules().add(m4);
        c1.getCourseModules().add(m6);
        c1.getCourseModules().add(m8);
        
        //add modules to IT course
        c2.getCourseModules().add(m1);
        c2.getCourseModules().add(m2);
        c2.getCourseModules().add(m4);
        c2.getCourseModules().add(m5);
        c2.getCourseModules().add(m7);
        
        System.out.println("\n \n \n ");
        System.out.println("COURSES");

        //Print out the Module lists for each Course
        for(int i = 0; i< courseList.length; i++)
        {
            System.out.println("\n----------- " + courseList[i].getCourseName() + " -----------");
            for(int j = 0; j< courseList[i].getCourseModules().size(); j++)
            {
                //need to cast as CourseModule or the get() will return a generic Object 
                CourseModule module = (CourseModule)courseList[i].getCourseModules().get(j);
                System.out.println(module.getName().toUpperCase());
            }
        }
        System.out.println("\n \n \n ");
        System.out.println("STUDENTS");
        for(int i = 0; i< studentsList.length;i++)
        {
            System.out.println("\n-----------");
            System.out.println("Student Name: " + studentsList[i].getName());
            System.out.println("Username: " + studentsList[i].returnUserName());
            System.out.println("Course: " + studentsList[i].getCourse().getCourseName());
            System.out.println("Modules:");
            for(int j = 0; j<studentsList[i].getCourse().getCourseModules().size(); j++)
            {
                CourseModule module = (CourseModule)studentsList[i].getCourse().getCourseModules().get(j);
                System.out.println("- " + module.getName());
            }
        }
        
    }
    
}
