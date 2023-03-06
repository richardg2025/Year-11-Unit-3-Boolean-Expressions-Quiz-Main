public class Main {

    public static void main(String[] args) {
        System.out.println(calculateGrade(90));
        System.out.println(calculateGrade(72));
        System.out.println(calculateGrade(42));

        System.out.println(fizzBuzz(6));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(25));
        System.out.println(fizzBuzz(124));

        System.out.println(frontBack("hello"));
        System.out.println(frontBack("hel"));
        System.out.println(frontBack("lo"));
        System.out.println(frontBack("o"));

        System.out.println(twoAsOne(1,2,3));
        System.out.println(twoAsOne(4,2,2));
        System.out.println(twoAsOne(2,2,5));

        System.out.println(endUp("hello"));
        System.out.println(endUp("heLlo"));
        System.out.println(endUp("hlo"));
        System.out.println(endUp("he"));
        System.out.println(endUp("HELLO"));

    }

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else if (grade >= 50) {
            return 'E';
        } else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num){
        if(num%3 == 0 && num%5 == 0){
            return "fizzBuzz";
        }
        else if(num%3 == 0){
            return "fizz";
        }
        else if(num%5 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack(String input){
        if(input.length() < 2){
            return input;
        }
        else{
            return input.substring(0, 2) + input + input.substring(0, 2);
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        return a + b == c || b + c == a || a + c == b;
    }

    // Question 5 - endUp
    public static String endUp(String input){
        if(input.length() <= 3){
            return input.toUpperCase();
        }
        else{
            return input.substring(0, input.length() - 3) + input.substring(input.length() - 3).toUpperCase();
        }
    }
}
