/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author safa-
 */
public class PasswordValidator {
      //rule1 length must be atleast 6
   //rule2 atleast 1 upper case
   //rule3 atleast 1 lower case
   //rule4 atleast 1 digit
   int upper,lower,digit;
   PasswordValidator()
   {
       this.upper=0;
       this.lower=0;
       this.digit=0;
   }
   public void rule1(String input)
   {
       for(int i=0;i<input.length();i++)
       {
           if(Character.isUpperCase(input.charAt(i)))
               upper++;
           if(Character.isLowerCase(input.charAt(i)))
               lower++;
           if(Character.isDigit(input.charAt(i)))
               digit++;
          
       }
       if(input.length()>=6 && upper>0 && lower>0 && digit>0)
           System.out.println("Password is valid ");
       else
           System.out.println("Password is not valid ");
   }
   public void rule2(String input)
   {
   //new rule of password validity --->number of characters must be >=10
   if(input.length()>=10)
       System.out.println("Password is valid ");
   else
       System.out.println("Password is not valid ");
      
   }
  

}
