package ie.atu;

import java.io.*;
import java.util.Scanner;

public class createFile {
    public static void main(String[] args) {

        {


            try
            {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter a file name:");
                String filename = keyboard.nextLine();
                Scanner inputFile = new Scanner (new File(filename));
              FileWriter myFileWrite = new FileWriter(filename,true);
              myFileWrite.write("add new words");
              myFileWrite.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }

        }
    }

}
