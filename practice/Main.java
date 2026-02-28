package com.jdbc.practice;

import java.io.FileInputStream;
import java.sql.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            // System.out.println("Testing..");
            
   
            java.sql.Connection c = ConnectionProvider.getConnection();            
            
            String q = "insert into images(pic) values(?)";
            
            PreparedStatement pstmt = c.prepareStatement(q);
            
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            
           
            if (file != null) {
                FileInputStream fis = new FileInputStream(file);
                
                pstmt.setBinaryStream(1, fis, fis.available());
                pstmt.executeUpdate();
                
                // System.out.println("done...");
                JOptionPane.showMessageDialog(null, "Success! ");            
            } else {
                JOptionPane.showMessageDialog(null, "");
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}