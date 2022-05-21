import java.util.Scanner;

class Functions {
    int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Functions obj = new Functions();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("SUM = "+obj.sum(num1,num2));

        scan.close();

    }
}
