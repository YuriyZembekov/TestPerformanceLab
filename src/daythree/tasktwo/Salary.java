package daythree.tasktwo;

import daytwo.taskthree.Integrator;

public class Salary {
    private String from;
    private String to;
    private Integer salary;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getSalary() {
        return salary;
    }
}
