package info.groupby;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupbyExample {

	public static void main(String[] args) {
		List<Empolyee> allEmp = new ArrayList<>();
		allEmp.add(new Empolyee(1, 25000.0, "IT-Development", "surendra"));
		allEmp.add(new Empolyee(2, 35000.0, "IT-admin", "Jagdeesh"));
		allEmp.add(new Empolyee(3, 10000.0, "IT-admin", "vamshi"));
		allEmp.add(new Empolyee(4, 100000.0, "IT-Development", "durga"));
		allEmp.add(new Empolyee(5, 90000.0, "IT-production", "vamshi"));
		allEmp.add(new Empolyee(6, 95000.0, "IT-production", "sai"));
		allEmp.add(new Empolyee(7, 15000.0, "IT-Development", "narendra"));
		allEmp.add(new Empolyee(8, 40000.0, "IT-Tesing", "sandeep reddy"));
		allEmp.add(new Empolyee(9, 30000.0, "IT-Development", "mahesh reddy"));
		allEmp.add(new Empolyee(10, 15000.0, "IT-Development", "sai chander reddy"));
		allEmp.add(new Empolyee(11, 20000.0, "IT-Tesing", "venkatesh"));
		allEmp.add(new Empolyee(12, 40000., "IT-Development", "bhanu chander"));

		List<String> collect = allEmp.stream().map(Empolyee::getEmpDept).filter(dep -> dep.equals("IT-Tesing"))
				.collect(Collectors.toList());

		System.out.println(collect);

		System.out.println("----------------------------------------------------------------------");

		List<String> collect2 = allEmp.stream().map(e -> e.getEmpDept()).distinct().collect(Collectors.toList());
		System.out.println(collect2);

		System.out.println("----------------------------------------------------------------------");

		// here one department has many more empilyee
		Map<String, List<Empolyee>> groupEmpolyeemap = allEmp.stream()
				.collect(Collectors.groupingBy(Empolyee::getEmpDept));

		System.out.println(groupEmpolyeemap);

		System.out.println("----------------------------------------------------------------------");

		Map<String, List<Empolyee>> groupEmpolyeemap1 = allEmp.stream()
				.collect(Collectors.groupingBy(Empolyee::getEmpDept));
		System.out.println(groupEmpolyeemap1.size());
		
		System.out.println("----------------------------------------------------------------------");
		
		
		// Here you reduce List<empolyee> inside departments to a number.
		Map<String, Double> collect3 = allEmp.stream().collect(Collectors.groupingBy
				(Empolyee::getEmpDept, Collectors.summingDouble(Empolyee:: getEmpSalary)));
		
		System.out.println(collect3);
		
		System.out.println("----------------------------------------------------------------------");
		
		//Average salary of each department
		
		Map<String, Double> AvgDeptSalary = allEmp.stream().collect(Collectors.groupingBy(Empolyee::getEmpDept, 
				Collectors.averagingDouble(Empolyee::getEmpSalary)));
		
		System.out.println(AvgDeptSalary);
	}

}
