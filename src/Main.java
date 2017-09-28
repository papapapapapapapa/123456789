import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, number4, sum;
        System.out.print("請輸入a:");
        number1 = input.nextInt();
        System.out.print("請輸入b:");
        number2 = input.nextInt();
        System.out.print("請輸入c:");
        number3=input.nextInt();
        System.out.print("請輸入x:");
        number4=input.nextInt();
        sum = number1*(number4*number4)+number2*(number4)+number3;
        System.out.printf("計算結果y=%d", sum);
        input.close();
    }
}
