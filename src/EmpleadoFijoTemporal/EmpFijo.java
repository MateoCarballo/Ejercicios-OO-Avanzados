package EmpleadoFijoTemporal;

import java.util.ArrayList;

public class EmpFijo extends Empleado{

    private String salario;
    private float irpf;
    private int trienios;

    public EmpFijo(String nss, String nombre,
                   String fechaDeNacimiento, char sexo, String salario, float irpf, int trienios) {
        super(nss, nombre, fechaDeNacimiento, sexo);
        this.salario = salario;
        this.irpf = irpf;
        this.trienios = trienios;
    }

    @Override
    public float sueldo() {
        return 0;
    }
}
