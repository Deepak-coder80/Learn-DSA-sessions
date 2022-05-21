import java.util.Scanner;



class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        switch(num){
        case 1:
            System.out.println("Entered number is one");
            break;
        case 2:
            System.out.println("Entered number is two");
            break;
        case 3:
            System.out.println("Entered number is three");
            break;
        default:
            System.out.println("NUMBER IS GREATER THAN 3");
            break;
        }
        scan.close();
    }    
}
