package com.techelevator;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static List<Department> departments = new ArrayList();
    public static List<Employee> employees = new ArrayList();
    public static List<Employee> deptMarketing = new ArrayList();
    public static List<Employee> deptSales = new ArrayList();
    public static List<Employee> deptEngineering = new ArrayList();
    public static Map<String, Project> projects = new HashMap();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        
        // Assign departmental list
        assignDepartmentalList();
        
        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

        
    }
        	

        

    /**
     * Create departments and add them to the collection of departments
     */
    private static void createDepartments() {
    
    	Department depMarketing = new Department (001, "Marketing");
    	departments.add(depMarketing);
    	
    	Department depSales = new Department(002, "Sales");
    	departments.add(depSales);
    	
    	Department depEngineering = new Department(003, "Engineering");
    	departments.add(depEngineering);
    	
    }

	/**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        
        for(Department loopy : departments) {
        	System.out.println(loopy.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    	
    	Employee emp001 = new Employee ();
    	employees.add(emp001);
    	
    	
    	emp001.setEmployeeId(001);
    	emp001.setFirstName("Dean");
    	emp001.setLastName("Johnson");
    	emp001.setEmail("djohnson@teams.com");
    	emp001.setDepartment(departments.get(002));
    	emp001.setHireDate("08/21/2020");    	
    	
    	Employee emp002 = new Employee (002, "Angie", "Smith", "asmith@teams.com", departments.get(002), "08/21/2020");
    	employees.add(emp002);
    	

    	
    	Employee emp003 = new Employee (003, "Margaret", "Thompson", "mthompson@teams.com", departments.get(000), "08/21/2020");
    	employees.add(emp003);
    	
    	
        // Give Angie that raise she deserves for putting up with all of your shit.
   
    	emp002.setSalary(emp002.raiseSalary(10.0));
    	
    }
    
    /**
     * Assign employees to a departmental list based on onboarding Department input
     * 
     * This is not cheating, Frank. It is loosely coupled enough and
     * works with any subsequent employees added to the system. 
     * 
     * I will fight you over this.
     * 
     */
    	private static void assignDepartmentalList() {
    		
    	for(Employee loopy : employees) {
           if (loopy.getDepartment().getName() == "Marketing") {
        	   deptMarketing.add(loopy);
           }
           if (loopy.getDepartment().getName() == "Engineering") {
        	   deptEngineering.add(loopy);
           }   
           if (loopy.getDepartment().getName() == "Sales") {
        	   deptSales.add(loopy);
           }
    		
    	}
   }	
   
    
    
    /**
     * Print out each employee in the collection.
     */
    
    
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        for(Employee loopy : employees) {
        	System.out.println(loopy.getFullName() + 
        	  " (" + currency.format(loopy.getSalary()) + ") " + loopy.getDepartment().getName());	
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private static void createTeamsProject() {
    	
    	Project teams = new Project ("TEams", "Project Management Software", "10/10/2020", "10/17/2020");
   	
    	teams.setTeamMembers(deptEngineering);
    	
    	projects.put("TEams", teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
    	
    	Project marketing = new Project ("Marketing Landing Page", "Lead Capture Landing Page for Marketing", "10/10/2020", "10/17/2020");
    	
    	marketing.setTeamMembers(deptMarketing);
    	
    	projects.put("Marketing Landing Page", marketing);

    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        
        for (Map.Entry<String, Project> loopy : projects.entrySet()) {
            System.out.println(loopy.getKey() + ": " + loopy.getValue().getTeamMembers().size());

        }
        
    

    }

}

