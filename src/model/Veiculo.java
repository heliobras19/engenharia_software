/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author heliobras
 */
public class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public String identificador;
    private boolean ligado = false;
    
    public void iniciarMotor () {
        this.ligado = true;
    }
    
    public void desligarMotor () {
        this.ligado = false;
    }
    
    public void realizarManutencao() {
        
    }
}
