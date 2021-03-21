/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumni;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author ajayp
 */
public class CertificationRecord {
    
    Course course;
    AlumniProfile alumniProfile;
    String issueDate;
    
    public CertificationRecord(AlumniProfile alumniProfile) {
        this.alumniProfile = alumniProfile;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public AlumniProfile getAluminiProfile() {
        return alumniProfile;
    }

    public void setAluminiProfile(AlumniProfile aluminiProfile) {
        this.alumniProfile = aluminiProfile;
    }
    
}
