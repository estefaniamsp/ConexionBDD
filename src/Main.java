import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ingreso de Calificaciones");
        frame.setContentPane(new menuInsercion().form1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLocationRelativeTo(null);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}