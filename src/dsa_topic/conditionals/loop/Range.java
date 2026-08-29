package dsa_topic.conditionals.loop;

public class Range {
    static void main(String[] args) {
        //for loop
        //print 1 to 5
        System.out.println("For loop: ");
        for (int i=1; i<=5; i++){

            System.out.print(i+" ");
        }

        //while
        int num = 1;
        System.out.println();
        System.out.println("While loop: ");
        while (num <= 5){

            System.out.print(num+" ");
            num++;
        }
    }
}

