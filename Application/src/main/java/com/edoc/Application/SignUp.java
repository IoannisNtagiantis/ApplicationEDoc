package com.edoc.Application;

import java.io.PrintStream;
import java.util.Scanner;

public class SignUp {
    Scanner scanner = new Scanner(System.in);
   public void identification () {
       System.out.println("Please enter your Username: ");
       String username = scanner.nextLine();

       System.out.println("Please enter your password: ");
       String password = scanner.nextLine();

   }

  public char role () {
       String doctor;
       char input = 0;
       do {
           System.out.println("Are you a doctor? (y/n)");
           doctor = scanner.nextLine();

           if (doctor.length() == 1) {
               input = doctor.charAt(0);
           }
       } while ((doctor.length() != 1) || (input != 'y' && input != 'n'));

       return input;
   }

   public void CitizenSignUp(){
       String name , LastName , AMKA , address , PostalCode , PhoneNumber ;
       Boolean FamilyStatus;

       System.out.print("Name: ");
         name = scanner.nextLine();

        System.out.print("\nLast Name: ");
         LastName = scanner.nextLine();

        System.out.print("\nAMKA : ");
         AMKA = scanner.nextLine();

        System.out.print("\nAddress : ");
         address = scanner.nextLine();

        System.out.print("\nPostalCode : ");
         PostalCode = scanner.nextLine();

        System.out.print("\nPhoneNumber : ");
         PhoneNumber = scanner.nextLine();

         System.out.print("\nFamily Status (true/false) : ");
           FamilyStatus = scanner.nextBoolean();


           if (FamilyStatus) {
               System.out.print("\nHow many members your family has? : ");
               int FamilyMembers = scanner.nextInt();
           }


   }

   public void DoctorSignUp(){
       String Name , LastName , AFM , address , PostalCode , PhoneNumber , Capacity;
   }
}
