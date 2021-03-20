/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.feedback;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author ajayp
 */
public class Feedback {
    
    Course course;
    int assignemntsScore;
    int quizScore;
    int projectScore;
    int midFinalTermScore;
    double averageRating = 0;
    
    public Feedback (Course course, int assignmentScore, int quizScore, int projectScore, int midFinalTermScore) {
        this.assignemntsScore = assignmentScore;
        this.quizScore = quizScore;
        this.projectScore = projectScore;
        this.midFinalTermScore = midFinalTermScore;
        setCourse(course);
        setAverageRating(averageRating);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getAssignemntsScore() {
        return assignemntsScore;
    }

    public void setAssignemntsScore(int assignemntsScore) {
        this.assignemntsScore = assignemntsScore;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public void setQuizScore(int quizScore) {
        this.quizScore = quizScore;
    }

    public int getProjectScore() {
        return projectScore;
    }

    public void setProjectScore(int projectScore) {
        this.projectScore = projectScore;
    }

    public int getMidFinalTermScore() {
        return midFinalTermScore;
    }

    public void setMidFinalTermScore(int midFinalTermScore) {
        this.midFinalTermScore = midFinalTermScore;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = (assignemntsScore + quizScore + projectScore + midFinalTermScore) / 4;
    }
}
