import java.util.*;
public class Regex{
    public static void main(String[] args) {
        
       String input= "6688 8948 4090";
       String re ="[0-9]{4}\\s{1}[0-9]{4}\\s{1}[0-9]{4}";
       Pattern p=Pattern.compile(re);
       Matcher m= p.matcher(input);
       if (m.find()&&m.group().equals(input)){
           System.out.println("valid");
       }else {
           System.out.println("invalid");
       }


       String input= "L154546124";
       String re ="[A-Z]{1}[1-9]{9}";
       Pattern p=Pattern.compile(re);
       Matcher m= p.matcher(input);
       if (m.find()&&m.group().equals(input)){
           System.out.println("valid");
       }else {
           System.out.println("invalid");
       }


    String input= "1254654";
    String re ="[1-9]\\d{7}";
       Pattern p=Pattern.compile(re);
       Matcher m= p.matcher(input);
       while (m.find()){
           System.out.println(input.substring(m.start(),m.end()));
       }
    }
}