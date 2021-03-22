/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.github.javafaker.Faker;
import info5100.university.alumni.AlumniDirectory;
import info5100.university.alumni.AlumniProfile;
import info5100.university.alumni.EmployementRecord;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.Department.Department;
import static info5100.university.example.Info5001UniversityExample.getAverageFeebackRating;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.feedback.Feedback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ui.Admin.AdminJPanel;

/**
 *
 * @author palak
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    AlumniDirectory alumniDirec;
    CourseCatalog courseCatalog;
    
    public MainJFrame() {
        initComponents();
//        alumniDirec = new AlumniDirectory();
//        courseCatalog = new CourseCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnAlumni = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnAlumni.setText("Alumni");

        btnStudent.setText("Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlumni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnAlumni, btnStudent});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnStudent)
                .addGap(18, 18, 18)
                .addComponent(btnAlumni)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdmin, btnAlumni, btnStudent});

        SplitPane.setLeftComponent(controlPanel);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("University Model Implementation");

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        SplitPane.setRightComponent(displayPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here
        AdminJPanel adminPanel = new AdminJPanel(alumniDirec,courseCatalog);
        SplitPane.setRightComponent(adminPanel);
        
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

                Faker fakerPkg = new Faker();
        
        Department department = new Department("Information Systems");

        CourseCatalog courseCatalog = new CourseCatalog(department);
        Course course = department.newCourse("app eng", "info 5100", 4);
        
        Course course1 = department.newCourse("web eng", "info 6150", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        CourseOffer courseoffer1 = courseschedule.newCourseOffer("info 6150");

        courseoffer.generatSeats(10);
        
        courseoffer1.generatSeats(14);
        
        ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();

        alumniDirec = new AlumniDirectory(department);
        
        // Display 10 random students IDs and Final GPA for all of them
        for (int i = 0; i < 10; i++) {
            PersonDirectory pd = department.getPersonDirectory();
            Person person = pd.newPerson(fakerPkg.number().digits(9));
            StudentDirectory sd = department.getStudentDirectory();
            StudentProfile student = sd.newStudentProfile(person);
            CourseLoad courseload = student.newCourseLoad("Fall2020");
            courseload.newSeatAssignment(courseoffer); //register student in class
            
            AlumniProfile alumni = new AlumniProfile(student); 
            EmployementRecord emp = new EmployementRecord(alumni);
        
            // To calculate Final GPA for each student
            ArrayList<Seat> seatListAED = courseoffer.getSeatlist();
            for (Seat seat : seatListAED) {
                if (seat.isOccupied()) {
                    double min = 2.0;
                    double max = 4.0;
                    seat.getSeatassignment().setGrade(min + (fakerPkg.random().nextDouble() * (max - min)));
                }
            }
            System.out.println("Student NUID: " + person.getPersonId());
            System.out.println("Student Final GPA: " + student.getTranscript().calculateGPA());
            System.out.println("Company Name:" + emp.getCompanyName());
            System.out.println("Company Ranking:" + emp.getCompanyRanking());
            System.out.println("-------------------");
            
            Feedback feedback = new Feedback(courseoffer.getCourse(), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100));
            
            feedbackList.add(feedback);
            
            }
            System.out.println("\n");
        // Display 10 random students IDs and Final GPA for all of them
        for (int i = 0; i < 14; i++) {
            PersonDirectory pd = department.getPersonDirectory();
            Person person = pd.newPerson(fakerPkg.number().digits(9));
            StudentDirectory sd = department.getStudentDirectory();
            StudentProfile student = sd.newStudentProfile(person);
            CourseLoad courseload = student.newCourseLoad("Fall2020");
            courseload.newSeatAssignment(courseoffer1); //register student in class
            
            AlumniProfile alumni = new AlumniProfile(student);
            EmployementRecord emp = new EmployementRecord(alumni);
            
            // To calculate Final GPA for each student 
            ArrayList<Seat> seatListWeb = courseoffer1.getSeatlist();
            for (Seat seat : seatListWeb) {
                if (seat.isOccupied()) {
                    double min = 2.0;
                    double max = 4.0;
                    seat.getSeatassignment().setGrade(min + (fakerPkg.random().nextDouble() * (max - min)));
                }
            }
            System.out.println("Student NUID: " + person.getPersonId());
            System.out.println("Student Final GPA: " + student.getTranscript().calculateGPA());
            System.out.println("Company Name:" + emp.getCompanyName());
            System.out.println("Company Ranking:" + emp.getCompanyRanking());

            System.out.println("-------------------");
            
            Feedback feedback = new Feedback(courseoffer1.getCourse(), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100), fakerPkg.number().numberBetween(10,100));
      
            feedbackList.add(feedback);
        }
      
        HashMap<String, Double> feedbackEntry = new HashMap<String, Double>();
            feedbackEntry.put(courseoffer.getCourse().getName(), getAverageFeebackRating(feedbackList, courseoffer));
            feedbackEntry.put(courseoffer1.getCourse().getName(), getAverageFeebackRating(feedbackList, courseoffer1));
            
            for (Map.Entry<String, Double> feedEntry: feedbackEntry.entrySet()) {
                String key = feedEntry.getKey();
                double rating = feedEntry.getValue();
                rating = Math.round(rating * 100.0) / 100.0;
                course.setCourseRating(rating);
                System.out.println("Course: " + key + ", Rating: " + rating);
            }
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total: " + total);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAlumni;
    private javax.swing.JButton btnStudent;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
