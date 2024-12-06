/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsort;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class InsertionSort {
    
     public static void insertionSort(double[] array, int startIndex) {
        int n = array.length;

        for (int i = startIndex + 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;

            while (j >= startIndex && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
     
      public static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double[] array = new double[70];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
        }

        System.out.println("Array before sorting:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the starting index for sorting (0 to 69): ");
        int startIndex = scanner.nextInt();

        while (startIndex < 0 || startIndex >= array.length) {
            System.out.print("Invalid index. Please enter a value between 0 and 69: ");
            startIndex = scanner.nextInt();
        }
      
        insertionSort(array, startIndex);

        System.out.println("\nArray after sorting:");
        printArray(array);

        scanner.close();
    }
    
}
