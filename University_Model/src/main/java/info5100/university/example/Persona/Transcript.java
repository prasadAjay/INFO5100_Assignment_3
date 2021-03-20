/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.SeatAssignment;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    HashMap<String, CourseLoad> courseloadlist;
    CourseLoad currentcourseload;

    public Transcript() {
        courseloadlist = new HashMap<String, CourseLoad>();
    }

    public CourseLoad newCourseLoad(String sem) {
        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {
        return currentcourseload;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {
        return courseloadlist.get(semester);
    }
    
    public double calculateGPA() {
        double totalGPA = 0;
        double SumOfCourses = 0;
        double NoOfCourses = 0;
        for (Map.Entry<String, CourseLoad> courseEntry: courseloadlist.entrySet()) {
            String key = courseEntry.getKey();
            CourseLoad courseLoadValue = courseEntry.getValue();
            for (SeatAssignment seatAssignment: courseLoadValue.getSeatassignments()) {
                SumOfCourses += seatAssignment.getGrade();
                NoOfCourses++;
            }
            if (NoOfCourses > 0) {
                totalGPA = SumOfCourses/NoOfCourses;
            }
        }
        return totalGPA;
    }
}
