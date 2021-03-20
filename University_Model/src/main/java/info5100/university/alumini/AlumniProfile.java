/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumini;

import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class AlumniProfile {
    
    StudentProfile studentProfile;
    ArrayList<CertificationRecord> certificationRecordList;
    String companyName;
    int yeadOfGraduation;

    public AlumniProfile(StudentProfile studentProfile, ArrayList<CertificationRecord> certificationRecordList, String companyName, int yeadOfGraduation) {
        this.studentProfile = studentProfile;
        this.certificationRecordList = certificationRecordList;
        this.companyName = companyName;
        this.yeadOfGraduation = yeadOfGraduation;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYeadOfGraduation() {
        return yeadOfGraduation;
    }

    public void setYeadOfGraduation(int yeadOfGraduation) {
        this.yeadOfGraduation = yeadOfGraduation;
    }
}
