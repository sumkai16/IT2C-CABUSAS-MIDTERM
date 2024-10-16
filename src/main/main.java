
package main;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String op = null;
        
        do{
              
            System.out.println("===========================================-");
            System.out.println("    WELCOME TO MEDICAL RECORD");
            System.out.println("===========================================");
            System.out.println("    1. ADD RECORD");
            System.out.println("    2. VIEW RECORD");
            System.out.println("    3. EDIT RECORD");
            System.out.println("    4. DELETE RECORD");
            System.out.println("    5. EXIT");
            System.out.println("===========================================");

            System.out.print("Enter Action: ");
            int act = in.nextInt();
             while (act>5 || act<0){
                   System.out.print("Error, Enter Action Again (1-5 only): ");
                     act = in.nextInt(); 
                }
            implementation im = new implementation();
            switch(act){
                case 1:
                    im.addMRecord();
                    break;
                case 2:
                    im.viewMRecord();
                    break;
                case 3:
                    im.viewMRecord();
                    im.updateMRecord();
                    break;
                case 4:
                    im.viewMRecord();
                    im.deleteMRecord();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.out.println("Thank You, See you soon!");
                    System.exit(0);
                    break;
            }
            
            System.out.print("Do you want to continue?(Y/N): ");
            op = in.next();
        }while(op.equals("Y") || op.equals("y"));
            System.out.println("Thank You, See you soon!");
    }
}
