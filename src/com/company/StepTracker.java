package com.company;

public class StepTracker {
    private int numSteps;
    private int totalSteps;
    private int numActiveDays;
    private int numDays;

    public StepTracker(int steps){
        numSteps = steps;
        totalSteps = 0;
        numActiveDays = 0;
        numDays = 0;
    }

    public double averageSteps(){
        if(numDays==0) return 0.0;
        return (double)totalSteps/numDays;
    }

    public void addDailySteps(int steps){
        totalSteps += steps;
        if(steps>=numSteps) numActiveDays++;
        numDays++;
    }
    public int activeDays(){
        return numActiveDays;
    }

    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
