

package com.mycompany.practica.evaluada2;
    import javax.swing.JOptionPane;

public class PracticaEvaluada2 {

    public static void main(String[] args) {
        
        /* 
        Ejercicio 1 
        */
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero: \n"));
        switch (num1){
            case 1:
              JOptionPane.showMessageDialog(null,"Enero-primer cautrimestre");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Febrero-primer cautrimestre"); 
                break;
            case 3:
                 JOptionPane.showMessageDialog(null,"Marzo-primer cautrimestre");
                break;
            case 4:
                 JOptionPane.showMessageDialog(null,"Abril-primer cautrimestre");
                break;
            case 5:
                 JOptionPane.showMessageDialog(null,"Mayo-segundo cuatrimestre");
                break;
            case 6:
                 JOptionPane.showMessageDialog(null,"Junio-segundo cuatrimestre");
                break;
            case 7:
                 JOptionPane.showMessageDialog(null,"Julio-segundo cuatrimestre");
                break;
            case 8:
                 JOptionPane.showMessageDialog(null,"Agosto-segundo cuatrimestre");
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"Septiembre-tercer cuatrimestre");
                break;
            case 10:
                 JOptionPane.showMessageDialog(null,"Octubre-tercer cuatrimestre");
                break;
            case 11:
                 JOptionPane.showMessageDialog(null,"Noviembre-tercer cuatrimestre");
                break;
            case 12:
                 JOptionPane.showMessageDialog(null,"Diciembre-tercer cuatrimestre");
                break;
                
                default:{
                        JOptionPane.showMessageDialog(null,"La opción ingresada no es válida, ¡Vuelve a intentarlo!");
                }
                
                
        
        
        
        
        }
        
        {
        
        
        int edad=Integer.parseInt(JOptionPane.showInputDialog(null, "digite su edad: \n"));
        
        
        if (edad>=0 && edad<=5){JOptionPane.showMessageDialog(null, "Es de primera infacia"); }
        
        if (edad>=6 && edad<=11){JOptionPane.showMessageDialog(null,"Es infancia"); }
        
        if (edad>=12 && edad<=18){JOptionPane.showMessageDialog(null, "Es adolecencia"); }
        
        if (edad>=19 && edad<=30){JOptionPane.showMessageDialog(null, "Es juventud"); }
        
        if (edad>=30 && edad<=59){JOptionPane.showMessageDialog(null, "Es adultez"); }
        
        if (edad>59){JOptionPane.showMessageDialog(null, "Es adulto mayor"); }
        
        }
    }
}
