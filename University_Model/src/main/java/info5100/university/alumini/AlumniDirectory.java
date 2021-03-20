/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.alumini;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author ajayp
 */
public class AlumniDirectory {
    
    Department department;
    ArrayList<AlumniProfile> alumniList;
    
    public AlumniDirectory(Department department, ArrayList<AlumniProfile> alumniList) {
        this.department = department;
        this.alumniList = alumniList;
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
}
