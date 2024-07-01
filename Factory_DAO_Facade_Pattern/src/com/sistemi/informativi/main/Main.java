package com.sistemi.informativi.main;

import com.sistemi.informativi.business.Choice;
import com.sistemi.informativi.business.ChoiceImpl;
import com.sistemi.informativi.enumeration.Course;

public class Main {
    public static void main(String[] args) {

        Choice choose = new ChoiceImpl();
        choose.choice(Course.FRONTEND).forEach(System.out::println);
    }
}
