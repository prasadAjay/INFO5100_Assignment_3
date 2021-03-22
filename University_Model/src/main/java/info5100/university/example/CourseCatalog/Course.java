/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.feedback.Feedback;

/**
 *
 * @author kal bugrara
 */
public class Course {
    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour
    double courseRating;
    
    Feedback feedback;
    
    public Course(String n, String numb, int ch){
        name = n;
        number = numb;
        credits = ch;
        
        
    }
    public String getCOurseNumber(){
        return number;
    }
    
    public int getCoursePrice(){
        return price*credits;
        
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }
    
    
}
