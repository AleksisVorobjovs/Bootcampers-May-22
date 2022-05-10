import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.Ask user to input two numbers, compare them and output result.
        System.out.println("Enter Int Value a:");
        int a = sc.nextInt();
        System.out.println("Enter Int Value b:");
        int b = sc.nextInt();
        boolean isEqual = false;
        boolean isLessThan = false;
        boolean isLessOrEqual = false;
        boolean isGreaterThan = false;
        boolean isGreaterOrEqual = false;

        if(a==b){
            isEqual=true;
        }
        if(a<=b){
            isLessOrEqual = true;
        }
        if (a>=b) {
            isGreaterOrEqual = true;
        }
        if(a<b){
            isLessThan = true;
        }
        if(a>b){
            isGreaterThan = true;
        }
        System.out.println("is "+a+" equal to  "+b+"? - "+isEqual);
        System.out.println("is "+a+" less than "+b+"? - "+isLessThan);
        System.out.println("is "+a+" less or equal  "+b+"? - "+isLessOrEqual);
        System.out.println("is "+a+" greater than  "+b+"? - "+isGreaterThan);
        System.out.println("is "+a+" greater or equal to  "+b+"? - "+isGreaterOrEqual);


        //2.Ask user to input two boolean values and compare them.
        System.out.println("Enter b1:");
        boolean b1 = sc.nextBoolean();
        System.out.println("Enter b2:");
        boolean b2 = sc.nextBoolean();
        boolean isEqual2 = false;
        if(b1==b2){
            isEqual2 = true;
        }
        System.out.println("is b1 equal to  b2 equal? - "+isEqual2);


        //3.Ask user to input a whole number and output true, if it is even number and false if it is odd number
        System.out.println("Enter Whole Number:");
        int a3 = sc.nextInt();
        if(a3%2==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        //4.Ask user to input a whole number and output false, if it is even number and true if it is odd number
        System.out.println("Enter Whole Number:");
        int a4 = sc.nextInt();
        if(a4%2==0){
            System.out.println("False");
        }else{
            System.out.println("True");
        }


        //5.Write a program which reads boolean value from user and prints out the opposite value:
        System.out.println("Enter boolean value:");
        boolean b5 = sc.nextBoolean();
        System.out.println(!b5);


        //6.Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true
        System.out.println("Enter Whole Number a:");
        int a6 = sc.nextInt();
        System.out.println("Enter Whole Number b:");
        int b6 = sc.nextInt();
        boolean isTrue = false;
        if(a6==b6){
            isTrue = true;
        }else if(a6<0 && b6>0){
            isTrue = true;
        }else if(a6>100 && b6>100){
            isTrue = true;
        }
        System.out.println(isTrue);
    }
}