package org.notification_system_observer_design_pattern;

public class JobFinder implements Subscriber{

    protected String name;

    public JobFinder(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Notify "+name+" : "+message);
    }
}
