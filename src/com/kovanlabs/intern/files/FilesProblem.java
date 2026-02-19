package com.kovanlabs.intern.files;

import java.io.*;
import java.util.Scanner;

/* Write a program to read a text file and print its contents line by line.

Write a program to copy the contents of one file into another file.

Write a program to count the number of lines, words, and characters in a file.

Write a program to write user input into a file until the user types exit.

Write a program to read a file and print only the lines that contain a specific word.

Write a program to append text to an existing file without overwriting its contents.

Write a program to read a file and find the longest word in it.

Write a program to read a file and convert all text to uppercase and store it in another file.

Write a program that demonstrates exception handling while reading a file that may not exist.

Write a program using try-with-resources to read data from a file.

Write a program to serialize an object to a file and deserialize it back.

Write a program to read a file byte-by-byte and display the output.

Write a program to store employee details in a file and retrieve them.

Write a program to delete a file after checking whether it exists.

Write a program to read a CSV file and display its contents in tabular format.
*/

public class FilesProblem  {



    public void fileRead(BufferedReader br) {
        try {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error in reading file");
        }
    }

        public void fileWrite(BufferedWriter bw ,String filename) {
            try {


                bw.write(filename);
                bw.newLine();
                bw.close();
                System.out.println("text Added sucessfully");
            }
            catch (IOException e) {
                System.out.println("file not able to write");
            }
        }

        public void countNumberOfLine(BufferedReader br){
        try {

            int count =0;
            String line = br.readLine();

            while(line != null){

                line = br.readLine();
                count++;
            }

            br.close();
            System.out.println("Number of lines: "+count);

            }
        catch (IOException e) {
            System.out.println("file not able to read");
        }

        }

        public void copyContentOneToAnother( BufferedReader br, BufferedWriter bw) {

        try{
            String line ;
            while((line = br.readLine())!= null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();

            System.out.println("text copied sucessfully");

        }catch(Exception e){
            System.out.println("Error in copying file");
        }



        }

    public static void main(String[] args) {

//        Scanner sc=  new Scanner(System.in);
//        String filename = sc.nextLine();
        try{
        FileReader fr = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("input.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        FilesProblem fp = new FilesProblem();
//        fp.fileRead();
//        fp.fileWrite(fw,bw,filename);
//        fp.countNumberOfLine(fr ,br);

            fp.copyContentOneToAnother(br,bw);

            br.close();
            fw.close();
            bw.close();
            fr.close();

    }catch(Exception e){
        System.out.println("Error in  file");}
    }
}
