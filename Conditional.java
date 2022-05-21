import java.util.Scanner;

class Conditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        if(num==0){
            System.out.println("NUMBER IS ZERO");
        }else if(num>0){
            System.out.println("NUMBER IS POSITIVE");
        }else{
            System.out.println("NUMBER IS NEGATIVE");
        }
        scan.close();
    }
}
