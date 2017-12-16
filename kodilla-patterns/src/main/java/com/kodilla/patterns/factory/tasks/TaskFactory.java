package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "Driving task";
    public static final String PAINTING_TASK = "Painting task";
    public static final String SHOPPING_TASK = "Shopping task";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving to Germany", "Germany", "Car" );
            case PAINTING_TASK:
                return new PaintingTask("Painting kitchen", "Yellow", "Kitchen");
            case SHOPPING_TASK:
                return new ShoppingTask("Buying new TV", "TV", 1.0);
            default:
                return null;
        }
    }
}
