/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labe.pkg5_daniel_trimarchi;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author X
 */
public class Universo extends javax.swing.JFrame {

    /**
     * Creates new form JTree
     */
    public Universo() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        mc_jlist = new javax.swing.JPopupMenu();
        agregar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        borrar = new javax.swing.JMenuItem();
        menu_popup = new javax.swing.JPopupMenu();
        opcion_edad = new javax.swing.JMenuItem();
        opcion_eliminar = new javax.swing.JMenuItem();
        opcion_modificar = new javax.swing.JMenuItem();
        menu_nacionalidad = new javax.swing.JPopupMenu();
        num_personas = new javax.swing.JMenuItem();
        cambiar_nombre = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_personas = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_personas1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        PasoalTree = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_personas = new javax.swing.JTree();
        c_energia = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        Agregar_lista = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sp_edad1 = new javax.swing.JSpinner();
        c_peso = new javax.swing.JSpinner();
        c_edad = new javax.swing.JSpinner();
        c_region = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        mc_jlist.add(agregar);

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        mc_jlist.add(modificar);

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        mc_jlist.add(borrar);

        opcion_edad.setText("Ver edad");
        opcion_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_edadActionPerformed(evt);
            }
        });
        menu_popup.add(opcion_edad);

        opcion_eliminar.setText("Eliminar");
        opcion_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_eliminarActionPerformed(evt);
            }
        });
        menu_popup.add(opcion_eliminar);

        opcion_modificar.setText("Modificar");
        menu_popup.add(opcion_modificar);

        num_personas.setText("Numero de Personas");
        num_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_personasActionPerformed(evt);
            }
        });
        menu_nacionalidad.add(num_personas);

        cambiar_nombre.setText("Cambiar el Nombre");
        menu_nacionalidad.add(cambiar_nombre);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));
        getContentPane().setLayout(null);

        jLabel4.setText("NOMBRE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 22, 78, 31);
        getContentPane().add(tf_nombre);
        tf_nombre.setBounds(82, 27, 94, 20);

        jl_personas.setModel(new DefaultListModel()
        );
        jl_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_personasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_personas);

        jl_personas1.setModel(new DefaultListModel()
        );
        jl_personas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_personas1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_personas1);

        jLabel1.setText("Mundos Disco");

        PasoalTree.setText("-->");
        PasoalTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasoalTreeMouseClicked(evt);
            }
        });

        jLabel10.setText("Criaturas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(PasoalTree, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasoalTree))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 210, 578, 324);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Universo");
        jt_personas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_personasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_personas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(710, 50, 350, 370);

        c_energia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c_energia.setDoubleBuffered(true);
        c_energia.setEnabled(false);
        c_energia.setValue(0
        );
        getContentPane().add(c_energia);
        c_energia.setBounds(410, 90, 94, 20);

        jLabel2.setText("Peso");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 59, 78, 31);

        Agregar_lista.setText("AGREGAR LISTA");
        Agregar_lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Agregar_listaMouseClicked(evt);
            }
        });
        Agregar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_listaActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_lista);
        Agregar_lista.setBounds(30, 100, 151, 39);

        jLabel5.setText("Peso");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 30, 40, 20);

        jLabel6.setText("Edad Maxima");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 60, 100, 14);

        jLabel7.setText("Energia");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 90, 70, 14);

        jLabel8.setText("Region");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 130, 100, 14);

        sp_edad1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sp_edad1.setDoubleBuffered(true);
        sp_edad1.setEnabled(false);
        sp_edad1.setValue(0
        );
        getContentPane().add(sp_edad1);
        sp_edad1.setBounds(82, 64, 94, 20);

        c_peso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c_peso.setDoubleBuffered(true);
        c_peso.setEnabled(false);
        c_peso.setValue(0
        );
        getContentPane().add(c_peso);
        c_peso.setBounds(410, 30, 94, 20);

        c_edad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c_edad.setDoubleBuffered(true);
        c_edad.setEnabled(false);
        c_edad.setValue(0
        );
        getContentPane().add(c_edad);
        c_edad.setBounds(410, 60, 94, 20);
        getContentPane().add(c_region);
        c_region.setBounds(380, 130, 120, 20);

        jLabel9.setText("Raza");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 170, 50, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 170, 120, 20);

        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(269, 0, 20, 520);

        jButton2.setText("AGREGAR AL ARBOL");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(770, 0, 173, 39);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        //raiz.getChildAt(1).getChildAt(2).getUserObject()
        DefaultMutableTreeNode nodo_persona;
        nodo_persona = new DefaultMutableTreeNode(
                new Persona(tf_nombre.getText(),
                        (Integer) c_energia.getValue(), (String) cb_nacionalidad.getSelectedItem()
                )
        );
        DefaultMutableTreeNode anio;
        anio = new DefaultMutableTreeNode(
                new SimpleDateFormat("YYYY").format(
                        new Date())
        );
        DefaultMutableTreeNode mes;
        mes = new DefaultMutableTreeNode(
                new SimpleDateFormat("MM").format(
                        new Date())
        );

        anio.add(mes);
        nodo_persona.add(anio);
        raiz.add(nodo_persona);
        m.reload();


    }//GEN-LAST:event_jButton2MouseClicked

    private void Agregar_listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agregar_listaMouseClicked
        // TODO add your handling code here:
        DefaultListModel modelo
                = (DefaultListModel) jl_personas.getModel();
        modelo.addElement(new Mundo(
                (Integer) c_energia.getValue(),
                tf_nombre.getText()
        ));
        jl_personas.setModel(modelo);
        tf_nombre.setText("");
        c_energia.setValue(20);

    }//GEN-LAST:event_Agregar_listaMouseClicked

    private void PasoalTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasoalTreeMouseClicked
        // TODO add your handling code here:
        //VISTA DE LA LIST HAY UN METODO GET SELECTED INDEX
        if (jl_personas.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL
                    = (DefaultTreeModel) jt_personas.getModel();
            DefaultMutableTreeNode raiz
                    = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            //obtener la persona a guardar
            DefaultListModel modeloLISTA
                    = (DefaultListModel) jl_personas.getModel();
            String nombre;
            int peso;
            nombre = ((Mundo) modeloLISTA.get(
                    jl_personas.getSelectedIndex())).getN_Tortuga();

            peso = ((Mundo) modeloLISTA.get(
                    jl_personas.getSelectedIndex())).getPeso_tor();
            int centinela = -1;
            int centinela2 = -1;

            //raiz.getChildCount()  ***TAMÑO DE LA LISTA***
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().
                        equals(nombre)) {

                    for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                        if (raiz.getChildAt(i).getChildAt(j).toString().
                                equals(nombre)) {
                            centinela2 = 1;

                        }
                    }

                    if (centinela2 == -1) {
                        DefaultMutableTreeNode p
                                = new DefaultMutableTreeNode(
                                        new Mundo(peso,
                                                nombre)
                        );
                                
                        ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);

                    }
                    centinela = 1;

                }
            }
            if (centinela == -1) {
                DefaultMutableTreeNode n
                        = new DefaultMutableTreeNode(nombre);

                DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(
                                new Mundo(peso,
                                nombre)
                        );
               //n.add(p);
                raiz.add(n);
            }
            modeloARBOL.reload();
        } else {
            JOptionPane.showMessageDialog(this, "No Hay Personas");

        }

    }//GEN-LAST:event_PasoalTreeMouseClicked

    private void jl_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_personasMouseClicked

        if (evt.isMetaDown()) {
            mc_jlist.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_personasMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        int pos = jl_personas.getSelectedIndex();
        DefaultListModel modelo = (DefaultListModel) jl_personas.getModel();
        String nombre = JOptionPane.showInputDialog(this, "Ingrese otro Nombre");

        modelo.insertElementAt(new Persona(nombre, ((Persona) modelo.getElementAt(pos)).getEdad(),
                ((Persona) modelo.getElementAt(pos)).getNacionalidad()), pos);
        modelo.removeElementAt(pos + 1);


    }//GEN-LAST:event_modificarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        DefaultListModel modelo
                = (DefaultListModel) jl_personas.getModel();
        modelo.addElement(new Persona(tf_nombre.getText(),
                (Integer) c_energia.getValue(),
                (String) cb_nacionalidad.getSelectedItem()));
        //modelo.remove(pos);
        //((Persona)modelo.get(pos).set 

        jl_personas.setModel(modelo);
        tf_nombre.setText("");
        c_energia.setValue(20);
        cb_nacionalidad.setSelectedIndex(0);

    }//GEN-LAST:event_agregarActionPerformed

    private void Agregar_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agregar_listaActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        int pos = jl_personas.getSelectedIndex();
        DefaultListModel model = (DefaultListModel) jl_personas.getModel();
        if (pos >= 0) {
            model.remove(pos);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void jt_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personasMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            int row = jt_personas.getClosestRowForLocation(evt.getX(), evt.getY());
            //MARCA LA FILA COMO SELECCIONADO
            jt_personas.setSelectionRow(row);
            Object v1
                    //EL OBJETO HACE REFERENCIA AL ULTIMO ELEMENTO SELECCIONADO
                    = jt_personas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Persona) {
                personas_Seleccionada
                        = (Persona) nodo_seleccionado.getUserObject();
                menu_popup.show(evt.getComponent(), evt.getX(), evt.getY());

            }

            if (nodo_seleccionado.getUserObject() instanceof String && !nodo_seleccionado.getUserObject().equals("Personas")) {

            }

        }
    }//GEN-LAST:event_jt_personasMouseClicked

    private void opcion_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_edadActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Tiene una Edad de: " + personas_Seleccionada.getEdad());
    }//GEN-LAST:event_opcion_edadActionPerformed

    private void opcion_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_eliminarActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
        System.out.println("");
    }//GEN-LAST:event_opcion_eliminarActionPerformed

    private void num_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_personasActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();

        m.getChildCount(10);

    }//GEN-LAST:event_num_personasActionPerformed

    private void jl_personas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_personas1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jl_personas1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Universo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Universo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Universo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Universo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//"MENU CONTEXTUAL" A LA LISTA PARA AGREGAR MODIFICAR Y AGREGAR;
//HCER UE NO META A LA MISMA PERSONA MAS DE UNA VEZ SI ES IGUAL
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Universo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_lista;
    private javax.swing.JButton PasoalTree;
    private javax.swing.JMenuItem agregar;
    private javax.swing.JMenuItem borrar;
    private javax.swing.JSpinner c_edad;
    private javax.swing.JSpinner c_energia;
    private javax.swing.JSpinner c_peso;
    private javax.swing.JTextField c_region;
    private javax.swing.JMenuItem cambiar_nombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    private javax.swing.JList<String> jl_personas;
    private javax.swing.JList<String> jl_personas1;
    private javax.swing.JTree jt_personas;
    private javax.swing.JPopupMenu mc_jlist;
    private javax.swing.JPopupMenu menu_nacionalidad;
    private javax.swing.JPopupMenu menu_popup;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JMenuItem num_personas;
    private javax.swing.JMenuItem opcion_edad;
    private javax.swing.JMenuItem opcion_eliminar;
    private javax.swing.JMenuItem opcion_modificar;
    private javax.swing.JSpinner sp_edad1;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration//GEN-END:variables
DefaultMutableTreeNode nodo_seleccionado;
//Persona personas_Seleccionada;
    DefaultListModel lista_seleccionada;
}
