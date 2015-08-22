package net.waltonstine.permute;

import java.util.Arrays;
import java.util.Random;

public class Permute
{
    private static Random _rand = new Random();
    
    private Permute()
    {
    }

    private static void swap(Object[] arr, int ii, int jj)
    {
        Object temp  = arr[ii];
        arr[ii] = arr[jj];
        arr[jj] = temp;
    }
    
    public static Object[] permuteArray(Object[] arr)
    {
        int len = arr.length;
        
        for (int ii = 0; ii < len; ii++)
        {
            swap(arr, ii, _rand.nextInt(len));
        }
        
        return arr;
    }
    
    private static void showPermutations(Object[] arr)
    {
        System.out.printf("Permute %s\n", Arrays.asList(arr));
        
        for (int ii = 1; ii <= 10; ii++)
        {
            Permute.permuteArray(arr);
             System.out.println(Arrays.asList(arr).toString());
        }
    }
    
    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            showPermutations(args);
        }
       
        Integer[] intArr =
            {
                new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5), new Integer(6), new Integer(7), new Integer(8),
            };
        
        showPermutations(intArr);
        
        return;
    }
}


