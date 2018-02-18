package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ExercisesService implements Observable {
    private final List<Observer> observers;
    private final Queue<Exercise> exercises;
    private final String user;

    public ExercisesService(String user) {
        this.user = user;
        observers = new ArrayList<>();
        exercises = new ArrayDeque<>();
    }

    public void addExercise(Exercise exercise){
        exercises.offer(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<Exercise> getExercises() {
        return exercises;
    }

    public String getUser() {
        return user;
    }
}
