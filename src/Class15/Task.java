package Class15;

public class Task {
    /*Create a method createEmail(). Based on values of users name,
     lastName and email type, your method should return complete
      email Address. Example:  createEmail(John, Snow,gmail) → johnsnow@gmail.com or
      return type =>String
      name=>createEmail
      parameter=>String FirstName String lastName String Emailtype
      {
      concat
      {
     */
    String createEmail(String FirstName,String LastName,String emailType){
        return FirstName+LastName+"@"+emailType+".com";
    }
}
