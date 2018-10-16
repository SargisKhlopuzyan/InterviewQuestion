package com.example.sargiskh.interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class FindSecondMaxElementClass {

    public static Integer findSecondMaxElement(List<Integer> elements) {

        int maxIndex1 = -1;
        int maxIndex2 = -1;

        for (int k = 0; k < elements.size(); k++) {
            if (elements.get(k) != null) {
                if (maxIndex1 == -1) {
                    maxIndex1 = k;
                } else if (maxIndex2 == -1 && (elements.get(maxIndex1) != elements.get(k)) ) {
                    if (elements.get(maxIndex1) < elements.get(k)) {
                        maxIndex2 = maxIndex1;
                        maxIndex1 = k;
                    } else {
                        maxIndex2 = k;
                    }
                    break;
                }
            }
        }

        if (maxIndex1 == -1 || maxIndex2 == -1) {
            return null;
        }

        int startIndex = maxIndex1 > maxIndex2 ? maxIndex1 : maxIndex2;

        for (int i = startIndex + 1; i < elements.size(); i++) {
            if (elements.get(i) == null) {
                continue;
            }
            if (elements.get(i) > elements.get(maxIndex1) && elements.get(i) > elements.get(maxIndex2)) {
                maxIndex2 = maxIndex1;
                maxIndex1 = i;
            } else if (elements.get(i) < elements.get(maxIndex1) && elements.get(i) > elements.get(maxIndex2)) {
                maxIndex2 = i;
            }
        }

        return elements.get(maxIndex2);
    }


    public static List<Integer> getRandomIntegerList() {
        List<Integer> elements = new ArrayList<>();
        elements.add(null);
        elements.add(11);
        elements.add(null);
        elements.add(null);
        elements.add(11);
        elements.add(4);
        elements.add(null);
        elements.add(14);
        elements.add(2);
        elements.add(16);
        elements.add(null);
        elements.add(null);
        elements.add(6);
        elements.add(null);
        elements.add(4);
        elements.add(1);
        elements.add(null);
        elements.add(5);
        elements.add(1);
        elements.add(9);
        elements.add(null);
        elements.add(7);
        elements.add(2);
        elements.add(null);
        elements.add(10);
        elements.add(11);

        return elements;
    }

}