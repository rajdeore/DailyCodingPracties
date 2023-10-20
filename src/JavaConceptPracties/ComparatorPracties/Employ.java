package JavaConceptPracties.ComparatorPracties;

public class Employ {
    String name;
    int empId;
    int phone;

    public Employ(String name, int empId, int phone) {
        this.name = name;
        this.empId = empId;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", phone=" + phone +
                '}';
    }
}
