import java.util.Scanner;

public class Main {

    public static boolean checkPrime(int num){
        boolean check = false;
        for (int i = 2; i<num; i++){
            if (num%i == 0){
                check = false;
                break;
            }else check = true;
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Prime number: ");
        int num = scanner.nextInt();

        int count = 0;
        int i = 3;

        System.out.print("The number of prime number less than " + num + " are : 2, ");

        while (count<num -1){
            if (checkPrime(i)){
                System.out.print(i + ", ");
                count += 1;
            }
            i ++;
        }
    }
}
