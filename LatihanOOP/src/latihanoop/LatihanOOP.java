/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanoop;

/**
 *
 * @author mlk
 */

import java.util.*;

public class LatihanOOP {

    /**
     * @param args the command line arguments
     */
    
//    static void print(Set<String> set) {
//        for (String element : set) {
//            System.out.print(element);
//        }
//    }
//    public static void main(String[] args) {
//        Set<String> set = new HashSet<String>();
//        set.add("A");
//        set.add("J");
//        set.add("A");
//        set.add("X");
//        print(set);
//    }
    
//    public static void main(String[] args) {
//        Map<String, Integer> map = new TreeMap<String, Integer>();
//        map.put("J", 1);
//        map.put("A", 2);
//        map.put("V", 3);
//        map.put("A", 4);
//        for (Object element : map.keySet()) {
//            System.out.print(element);
//        }
//    }    
    
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("T",1);
    map.put("M",3);
    map.keySet().add("A"); //keySet().add("A");
    System.out.println(map.size());
}

}
