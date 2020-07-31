/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_danielalvarado;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Daniel A. Alvarado
 */
public class Lab2_DanielAlvarado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> lista = new ArrayList();
        Random ale = new Random();
        
        int opcion = 0;
        boolean logIn = false;

        while (opcion != 8) {

            System.out.println("1) Agregar empleado");
            System.out.println("2) Despedir empleado");
            System.out.println("3) Log in");
            System.out.println("4) Ascender cajero");
            System.out.println("5) Listar empleados ");
            System.out.println("6) Modificar un empleado");
            System.out.println("7) RANDOM");
            System.out.println("8) Opcion de salida");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {

                case 1:
                    if (logIn) {
                        System.out.println("Registro empleados");

                        System.out.println("Ingrese el nombre: ");
                        String nombre = sc.next();
                        System.out.println();
                        System.out.println("Ingrese su apelldio: ");
                        String apellido = sc.next();
                        System.out.println();
                        System.out.println("Ingrese su color favorito: ");
                        String color = sc.next();
                        System.out.println();
                        System.out.println("Ingrese su edad: ");
                        int edad = sc.nextInt();
                        System.out.println();
                        System.out.println("Ingerese su altura: ");
                        double altura = sc.nextDouble();
                        System.out.println();
                        System.out.println("Ingrese el peso: ");
                        double peso = sc.nextDouble();
                        System.out.println();
                        System.out.println("Ingrese titulo: ");
                        sc.nextLine();
                        String titulo = sc.nextLine();
                        System.out.println();
                        System.out.println("Ingrese su genero: ");
                        String genero = sc.next();
                        System.out.println();

                        String cargo = "";
                        System.out.println("Elija el cargo: ");
                        System.out.println("1) cajero");
                        System.out.println("2) gerente");
                        System.out.println("3) aseador");
                        System.out.println("4) seguridad");
                        System.out.println("Ingrese la opcion: ");
                        int opcion2 = sc.nextInt();
                        System.out.println();

                        while (opcion2 < 0 || opcion2 > 4) {
                            System.out.println("Ingrese una opcion valida: ");
                            opcion2 = sc.nextInt();
                            System.out.println();
                        }

                        double salario = 0;

                        switch (opcion2) {
                            case 1:
                                salario = 40000;
                                cargo = "cajero";
                                break;

                            case 2:
                                salario = 50000;
                                cargo = "gerente";
                                break;

                            case 3:
                                salario = 30000;
                                cargo = "aseador";
                                break;

                            case 4:
                                salario = 38000;
                                cargo = "seguridad";
                                break;
                        }

                        Empleado e = new Empleado(nombre);
                        e.setApellido(apellido);
                        e.setcFavorito(color);
                        e.setAltura(altura);
                        e.setCargo(cargo);
                        e.setSalario(salario);
                        e.setPeso(peso);
                        e.setEdad(edad);
                        e.setTitulo(titulo);
                        e.setGenero(genero);

                        lista.add(e);

                        System.out.println("El empleado se ha agregado "
                                + "exitosamente: ");
                        System.out.println();

                    } else {
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }

                    break;

                case 2:
                    if (logIn) {
                        System.out.println("Despedir empleado");

                        if (lista.isEmpty()) {
                            System.out.println("No hay empleados por despedir");
                        } else {
                            System.out.println("Esta es la lista: ");
                            for (Empleado e : lista) {
                                System.out.println(lista.indexOf(e) + "  " + e);
                            }

                            System.out.println("Elija la posicion del empleado"
                                    + " a despedir: ");
                            int posicion = sc.nextInt();

                            while (posicion > lista.size() - 1 || posicion < 0) {
                                System.out.println("Ingrese una posicion correcta: ");
                                posicion = sc.nextInt();
                                System.out.println();
                            }
                            
                            Empleado c = lista.get(posicion);
                            
                            System.out.println("Desea eliminar a :"+c
                            + " 1 = si 2 = no");
                            int eleccion = sc.nextInt();
                            
                            while (eleccion > 2 || eleccion < 0){
                                System.out.println("Ingrese posicion correcta: ");
                                eleccion = sc.nextInt();
                                System.out.println();
                            }
                            
                            if(eleccion == 1){
                                lista.remove(posicion);
                                
                                System.out.println("Se ha despedido"
                                        + " el empleado");
                            }
                            if(eleccion ==  2){
                                System.out.println("No se elimino el empleado");
                            }
                        }

                    } else {
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Inicio de sesion: ");
                    System.out.println("Ingrese su usuario: ");
                    String usuario = sc.next();

                    System.out.println("Ingrese su password");
                    String password = sc.next();

                    if (password.equals("99") && usuario.equals("leobanegas")) {
                        logIn = true;
                        System.out.println("Ha iniciado exitosamente sesion");
                        System.out.println();
                    } else {
                        System.out.println("El usuario o password es incorrecto");
                        System.out.println();
                    }

                    break;

                case 4:
                    if (logIn) {
                        if(lista.isEmpty()){
                            System.out.println("No hay empleados por ascender");
                        }
                        else{
                            int contador = 0;
                            for (Empleado e : lista) {
                                String cargo = e.getCargo();
                                if(cargo.equals("gerente")){
                                    contador++;
                                }
                            }
                            
                            if(contador >= 3){
                                System.out.println("Las posiciones de gerente"
                                        + " estan ocupadas");
                                System.out.println();
                            }
                            else{
                                System.out.println("Lista de cajeros");
                                for (Empleado e : lista) {
                                    System.out.println(lista.indexOf(e) + "  " + e);
                                }
                                
                                System.out.println("Ingrese el indice del "
                                        + "cajero que desea ascender: ");
                                int number = sc.nextInt();
                                
                                while(number < 0 || number > lista.size()-1){
                                    System.out.println("Ingrese posicion correcta: ");
                                    number = sc.nextInt();
                                    System.out.println();
                                }
                                boolean esCajero = false;
                                
                                while(esCajero == false){
                                    String cargo = lista.get(number).getCargo();
                                    
                                    if(cargo.equals("cajero")){
                                        esCajero = true;
                                    }
                                    else{
                                        System.out.println("El empleado no "
                                                + "tiene posicion de empleado:");
                                        System.out.println("Ingrese otra posicion: ");
                                        number = sc.nextInt();
                                    }
                                }
                                
                                System.out.println("Desea ascender a gerente a "
                                        +lista.get(number)+" ? \n 1 = si 2 = no");
                                int confirmacion = sc.nextInt();
                                
                                if(confirmacion == 1){
                                    lista.get(number).setCargo("gerente");
                                    System.out.println("Se ha ascendido "
                                            + "a la persona exitosamente");
                                    System.out.println();
                                }
                                else{
                                    System.out.println("No se realizo el cambio");
                                    System.out.println();
                                }
                            }
                            
                        }
                        
                        
                    } else {
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }
                    break;

                case 5:
                    if (logIn) {
                        if (lista.isEmpty()){
                            System.out.println("No hay empleados por mostrar: ");
                        }
                        else{
                            System.out.println("-> Gerentes");
                            for (Empleado e : lista) {
                                String cargo = e.getCargo();
                                if(cargo.equals("gerente")){
                                    System.out.println(lista.indexOf(e) + "  " + e);
                                }
                            }
                            
                            System.out.println("-> Cajeros");
                            for (Empleado e : lista) {
                                String cargo = e.getCargo();
                                if(cargo.equals("cajero")){
                                    System.out.println(lista.indexOf(e) + "  " + e);
                                }
                            }
                            
                            System.out.println("-> Seguridad");
                            for (Empleado e : lista) {
                                String cargo = e.getCargo();
                                if(cargo.equals("seguridad")){
                                    System.out.println(lista.indexOf(e) + "  " + e);
                                }
                            }
                            
                            System.out.println("-> Aseador");
                            for (Empleado e : lista) {
                                String cargo = e.getCargo();
                                if(cargo.equals("aseador")){
                                     System.out.println(lista.indexOf(e) + "  " + e);
                                }
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }
                    break;

                case 6:
                    if (logIn) {
                        System.out.println("Modificar empleado");
                        System.out.println();
                        
                        if(lista.isEmpty()){
                            System.out.println("No hay empleados "
                                    + "para modificar");
                        }
                        else{
                            System.out.println("Lista de empleados");
                            
                            for (Empleado e : lista) {
                                System.out.println(lista.indexOf(e) + "  " + e);
                            }
                            
                            System.out.println("Ingrese el indice del "
                                    + " empleado a modificar: ");
                            int indice = sc.nextInt();
                            System.out.println();
                            
                            while(indice < 0 || indice > lista.size()-1){
                                System.out.println("Ingrese posicion correcta: ");
                                indice = sc.nextInt();
                                System.out.println();
                            }
                            
                            System.out.println("Ingrese opcion de"
                                    + " atributo a modificar: ");
                            System.out.println("1) Nombre");
                            System.out.println("2) Apellido");
                            System.out.println("3) Color favorito");
                            System.out.println("4) Edad");
                            System.out.println("5) Altura");
                            System.out.println("6) Peso");
                            System.out.println("7) Titulo");
                            int i = sc.nextInt();
                            System.out.println();
                            
                            while(i < 1 || i > 7){
                                System.out.println("Ingrese numero correcto");
                                i = sc.nextInt();
                                System.out.println();
                            }
                            
                            switch(i){
                                
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre: ");
                                    String name = sc.next();
                                    lista.get(indice).setNombre(name);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                                    
                                case 2:
                                    System.out.println("Ingrese el nuevo apellido: ");
                                    String apellido = sc.next();
                                    lista.get(indice).setApellido(apellido);
                                    System.out.println("Se modifico correctamente");
                                    break;
                                    
                                case 3:
                                    System.out.println("Ingrese el nuevo color: ");
                                    String color = sc.next();
                                    lista.get(indice).setcFavorito(color);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                                    
                                case 4:
                                    System.out.println("Ingrese la nueva edad: ");
                                    int edad = sc.nextInt();
                                    lista.get(indice).setEdad(edad);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                                    
                                case 5:
                                    System.out.println("Ingrese nueva altura: ");
                                    double altura = sc.nextDouble();
                                    lista.get(indice).setAltura(altura);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                                    
                                case 6:
                                    System.out.println("Ingrese nuevo peso: ");
                                    double peso = sc.nextDouble();
                                    lista.get(indice).setPeso(peso);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                                    
                                case 7:
                                    System.out.println("Ingrese nuevo titulo: ");
                                    sc.nextLine();
                                    String titulo = sc.nextLine();
                                    lista.get(indice).setTitulo(titulo);
                                    System.out.println("Se modifico correctamente");
                                    System.out.println();
                                    break;
                            }
                            
                            
                        }
                    } else { 
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }
                    break;

                case 7:
                    if (logIn) {
                        System.out.println("Random cambia cargos: ");
                        
                        if(lista.isEmpty()){
                            System.out.println("La lista esta vacia");
                        }else{
                            int numero = 1+ale.nextInt(lista.size());
                        
                            int random = 0+ale.nextInt(lista.size()-1);
                            int gerentes = 0;
                        
                            for (Empleado e : lista) {
                                int posicion = lista.indexOf(e);
                                String cargo = lista.get(posicion).getCargo();
                            
                                if(cargo.equals("gerente")){
                                    gerentes++;
                                }
                            }
                            
                            for (int i = 0; i < numero; i++) {
                                int aleatorio = 1+ale.nextInt();
                                
                                
                            }
                        }
                                                                  
                        
                        
                    } else {
                        System.out.println("No ha iniciado sesion");
                        System.out.println();
                    }

                    break;

                case 8:
                    System.out.println("Te has salido del sistema");
                    break;

                default:
                    System.out.println("Opcion ingresada no valida");
                    System.out.println();

            }

        }

    }

}
