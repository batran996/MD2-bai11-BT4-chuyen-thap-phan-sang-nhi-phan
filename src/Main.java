import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can chuyen");
        int input = scanner.nextInt();


        while (input != 0) {
            int sodu = input % 2;
            stack.push(sodu);
            input /=2;
        }
//        System.out.println(stack);
        int[] resul = new int[stack.size()];
        for (int i = 0; i < resul.length; i++) {
            resul[i] = stack.pop();
        }
        System.out.println("so he nhi phan la");
        System.out.println(Arrays.toString(resul));
    }
}