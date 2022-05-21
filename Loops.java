import java.util.Scanner;

class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        //WHILE LOOP
        // int i=0;
        // while(i<=num){
        //     System.out.println(i);
        //     i++;
        // }

        //DO WHILE LOOP
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=num);

        //FOR LOOP 
        for(int i=0;i<=num;i++){
            System.out.println(i);
        }
        scan.close();
    }
}
