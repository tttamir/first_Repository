import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //task1
        int n;
        System.out.print("vvedi n = ");
        n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(i%2==1)
            res+=i;
        }
        System.out.println("res = "+ res);

        //task2
        int a;
        int b;
        System.out.print("vvedi a = ");
        a = sc.nextInt();
        System.out.print("vvedi b = ");
        b = sc.nextInt();
        for (int i = a; i < b; i++) {
            if(i%2==0)
                System.out.println(i);

        }
        System.out.println("---------------------");
        //task3
        int i = 0;
        if ()
        for(i ; i <= 1 ; i++) {
                System.out.println(i);
        }
    }

}