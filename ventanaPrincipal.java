/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.paint;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author hcarreras
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        grupoHerramientas = new javax.swing.ButtonGroup();
        grupoColores = new javax.swing.ButtonGroup();
        BarraEstado = new javax.swing.JTextField();
        Herramientas = new javax.swing.JPanel();
        Punto = new javax.swing.JButton();
        Linea = new javax.swing.JButton();
        rectangulo = new javax.swing.JButton();
        ovalo = new javax.swing.JButton();
        Central = new javax.swing.JPanel();
        Colores = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        Fila1 = new javax.swing.JPanel();
        Negro = new javax.swing.JButton();
        Verde = new javax.swing.JButton();
        Rojo = new javax.swing.JButton();
        Fila2 = new javax.swing.JPanel();
        Azul = new javax.swing.JButton();
        Blanco = new javax.swing.JButton();
        Amarillo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Grosor = new javax.swing.JSpinner();
        editarBox = new javax.swing.JCheckBox();
        Relleno = new javax.swing.JCheckBox();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        verBarraHerramientas = new javax.swing.JCheckBoxMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(371, 400));

        BarraEstado.setText("Bienvenido");
        BarraEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(BarraEstado, java.awt.BorderLayout.PAGE_END);

        Herramientas.setPreferredSize(new java.awt.Dimension(400, 30));
        Herramientas.setLayout(new javax.swing.BoxLayout(Herramientas, javax.swing.BoxLayout.LINE_AXIS));

        Punto.setIcon(new javax.swing.ImageIcon("/Users/hcarreras/3º informatica/2º Cuatrimestre/SM/P4 paint/iconos/Lapiz.gif")); // NOI18N
        grupoHerramientas.add(Punto);
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        Herramientas.add(Punto);

        Linea.setIcon(new javax.swing.ImageIcon("/Users/hcarreras/3º informatica/2º Cuatrimestre/SM/P4 paint/iconos/Linea.gif")); // NOI18N
        grupoHerramientas.add(Linea);
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaActionPerformed(evt);
            }
        });
        Herramientas.add(Linea);

        rectangulo.setIcon(new javax.swing.ImageIcon("/Users/hcarreras/3º informatica/2º Cuatrimestre/SM/P4 paint/iconos/Rectangulo.gif")); // NOI18N
        grupoHerramientas.add(rectangulo);
        rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectanguloActionPerformed(evt);
            }
        });
        Herramientas.add(rectangulo);

        ovalo.setIcon(new javax.swing.ImageIcon("/Users/hcarreras/3º informatica/2º Cuatrimestre/SM/P4 paint/iconos/Ovalo.gif")); // NOI18N
        grupoHerramientas.add(ovalo);
        ovalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovaloActionPerformed(evt);
            }
        });
        Herramientas.add(ovalo);

        getContentPane().add(Herramientas, java.awt.BorderLayout.PAGE_START);

        Central.setLayout(new java.awt.BorderLayout());

        Colores.setPreferredSize(new java.awt.Dimension(400, 40));
        Colores.setLayout(new java.awt.BorderLayout());

        Izquierda.setLayout(new java.awt.BorderLayout());

        Fila1.setLayout(new javax.swing.BoxLayout(Fila1, javax.swing.BoxLayout.LINE_AXIS));

        Negro.setBackground(new java.awt.Color(0, 0, 0));
        grupoColores.add(Negro);
        Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActionPerformed(evt);
            }
        });
        Fila1.add(Negro);

        Verde.setBackground(new java.awt.Color(0, 255, 0));
        grupoColores.add(Verde);
        Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeActionPerformed(evt);
            }
        });
        Fila1.add(Verde);

        Rojo.setBackground(new java.awt.Color(255, 0, 0));
        grupoColores.add(Rojo);
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });
        Fila1.add(Rojo);

        Izquierda.add(Fila1, java.awt.BorderLayout.PAGE_START);

        Fila2.setLayout(new javax.swing.BoxLayout(Fila2, javax.swing.BoxLayout.LINE_AXIS));

        Azul.setBackground(new java.awt.Color(0, 51, 255));
        grupoColores.add(Azul);
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });
        Fila2.add(Azul);

        Blanco.setBackground(new java.awt.Color(255, 255, 255));
        grupoColores.add(Blanco);
        Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlancoActionPerformed(evt);
            }
        });
        Fila2.add(Blanco);

        Amarillo.setBackground(new java.awt.Color(255, 255, 0));
        grupoColores.add(Amarillo);
        Amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmarilloActionPerformed(evt);
            }
        });
        Fila2.add(Amarillo);

        Izquierda.add(Fila2, java.awt.BorderLayout.CENTER);

        Colores.add(Izquierda, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        Grosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GrosorStateChanged(evt);
            }
        });
        Grosor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                GrosorAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Grosor);

        editarBox.setText("Editar");
        editarBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBoxActionPerformed(evt);
            }
        });
        jPanel1.add(editarBox);

        Relleno.setText("Relleno");
        Relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoActionPerformed(evt);
            }
        });
        jPanel1.add(Relleno);

        Colores.add(jPanel1, java.awt.BorderLayout.CENTER);

        Central.add(Colores, java.awt.BorderLayout.PAGE_END);
        Central.add(escritorio, java.awt.BorderLayout.CENTER);

        getContentPane().add(Central, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Abrir");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jMenu1.add(Nuevo);

        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jMenu1.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jMenu1.add(Guardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        verBarraHerramientas.setSelected(true);
        verBarraHerramientas.setText("Barra Herramientas");
        verBarraHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBarraHerramientasActionPerformed(evt);
            }
        });
        jMenu2.add(verBarraHerramientas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraEstadoActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setHerramientaSeleccionada(1);
        BarraEstado.setText("Punto");
    }//GEN-LAST:event_PuntoActionPerformed

    private void LineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setHerramientaSeleccionada(2);
        BarraEstado.setText("Linea");
    }//GEN-LAST:event_LineaActionPerformed

    private void rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectanguloActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setHerramientaSeleccionada(3);
        BarraEstado.setText("Rectangulo");
    }//GEN-LAST:event_rectanguloActionPerformed

    private void ovaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovaloActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setHerramientaSeleccionada(4);
        BarraEstado.setText("Ovalo");
    }//GEN-LAST:event_ovaloActionPerformed

    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.red);
    }//GEN-LAST:event_RojoActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.blue);
    }//GEN-LAST:event_AzulActionPerformed

    private void NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.black);
    }//GEN-LAST:event_NegroActionPerformed

    private void BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlancoActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.white);
    }//GEN-LAST:event_BlancoActionPerformed

    private void AmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.yellow);
    }//GEN-LAST:event_AmarilloActionPerformed

    private void VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setColor(Color.green);
    }//GEN-LAST:event_VerdeActionPerformed

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setRelleno(Relleno.isSelected());
    }//GEN-LAST:event_RellenoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        VentanaInterna vi = new VentanaInterna(); 
        escritorio.add(vi); 
        vi.setVisible(true);

    }//GEN-LAST:event_NuevoActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser(); 
        int resp = dlg.showOpenDialog(this); 
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile(); //Código
        }
        
        
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        JFileChooser dlg = new JFileChooser(); 
        int resp = dlg.showOpenDialog(this); 
        if( resp == JFileChooser.APPROVE_OPTION) {
            File f = dlg.getSelectedFile(); //Código
        }
        
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void verBarraHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBarraHerramientasActionPerformed
        // TODO add your handling code here:
       if(verBarraHerramientas.getState()){
           BarraEstado.setVisible(true);
       }
       else
           BarraEstado.setVisible(false);

        
    }//GEN-LAST:event_verBarraHerramientasActionPerformed

    private void editarBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBoxActionPerformed
       Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
       lienzo1.setEditar(editarBox.isSelected());
    }//GEN-LAST:event_editarBoxActionPerformed

    private void GrosorAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_GrosorAncestorMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_GrosorAncestorMoved

    private void GrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GrosorStateChanged
        // TODO add your handling code here:
        Lienzo lienzo1 = ((VentanaInterna) escritorio.getSelectedFrame()).getLienzo();
        lienzo1.setGrosor(((Integer)Grosor.getValue()).floatValue());
      //  System.out.println(((Integer)Grosor.getValue()).floatValue());
    }//GEN-LAST:event_GrosorStateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JButton Amarillo;
    private javax.swing.JButton Azul;
    private javax.swing.JTextField BarraEstado;
    private javax.swing.JButton Blanco;
    private javax.swing.JPanel Central;
    private javax.swing.JPanel Colores;
    private javax.swing.JPanel Fila1;
    private javax.swing.JPanel Fila2;
    private javax.swing.JSpinner Grosor;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JPanel Herramientas;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton Linea;
    private javax.swing.JButton Negro;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JButton Punto;
    private javax.swing.JCheckBox Relleno;
    private javax.swing.JButton Rojo;
    private javax.swing.JButton Verde;
    private javax.swing.JCheckBox editarBox;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.ButtonGroup grupoColores;
    private javax.swing.ButtonGroup grupoHerramientas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ovalo;
    private javax.swing.JButton rectangulo;
    private javax.swing.JCheckBoxMenuItem verBarraHerramientas;
    // End of variables declaration//GEN-END:variables
}
