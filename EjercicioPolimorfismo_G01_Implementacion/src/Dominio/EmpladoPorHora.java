/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author jairo
 */
public class EmpladoPorHora extends Empleado {
    private double pHora, pHoraE;
    private int nHoras;

    public EmpladoPorHora() {
    }

    public EmpladoPorHora(double pHora, double pHoraE, int nHoras) {
        this.pHora = pHora;
        this.pHoraE = pHoraE;
        this.nHoras = nHoras;
    }

    /**
     * @return the pHora
     */
    public double getpHora() {
        return pHora;
    }

    /**
     * @param pHora the pHora to set
     */
    public void setpHora(double pHora) {
        this.pHora = pHora;
    }

    /**
     * @return the pHoraE
     */
    public double getpHoraE() {
        return pHoraE;
    }

    /**
     * @param pHoraE the pHoraE to set
     */
    public void setpHoraE(double pHoraE) {
        this.pHoraE = pHoraE;
    }

    /**
     * @return the nHoras
     */
    public int getnHoras() {
        return nHoras;
    }

    /**
     * @param nHoras the nHoras to set
     */
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public double getLiquidacion() {
           int nHorasE=0;
           if(this.nHoras>40){
               nHorasE = this.nHoras-40;
           }
           
           return (nHorasE * this.pHoraE) + (this.nHoras - nHorasE)*this.pHora;
    }
    
    
    
}
