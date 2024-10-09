/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Polinomios;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;

/**
 *
 * @author Daniel Ramos
 */
public class ClasesPolinomio extends javax.swing.JFrame {

    /**
     * Creates new form ClasesPolinomio
     */
    public ClasesPolinomio() {
        initComponents();
        Cálculo.add(CMatriz);
        Cálculo.add(CVértices);
        CVértices.setSelected(true);
        Resultado.setEditable(false);
        matriz.setEnabled(false);
    }
    
    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
       return retValue;
    }
    
    public String imprime_grafica(ArrayList<ArrayList<Integer>> mat, boolean tipo) {
        String s = "";
        for(int i = 0; i < mat.size(); ++i) {
            for(int j = 0; j < mat.size(); ++j) {
                s += Integer.toString(mat.get(i).get(j)) + " ";
            }
            s += "\n";
        }
        return s;
    }

    public void clases_n(int n) {
        Polinomio poli = new Polinomio();
        String s = "";
        s += "Las gráficas de " + n + " vértices \ntienen " + Main.clases.get(n - 1).size() + " clases de polinomios.\n\n";
        for(int i = 0; i < Main.clases.get(n - 1).size(); ++i) {
            s += "Polinomio: " + poli.imprime_polinomio(Main.clases.get(n - 1).get(i).poli) + ".\n";
            if(Main.clases.get(n - 1).get(i).mat.size() == 1) {
                s += "Existe " + 1 + " gráfica en la clase:\n\n";
            } else {
             s += "Existen " + Main.clases.get(n - 1).get(i).mat.size() + " gráficas \nno isomorfas que pertenecen a \nesta clase:\n\n";   
            }
            for(int j = 0; j < Main.clases.get(n - 1).get(i).mat.size(); ++j) {
                s += imprime_grafica(Main.clases.get(n - 1).get(i).mat.get(j), false) + "\n";
            }
        }
        Resultado.setText(s);
    }
    
    public void matriz_n(int n) {
        String cadena = matriz.getText();
        StringTokenizer st = new StringTokenizer(cadena, " |\n");
        ArrayList<ArrayList<Boolean>> mat = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            mat.add(new ArrayList<>());
            for(int j = 0; j < n; ++j) {
                if(!st.hasMoreTokens()) {
                    Resultado.setText("Error:\nLa matriz no coincide con el\nel número de vértices");
                    return;
                }
                mat.get(mat.size() - 1).add(Integer.parseInt(st.nextToken()) != 0);
            }
        }
        
        if(st.hasMoreElements()) {
            Resultado.setText("Error:\nLa matriz no coincide con el\nel número de vértices");
            return;
        }
        
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(i == j) {
                    if(mat.get(i).get(j) == true) {
                        Resultado.setText("Polinomio cromático:\n0\nLa gráfica contiene un lazo");
                        return;
                    }
                } else {
                    if(!Objects.equals(mat.get(i).get(j), mat.get(j).get(i))) {
                        Resultado.setText("Error:\nLa matriz no es simétrica.");
                        return;
                    }
                }
            }
        }
        Polinomio poli = new Polinomio();
        String s = poli.chromatic(mat);
        LinkedList<Integer> a = poli.traductor(n, s);
        String res = "";
        res += "Polinomio: " + poli.imprime_polinomio(a) + "\n";
        for(int i = 0; i < Main.clases.get(n - 1).size(); ++i) {
            if(Main.compara(a, Main.clases.get(n - 1).get(i).poli)) {
                if(Main.clases.get(n - 1).get(i).mat.size() == 1) {
                    res += "La gráfica es cromáticamente \núnica.\n";
                } else {
                    res += "La gráfica comparte su \npolinomio con las siguientes \n" + (Main.clases.get(n - 1).get(i).mat.size()) + " gráficas, una de estas es \nisomorfa a ella:\n\n";
                    for(int j = 0; j < Main.clases.get(n - 1).get(i).mat.size(); ++j) {
                        for(int u = 0; u < n; ++u) {
                            for(int v = 0; v < n; ++v) {
                                res += Main.clases.get(n - 1).get(i).mat.get(j).get(u).get(v) + " ";
                            }
                            res += "\n";
                        }
                        res += "\n";
                    }
                }
            }
        }
        Resultado.setText(res);
                
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Cálculo = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        CalculaClase = new javax.swing.JButton();
        nclase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        matriz = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        CMatriz = new javax.swing.JRadioButton();
        CVértices = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jScrollPane4.setViewportView(jTextPane1);

        jScrollPane5.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clases del polinomio cromático de una gráfica");
        setIconImage(getIconImage());

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Restulado:");

        CalculaClase.setText("¡Calcula la clase!");
        CalculaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculaClaseActionPerformed(evt);
            }
        });

        nclase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nclase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nclaseActionPerformed(evt);
            }
        });
        nclase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nclaseKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ingresa el número de vértices:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Volver al menú principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
        jScrollPane2.setViewportView(matriz);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ingresa tus aristas o matriz de adyacencia:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("| Limpiar |");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        CMatriz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CMatriz.setText("Calcular la clase de una gráfica dada su matriz de adyacencia");
        CMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMatrizActionPerformed(evt);
            }
        });

        CVértices.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CVértices.setText("Calcular todas las clases de n vértices");
        CVértices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVérticesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Elige la opción que deseas calcular:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Calculadora de classes cromáticas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Calculadora cromática");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Si necesitas ayuda, puedes consultar las instrucciones de ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("uso en el archivo instrucciones.pdf, que se encuentra en ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("la carpeta de instalación del programa.");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nclase, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculaClase)
                    .addComponent(CMatriz)
                    .addComponent(CVértices)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10)
                            .addGap(12, 12, 12)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CVértices)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CMatriz)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nclase, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CalculaClase)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculaClaseActionPerformed
        // TODO add your handling code here:
        if("".equals(nclase.getText())) {
            Resultado.setText("Error.\nNo se han llenado las entradas.");
            return;
        }
        int n = Integer.parseInt(nclase.getText());
        Resultado.setText("");
        if(CVértices.isSelected()) {
            clases_n(n);
        } else {
            if("".equals(matriz.getText())) {
            Resultado.setText("Error.\nNo se han llenado las entradas.");
            return;
        }
            matriz_n(n);
        }
    }//GEN-LAST:event_CalculaClaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Main m;
        try {
            m = new Main();
            m.setVisible(true);
            m.setResizable(false);
            m.setLocationRelativeTo(null);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClasesPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Resultado.setText("");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void CVérticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVérticesActionPerformed
        // TODO add your handling code here:
        matriz.setEnabled(false);
    }//GEN-LAST:event_CVérticesActionPerformed

    private void CMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMatrizActionPerformed
        // TODO add your handling code here:
        matriz.setEnabled(true);
    }//GEN-LAST:event_CMatrizActionPerformed

    private void nclaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nclaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nclaseActionPerformed

    private void nclaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nclaseKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_nclaseKeyTyped

    private void matrizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matrizKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key == '0' || key == '1' || key == ' ' || key == '\n';

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
            java.util.logging.Logger.getLogger(ClasesPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClasesPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClasesPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClasesPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClasesPolinomio cp = new ClasesPolinomio();
                cp.setVisible(true);
                cp.setResizable(false);
                cp.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CMatriz;
    private javax.swing.JRadioButton CVértices;
    private javax.swing.JButton CalculaClase;
    private javax.swing.ButtonGroup Cálculo;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextArea matriz;
    private javax.swing.JTextField nclase;
    // End of variables declaration//GEN-END:variables
}
