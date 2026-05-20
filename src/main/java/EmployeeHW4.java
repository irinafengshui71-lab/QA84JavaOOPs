public class EmployeeHW4 extends PersonHW4{

    private String company;
    private int salary;

    public EmployeeHW4(){}

    public EmployeeHW4(String company, int salary){

        this.company = company;
        this.salary = salary;
    }



    public void setCompany(String company) {
        if (company != null)
        this.company = company;
    }

    public void setSalary(int salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeHW4{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }



}
