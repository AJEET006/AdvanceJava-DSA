
public class Main
{
		public static void main(String [] args) 
		{
			Employee e1 = new Employee("A", 34, 15500); //name, age & salary
			Employee e2 = new Employee("B", 31, 15600);
			Employee e3 = new Employee("C", 32, 15100);
			Employee e4 = new Employee("D", 30, 15200);
			Employee e5 = new Employee("E", 31, 15300);

			doublyEmpLL employeeList1 = new doublyEmpLL();
			employeeList1.insert(e1);
			employeeList1.append(e2);
			employeeList1.insert_at_pos(e3,3);

			doublyEmpLL employeeList2 = new doublyEmpLL()
					employeeList1.append(e4);
			employeeList1.insert(e5);
			employeeList1.append("F", 31, 15900);

			System.out.println(employeeList1);
			System.out.println(employeeList2);

			employeeList1.append(employeeList2);
			employeeList1.deleteOlderThan31Age();
			EmployeeDLL.printCommonEmployees(employeeList1, employeeList2);

			EmployeeDLL employeeList3 = EmployeeDLL.concat(employeeList1, employeeList2);
			System.out.println(employeeList3);
		}
}







