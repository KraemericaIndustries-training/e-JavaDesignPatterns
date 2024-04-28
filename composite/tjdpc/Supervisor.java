package tjdpc;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements FacultyInterface {

    protected List<FacultyInterface> employeeList;

    private String name;
    private String deptName;

    Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
        employeeList = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        return (name + " is the " + deptName);
    }

    public void add(FacultyInterface professor) {
        employeeList.add(professor);
    }

    public void remove(FacultyInterface professor) {
        employeeList.remove(professor);
    }

    public List<FacultyInterface> getMyFaculty() {
        return employeeList;
    }
}
