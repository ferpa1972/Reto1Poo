package Reto1;

import javax.swing.*;

public class DatosEstudiantes {
    int MAT;
    float CAL1,CAL2,CAL3,CAL4,CAL5, prom;

    public void calcPromocion (){
        MAT = Integer.parseInt(JOptionPane.showInputDialog("Ingrese matricula del estuddiante"));
        CAL1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
        CAL2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
        CAL3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
        CAL4 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
        CAL5 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
        prom = (CAL1+CAL2+CAL3+CAL4+CAL5)/5;
        if (prom >= 6){
            System.out.println("El alumno "+ MAT+" aprobo ya que tuvo un promedio de "+prom);
        }else{
            System.out.println("El alumno "+ MAT+" no aprobo ya que tuvo un promedio de "+prom);
        }
    }
}
