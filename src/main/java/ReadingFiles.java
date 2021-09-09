import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFiles {
    public static void main(String[] args) {

        System.out.println("\n============== Data in File ==============");
        System.out.println("This is information about the data in the resources folder:\n");
        //access and read the files in the resources folder
        //need to access file in a specific way

        //use InputStream, captures data as a String og bytes
        //need to use .class file because we are in static method
        //we would use getClass() if were in a non-static method
        //then use getResourceAsStream() and we pass in the path location to the file we want, this returns an InputStream
        //goal to find resource folder in our program structure
        //everything closes automatically with this method

        int[] nums;

        try (
                InputStream file = ReadingFiles.class.getResourceAsStream("/somenums.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(file))
        ) {

            //loop through document to capture all numbers and sum them without using ArrayList, just Array

            int count = 0;
            String line;
//            while ( (line = reader.readLine()) != null) {
//                count++;
//            }//while

            //System.out.println("count");

            //end of counting loop
            nums = new int [10];

            int sum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                sum += nums[i];
//            }
//
//            System.out.println("Sum of numbers: " + sum);

        } catch (IOException bad) {

        }
        //-----------------------------------------------------------------------------------

        try (
                InputStream file = ReadingFiles.class.getResourceAsStream("/somenums.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(file))
        ) {

            //if a line has 10 "day"s in it, it will only be counted as one
            //answers "how many lines have "day in it?"
            String line;
            int dayCount = 0;
            while ((line = reader.readLine()) != null) {
                if (line.contains("day")) {
                    dayCount++;
                }
            }

            System.out.println("Day appears " + dayCount + " times");

            //quick and powerful reading from and printing text file
            //Files.newBufferedReader(Paths.get(String.valueOf(file))).lines().collect(Collectors.toList()).forEach(System.out::println)

        } catch (IOException bad) {

        }

        //------------------------------------------------------------

//        try (
//                InputStream file = ReadingFiles.class.getResourceAsStream("/somenums.txt");
//                BufferedReader reader = new BufferedReader(new InputStreamReader(file))
//        ) {
//            int index = 0;
//
//            while ( (line = r2.readLine()) != null) {
//                nums[index] = Integer.parseInt(line);
//                index++;
//            }//while
//
//            int sum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                sum += nums[i];
//            }
//
//            System.out.println("Sum of numbers: " + sum);
//
//
//        } catch (IOException bad) {
//
//        }





        //have to make a new buffered reader because old one does not start at top of file
        //BufferedReader r2 = new BufferedReader(new InputStreamReader(file));





        System.out.println("\n============== Data in File ==============");
        System.out.println("This is information about the data in the root folder:\n");



    }//main
}//class
