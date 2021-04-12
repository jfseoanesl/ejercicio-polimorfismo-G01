package test;

import Dominio.*;

public class Test {
    public static void main(String[] args) {
        
        Empleado e = new EmpleadoAsalariado(700);
        imprimirLiquidacion(e);
        
        Empleado eh = new EmpladoPorHora(100, 150, 39);
        imprimirLiquidacion(eh);
        
    }
    
    public static void imprimirLiquidacion(Empleado e){
        System.out.println("Liquidacion=" + e.getLiquidacion());
    }
}
