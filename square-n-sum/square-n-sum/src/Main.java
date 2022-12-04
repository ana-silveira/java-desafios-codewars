/*
Complete the square sum function so that it squares each number passed into it and
then sums the results together.
For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
*/


public class Main {
    public static void main(String[] args) {
        int[] number = {1, 2, 2};
        squareSum(number);
        System.out.println(squareSum(number));

    }
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int x : n){
            sum += Math.pow(x, 2);
        }
    return sum;
    }
}