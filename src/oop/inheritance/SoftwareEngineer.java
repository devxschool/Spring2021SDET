package oop.inheritance;

public class SoftwareEngineer extends Engineer{

    private boolean isSeniorSDE;

    public SoftwareEngineer(int employeeNumber, String name, String DOB, String jobTitle,
                            double salary, boolean isOnTarget, boolean isSeniorSDE) {
        super(employeeNumber, name, DOB, jobTitle, salary, isOnTarget);
        this.isSeniorSDE = isSeniorSDE;
    }

    public boolean isSeniorSDE() {
        return isSeniorSDE;
    }

    public void setSeniorSDE(boolean seniorSDE) {
        isSeniorSDE = seniorSDE;
    }
}
