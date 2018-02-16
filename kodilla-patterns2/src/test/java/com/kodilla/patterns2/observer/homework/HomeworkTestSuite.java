package com.kodilla.patterns2.observer.homework;


import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ExercisesService exercisesService1 = new User1ExerciseService("John");
        ExercisesService exercisesService2 = new User2ExerciseService("Anna");
        Mentor jim = new Mentor("Jim");
        Mentor tom = new Mentor("Tom");
        exercisesService1.registerObserver(jim);
        exercisesService2.registerObserver(tom);
        //when

        exercisesService1.addExercise(new Exercise("Exercise 1 - Interface"));
        exercisesService1.addExercise(new Exercise("Exercise 2 - Abstract Class"));
        exercisesService1.addExercise(new Exercise("Exercise 3 - Spring"));
        exercisesService2.addExercise(new Exercise("Exercise 4 - Hibernate"));
        exercisesService2.addExercise(new Exercise("Exercise 5 - Design Patterns"));

        //Then
        assertEquals(3, jim.getUpdateCount());
        assertEquals(2, tom.getUpdateCount());
    }
}
