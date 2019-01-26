import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);


        int i = 0;

        while (i < numbers.length) {
            System.out.println("Podaj liczbę");
            numbers[i] = scanner.nextInt();
            i++;
        }

        int sum = 0;
        int j = 0;
        while (j < numbers.length) {
            sum = sum + numbers[j];
            j = j + 2;
        }
        System.out.println(sum);
    }

}



