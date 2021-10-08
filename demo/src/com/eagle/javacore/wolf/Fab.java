package com.eagle.javacore.wolf;

/**
 * @Title: Fab
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/7/19 15:06
 * @Version: 1.0
 */
public class Fab {
    public static void main(String[] args) {
        // 斐波那契数列特点：f(1)=1,f(2)=1,f(3)=f(1)+f(2),f(4)=(f2)+(f3)……依次类推。
        // 即后一个数都是等于前两个数的和，这样的数列就是斐波那契数列。
        System.out.println(f(5));
        int[] a = new int[2];
        int[] aa = new int[]{1,3,3} ;
    }

    public static int f(int n) {
        if(n == 1 || n ==2) {
            return 1;
        }else {
            return f(n-1) + f(n -2);
        }
    }
}
