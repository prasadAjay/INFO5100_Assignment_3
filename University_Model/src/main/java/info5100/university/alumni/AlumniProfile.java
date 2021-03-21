/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumni;

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
}
