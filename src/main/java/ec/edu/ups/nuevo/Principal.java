/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.ups.nuevo;

import ec.edu.ups.nuevo.controlador.Biblioteca_Controlador;
import ec.edu.ups.nuevo.controlador.LibroControlador;
import ec.edu.ups.nuevo.controlador.PrestamoControlador;
import ec.edu.ups.nuevo.controlador.UsuarioControlador;
import ec.edu.ups.nuevo.idao.LibroDAO;
import ec.edu.ups.nuevo.idao.PrestamoDAO;
import ec.edu.ups.nuevo.idao.UsuarioDAO;
import ec.edu.ups.nuevo.vista.Actualizar_Libro;
import ec.edu.ups.nuevo.vista.Actualizar_Usuario;
import ec.edu.ups.nuevo.vista.Agregar_Libro;
import ec.edu.ups.nuevo.vista.Buscar_Libro;
import ec.edu.ups.nuevo.vista.Buscar_Usuario;
import ec.edu.ups.nuevo.vista.Crear_Usuario;
import ec.edu.ups.nuevo.vista.Devolver_Libro;
import ec.edu.ups.nuevo.vista.Eliminar_Libro;
import ec.edu.ups.nuevo.vista.Eliminar_Usuario;
import ec.edu.ups.nuevo.vista.Prestar_Libro;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author davidvargas
 */
public class Principal extends javax.swing.JFrame {

    //Controladores
    private Biblioteca_Controlador controladorBiblioteca;
    private LibroControlador controladorLibro;
    private PrestamoControlador controladorPrestamo;
    private UsuarioControlador controladorUsuario;
    //Ventanas Usuario CRUD
    private Crear_Usuario crear_Usuario;
    private Buscar_Usuario buscar_Usuario;
    private Actualizar_Usuario actualizar_Usuario;
    private Eliminar_Usuario eliminar_Usuario;
    //Ventana Libro CRUD
    private Agregar_Libro agregar_Libro;
    private Buscar_Libro buscar_Libro;
    private Actualizar_Libro actualizar_Libro;
    private Eliminar_Libro eliminar_Libro;
    //Ventanas Prestar/Devolver
    private Prestar_Libro prestar;
    private Devolver_Libro devolver;
    //DAOS
    private UsuarioDAO usuarioDAO;
    private PrestamoDAO prestamoDAO;
    private LibroDAO libroDAO;
    private ResourceBundle mensajes;
    private Locale locale;

    /**
     * Creates new form Main
     */
    public Principal() {
        initComponents();
        controladorUsuario = new UsuarioControlador(new UsuarioDAO());
        controladorLibro = new LibroControlador(new LibroDAO());
        controladorPrestamo = new PrestamoControlador(new PrestamoDAO(), new UsuarioControlador(new UsuarioDAO()));
        prestamoDAO = new PrestamoDAO();

        usuarioDAO = new UsuarioDAO();
        controladorUsuario = new UsuarioControlador(usuarioDAO);
        prestamoDAO = new PrestamoDAO();
        libroDAO = new LibroDAO();
        controladorLibro = new LibroControlador(libroDAO);
        PrestamoDAO prestamoDAO = new PrestamoDAO();
        //locale = Locale.getDefault();
        locale = new Locale("es", "EC");
        Locale idiomaActual = Locale.getDefault();
        System.out.println("El idioma actual es: " + idiomaActual.getLanguage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnUsuario = new javax.swing.JMenu();
        mniAgregar_Usuario = new javax.swing.JMenuItem();
        mniBuscar_Usuario = new javax.swing.JMenuItem();
        mniActualizar_Usuario = new javax.swing.JMenuItem();
        mniEliminar_Usuario = new javax.swing.JMenuItem();
        mnLibro = new javax.swing.JMenu();
        mniAgregar_Libro = new javax.swing.JMenuItem();
        mniBuscar_Libro = new javax.swing.JMenuItem();
        mniActualizar_Libro = new javax.swing.JMenuItem();
        mniEliminar_Libro = new javax.swing.JMenuItem();
        mnPrestar = new javax.swing.JMenu();
        mniPrestar_Libro = new javax.swing.JMenuItem();
        mnDevolver = new javax.swing.JMenu();
        mniDevolver_Libro = new javax.swing.JMenuItem();
        menuIdiomas = new javax.swing.JMenu();
        menuItemEspanol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        mnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuario.png"))); // NOI18N
        mnUsuario.setText("Usuario");

        mniAgregar_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarUsuario.png"))); // NOI18N
        mniAgregar_Usuario.setText("Agregar Usuario");
        mniAgregar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregar_UsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mniAgregar_Usuario);

        mniBuscar_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarUsuario.png"))); // NOI18N
        mniBuscar_Usuario.setText("Buscar Usuario");
        mniBuscar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscar_UsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mniBuscar_Usuario);

        mniActualizar_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar Usuario.png"))); // NOI18N
        mniActualizar_Usuario.setText("Actualizar Usuario");
        mniActualizar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniActualizar_UsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mniActualizar_Usuario);

        mniEliminar_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar Usuario.png"))); // NOI18N
        mniEliminar_Usuario.setText("Eliminar Usuario");
        mniEliminar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminar_UsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mniEliminar_Usuario);

        jMenuBar1.add(mnUsuario);

        mnLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Libro.png"))); // NOI18N
        mnLibro.setText("Libro");

        mniAgregar_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar Libro.png"))); // NOI18N
        mniAgregar_Libro.setText("Agregar Libro");
        mniAgregar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregar_LibroActionPerformed(evt);
            }
        });
        mnLibro.add(mniAgregar_Libro);

        mniBuscar_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar Libro.png"))); // NOI18N
        mniBuscar_Libro.setText("Buscar Libro");
        mniBuscar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBuscar_LibroActionPerformed(evt);
            }
        });
        mnLibro.add(mniBuscar_Libro);

        mniActualizar_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualizar Libro.png"))); // NOI18N
        mniActualizar_Libro.setText("Actualizar Libro");
        mniActualizar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniActualizar_LibroActionPerformed(evt);
            }
        });
        mnLibro.add(mniActualizar_Libro);

        mniEliminar_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar Libro.png"))); // NOI18N
        mniEliminar_Libro.setText("Eliminar Libro");
        mniEliminar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEliminar_LibroActionPerformed(evt);
            }
        });
        mnLibro.add(mniEliminar_Libro);

        jMenuBar1.add(mnLibro);

        mnPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Prestar.png"))); // NOI18N
        mnPrestar.setText("Prestar");

        mniPrestar_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Prestar.png"))); // NOI18N
        mniPrestar_Libro.setText("Prestar Libro");
        mniPrestar_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPrestar_LibroActionPerformed(evt);
            }
        });
        mnPrestar.add(mniPrestar_Libro);

        jMenuBar1.add(mnPrestar);

        mnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Devolver.png"))); // NOI18N
        mnDevolver.setText("Devolver");

        mniDevolver_Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Devolver.png"))); // NOI18N
        mniDevolver_Libro.setText("Devolver Libro");
        mniDevolver_Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDevolver_LibroActionPerformed(evt);
            }
        });
        mnDevolver.add(mniDevolver_Libro);

        jMenuBar1.add(mnDevolver);

        menuIdiomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Idiomas.png"))); // NOI18N
        menuIdiomas.setText("Idiomas");

        menuItemEspanol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Espanol.png"))); // NOI18N
        menuItemEspanol.setText("Español");
        menuItemEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspanolActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemEspanol);

        menuItemIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Ingles.png"))); // NOI18N
        menuItemIngles.setText("Inglés");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemIngles);

        jMenuBar1.add(menuIdiomas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAgregar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregar_UsuarioActionPerformed
        if (crear_Usuario == null) {
            crear_Usuario = new Crear_Usuario();
            jPanel1.add(crear_Usuario);
        }
        crear_Usuario.setVisible(true);
    }//GEN-LAST:event_mniAgregar_UsuarioActionPerformed

    private void mniBuscar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscar_UsuarioActionPerformed
        if (buscar_Usuario == null) {
            buscar_Usuario = new Buscar_Usuario(controladorUsuario);
            jPanel1.add(buscar_Usuario);
        }
        buscar_Usuario.setVisible(true);
    }//GEN-LAST:event_mniBuscar_UsuarioActionPerformed

    private void mniActualizar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniActualizar_UsuarioActionPerformed
        if (actualizar_Usuario == null) {
            actualizar_Usuario = new Actualizar_Usuario(controladorUsuario);
            jPanel1.add(actualizar_Usuario);
        }
        actualizar_Usuario.setVisible(true);
    }//GEN-LAST:event_mniActualizar_UsuarioActionPerformed

    private void mniEliminar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminar_UsuarioActionPerformed
        if (eliminar_Usuario == null) {
            eliminar_Usuario = new Eliminar_Usuario(controladorUsuario);
            jPanel1.add(eliminar_Usuario);
        }
        eliminar_Usuario.setVisible(true);
    }//GEN-LAST:event_mniEliminar_UsuarioActionPerformed

    private void mniAgregar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregar_LibroActionPerformed
        if (agregar_Libro == null) {
            agregar_Libro = new Agregar_Libro(controladorLibro);
            jPanel1.add(agregar_Libro);
        }
        agregar_Libro.setVisible(true);
    }//GEN-LAST:event_mniAgregar_LibroActionPerformed

    private void mniBuscar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBuscar_LibroActionPerformed
        if (buscar_Libro == null) {
            buscar_Libro = new Buscar_Libro(controladorLibro);
            jPanel1.add(buscar_Libro);
        }
        buscar_Libro.setVisible(true);
    }//GEN-LAST:event_mniBuscar_LibroActionPerformed

    private void mniActualizar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniActualizar_LibroActionPerformed
        if (actualizar_Libro == null) {
            actualizar_Libro = new Actualizar_Libro(controladorLibro);
            jPanel1.add(actualizar_Libro);
        }
        actualizar_Libro.setVisible(true);
    }//GEN-LAST:event_mniActualizar_LibroActionPerformed

    private void mniEliminar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEliminar_LibroActionPerformed
        if (eliminar_Libro == null) {
            eliminar_Libro = new Eliminar_Libro(controladorLibro);
            jPanel1.add(eliminar_Libro);
        }
        eliminar_Libro.setVisible(true);
    }//GEN-LAST:event_mniEliminar_LibroActionPerformed

    private void mniPrestar_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPrestar_LibroActionPerformed
        if (prestar == null) {
            prestar = new Prestar_Libro(controladorUsuario, controladorLibro, controladorPrestamo, prestamoDAO);
            jPanel1.add(prestar);
        }
        prestar.setVisible(true);
    }//GEN-LAST:event_mniPrestar_LibroActionPerformed

    private void mniDevolver_LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDevolver_LibroActionPerformed
        if (devolver == null) {
            devolver = new Devolver_Libro(controladorLibro, controladorPrestamo, controladorUsuario, prestamoDAO);
            jPanel1.add(devolver);
        }
        devolver.setVisible(true);
    }//GEN-LAST:event_mniDevolver_LibroActionPerformed

    private void menuItemEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspanolActionPerformed
        locale = new Locale("es", "EC");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemEspanolActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        locale = new Locale("en", "US");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemInglesActionPerformed
    public void cambiarIdioma() {
        mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        mnUsuario.setText(mensajes.getString("mnUsuario"));
        mnLibro.setText(mensajes.getString("mnLibro"));
        mnDevolver.setText(mensajes.getString("mnDevolver"));
        mnPrestar.setText(mensajes.getString("mnPrestar"));
        if (crear_Usuario != null) {
            crear_Usuario.cambiarIdioma(locale);
        }
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuIdiomas;
    private javax.swing.JMenuItem menuItemEspanol;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenu mnDevolver;
    private javax.swing.JMenu mnLibro;
    private javax.swing.JMenu mnPrestar;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem mniActualizar_Libro;
    private javax.swing.JMenuItem mniActualizar_Usuario;
    private javax.swing.JMenuItem mniAgregar_Libro;
    private javax.swing.JMenuItem mniAgregar_Usuario;
    private javax.swing.JMenuItem mniBuscar_Libro;
    private javax.swing.JMenuItem mniBuscar_Usuario;
    private javax.swing.JMenuItem mniDevolver_Libro;
    private javax.swing.JMenuItem mniEliminar_Libro;
    private javax.swing.JMenuItem mniEliminar_Usuario;
    private javax.swing.JMenuItem mniPrestar_Libro;
    // End of variables declaration//GEN-END:variables
}
