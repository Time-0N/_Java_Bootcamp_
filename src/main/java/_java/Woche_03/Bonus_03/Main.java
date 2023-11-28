package _java.Woche_03.Bonus_03;

public class Main {
    public static void main(String[] args) {
        /*Cards card1 = new Cards(1);
        Cards card2 = new Cards(2);
        Cards card3 = new Cards(3);*/

        int[] numbers = {1,7,3,8};
        int[] sortedNumbers = {0,0,0,0};


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[i+1]) {
                sortedNumbers[i] = numbers[i];
                System.out.println(sortedNumbers[i]);
            }
        }


    }
}
