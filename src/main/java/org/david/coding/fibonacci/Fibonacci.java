package org.david.coding.fibonacci;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 15/08/2017.
 */
class Fibonacci {

    long calculate(long n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return calculate(n - 2) + calculate(n - 1);

    }


    List<Integer> readFile(String filename) {

        List<Integer> list = new ArrayList<Integer>();

        File file = new File(filename);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text;
            while ((text = reader.readLine()) != null) {
                try {
                    if ( isNumber(text) ) {
                        int num = Integer.parseInt(text);
                        list.add(num);
                    }
                }catch (NumberFormatException e ){
                    e.getStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

   void writeFile (List<Integer> numbers){
    // for each number in numbers list calculate fibonacci
       // and write those number to a file

   }

    boolean isNumber( String s ) {
        // todo
        return false;
    }
}
