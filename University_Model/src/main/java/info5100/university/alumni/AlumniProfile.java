/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumni;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.feedback.Feedback;
import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class AlumniProfile {
    
    StudentProfile studentProfile;
    ArrayList<CertificationRecord> certificationRecordList;
    int yearOfGraduation;
    ArrayList<EmployementRecord> employementHistory;
    Feedback feedback;
    EmployementRecord employementRecord;
    Course course;

    public AlumniProfile(StudentProfile studentProfile,EmployementRecord employementRecord) {
        this.studentProfile = studentProfile;
        this.employementRecord = employementRecord;
    }

    public AlumniProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
        
    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public ArrayList<CertificationRecord> getCertificationRecordList() {
        return certificationRecordList;
    }

    public void setCertificationRecordList(ArrayList<CertificationRecord> certificationRecordList) {
        this.certificationRecordList = certificationRecordList;
    }
    
    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public void addNewCertificateRecord(AlumniProfile alumniProfile){
        CertificationRecord certificate = new CertificationRecord(alumniProfile);
        certificationRecordList.add(certificate);
    }
    
    public void addNewEmployementRecord(AlumniProfile alumniProfile){
        EmployementRecord employeeRecord = new EmployementRecord(alumniProfile);
        employementHistory.add(employeeRecord);
    }

    public ArrayList<EmployementRecord> getEmployementHistory() {
        return employementHistory;
    }

    public void setEmployementHistory(ArrayList<EmployementRecord> employementHistory) {
        this.employementHistory = employementHistory;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public EmployementRecord getEmployementRecord() {
        return employementRecord;
    }

    public void setEmployementRecord(EmployementRecord employementRecord) {
        this.employementRecord = employementRecord;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
}
