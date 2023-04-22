package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);

        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(3);
        setTwo.add(4);
        setTwo.add(5);
        setTwo.add(6);

        Set<Integer> setThree = new HashSet<>();

        setThree.addAll(setOne);
        setThree.addAll(setTwo);
        System.out.println(setThree);

        Set<Integer> tempSetOne = new HashSet<>();
        Set<Integer> tempSetThree;
        tempSetOne.addAll(setOne);
        tempSetOne.retainAll(setTwo);
        tempSetThree = tempSetOne;
        System.out.println(tempSetThree);

        Set<Integer> tempTempSetOne = new HashSet<>();
        Set<Integer> tempTempSetThree;
        tempTempSetOne.addAll(setOne);
        tempTempSetOne.removeAll(setTwo);
        tempTempSetThree = tempTempSetOne;
        System.out.println(tempTempSetThree);

        setThree.removeAll(tempSetThree);
        System.out.println(setThree);


        Map<String, Integer> listOne = new HashMap<>();
        Map<String, Integer> listTwo = new HashMap<>();
        listOne.put("Jajka", 3);
        listOne.put("Mleko", 1);
        listTwo.put("Jajka", 2);
        listTwo.put("Kiełbasa", 2);

        listTwo.forEach((k, v) -> listOne.merge(k, v, Integer::sum));
        System.out.println(listOne);


        Map result = new HashMap(listTwo);
        result.keySet().retainAll(listOne.keySet());
        System.out.println(result);


        Map<String, Integer> difference = new HashMap<>(listOne);
        difference.remove(listTwo);
        System.out.println(difference);












    }
}
