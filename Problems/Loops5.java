package com.krishna.Problems;

//Multiple ways to create and print array
//Since non-square array is more complex, focus is more here

public class Loops5 {
    public static void main(String[] args) {
        System.out.println("Declaration and initialization...[non-squaer jaggged]");

        int[][] mat = {
                {6, 7, 8, 9},
                {1, 2},
                {4, 5, 6},

        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();

        }


//        *********************************************************************************

        System.out.println("First Declaration and then initialization...[non-square jagged]");

        int[][] mat1 = new int[3][];
        mat1[0] = new int[4];
        mat1[1] = new int[2];
        mat1[2] = new int[1];
        mat1[0][0] = 1;
        mat1[0][1] = 2;
        mat1[0][2] = 3;
        mat1[0][3] = 24;
        mat1[1][0] = 78;
        mat1[1][1] = 4;
        mat1[2][0] = 5;

        for (int[] ints : mat1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();

        }

        //        *********************************************************************************


        System.out.println("First Declaration and then initialization...[non-square]");

        int[][] mat2 = new int[3][2];
        mat2[0][0] = 1;
        mat2[0][1] = 2;
        mat2[1][0] = 3;
        mat2[1][1] = 4;
        mat2[2][0] = 5;
        mat2[2][1] = 6;

        for (int[] ints : mat2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();

        }

        //        *********************************************************************************

        System.out.println("Declaration and initialization...[square]");

        int[][] mat3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] ints : mat3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();

        }

    }
}

/*Conclusion
The for Loop used for non-square jagged 2D array can be used for square arrays as well. Hence, it's the universal one.
*/