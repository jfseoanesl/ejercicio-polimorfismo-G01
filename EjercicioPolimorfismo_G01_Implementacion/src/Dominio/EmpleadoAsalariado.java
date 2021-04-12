package Dominio;

public class EmpleadoAsalariado extends Empleado {
     private double pSemanal;

    public EmpleadoAsalariado() {
        super();
    }

     
    public EmpleadoAsalariado(double pSemanal) {
        super();
        this.pSemanal = pSemanal;
    }

    public double getpSemanal() {
        return this.pSemanal;
    }

    public void setpSemanal(double pSemanal) {
        this.pSemanal = pSemanal;
    }

    @Override
    public double getLiquidacion() {
         return this.pSemanal / 7 * 30;
    }
     
     
}
