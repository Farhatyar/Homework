package HomeWork15.Task3;

public class task3Test {
    public static void main(String[] args) {
        Teacher obj1=new Teacher();
        mathteacher obj2=new mathteacher();
        ChemistryTeacher obj3=new ChemistryTeacher();
        pianoTeacher obj4=new pianoTeacher();

        System.out.println("*************************");

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        obj1.scream();
        System.out.println(obj1.eat("Food"));

        System.out.println("*************************");

        System.out.println(obj2.name);
        System.out.println(obj2.age);
        obj2.scream();
        System.out.println(obj2.eat("bread"));
        System.out.println(obj2.alwayspresent);
        obj2.mathprint();

        System.out.println("************************");

        System.out.println(obj3.name);
        System.out.println(obj3.age);
        obj3.scream();
        System.out.println(obj1.eat("cookie"));
        System.out.println(obj3.angry);
        obj3.Chemprint();

        System.out.println("*********************");

        System.out.println(obj4.name);
        System.out.println(obj4.age);
        obj4.scream();
        System.out.println(obj4.eat("nothing"));
        System.out.println(obj4.teaches);
        obj4.pianoprint();

    }
}
