import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
    Scanner inp =new Scanner(System.in);
        System.out.println("Enter Your Number : ");
    int number = inp.nextInt();
    int basNumber = 0;
    int tempNumber = number;
    int result = 0;
    int basPow;
    int basValue;


    while (tempNumber != 0){
        tempNumber /= 10;
        basNumber++;
    }

   tempNumber = number;
    while (tempNumber != 0){
        basValue = tempNumber % 10;
        basPow = 1;
        for (int i = 1; i <= basNumber; i++){
            basPow *=basValue;
        }
        result += basPow;
        tempNumber /= 10;

   }

        System.out.println(result);

    }

}
