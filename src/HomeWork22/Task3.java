package HomeWork22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
   /* Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
John Smith=$100000
    */
   public static void main(String[] args) {

       Map<String,Integer> employees=new HashMap<>();
       employees.put("Omar",18000);
       employees.put("Ahmad",28000);
       employees.put("John",100000);
       employees.put("Omid",58000);

       var entries=employees.entrySet();
       String HPE="";
       int HS=0;
       for(var entry:entries){
          if(entry.getValue()>HS){
              HS= entry.getValue();
              HPE=entry.getKey();
          }
       }
       System.out.println(HPE+"=$"+HS);


   }
}
