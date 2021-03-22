/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumni;

import com.github.javafaker.Faker;

/**
 *
 * @author palak
 */
public class EmployementRecord {
    AlumniProfile alumniProfile;
    enum employmentType{
        FullTime, PartTime, Internship;
    }
    String companyName;
    String Position;
    String startDate;
    double salary;
    String companyRanking;
    String jobRole;

    Faker fakerPkg = new Faker();
    
    public EmployementRecord(AlumniProfile alumniProfile) {
        this.alumniProfile = alumniProfile;
    }

    public AlumniProfile getAlumniProfile() {
        return alumniProfile;
    }

    public void setAlumniProfile(AlumniProfile alumniProfile) {
        this.alumniProfile = alumniProfile;
    }

    public String getCompanyName() {
        companyName = fakerPkg.company().name();
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        
        salary = fakerPkg.number().numberBetween(100000,500000);
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getCompanyRanking() {
        
        String sCompanyName = this.companyName;
        int hash = 7;
        for (int i = 0; i < sCompanyName.length(); i++) {
            hash = hash*31 + sCompanyName.charAt(i);
        }
        
        if(hash<100)
        {
            companyRanking = "Tier1";
        }
        else
        {
            companyRanking = "Tier2";
        }
        
        return companyRanking;
    }

    public void setCompanyRanking(String companyRanking) {
        this.companyRanking = companyRanking;
    }

    
}
