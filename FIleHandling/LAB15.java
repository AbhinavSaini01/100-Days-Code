package LAB;

import java.io.*;

class Employee 
{
    private int empNo;
    private String empName;
    private int empBasic;

    public Employee(int empNo, String empName, int empBasic)
    {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

	public int getEmpNo()
	{
		return empNo;
	}

	public int getEmpBasic() 
	{
		return empBasic;
	}

	public String getEmpName() {
		return empName;
	}
}

public class LAB15
{
    private static final String FILE_PATH = "emp.txt";

    public static void main(String[] args) throws IOException 
    {
        Employee employee = new Employee(123, "John Doe", 5000);

        try (PrintWriter writer = new PrintWriter(FILE_PATH))
        {
            writer.println(employee.getEmpNo() + "," + employee.getEmpName() + "," + employee.getEmpBasic());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) 
        {
            String line = reader.readLine();
            if (line != null) {
                String[] parts = line.split(",");
                int empNo = Integer.parseInt(parts[0]);
                String empName = parts[1];
                int empBasic = Integer.parseInt(parts[2]);

                System.out.println("Employee details:");
                System.out.println("Employee Number: " + empNo);
                System.out.println("Employee Name: " + empName);
                System.out.println("Employee Basic Salary: " + empBasic);
            }
        }
    }
}


