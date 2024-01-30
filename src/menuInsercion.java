import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuInsercion {
    private JButton conectarALaBDDButton;
    public JPanel form1;
    private JLabel mensajeTxt;
    private JTextField nombreTF;
    private JTextField cedulaTF;
    private JTextField calif1TF;
    private JTextField calif2TF;
    private JButton insertarButton;
    private JLabel nombre;
    private JLabel cedula;
    private JLabel calificacion1;
    private JLabel calificacion2;
    private JButton borrarCamposButton;

    public menuInsercion() {
        conectarALaBDDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexionBDD miconexion = new conexionBDD();
                miconexion.conexionLocal("jdbc:mysql://localhost:3306/estudiantes", "root","141211");

                mensajeTxt.setText(miconexion.getMensaje());
            }
        });
        borrarCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreTF.setText("");
                cedulaTF.setText("");
                calif1TF.setText("");
                calif2TF.setText("");
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarDatos insertardatos = new insertarDatos();
                insertardatos.ingresoDatos(nombreTF.getText(),cedulaTF.getText(), Integer.parseInt(calif1TF.getText()), Integer.parseInt(calif2TF.getText()));


            }
        });
    }
}
