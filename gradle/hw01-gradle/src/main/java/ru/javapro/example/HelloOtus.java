package ru.javapro.example;
import com.google.common.primitives.Ints;
import java.util.List;

public class HelloOtus {
    public static void main(String[] args)
    {
        // Using Ints.compare() method to
        // compare the two specified int
        // values in the standard way
        // This should return positive number
        // as a is greater than b
        System.out.println(Ints.compare(7, 5));
        System.out.println("\n=========1 means that first letter is greater than second.========");

    }
}
