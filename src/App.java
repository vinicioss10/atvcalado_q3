import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num, poi;
        Scanner dig;

        dig = new Scanner(System.in);
        System.out.println("digite um numero");
        num = dig.nextInt();
        poi = (num % 2);
        if ((poi == 0) && (num < 0)) {
            System.out.println("O numero " + num + " é par ");
        } else {
            System.out.println("O numero " + num + " é impar ");
        }
        {
            if (0 < num) {
                System.out.println("o numero é positivo");
            } else {
                System.out.println("ele é negativo");
            }
        }
    }

}
