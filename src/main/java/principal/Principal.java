package principal;

import javax.swing.JOptionPane;
import model.Triangulo;

public class Principal {
    
    public static void main(String[] args){
        
        Triangulo tri1 = new Triangulo();
        
        //Entrada
        tri1.setBase(Double.parseDouble(JOptionPane.showInputDialog("Base do triângulo: ")));
        tri1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura do triângulo: ")));
        
        //Saida
        JOptionPane.showMessageDialog(null, "Área do triângulo: "+tri1.getArea());
    }
}
