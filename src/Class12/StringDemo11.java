package Class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="send it to support channel.more java";
        String newstr=str.substring(4);
        System.out.println(newstr);
        // we can also specify the staring point and the ending point
        System.out.println(str.substring(0,18));
    }
}
