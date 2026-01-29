package com.kovanlabs.intern.matrix;

public class MatrixMultiple {

        public static void main(String [] args){

            int[][] A = {
                    {1,3,2},
                    {2,4,5},
                    {6,4,3}
            };

            int[][] B ={
                    {5,4,3},
                    {4,6,2},
                    {0,5,2}
            };

            int[][] C = new int[3][3];

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){

                        C[i][j] += A[i][k] * B[k][j];

                    }
                }
            }

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }

    }


