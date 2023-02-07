package HomeWork16.Task2;

public class Tester {
    public static void main(String[] args) {
        FulltimeEmp f1=new FulltimeEmp("Finance","Abdullah",
                4325,(short) 7000);
        f1.details();
        f1.vacation();
        f1.weekdays();

        System.out.println("**************************");

        PartTimeEmp p1=new PartTimeEmp("Morning","Khan",564,(short) 4500);
        p1.details();
        p1.daysPresent(new String[]{"Monday","Tuesday","Friday"});

        System.out.println("----------------------------");
        HRFullTimeEmps h1=new HRFullTimeEmps("Managing the department",
                "HR manager","Omar",789,(short) 21000);
        h1.details();
        System.out.println(h1.unpaidLeaves(9));
        h1.weekdays(); // from grandparent
        h1.vacation();// from parent


    }
}
