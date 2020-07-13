package emailadministration;
import java.util.*;
public class EmailAdministration 
{
    String fname; 
    String lname;
    String dept;
    String pwd;
    String email;
    int pwdlength = 10;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.next();
        String dept = sc.next();
        EmailAdministration ea = new EmailAdministration(fname, lname, dept);
        ea.getDetails();
    }
    
    public EmailAdministration(String fname, String lname, String dept) 
    {
        this.fname = fname;
        this.lname = lname;
        this.dept = dept;
        email = fname + lname + "@" + dept + ".com";
        pwd = generatePwd();
    }
    
    public String generatePwd()
    {
        String CapLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallLetter = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String Combine = CapLetter + SmallLetter + specialCharacters + numbers;
        char c[] = new char[pwdlength];
        for(int i = 0; i < pwdlength; i++)
        {
            int randString = (int)(Math.random()*Combine.length());
            c[i] = Combine.charAt(randString);
        }
        return new String(c);   
    }
        String Changepwd(String pwd)
        {
            this.pwd = pwd;
            return pwd;
        }
        void  getDetails()
        {
            System.out.println("Name: " + fname + " " + lname);
            System.out.println("Email: " + email);
        }
}
