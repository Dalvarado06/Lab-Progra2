/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danielalvarado;

/**
 *
 * @author dalva
 */
public class Empleado { 
    
    private String nombre;
    private String apellido;
    private String cFavorito;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String titulo;
    private String cargo;
    private double salario;
    
    
    public Empleado(){}
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public Empleado(String nombre, String cargo){
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setcFavorito(String color){
       cFavorito = color;
    }
    
    public String getcFavorito(){
        return cFavorito;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
    @Override
    public String toString(){
        return "-> Nombre: "+nombre+" -> Apellido: "+apellido+" -> Cargo: "+cargo
                +" -> Salario: "+salario;
    }
    
    
}
