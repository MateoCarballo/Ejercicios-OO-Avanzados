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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }

    @Override
    public float sueldo() {
        return 0;
    }
}
