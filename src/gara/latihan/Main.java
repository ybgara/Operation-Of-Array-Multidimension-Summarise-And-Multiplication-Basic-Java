package gara.latihan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("HARI KE EMPAT BELAJAR JAVA DASAR 2.0 \n\n");

        int[][] matrix_A = {
                {5,6,7,8},
                {4,3,2,1}
        };

        int[][] matrix_B = {
                {1,4,5,8},
                {2,3,6,9}
        };

        int[][] matrix_D = {
                {1,2},
                {3,4},
                {5,6},
                {7,8}
        };

        System.out.println("Matrix A : ");
        outputArray(matrix_A);

        System.out.println("Matrix B : ");
        outputArray(matrix_B);

        // PERTAMBAHAN MATRIKS
        System.out.println("================================================== ++");
        if ((matrix_A.length == matrix_B.length) && (matrix_A[0].length == matrix_B[0].length)){
            int[][] matrix_C = tambahMatrix(matrix_A, matrix_B) ;
            outputArray(matrix_C);
        } else {
            System.out.println(" Ukuran Matriks Yang Akan Dijumlahkan Tidak Sama ! ");
        }

        // PERKALIAN MATRIKS
        System.out.println("================================================== ++");
        int[][] matrix_E = perkalianMatrix(matrix_B, matrix_D);
        outputArray(matrix_E);

    }

    private static int[][] perkalianMatrix(int[][] matrix_A, int[][] matrix_B){

        int[][] hasilPerkalian = new int[matrix_A.length][matrix_B[0].length] ;
        int temp ;

            for (int i = 0 ; i < matrix_A.length ; i++){
                for (int j = 0 ; j < matrix_B[0].length ; j++ ){
                    temp = 0 ;
                    for (int k = 0 ; k < matrix_A[0].length ; k++){
                        temp += matrix_A[i][k] * matrix_B[k][j] ;
                    }
                    hasilPerkalian[i][j] = temp ;
                }
            }
        return hasilPerkalian;
    }

    private static int[][] tambahMatrix(int[][] matrix_A, int[][] matrix_B){

        int[][] hasilTambah = new int[matrix_A.length][matrix_B[0].length] ;

        for (int i = 0 ; i < matrix_A.length; i++){
                    for (int j = 0 ; j < matrix_B[0].length; j++){
                        hasilTambah[i][j] = matrix_A[i][j] + matrix_B[i][j] ;
                    };

            };
        return hasilTambah ;
    }


    private static void outputArray(int[][] matrix){
        for (int i = 0 ; i < matrix.length ; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
