package java.com.examly.springapp.model;

import java.lang.annotation.Inherited;

@Entity
@Table(name="EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
   private String employeeName;
   private String email;
   private long mobile;
   private String address;
   private String roll;
   private float salary;
   private String department;
public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public long getMobile() {
    return mobile;
}
public void setMobile(long mobile) {
    this.mobile = mobile;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getRoll() {
    return roll;
}
public void setRoll(String roll) {
    this.roll = roll;
}
public float getSalary() {
    return salary;
}
public void setSalary(float salary) {
    this.salary = salary;
}
public String getDepartment() {
    return department;
}
public void setDepartment(String department) {
    this.department = department;
}
public Employee() {
    super();
}
public Employee(int employeeId, String employeeName, String email, long mobile, String address, String roll,
        float salary, String department) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.email = email;
    this.mobile = mobile;
    this.address = address;
    this.roll = roll;
    this.salary = salary;
    this.department = department;
}
@Override
public String toString() {
    return "Employee [address=" + address + ", department=" + department + ", email=" + email + ", employeeId="
            + employeeId + ", employeeName=" + employeeName + ", mobile=" + mobile + ", roll=" + roll + ", salary="
            + salary + "]";
}
   
    
}
