package Ejercicio3;

public class EjercicioLab3 {
    public static void main (String[] args){

        Employee empleado1 = new Employee(3476,"Maria","Perez","HR", 3,32876.25);
        Employee empleado2 = new Employee(2761,"Pedro", "Gonzales", "Management", 10, 59300.85);
        Employee empleado3 = new Employee(1693,"Carlota", "Rodriguez","Development", 7, 37866.01);

        System.out.println("Empleado: " + empleado1.getName() + " " + empleado1.getLastName() + " con ID: " + empleado1.getId() + " lleva " + empleado1.getWorkingYears() + " años ocupando la posicion de " + empleado1.getDepartment() + " por lo que su salario es de: " + empleado1.getSalary() + " Euros");
        System.out.println("Empleado: " + empleado2.getName() + " " + empleado2.getLastName() + " con ID: " + empleado2.getId() + " lleva " + empleado2.getWorkingYears() + " años ocupando la posicion de " + empleado2.getDepartment() + " por lo que su salario es de: " + empleado2.getSalary() + " Euros");

        empleado3.setDepartment("CEO");
        empleado3.setSalary(100453.54);

        System.out.println("Empleado: " + empleado3.getName() + " " + empleado3.getLastName() + " con ID: " + empleado3.getId() + " lleva " + empleado3.getWorkingYears() + " años ocupando la posicion de " + empleado3.getDepartment() + " por lo que su salario es de: " + empleado3.getSalary() + " Euros");

    }
}
