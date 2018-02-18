package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(ExercisesService exercisesService) {
        System.out.println("New exercise from student " + exercisesService.getUser() +
                " for mentor " + mentorName + " (count: " + updateCount + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
