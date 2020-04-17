/**
 * declare and assign array numbers
 * then declare sum and initialize to 0
 * get each index value starting from 0
 * add all index values together
 * print out sum
 * */




public class completeArray {
    public static void main(String[] args){
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
            System.out.println(sum);
        }
    }
}
