package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {


			EmployeeInfo emp1 = new EmployeeInfo(1);
			EmployeeInfo emp2 = new EmployeeInfo("Nahid", 2);
			EmployeeInfo emp3 = new EmployeeInfo("Nayem", 3, 21);

			System.out.println("-------------------------------------");

			EmployeeInfo.calculateEmployeeBonus(50000, 7);
			EmployeeInfo.calculateEmployeeBonus(50000, 10);


			System.out.println("----------------------------------------");
			emp1.setname("Nayem");
			System.out.println(emp1.getName());

			System.out.println("--------------------------------------");


			ConnectToSqlDB connect = new ConnectToSqlDB();
			connect.insertProfileToSqlTable("Employees", "Id", "Age");


		}

	}

