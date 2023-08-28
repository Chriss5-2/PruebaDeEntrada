/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebadeentrada;

/**
 *
 * @author CHRISTIAN
 */
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Persona 1", 25, 'M');
        Persona persona2 = new Persona("Persona 2", 30, 'F');
        Persona persona3 = new Persona("Persona 3", 28, 'M');

        Persona[] personas = {persona1, persona2, persona3};

        double edadPromedio = Persona.calcularEdadPromedio(personas);
        System.out.println("Edad promedio de las personas: " + edadPromedio);
    }


}
