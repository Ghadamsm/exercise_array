import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//  1.Write a Java program to test if the first and the last element of an array of
//  integers are same. The length of the array must be greater than or equal to 2
//array = 50, -20, 0, 30, 40, 60, 10




//    int[] firstarray = {50 , -20 , 0 , 30 , 40 , 60 , 10};
//
//        if (firstarray.length < 2) {
//            System.out.println("false");
//        }else if (firstarray[0]== firstarray[firstarray.length -1] ){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }








//2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
//[1, 4, 17, 7, 25, 3, 100]




//                int[] array = {1, 4, 17, 7, 25, 3, 100};
//
//                double sum = 0;
//                for (int i = 0; i < array.length; i++) {
//                    sum += array[i];
//                }
//                double average = sum / array.length;
//
//        System.out.print("The average of the said array is : " + average);
//
//        System.out.println (" The numbers in the said array that are greater than the average are : ");
//
//                for (int i = 0; i < array.length; i++) {
//                    if (array[i] > average) {
//                        System.out.print(array[i] + " ");
//                    }
//                }






//3.Write a Java program to get the larger value between first and last element of an array of integers.
//[20, 30, 40]



//   int[] ints = {20, 30, 40};
//
//        int firstElement = ints[0];
//        int lastElement = ints[ints.length - 1];
//
//        if (firstElement > lastElement) {
//            System.out.println("Larger value between first and last element : " + firstElement);
//        } else {
//            System.out.println("Larger value between first and last element : " + lastElement);
//        }



        
        


//4.Write a Java program to swap the first and last elements of an array and create a new array.
//[20, 30, 40]




//        int[] ints1 = {20, 30, 40};
//        int ints = ints1[0];
//
//
//        ints1[0] = ints1[ints1.length - 1];
//        ints1[ints1.length - 1] = ints;
//
//        System.out.println("New array after swapping the first and last elements : " + Arrays.toString(ints1) );






//5. Write a program that places the odd elements of an array before the even elements
//[2,3,40,1,5,9,4,10,7]




//        int[] oddeven = { 2, 3, 40, 1, 5, 9, 4, 10, 7 };
//        int i = 0;
//
//
//        while (i < oddeven.length && oddeven[i] % 2 == 0) {
//            i++;
//            for (int j = i + 1; j < oddeven.length; j++) {
//                if (oddeven[j] % 2 != 0) {
//                    int co = oddeven[i];
//                    oddeven[i] = oddeven[j];
//                    oddeven[j] = co;
//                    i++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(oddeven));


        
        



//6. Write a program that test the equality of two arrays.
//[2,3,6,6,4] [2,3,6,6,4]



        
//        int[] first = {2, 3, 6, 6, 4};
//        int[] second = {2, 3, 6, 6, 4};
//
//
//        boolean equal = Arrays.equals(first, second) ;
//        System.out.println(equal);
//
      
       








    }
}