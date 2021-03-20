/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumini;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author ajayp
 */
public class CertificationRecord {
    
    Course course;
    AlumniProfile aluminiProfile;
    
    public CertificationRecord(Course course, AlumniProfile aluminiProfile) {
        this.course = course;
        this.aluminiProfile = aluminiProfile;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public AlumniProfile getAluminiProfile() {
        return aluminiProfile;
    }

    public void setAluminiProfile(AlumniProfile aluminiProfile) {
        this.aluminiProfile = aluminiProfile;
    }
}
