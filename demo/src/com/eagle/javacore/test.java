package com.eagle.javacore;

import java.util.*;

/**
 * @Title: test
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/9/7 16:54
 * @Version: 1.0
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()){
            
            System.out.println(iterator.next());
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        boolean b = map.containsKey(1);
        map.containsValue("a");
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            map.get(integer);
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.getKey();
            entry.getValue();
        }

    }
}
