package com.cucumber.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.cucumber.dao.EmployeeDao;
import com.cucumber.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	public TreeMap<Integer, Employee> map = new TreeMap<>();
	public AtomicInteger randomNumber = new AtomicInteger(1000);
	String date = Calendar.getInstance().getTime().toString();

	public EmployeeDaoImpl() {
		/*for(int i=0;i<5;i++)
		{*/
			Employee employee = new Employee("manzer", "cognizant");
			addEmployee(employee);
		//	i++;
		//}
	}

	private boolean addEmployee(Employee employee) {
		if (employee != null) {
			int id = randomNumber.getAndIncrement();
			//System.out.println("id="+id+" emloyee="+employee.getId()+" name="+employee.getName());
			employee.setJoiningDate(Calendar.getInstance().getTime().toString());
			employee.setId(id);
			map.put(id, employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(map.values());
		return list;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = map.get(id);
		return employee;
	}

	@Override
	public void deleteAllEmployees() {
		map.clear();
	}

	@Override
	public boolean createEmployee(Employee employee) {
		boolean result = addEmployee(employee);
		if (result)
			return true;
		return false;
	}

	@Override
	public Employee deleteEmployee(int id) {
		return map.remove(id);
	}

	@Override
	public boolean updateEmployee(int id, Employee employee) {
		Employee currentEmployee = map.get(id);
		if (currentEmployee != null) {
			currentEmployee.setDeptname(employee.getDeptname());
			currentEmployee.setName(employee.getName());
			currentEmployee.setJoiningDate(employee.getJoiningDate()==null?currentEmployee.getJoiningDate():employee.getJoiningDate());
			map.put(id, currentEmployee);
			return true;
		}
		return false;
	}
}