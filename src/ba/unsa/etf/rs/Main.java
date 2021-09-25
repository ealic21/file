package ba.unsa.etf.rs;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Mujo","Mujic",45);
        //write file
        try {
            FileWriter fileWriter = new FileWriter("datoteka.txt");
            fileWriter.write(person.toString());
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }



        //read file

        try {
            FileReader fileReader = new FileReader("datoteka.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
