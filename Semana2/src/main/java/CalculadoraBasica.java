/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */


public class CalculadoraBasica  extends Calculadora{
    
    private String modelo;
    
  public double div(double a, double b){
      return a / b;
  }
    
  public double multiplicacion(double a, double b){
      return a * b;
  }  

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
    
}
