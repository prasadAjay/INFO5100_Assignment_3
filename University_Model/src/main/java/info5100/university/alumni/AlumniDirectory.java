/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumni;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class AlumniDirectory {
    
    Department department;
    ArrayList<AlumniProfile> alumniList;
    
    public AlumniDirectory(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<AlumniProfile> getAlumniList() {
        return alumniList;
    }

    public void setAlumniList(ArrayList<AlumniProfile> alumniList) {
        this.alumniList = alumniList;
    }
    
    public void addAlumniRecord(AlumniProfile alumniProfile) {
        alumniList.add(alumniProfile);
    }

    public AlumniProfile searchAlumniByGradYear(int yearOfGraduation) {
        for (AlumniProfile alumniProfile : alumniList) {
            if (alumniProfile.getYearOfGraduation() == yearOfGraduation) {
                return alumniProfile;
            }
        }
        return null;
    }
    
    public AlumniProfile findAlumni(String id) {
        for (AlumniProfile alumniProfile : alumniList) {
            if (alumniProfile.getStudentProfile().isMatch(id)) {
                return alumniProfile;
            }
        }
        return null;
    }
}
