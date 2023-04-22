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

        // zrobić 3 listę
        // dodać wszystko z listy nr 1,
        // dla każdego elementu z listy 2 jeżeli klucz występuje już w liście 3, to dodać jego wartość
        // w przeciwnym razie dodać klucz i wartość / put



















    }
}
