package principal;

import modelo.hospital.*;
import modelo.personas.*;
import modelo.enums.Turno;
import modelo.abstractas.Empleado;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SistemaHospitalDemo {

    public static void main(String[] args) {

        Hospital h = new Hospital("Hospital Central");

        Medico m = new Medico(1,"Juan","Perez",LocalDate.of(1990,1,1),"a@a.com",
                "001",LocalDate.now(),2000,true,"123","General");

        Cirujano c = new Cirujano(2,"Luis","Lopez",LocalDate.of(1985,1,1),"b@b.com",
                "002",LocalDate.now(),3000,true,"456","Cirugia",5);

        Enfermero e = new Enfermero(3,"Ana","Diaz",LocalDate.of(1995,1,1),"c@c.com",
                "003",LocalDate.now(),1500,true,Turno.MANANA);

        h.contratarEmpleado(m);
        h.contratarEmpleado(c);
        h.contratarEmpleado(e);

        Paciente p = new Paciente(1,"Pedro","Gomez",LocalDate.of(2000,1,1),"p@p.com","HC1","O+");

        h.registrarPaciente(p);

        CitaMedica cita = new CitaMedica(1,p,m,LocalDateTime.now(),"Consulta");

        h.agendarCita(cita);

        ArrayList<Empleado> lista = new ArrayList<>();
        lista.add(m);
        lista.add(c);
        lista.add(e);

        for (Empleado emp : lista) {
            System.out.println(emp.obtenerTipo() + " salario: " + emp.calcularSalario());
        }

        System.out.println("Nomina total: " + h.calcularNominaTotal());
    }
}