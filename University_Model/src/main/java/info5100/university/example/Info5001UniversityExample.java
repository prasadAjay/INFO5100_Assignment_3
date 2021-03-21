/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import com.github.javafaker.Faker;
import info5100.university.alumni.AlumniProfile;
import info5100.university.alumni.EmployementRecord;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.feedback.Feedback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Faker fakerPkg = new Faker();
        
        Department department = new Department("Information Systems");

        Course course = department.newCourse("app eng", "info 5100", 4);
        
        Course course1 = department.newCourse("web eng", "info 6150", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        CourseOffer courseoffer1 = courseschedule.newCourseOffer("info 6150");

        courseoffer.generatSeats(10);
        
        courseoffer1.generatSeats(14);
        
        ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();

        // Display 10 random students IDs and Final GPA for all of them
        for (int i = 0; i < 10; i++) {
            PersonDirectory pd = department.getPersonDirectory();
            Person person = pd.newPerson(fakerPkg.number().digits(9));
            StudentDirectory sd = department.getStudentDirectory();
            StudentProfile student = sd.newStudentProfile(person);
            CourseLoad courseload = student.newCourseLoad("Fall2020");
            courseload.newSeatAssignment(courseoffer); //register student in class
            
            AlumniProfile alumni = new AlumniProfile(student);
            EmployementRecord emp = new EmployementRecord(alumni);
        
            // To calculate Final GPA for each student
            ArrayList<Seat> seatListAED = courseoffer.getSeatlist();
            for (Seat seat : seatListAED) {
                if (seat.isOccupied()) {
                    double min = 2.0;
                    double max = 4.0;
                    seat.getSeatassignment().setGrade(min + (fakerPkg.random().nextDouble() * (max - min)));
                }
            }
            System.out.println("Student NUID: " + person.getPersonId());
            System.out.println("Student Final GPA: " + student.getTranscript().calculateGPA());
            System.out.println("Company Name:" + emp.getCompanyName());
            System.out.println("Company Ranking:" + emp.getCompanyRanking());
            System.out.println("-------------------");
            
            Feedback feedback = new Feedback(courseoffer.getCourse(), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100));
            
            feedbackList.add(feedback);
            
            }
            System.out.println("\n");
        // Display 10 random students IDs and Final GPA for all of them
        for (int i = 0; i < 14; i++) {
            PersonDirectory pd = department.getPersonDirectory();
            Person person = pd.newPerson(fakerPkg.number().digits(9));
            StudentDirectory sd = department.getStudentDirectory();
            StudentProfile student = sd.newStudentProfile(person);
            CourseLoad courseload = student.newCourseLoad("Fall2020");
            courseload.newSeatAssignment(courseoffer1); //register student in class
            
            AlumniProfile alumni = new AlumniProfile(student);
            EmployementRecord emp = new EmployementRecord(alumni);
            
            // To calculate Final GPA for each student
            ArrayList<Seat> seatListWeb = courseoffer1.getSeatlist();
            for (Seat seat : seatListWeb) {
                if (seat.isOccupied()) {
                    double min = 2.0;
                    double max = 4.0;
                    seat.getSeatassignment().setGrade(min + (fakerPkg.random().nextDouble() * (max - min)));
                }
            }
            System.out.println("Student NUID: " + person.getPersonId());
            System.out.println("Student Final GPA: " + student.getTranscript().calculateGPA());
            System.out.println("Company Name:" + emp.getCompanyName());
            System.out.println("Company Ranking:" + emp.getCompanyRanking());
            System.out.println("-------------------");
            
            Feedback feedback = new Feedback(courseoffer1.getCourse(), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100));
      
            feedbackList.add(feedback);
        }
      
        HashMap<String, Double> feedbackEntry = new HashMap<String, Double>();
            feedbackEntry.put(courseoffer.getCourse().getName(), getAverageFeebackRating(feedbackList, courseoffer));
            feedbackEntry.put(courseoffer1.getCourse().getName(), getAverageFeebackRating(feedbackList, courseoffer1));
            
            for (Map.Entry<String, Double> feedEntry: feedbackEntry.entrySet()) {
                String key = feedEntry.getKey();
                double rating = feedEntry.getValue();
                rating = Math.round(rating * 100.0) / 100.0;
                System.out.println("Course: " + key + ", Rating: " + rating);
            }
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total: " + total);
    }
    
    public static double getAverageFeebackRating(ArrayList<Feedback> feedbackList, CourseOffer courseOffer) {
        double finalRating = 0;
        int feedbackCount = 0;
        for (Feedback feedback: feedbackList) {
            if (courseOffer.getCourse().getName().equalsIgnoreCase(feedback.getCourse().getName())) {
                finalRating += feedback.getAverageRating();
                feedbackCount++;
            }
        }
        finalRating = finalRating/feedbackCount;
        return finalRating;
    }
}
