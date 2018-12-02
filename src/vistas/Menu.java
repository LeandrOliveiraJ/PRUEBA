/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

/**
 *
 * @author Bulgaro
 */
public class Menu extends javax.swing.JFrame {
    CatalogoPeliculasImpl catalogo = new CatalogoPeliculasImpl();
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\Bulgaro\\Desktop\\Funadamentos Java\\laboratorioFinal\\laboratorioFinal\\catalogoPeliculas\\catalogoPeliculas.txt";
    AccesoDatosImpl acceso = new AccesoDatosImpl();
    /**
     * Creates new form frmPricipal
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMenu = new javax.swing.JMenu();
        itemInicializarArchivo = new javax.swing.JMenuItem();
        itemAgregarPelicula = new javax.swing.JMenuItem();
        itemListarPelicula = new javax.swing.JMenuItem();
        itemBuscarPelicula = new javax.swing.JMenuItem();
        itemBorrarPelicula = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuMenu.setText("Menu");

        itemInicializarArchivo.setText("Inicializar Archivo");
        itemInicializarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInicializarArchivoActionPerformed(evt);
            }
        });
        mnuMenu.add(itemInicializarArchivo);

        itemAgregarPelicula.setText("Agregar Pelicula");
        itemAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarPeliculaActionPerformed(evt);
            }
        });
        mnuMenu.add(itemAgregarPelicula);

        itemListarPelicula.setText("Listar Peliculas");
        itemListarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListarPeliculaActionPerformed(evt);
            }
        });
        mnuMenu.add(itemListarPelicula);

        itemBuscarPelicula.setText("BuscarPeliculas");
        itemBuscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarPeliculaActionPerformed(evt);
            }
        });
        mnuMenu.add(itemBuscarPelicula);

        itemBorrarPelicula.setText("Borrar Archivo");
        mnuMenu.add(itemBorrarPelicula);

        jMenuBar1.add(mnuMenu);

        mnuSalir.setText("Salir");

        itemSalir.setText("Salir");
        mnuSalir.add(itemSalir);

        jMenuBar1.add(mnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemListarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListarPeliculaActionPerformed
        if (acceso.existe(NOMBRE_ARCHIVO)== false){
            JOptionPane.showMessageDialog(null, "No hay nada para listar","Error", JOptionPane.ERROR_MESSAGE);
            itemInicializarArchivo.setEnabled(false);
        }else
        new ListarPeliculas().setVisible(true);
        catalogo.listarPeliculas(NOMBRE_ARCHIVO);
    }//GEN-LAST:event_itemListarPeliculaActionPerformed

    private void itemInicializarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInicializarArchivoActionPerformed
        if (acceso.existe(NOMBRE_ARCHIVO)== true){
            JOptionPane.showMessageDialog(null, "El Archivo ya existe","Error", JOptionPane.ERROR_MESSAGE);
            itemInicializarArchivo.setEnabled(false);
        }else
        catalogo.iniciarArchivo(NOMBRE_ARCHIVO);
    }//GEN-LAST:event_itemInicializarArchivoActionPerformed

    private void itemAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarPeliculaActionPerformed
        new AgregarPelicula().setVisible(true);
    }//GEN-LAST:event_itemAgregarPeliculaActionPerformed

    private void itemBuscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarPeliculaActionPerformed
        new Buscar().setVisible(true);
    }//GEN-LAST:event_itemBuscarPeliculaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAgregarPelicula;
    private javax.swing.JMenuItem itemBorrarPelicula;
    private javax.swing.JMenuItem itemBuscarPelicula;
    private javax.swing.JMenuItem itemInicializarArchivo;
    private javax.swing.JMenuItem itemListarPelicula;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuMenu;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}