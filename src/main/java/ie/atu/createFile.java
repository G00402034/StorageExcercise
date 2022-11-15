package ie.atu;

import java.io.*;

public class createFile {
    public static void main(String[] args) {

        {
           File myFile = new File("MyFile.txt");
           System.out.println("My file is located at " + myFile.getAbsolutePath());
           String words = "writing words";
            try
            {
              FileWriter myFileWrite = new FileWriter(myFile,true);
              myFileWrite.write("add new words");
              myFileWrite.close();
            }catch(IOException e)
            {
                e.printStackTrace();
            }

        }
    }

}
