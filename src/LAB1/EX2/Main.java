package LAB1.EX2;

import LAB1.EX1.Complex;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4}
        };

        int[][] B = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3}
        };

        int[][] addition = new int[3][3];
        int[][] multiplication = new int[3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                addition[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                multiplication[i][j] = 0;
                for (int k=0; k<3; k++){
                    multiplication[i][j] = multiplication[i][j] + A[i][k]*B[k][j];
                }
            }
        }

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf(addition[i][j] + " ");
            }
            System.out.printf("\n");
        }

        System.out.printf("\n");

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf(multiplication[i][j] + " ");
            }
            System.out.printf("\n");
        }

        // Close the scanner
        scanner.close();
    }
}
