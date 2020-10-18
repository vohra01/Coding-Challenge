package kunal.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    String name;
    double salary;
    Integer id;
    String designation;

    public Employee(String name, double salary, Integer id, String designation, String insuranceScheme) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.designation = designation;
        InsuranceScheme = insuranceScheme;
    }

    String InsuranceScheme;

    public Employee(String name, double salary, Integer id, String designation) {
        //parameterized constructor
    }

    public String getInsuranceScheme() {
        return InsuranceScheme;
    }

    public String getInsuranceScheme(double salary) {
    /*  write your code here to return the scheme on the basis of salary
     if nothing falls in the range return null */

        if (salary > 5000 && salary < 20000) {
            return "scheme a";
        }

        if (salary >= 20000 && salary < 40000) {
            return "scheme b";
        }

        if (salary >= 40000) {
            return "scheme c";
        }

        if (salary < 5000 && salary < 2000) {
            return null;
        }


        return null;


    }
}


class EmployeeServiceImpl {
    //Declare a Hashmap here where key is an Integer and the value is Employee object
    public static Map<Integer, Employee> map = new HashMap<>();

    public static void addEmployee(Employee emp) {
        //write your code here to add employee to the hashmap
        map.put(1, emp);

    }

    public static boolean deleteEmployee(int id) {
        //write your code here for returning true if the employee deleted wrt the id passed else


        if (Objects.nonNull(map.get(id))) {
            map.remove(id);
            return true;
        }

        return false;


    }

    public static String showEmpDetails(String InsuranceScheme) {

    /*Write your code here to return a string i.e the employee details according to the insurance scheme
    Format: Name: name Id: id Salary: salary Designation: Designation InsuranceScheme: InsuranceScheme
    If multiple results they should be in a different line*/
        Employee employee = map.entrySet().stream()
                .filter(it -> it.getValue().InsuranceScheme.equals(InsuranceScheme))
                .findFirst()
                .map(Map.Entry::getValue).orElse(null);


        return "Name: " + employee.name
                + " Id: " + employee.id
                + "+Salary: " + employee.salary
                + "Designation: "
                + employee.InsuranceScheme + "InsuranceScheme: "
                + employee.InsuranceScheme + "\n".trim();




    }
}
