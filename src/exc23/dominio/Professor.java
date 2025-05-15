package exc23.dominio;

public class Professor {
    private double salary = 0;
    private double hourValue;
    private int classes;
    private double inss;

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getsalary() {
        return salary;
    }

    public Professor(double hourValue, int classes, double inss) {
        this.hourValue = hourValue;
        this.classes = classes;
        this.inss = inss;
    }

    public double salaryCalculate(){
        salary = (classes*hourValue)*(inss/100);
        salary =(classes*hourValue) - salary;
        return salary;
    }

}
