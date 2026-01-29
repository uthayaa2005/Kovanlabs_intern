package com.kovanlabs.intern.matrix;

public class SpiralTraversal {


        public static void main(String[] args){

            int[][] A= {
                    {1,2,3},
                    {8,9,4},
                    {7,6,5}
            };

            int top =0 , bottom = A.length-1;
            int left =0 , right = A[0].length-1;

            while(top <= bottom && left <= right){

                for(int i=left;i<=right;i++){
                    System.out.print(A[top][i]+" ");
                }
                top++;

                for(int i=top;i<=bottom;i++){
                    System.out.print(A[i][right]+ " ");
                }
                right--;


                for(int i=right;i>=left;i--){
                    System.out.print(A[bottom][i]+" ");
                }
                bottom--;

                for (int i = bottom; i >= top; i--) {

                    System.out.print(A[i][left] + " ");
                }
                left++;

            }
        }
    }

