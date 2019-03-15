package info.groupby;

public class Empolyee {

	private Integer empId;
	private Double empSalary;
	private String empDept;
	private String empName;

	public Empolyee() {
		super();
	}

	public Empolyee(Integer empId, Double empSalary, String empDept, String empName) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empDept = empDept;
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
