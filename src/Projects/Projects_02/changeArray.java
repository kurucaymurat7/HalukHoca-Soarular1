package Projects.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

    public static void main(String[] args) {

        String[] useThisArray = {"Peach" , "Berry" , "Orange" , "WaterMelon" , "Orange"};

        for (int i = 0; i < useThisArray.length; i++) {
            if (useThisArray[i].equalsIgnoreCase("Orange")) {
                useThisArray[i] = "Apple";
            }
        }
        System.out.println(Arrays.toString(useThisArray));
    }
}