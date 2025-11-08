//CW2: WAP to print FizzBuzz using for loop
//divisible by 3: Fizz
//divisible by 5: Buzz
//divisible by 3 and 5: FizzBuzz

class Main {
    public static void main(String args[]) {
        for(int i = 1; i <= 15; i++) {

            if(i%15 == 0) {
                System.out.println("FizzBuzz");
            } else if(i%3 == 0) {
                System.out.println("Fizz");
            } else if(i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}