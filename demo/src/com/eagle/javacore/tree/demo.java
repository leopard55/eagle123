package com.eagle.javacore.tree;

public class demo {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int temp = 0;
        int count = 0;
        for (i=100; i<=999; i++)
        {
            temp = i;
            for (j=0; j<3; j++)
            {
                sum += (temp%10);
                temp /= 10;
            }
            if(0 == (sum%8))
            {
                count++;
            }
            sum = 0;
        }
        System.out.println(count);

    }
}
