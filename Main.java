import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a; // first number;
        int b; // second number
        int c; // spare number
        System.out.println ("enter first number");
        a = input.nextInt();
        c = a;
        System.out.println ("enter second number");
        b = input.nextInt();
        a = b;
        b = c;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
    }
}