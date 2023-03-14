package EmpleadoFijoTemporal;

import java.util.ArrayList;

public class EmpTemporal extends Empleado{

    private String fechaInicio;
    private String fechaFin;
    private double precioDia;

    private ArrayList<Ventas> listadoVentas = new ArrayList<>();

    public EmpTemporal(String nss, String nombre, String fechaDeNacimiento,
                   char sexo, String fechaInicio, String fechaFin, double precioDia,
                   ArrayList<Ventas> listadoVentas) {
        super(nss, nombre, fechaDeNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.listadoVentas = listadoVentas;
    }

    @Override
    public float sueldo() {
        return 0;
    }
}
