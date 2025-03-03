/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Polinomios;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Ramos
 */
public class CalculadoraPolinomio extends javax.swing.JFrame {
    
    File f = null;
    File dir = null;
    
    /**
     * Creates new form NewJFrame
     */
    public CalculadoraPolinomio() {
        initComponents();
        Forma.add(aristas);
        Forma.add(matriz_ad);
        matriz_ad.setSelected(true);
        resultado.setEditable(false);
    }

    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
       return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        Forma = new javax.swing.ButtonGroup();
        Medio = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ver = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        matriz = new javax.swing.JTextArea();
        botón = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        aristas = new javax.swing.JRadioButton();
        matriz_ad = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Polynomial Calculator - Calculadora del polinomio cromático de una gráfica");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ingresa el número de vértices: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ingresa tus aristas o matriz de adyacencia:");

        ver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verKeyTyped(evt);
            }
        });

        matriz.setColumns(20);
        matriz.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        matriz.setRows(5);
        matriz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matrizKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(matriz);

        botón.setText("¡Calcula el polinomio!");
        botón.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Resultlado:");

        aristas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aristas.setText("Lista de aristas");
        aristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aristasActionPerformed(evt);
            }
        });

        matriz_ad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        matriz_ad.setText("Matriz de adyacencia");
        matriz_ad.setToolTipText("");
        matriz_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriz_adActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Elige la forma en la que está representada tu gráfica:");

        jLabel6.setText("| Limpiar |");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Calculadora del polinomio cromático de una gráfica");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Volver al menú principal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Si necesitas ayuda, puedes consultar las instrucciones de ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("uso en el archivo instrucciones.pdf, que se encuentra en ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("la carpeta de instalación del programa.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Calculadora cromática");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addComponent(botón)
                    .addComponent(matriz_ad)
                    .addComponent(aristas))
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriz_ad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aristas)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botón)
                            .addComponent(jLabel6)))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónActionPerformed
        if("".equals(ver.getText()) || "".equals(matriz.getText())) {
            resultado.setText("Error.\nNo se han llenado las entradas.");
            return;
        }
        ArrayList<ArrayList<Boolean>> mat = new ArrayList<>();
            int n = Integer.parseInt(ver.getText());
            if(matriz_ad.isSelected()) {
                String cadena = matriz.getText();
                StringTokenizer st = new StringTokenizer(cadena, " |\n");
                for(int i = 0; i < n; ++i) {
                    mat.add(new ArrayList<>());
                    for(int j = 0; j < n; ++j) {
                        if(!st.hasMoreTokens()) {
                            resultado.setText("Error:\nLa matriz no coincide con el\nel número de vértices");
                            return;
                        }
                        mat.get(mat.size() - 1).add(Integer.parseInt(st.nextToken()) != 0);
                    }
                }
                if(st.hasMoreElements()) {
                    resultado.setText("Error:\nLa matriz no coincide con el\nel número de vértices");
                    return;
                }
            } else if(aristas.isSelected()) {
                for(int i = 0; i < n; ++i) {
                    mat.add(new ArrayList<>());
                    for(int j = 0; j < n; ++j) {
                        mat.get(mat.size() - 1).add(false);
                    }
                }
                
                String cadena = matriz.getText();
                StringTokenizer st = new StringTokenizer(cadena, " |\n");
                while(st.hasMoreElements()) {
                    String pal = st.nextToken();
                    pal = pal.replace("{", "");
                    pal = pal.replace("}", "");
                    StringTokenizer sto = new StringTokenizer(pal, ",");
                    int i = Integer.parseInt(sto.nextToken());
                    int j = Integer.parseInt(sto.nextToken());
                    mat.get(i).set(j, true);
                    mat.get(j).set(i, true);
                }
            }
            
            for(int i = 0; i < n; ++i) {
                for(int j = 0; j < n; ++j) {
                    if(i == j) {
                        if(mat.get(i).get(j) == true) {
                            resultado.setText("Polinomio cromático:\n0\nLa gráfica contiene un lazo");
                            return;
                        }
                    } else {
                        if(!Objects.equals(mat.get(i).get(j), mat.get(j).get(i))) {
                            resultado.setText("Error:\nLa matriz no es simétrica.");
                            return;
                        }
                    }
                }
            }
            
            Polinomio poli = new Polinomio();
            String s = poli.chromatic(mat);
            LinkedList<Integer> a = poli.traductor(n, s);
            String res = "";
            res += "Polinomio cromático:\n" + poli.imprime_polinomio(a) + ".\n";
            if(n < 9) {
                for(int i = 0; i < Main.clases.get(n - 1).size(); ++i) {
                    if(Main.compara(a, Main.clases.get(n - 1).get(i).poli)) {
                        if(Main.clases.get(n - 1).get(i).mat.size() == 1) {
                            res += "La gráfica es cromáticamente \núnica.\n";
                        } else {
                            res += "La gráfica comparte su \npolinomio con " + (Main.clases.get(n - 1).get(i).mat.size() - 1) + " gráfica(s)\nno isomorfa(s) a ella.\n";
                        }
                    }
                }
            }
            resultado.setText(res);
    }//GEN-LAST:event_botónActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        resultado.setText("");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void aristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aristasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aristasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            Main m = new Main();
            m.setVisible(true);
            m.setResizable(false);
            m.setLocationRelativeTo(null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CalculadoraPolinomio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void matriz_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriz_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriz_adActionPerformed

    private void verKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_verKeyTyped

    private void matrizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matrizKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || key == '}' || key == '{' || key == ',' || key == '\n' || key == ' ';

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_matrizKeyTyped

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
            java.util.logging.Logger.getLogger(CalculadoraPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalculadoraPolinomio cp = new CalculadoraPolinomio();
                cp.setVisible(true);
                cp.setResizable(false);
                cp.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Forma;
    private javax.swing.ButtonGroup Medio;
    private javax.swing.JRadioButton aristas;
    private javax.swing.JButton botón;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea matriz;
    private javax.swing.JRadioButton matriz_ad;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField ver;
    // End of variables declaration//GEN-END:variables
}
