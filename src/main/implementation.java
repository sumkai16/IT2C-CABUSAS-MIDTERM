
package main;
import java.util.*;

public class implementation {
    Scanner in = new Scanner (System.in); 
    config conf = new config();
    public void addMRecord(){
      
        
        System.out.print("VISIT DATE: ");
        String visit = in.next();
        System.out.print("DIAGNOSIS: ");
        String diagnosis = in.next();
        System.out.print("TREATMENT PLAN: ");
        String treatment = in.next();
        
         String sql = "INSERT INTO MedicalRecord (visit_date, diagnosis, treatment_plan) VALUES (?, ?, ?)";
        conf.addRecord(sql, visit, diagnosis, treatment);
    }
    public void updateMRecord(){
        System.out.print("Enter Record ID:");
        int id = in.nextInt();
        System.out.print("Update Visit Date: ");
        String date = in.next();
        System.out.print("Enter New Diagnosis: ");
        String diag = in.next();
        System.out.print("Enter New Treatment Plan: ");
        String treat = in.next();
        
        config dbConfig = new config();
        String sqlUpdate = "UPDATE MedicalRecord SET visit_date = ?, diagnosis = ?, treatment_plan = ? WHERE record_id = ?";
        dbConfig.updateRecord(sqlUpdate, date, diag, treat, id);
    }
    
    
    public void viewMRecord(){
        String votersQuery = "SELECT * FROM MedicalRecord";
        String[] votersHeaders = {"Record ID", "Visit Date", "Diagnosis", "Treatment Plan"};
        String[] votersColumns = {"record_id", "visit_date", "diagnosis", "treatment_plan"};
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
    
    public void deleteMRecord(){
        Scanner in = new Scanner (System.in);
        config dbConfig = new config();
        System.out.print("Enter ID you want to delete: ");
        int recordID = in.nextInt();
         
        String sqlDelete = "DELETE FROM MedicalRecord WHERE record_id = ?";
        dbConfig.deleteRecord(sqlDelete, recordID);
    }
}
