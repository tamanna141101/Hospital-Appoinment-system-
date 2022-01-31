
package hospitalappinmentsystem;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author TAMANNA
 */
public class HospitalAS2 extends HospitalAS {
    public void main_menu() {
       System.out.println("\n\n\t\t\t\t\t<<<< Main Menu >>>>");
       System.out.println("\n\n1. Doctor"
                        +"\n2. Patitent"
                        +"\n3. Admin"
                        +"\n4. Exit");
       
       
       
       int choice;
       do{
           System.out.print("\nPlease Seclect This Option: ");
            choice = in.nextInt();
            if(choice == 1)
            {
            login() ;   
            break;
            } 
            else  if(choice == 2)
            {
              
             patient();
              
             break;
            } 
            else  if(choice == 3)
            {
              
             login();
              
             break;
            } 
            else if(choice == 4)
            {
             System.exit(0);
            }
            else{
                System.out.println(choice+" does not have in this Option:");
            }
       }
       while(choice !=4);
      
      
       
   }
    //*********************//ADMIN//***********************//
                                   
    
    public void menu(){
        System.out.println("\n\n1.Main Menu"
                           + "\n2.Exit"); 
        int doc;
        do{
            System.out.print("\nPlease Seclect This Option: ");
            doc = in.nextInt();
            if(doc == 1){
            admin(); 
            break;
            } 
            else if(doc == 2)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }        
        }while(doc != 2); 
    }
    public void admin(){
        System.out.println("\n\n\t\t\t\t\t<<<< Admin Menu >>>>");

        System.out.println("\n\n1. Log out"
                    + "\n2. Patitent Info"
                    + "\n3. Exit"); 
          int admin1;
 
          do{
           System.out.print("\nPlease Seclect This Option: ");
           admin1= in.nextInt();
           if(admin1== 1){
           main_menu(); 
           break;
            } 
           if(admin1== 2){
            System.out.println("\n\n\t\t\t\t<<<< Patitent Info >>>");   
            System.out.println("\n\n\nName: "+name);
            System.out.println("Sex: "+sex1); 
            System.out.println("Blood Group: "+blood_group1);
            System.out.println("Age: "+age);
            System.out.println("Email: "+e);
            System.out.println("phone number: +088 "+phone_number);
            System.out.println("Hospital name: "+Hospital_name);
            System.out.println("Department Name: "+DepartmentName);

                    System.out.println("\n\n1. Appoinment Cancel "
                                    + "\n2. Appoinment Confirm"
                                    + "\n3. Main menu ");
                        do{
                            System.out.print("\nPlease Seclect This Option: ");
                            admin = in.nextInt();
                            if(admin == 1)
                            {
                            System.out.println("\t\t\tAppoinment Cancel");
                            menu();               
                            break;
                            } 
                            else  if(admin == 2)
                            {
                            System.out.println("\t\t\tAppoinment Confirm"); 
                            menu();
                            break;
                            } 
                            if(admin == 3){
                            admin();
                            break;
                            }             
                            else{
                            System.out.println(admin+" does not have in this Option:");
                            }
                            }while(admin !=3);

                            break;
            } 
            else if(admin1 == 3)
            {
            System.exit(0);
            }
            else{
            System.out.println(admin1+" does not have in this Option:");
            }        
            }while(admin1!= 3);
  
    }
    
    //************************//  DOCTOR  //***********************//
                                    
    public void  doctor(){
        int doc;
        System.out.println("\n\n\t\t\t\t\t<<<< Doctor Menu >>>>");
        System.out.println("\n\n1. Show Appoinment List"
                + "\n2. Logout"
                + "\n3. Exit");
 
        do{
           System.out.print("\nPlease Seclect This Option: ");
           doc = in.nextInt();
            if(doc == 1){
            List();
            break;
            }       
            else if(doc == 2){
            main_menu(); 
            break;
            } 
            else if(doc == 3)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }
        
        }while(doc != 3);
   }
    
    public void List(){
            if(admin == 2){
            System.out.println("\n\n\t\tPatient List ...");
            System.out.println("\n\nName: "+name);
            System.out.println("Sex: "+sex1); 
            System.out.println("Blood Group: "+blood_group1);
            System.out.println("Age: "+age);
            System.out.println("Email: "+e);
            System.out.println("phone number: +088 "+phone_number);
            }
            else if(admin == 1 ) {
            System.out.println("\n\n\t\t\t....No Appoinment Today....");  
            } 
            else{
                System.out.println("\n\n\t\t\t....NO Appoinment Today....");
            }
             System.out.println("\n\n1.Main Menu"
                           + "\n2.Exit"); 
        int doc;
        do{
            System.out.print("\nPlease Seclect This Option: ");
            doc = in.nextInt();
            if(doc == 1){
            doctor(); 
            break;
            } 
            else if(doc == 2)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }        
        }while(doc != 2); 
    }
  
  
  //*************************// PATIENT//***************************//
                                    
    public void   patient() {
 
         System.out.println("\n\n\t\t\t\t\t<<<< Patient Menu >>>>");
         System.out.println("\n\n1. Guest Mode"
                 + "\n2. Registration"
                 +"\n3. log in"
                 +"\n4. Exit");
         
         do{
           System.out.print("\nPlease Seclect This Option: ");
            choice1 = in.nextInt();
            if(choice1 == 1)
            {
            log_in();   
            break;
            } 
            else  if(choice1 == 2)
            {   
            Registration();  
             break;
            } 
            else  if(choice1 == 3)
            { 
             e = "abc@xyz.com";
             login();
              
             break;
            }
            else if(choice1 == 4)
            {
             System.exit(0);
            }
            else{
                System.out.println(choice1+" does not have in this Option...");
            }
       }
       while(choice1 !=4);
         
   }    
 
    public void  Registration(){
         Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\n\t\t\t\t\t<<<< Welcome to the Registration Form >>>>\n\n");
        //=============================================================//
                    // name// 
        System.out.print("First name:  ");
        String name1 = sc.nextLine();
        
        System.out.print("Last name: ");
        String name2 = sc.nextLine();
        
        StringBuffer name = new StringBuffer (name1);
        name.append(" ");
        name.append(name2);
        System.out.println("Name: "+name);
       //==============================================================//
                           // Email//
        boolean loop1 = false;
         do{ 
        System.out.print("Email:");
        e = in1.nextLine();
        int c=0;
        int b=0;
        for (int i = 0; i < e.length(); i++){  
            if(e.charAt(i)=='@'){
                c++;
            }
            if(e.charAt(i)==' '){
                b++;
            }
        }
        if(c == 0 || c>1 || b>=1){
            loop1=false;
            System.out.println("Invalid Email!!!");
            
        }
        else{   
            if((e.charAt(0)>= 'a' && e.charAt(0)<='z')||(e.charAt(0)>= 'A' && e.charAt(0)<='Z') ){         
                 
                  break;}
            else{
                 loop1=false;
                 System.out.println("Invalid Email!!!");                  
            }    
        }
        }while(loop1 = true);
           
    //===========================================================================//        
        
        
    //===========================================================================//
                                 // Password //
        System.out.println("your ID Number: 1234 \n");
        System.out.println("\n***************************************************************************");
        System.out.print("Conditions for a Valid Password....\n");        
        System.out.print("1. Password must contain at least 10 characters.\n");
        System.out.print("2. Password must contain at least 1 uppercase, 1 lowercase and 1 number.\n");
        System.out.println("***************************************************************************\n");
         boolean loop = false;
         do{
        System.out.print("Enter a Password: ");
        pass2 = sc.nextLine();
        int numCount = 0;
        int UpperCaseCount = 0;
        int LowerCaseCount = 0;
        
        if(pass2.length() >= 10){
        for (int i = 0; i < pass2.length(); i++) {
            char ch = pass2.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z'){
                UpperCaseCount++;
            }
             if(ch >= 'a' && ch <= 'z'){
                LowerCaseCount++;
            }
            
            else if(ch >= '0' && ch <= '9'){
                numCount++;
            }     
        }
        
        if ((numCount >= 1)&&(UpperCaseCount >=1)&&(LowerCaseCount >=1)){
            System.out.println("\n\t\t\tRegitration Successfully \n");
            login();
            break;
            
        }        
        else{
            loop= false;
            System.out.println("The password is invalid!!!.\n");
        }
        }       
        else{
            loop= false;
            System.out.println("The password is invalid!!!.\n");
        }
         }while(loop= true);
    //======================================================================================//   
   }
    //****************************************************************************************//
    
    //***************************************************************************************//
                                      //Login//
    public void  login(){
         
         Scanner in = new Scanner(System.in);
         String id = "20100026";
         String pass = "tamanna";
         String id1 = "doctor";
         String pass1 = "doctor";
         String id3 = "admin";
         String pass3 = "admin";
         
         
        System.out.println("\t\t\t\t\t<<<< Loggin Form >>>>\n\n\n");
        boolean loop = false;
        do{
        System.out.print("User ID: ");
        String a = in.nextLine();
        System.out.print("Password: ");
        String b = in.nextLine();
        //befor reg
        if(a.equals(id) && b.equals(pass) ){
        System.out.println("\n\t\t\tLog in successfully.");
        PatientMenu();
        break;
        }
        //after reg
        else if(a.equals(id2) &&  b.equals(pass2)) {
        System.out.println("\n\t\t\tLog in successfully.");
        PatientMenu();
        break;
        }
        else if(a.equals(id3) &&  b.equals(pass3)) {
        System.out.println("\n\t\t\tLog in successfully..");
        admin();
        break;
        }
        //doctor reg
        else if(a.equals(id1) && b.equals(pass1) ){
        System.out.println("\n\t\t\tLog in successfully.");
        doctor();
        break;
        }        
        else
        {    
        loop = false;
        System.out.println("User Id and Password wrong!!");
        }
        }while(loop = true);
  
   }
   //*******************************************************************************// 
    
   //********************************************************************************//
                            // Patient Form //
    
    public void PatientMenu1() {
        System.out.println("\n\n1. Appointment"
                 + "\n2. Display"
                 +"\n3. log out"
                 +"\n4. Exit");
         
         do{
           System.out.print("\nPlease Seclect This Option: ");
            p1 = in.nextInt();
            if(p1 == 1)
            {
            log_in();   
            break;
            } 
            else  if(p1 == 2)
            {   
            display();  
             break;
            } 
            else  if(p1 == 3)
            { 
            
             main_menu();
              
             break;
            }
            else if(p1 == 4)
            {
             System.exit(0);
            }
            else{
                System.out.println(p1+" does not have in this Option...");
            }
       }
       while(p1 !=4);
    }
    public void PatientMenu(){
        System.out.println("\n\n1. Appointment"
                 + "\n2. Display"
                 +"\n3. log out"
                 +"\n4. Exit");
         
         do{
           System.out.print("\nPlease Seclect This Option: ");
            p1 = in.nextInt();
            if(p1 == 1)
            {
            log_in();   
            break;
            } 
            else  if(p1 == 2)
            {   
            disply1();  
             break;
            } 
            else  if(p1 == 3)
            { 
            
             main_menu();
              
             break;
            }
            else if(p1 == 4)
            {
             System.exit(0);
            }
            else{
                System.out.println(p1+" does not have in this Option...");
            }
       }
       while(p1 !=4);
    }
    
    public void log_in(){
 
    System.out.println("\t\t\t\t\t<<<< Please Enter your Information >>>>\n");
    //===========================================================================//
                            //Name//
    System.out.print("Patient Name : ");
    name = in1.nextLine();
    //===========================================================================//
    //===========================================================================//
                            //Geander//
    System.out.println("--Your Geander-- ");
    System.out.println("1.Male "
            + "\n2.Female "
            + "\n3.Others\n");                        
    do{
    System.out.print("Please Seclect This Option: ");
    sex = in.nextInt();

    if(sex == 1)
    {   
        sex1 = "Male";
        System.out.println("Sex : Male\n");
        break;
    }
    else if(sex == 2)
    {
        sex1 = "Female";
        System.out.println("Sex : Female\n");
        break;
    }
    else if(sex == 3){
        sex1 = "Others";
        System.out.println("Sex : Others\n");
        break;
    }
    else
       System.out.println(sex+" does not have in this Option.");
    }
    while (sex != 3);
 //===========================================================================//


 //===========================================================================//
                            //Blood Group//
    System.out.println("--Your Blood Group-- "
               + "\n1.A+ "
               + "\n2.A- "
               + "\n3.B+ "
               + "\n4.B- "
               + "\n5.AB+ "
               + "\n6.AB- "
               + "\n7.O+ "
               + "\n8.O- "
               + "\n9. DON'T KNOW");                        
    do{
       System.out.print("Please Seclect This Option:");
       blood_group = in.nextInt();
       
        if(blood_group == 1)
        {
            blood_group1= "A+";
        System.out.println("Blood Group : A+");
        break;
        }
        else if(blood_group == 2)
        {
            blood_group1= "A+";
        System.out.println("Blood Group : A-");
        break;
        }
        else if(blood_group == 3)
        {
            blood_group1= "B+";
        System.out.println("Blood Group : B+");
        break;
        }
        else if(blood_group == 4)
        {
            blood_group1= "B-";
        System.out.println("Blood Group : B-");
        break;
        }
        else if(blood_group == 5)
        {
            blood_group1= "AB+";
        System.out.println("Blood Group : AB+");
        break;
        }
        else if(blood_group == 6)
        {
            blood_group1= "AB-";
        System.out.println("Blood Group : AB-");
        break;
        }
        else if(blood_group == 7)
        {
            blood_group1= "O+";
        System.out.println("Blood Group : O+");
        break;
        }
        else if(blood_group == 8)
        {
            blood_group1= "O-";
        System.out.println("Blood Group : O-");
        break;
        }
        else if(blood_group == 9)
        {
            blood_group1= "DON'T KNOW";
        System.out.println("Blood Group : DON'T KNOW");
        break;
        }
        else
       System.out.println(blood_group+" does not have in this Option.");
    }
        while(blood_group != 9);
     //===========================================================================//

    //===========================================================================//
                                    //Date of Birth//
                                    
       int day, month, year;
        GregorianCalendar date = new GregorianCalendar();
 
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Date of birth formate  dd/mm/yyyy");
         int DD = 0;
        int MM= 0;
        int YY= 0;
         boolean loop = false;
       do{
        System.out.print("Date of birth: ");
        String age1= sc.nextLine();
        String[] arrOfStr = age1.split("/"); 
    
       
        for (int i=0; i<=arrOfStr.length; i++) {            
          switch (i){
            case 0:
             DD= Integer.parseInt(arrOfStr[i]);
            break;
            case 1:
             MM= Integer.parseInt(arrOfStr[i]);
            break;	            
           case 2:
             YY = Integer.parseInt(arrOfStr[i]);
            break;
          }         
        }
        
        if(YY >= 1600 && YY <= 9999){
    
    if(MM >= 1 && MM <= 12){
        if((DD>=1 && DD<=31) && (MM== 1||MM == 3||MM == 5||MM == 7||MM == 8||MM == 10||MM == 12  )){
          break; 
        }         
        else if((DD>=1&&DD<=30)&&( MM == 4||MM == 6||MM == 9||MM == 11 )){
            break;
        }
    
        else if((DD>=1&&DD<=28)&&(MM == 2)){
            break;
        }
          
        else if((DD>=1&&DD<=29)&&(MM == 2)){
          break;
            
        }
        else{
            System.out.println("Invadil date!!");
             loop = false;
        }
    }
    else{
         System.out.println("Invadil month!!");
          loop = false;
    }}
       
        else{
             System.out.println("Invadil year!!");
              loop = false;
        }
        
       }while(loop = true);
     
        // if birth date is greater then current
        // birth_month, then donot count this month
        // and add 30 to the date so as to subtract
        // the date and get the remaining days
        if (DD> day) {
            month = month - 1; }
 
        // if birth month exceeds current month,
        // then do not count this year and add
        // 12 to the month so that we can subtract
        // and find out the difference
        if (MM > month) {
            year = year - 1; }

         age = year - YY;      
        System.out.println("Years: " + age );  
 
        
    //==========================================================================//    

   
    //===========================================================================//
                                        //Mobile Number//
    do{
        System.out.print("\nEnter your Phone Number  : +880 ");
        phone_number = in1.nextLine();        
            if(phone_number.length()==10)
            {                
            if(choice1 == 1)
            {
            Guest_mode() ;              
            } 
            else  if(choice1 == 2 || choice1==3)
            {   
            Hospital_Type();             
            } 
            break;
            }
            else{
                 System.out.println("Invalid Number!!");
                }       
        }while( phone_number.length()!= 10);
  
    }
  //**********************************************************************************//
    
 //************************************************************************************//
                          // Guest Mode //
     public void  Guest_mode(){
         
         if(choice1 == 1){
            boolean loop1 = false;
         do{ 
        System.out.print("Email:");
        e = in1.nextLine();
        int c=0;
        int b=0;
        for (int i = 0; i < e.length(); i++){  
            if(e.charAt(i)=='@'){
                c++;
            }
            if(e.charAt(i)==' '){
                b++;
            }
        }
        if(c == 0 || c>1 || b>=1){
            loop1=false;
            System.out.println("Invalid Email!!!");
            
        }
        else{   
            if((e.charAt(0)>= 'a' && e.charAt(0)<='z')||(e.charAt(0)>= 'A' && e.charAt(0)<='Z') ){         
                 
                  break;}
            else{
                 loop1=false;
                 System.out.println("Invalid Email!!!");                  
            }    
        }
        }while(loop1 = true);
            }
        System.out.println("\n\n Hospital Name..."
                          +"\n 1.Dhaka Medical College, Dhaka"
                          +"\n 2.Sir Salimullah Medical College, Dhaka"
                          +"\n 3.Asgar Ali Hospital, Dhaka, Dhaka"
                          +"\n 4.BIRDEM Hospital, Dhaka"
                          +"\n 5.Lab-aid Cardiac and Specialized Hospital, Dhaka"
                          +"\n 6.Exit ");
    ///do while loop
    int choose;
    do{
        System.out.print("\nPlease Seclect This Option: ");
        
        choose = in.nextInt();
       
        if(choose == 1)
        {
        Hospital_name= "Dhaka Medical College";
        System.out.println("\n\nHospital Name : Dhaka Medical College, Dhaka\n\n\n ");
        break ;
        }
        else if( choose == 2)
        {
        Hospital_name= "Sir Salimullah Medical College";
        System.out.println("\n\nHospital Name : Sir Salimullah Medical College, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 3)
        {
        Hospital_name= "Asgar Ali Hospital, Dhaka";
        System.out.println("\n\nHospital Name : Asgar Ali Hospital, Dhaka, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 4)
        {
        Hospital_name= "BIRDEM Hospital";
       System.out.println("\n\nHospital Name : BIRDEM Hospital, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 5)
        {
       Hospital_name= "Lab-aid Cardiac and Specialized Hospital";
       System.out.println("\n\nHospital Name : Lab-aid Cardiac and Specialized Hospital, Dhaka\n\n\n");
        break ;
        }
        else if(choose == 6)
        {
            System.exit(0);
        }
        else
         System.out.println(choose+" does not have in this Option:");
    }
        while(choose != 6); 

    System.out.print("\n\n Department Name..."
                            +"\n 1. Department of Cardiology"
                            +"\n 2. Department of Urology"
                            +"\n 3. Department of Medicine focuses"                           
                            +"\n 4. Exit");
        ///do while loop
        int q;
        do{
       System.out.println("\nPlease Seclect This Option: ");
        q = in.nextInt();
      

                if(q==1)
                {
                DepartmentName = "Department of Cardiology";
                System.out.println("Department Name : Department of Cardiology\n\n\n");
                 break ;
                }
                else if (q == 2)
                {
                DepartmentName = "Department of Urology";
                System.out.println("Department Name : Department of Urology\n\n\n");
                 break ;
                }
                
                else if (q == 3){
                DepartmentName = "Department of Medicine focuses";
               System.out.println("Department Name : Department of Medicine focuses\n\n\n");
                 break ;
                }
                else if( q == 4)
                {
                System.exit(0);
                }
                else
                System.out.println(q+" does not have in this Option:");
          }
                while(q != 4);
        
        
            BookingTime= "05 :00 pm";
           
            
    System.out.println("\n\n\n\t\t\t\t\t<<<< Your Appointment Complete. Please Wait Confirm Mail or Call... >>>>\n\n");

    System.out.println("Name: "+name);
    System.out.println("Sex: "+sex1); 
    System.out.println("Blood Group: "+blood_group1);
    System.out.println("Age: "+age);
    System.out.println("Email: "+e);
    System.out.println("phone number: +088 "+phone_number);
    System.out.println("Hospital name: "+Hospital_name);
    System.out.println("Department Name: "+DepartmentName);
    System.out.println("Booking Time: "+BookingTime);
     System.out.println("\n\n1.Main Menu"
                           + "\n2.Exit"); 
        int doc;
        do{
            System.out.print("\nPlease Seclect This Option: ");
            doc = in.nextInt();
            if(doc == 1){
            main_menu(); 
            break;
            } 
            else if(doc == 2)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }        
        }while(doc != 2); 
   }  
    public void Hospital_Type(){
    
    System.out.println("\n\n\t\t\t\t\t<<<< Hospital Type >>>>\n\n\n"
            +"\nThere are two types of Hospitals"
            +"\n1. Government Hospital"
            +"\n2. Private Hospital"
            +"\n3. Exit");
    
    int choice;
    ///do while loop
    do{
    
    System.out.print("\n\nEnter your choice: ");
    choice = in.nextInt();
    

        if(choice == 1)
        {
        System.out.println("\n\nGovernment Hospital\n\n\n");
        
        Selection();
        break;
        }

        else if(choice == 2)
        {
        System.out.println("\n\nPrivate Hospital\n\n\n");
        
        Selection1();
        break ;
        }
        else if(choice == 3)
        {
            System.exit(0);
        }
        else
       System.out.println(choice+" does not have in this Option.");
    }
     while (choice != 3);

    
}
    public void Selection(){
     System.out.println("\n\n\t\t\t\t\t<<<< Government Hospital >>>\n");     
     System.out.println("Hospital Name..."
                          +"\n 1.Dhaka Medical College, Dhaka"
                          +"\n 2.Sir Salimullah Medical College, Dhaka"
                          +"\n 3.Kurmitola General Hospitall, Dhaka"
                          +"\n 4.Mirpur Maternity Hospital, Dhaka"
                          +"\n 5.Bangladesh Railway Hospital, Dhaka"
                          +"\n 6.Exit ");
    ///do while loop
     int choose;
    do{
        System.out.print("\nPlease Seclect This Option: ");
       
        choose = in.nextInt();
       
        if(choose == 1)
        {
            Hospital_name= "Dhaka Medical College";
        System.out.println("\n\nHospital Name : Dhaka Medical College, Dhaka\n\n\n ");
        break ;
        }
        else if( choose == 2)
        {
            Hospital_name= "Sir Salimullah Medical College";
        System.out.println("\n\nHospital Name : Sir Salimullah Medical College, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 3)
        {
            Hospital_name= "Kurmitola General Hospital";
        System.out.println("\n\nHospital Name : Kurmitola General Hospital, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 4)
        {
            Hospital_name= "Mirpur Maternity Hospital";
       System.out.println("\n\nHospital Name : Mirpur Maternity Hospital, Dhaka\n\n\n");
        break ;
        }
        else if( choose == 5)
        {
            Hospital_name= "Bangladesh Railway Hospital";
       System.out.println("\n\nHospital Name : Bangladesh Railway Hospital, Dhaka\n\n\n");
        break ;
        }
        else if(choose == 6)
        {
            System.exit(0);
        }
        else
         System.out.println(choose+" does not have in this Option:");
    }
        while(choose != 6);
        
         Department_Name();
       
  }
    public void Selection1(){
    
    System.out.println("\n\n\t\t\t\t\t<<<< Private Hospital >>>>\n");
    System.out.println("Hospital Name..."
                            +"\n 1.Asgar Ali Hospital, Dhaka"
                            +"\n 2.Lab-aid Cardiac and Specialized Hospital, Dhaka"
                            +"\n 3.BIRDEM Hospital, Dhaka"
                            +"\n 4.Ibn Sina Medical College and Hospital, Dhaka"
                            +"\n 5.United Hospital Gulshan, Dhaka"
                            +"\n 6. Exit");
                                
    ///do while loop
    int choose1;
      do {
        
        System.out.print("\nPlease Seclect This Option: ");
        choose1 = in.nextInt();
        

            if( choose1 == 1)
            {
                Hospital_name= "Asgar Ali Hospital";
            System.out.println("\n\nHospital Name : Asgar Ali Hospital, Dhaka\n\n\n");
             break ;
            }
            else if( choose1 == 2)
            {
                Hospital_name= "Lab-aid Cardiac and Specialized Hospital";
            System.out.println("\n\nHospital Name : Lab-aid Cardiac and Specialized Hospital, Dhaka\n\n\n");
             break ;
            }
            else if( choose1 == 3)
            {
                Hospital_name= "BIRDEM Hospital";
           System.out.println("\n\nHospital Name : BIRDEM Hospital, Dhaka\n\n\n");
            break ;
            }
            else if( choose1 == 4)
            {
                Hospital_name= "Ibn Sina Medical College and Hospital";
            System.out.println("\n\nHospital Name : Ibn Sina Medical College and Hospital, Dhaka\n\n\n");
             break ;
            }
            else if( choose1 == 5)
            {
                Hospital_name= "United Hospital Gulshan,";
            System.out.println("\n\nHospital Name : United Hospital Gulshan, Dhaka\n\n\n");
             break ;
            }
            else if( choose1 == 6)
            {
            System.exit(0);
            }
            else
             System.out.println(choose1+" does not have in this Option:");
        }
            while( choose1 != 6 );

                Department_Name();
      
  }
    public void Department_Name(){
        
        System.out.println("\n\n\t\t\t\t\t<<<< Department Name >>>\n\n\n");

        System.out.println("Department Name... "
                            +"\n1. Department of Cardiology"
                            +"\n 2. Department of Urology"
                            +"\n 3. Department of Nephrology"
                            +"\n 4. Department of Neuro Medicine"
                            +"\n 5. Department of Medicine focuses"
                            +"\n 6. Department of Dermatology"
                            +"\n 7. Exit");
        ///do while loop
        int q;
        do{
       System.out.print("\nPlease Seclect This Option: ");
        q = in.nextInt();
      

                if(q==1)
                {
                    DepartmentName = "Department of Cardiology";
                System.out.println("Department Name : Department of Cardiology\n\n\n");
                 break ;
                }
                else if (q == 2)
                {
                    DepartmentName = "Department of Urology";
                System.out.println("Department Name : Department of Urology\n\n\n");
                 break ;
                }
                else if (q == 3)
                {
                    DepartmentName = "Department of Nephrology";
               System.out.println("Department Name : Department of Nephrology\n\n\n");
                 break ;
                }
                else if (q == 4)
                {
                    DepartmentName = "Department of Neuro Medicine";
                System.out.println("Department Name : Department of Neuro Medicine\n\n\n");
                 break ;
                }
                else if (q == 5){
                    DepartmentName = "Department of Medicine focuses";
               System.out.println("Department Name : Department of Medicine focuses\n\n\n");
                 break ;
                }
                else if (q == 6)
                {
                   DepartmentName = "Department of Dermatology"; 
                System.out.println("Department Name : Department of Dermatology\n\n\n");
                 break ;
                }
                else if( q == 7)
                {
                System.exit(0);
                }
                else
                System.out.println(q+" does not have in this Option:");
          }
                while(q != 7);

                
                Booking_Time();


               
  }

    public void Booking_Time(){
      

    System.out.println("\n\n\t\t\t\t\t<<<< Booking Time >>>>\n\n\n");
    System.out.println("\n1. 04:00 pm  "
                            + "\n2. 05:00 pm "
                            + "\n3. 06:00 pm "
                            + "\n4. 07:00 pm "
                            + "\n5. 08:00 pm "
                            + "\n6. 09:00 pm"
                            + "\n7. Exit\n");
    boolean loop = false;  
    int time;
    do{
        
        System.out.print("\nPlease Seclect This Option: ");
        time = in.nextInt();
        
        
        ///Nested
        if(time == 1){ 
           System.out.println("04 :00 pm = Booked  ");
           loop = false;
        }
        else  if(time == 2){ 
            BookingTime= "05 :00 pm";
            System.out.println("05 :00 pm = Available  "); 
            break;
        }
        else  if(time == 3){
            BookingTime= "06 :00 pm";
            System.out.println("06 :00 pm = Available  ");               
            break;
        }
        else  if(time == 4){          
            System.out.println("\n\n07 :00 pm = Booked ");              
            loop = false;
        }
        else  if(time == 5){ 
            BookingTime= "08 :00 pm";
            System.out.println("\n\n08 :00 pm = Available  ");              
            break;
        }
        else  if(time== 6){
            BookingTime= "09 :00 pm";
            System.out.println("09 :00 pm = Available  ");               
            break;
        }
        else if( time == 7)
        {
            System.exit(0);
        }

        else
         System.out.println(time+" does not have in this Option:");
    }
    while(loop = true);

                
      display ();

  }
    public void disply1(){
        System.out.println("\n\t\t\tNo Appoinment ");
        System.out.println("\n\n1.Main Menu"
                           + "\n2.Exit"); 
        int doc;
        do{
            System.out.print("\nPlease Seclect This Option: ");
            doc = in.nextInt();
            if(doc == 1){
            PatientMenu(); 
            break;
            } 
            else if(doc == 2)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }        
        }while(doc != 2); 
    }

    public  void display (){
   
    System.out.println("\n\n\n\t\t\t\t\t<<<< Your Appointment Complete. Please Wait Confirm Mail or Call... >>>>\n\n");

    System.out.println("Name: "+name);
    System.out.println("Sex: "+sex1); 
    System.out.println("Blood Group: "+blood_group1);
    System.out.println("Age: "+age);
    System.out.println("Email: "+e);
    System.out.println("phone number: +088 "+phone_number);
    System.out.println("Hospital name: "+Hospital_name);
    System.out.println("Department Name: "+DepartmentName);
    System.out.println("Booking Time: "+BookingTime);
   
    
        System.out.println("\n\n1.Main Menu"
                           + "\n2.Exit"); 
        int doc;
        do{
            System.out.print("\nPlease Seclect This Option: ");
            doc = in.nextInt();
            if(doc == 1){
            PatientMenu1(); 
            break;
            } 
            else if(doc == 2)
            {
            System.exit(0);
            }
            else{
            System.out.println(doc+" does not have in this Option:");
            }        
        }while(doc != 2); 

}  
}
