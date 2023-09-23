package java.com.examly.springapp.controller;

@RestController
public class ApiController {
 
    @Autowired
    EmployeeService empSer;

    @GetMapping("/test")
    public String showMsg()
    {
        return "Hello";
    }

    @GetMapping("/api/salary/higher-than/{salary}")
    public List<Employee> getEmployeeWithSalaryHigherThan(@PathVariable(value="salary" )float sal)
    {
        List<Employee> empList=empSer.getEmployeeWithSalaryHigherThan(sal);
        return empList;
    }
}