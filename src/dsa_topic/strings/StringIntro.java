package dsa_topic.strings;

public class StringIntro {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); //true

        String s3 = s2;
        System.out.println(s3 == s2); //true

        String s4 = s2 + " world";
        System.out.println(s4 == s3); //false

        String s5 = new String("Soumitra");
        String s6 = new String(" Das");

        System.out.println(s5 == s6); //false


    }
}
