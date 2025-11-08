import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        int jackpot = 73;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {

            System.out.print("Guess a jackpot Number: ");
            int guess = sc.nextInt();

            if(jackpot == guess) {
                System.out.println("7 crore kya karenge itni rashi ka");
                break;
            }

            if(jackpot > guess) 
                System.out.println("Jackpot is greater than " + guess);

            if(jackpot < guess) 
                System.out.println("Jackpot is smaller than " + guess);

        }


    }


}