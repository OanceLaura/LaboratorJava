package Cofetarie;

import java.io.*;
import javax.swing.JOptionPane;
   

public class Comanda extends javax.swing.JFrame {
String text1="Cantitate:";
String text2="Denumire produs:";
String text3="Pret total:";
public int PretTotal=0;


    public Comanda() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cant3 = new javax.swing.JTextField();
        cant2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cant1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        denprod3 = new javax.swing.JTextField();
        nume = new javax.swing.JTextField();
        denprod1 = new javax.swing.JTextField();
        prenume = new javax.swing.JTextField();
        denprod2 = new javax.swing.JTextField();
        adresa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comanda = new javax.swing.JButton();
        prettotal = new javax.swing.JButton();
        prettotal1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(210, 135, 225));

        jLabel1.setText("NUME");

        cant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant3ActionPerformed(evt);
            }
        });

        cant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant2ActionPerformed(evt);
            }
        });

        jLabel3.setText("ADRESA");

        cant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant1ActionPerformed(evt);
            }
        });

        jLabel2.setText("PRENUME");

        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });

        jLabel11.setText("TELEFON");

        jButton2.setText("INAPOI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeActionPerformed(evt);
            }
        });

        denprod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denprod1ActionPerformed(evt);
            }
        });

        prenume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenumeActionPerformed(evt);
            }
        });

        denprod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denprod2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("COMANDA");

        jLabel5.setText("CANTITATE(kg, bucata)");

        jLabel6.setText("DENUMIRE PRODUS");

        comanda.setText("TRIMITE COMANDA");
        comanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comandaActionPerformed(evt);
            }
        });

        prettotal.setText("Pret total");
        prettotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prettotalActionPerformed(evt);
            }
        });

        prettotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prettotal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(denprod3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(prettotal)
                        .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(denprod2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(denprod1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prettotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(143, 143, 143)))
                                .addComponent(jLabel1)
                                .addComponent(nume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(prenume, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(comanda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(denprod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(denprod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(denprod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prettotal)
                            .addComponent(prettotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comanda)
                            .addComponent(jButton2))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant3ActionPerformed

    }//GEN-LAST:event_cant3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void denprod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denprod1ActionPerformed

    }//GEN-LAST:event_denprod1ActionPerformed

    private void prenumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenumeActionPerformed

    }//GEN-LAST:event_prenumeActionPerformed

    private void denprod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denprod2ActionPerformed

    }//GEN-LAST:event_denprod2ActionPerformed

    private void comandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comandaActionPerformed
        try{
            if (esteNumar(telefon.getText())&&telefon.getText().length()==10){ 
            
            FileWriter file=new FileWriter("C:\\Users\\Laura\\OneDrive\\Desktop\\ProiectCofetarie\\ProiectCofetarie\\src\\Cofetarie\\fisier.txt");
            BufferedWriter out=new BufferedWriter(file);
            out.write(nume.getText());
            out.newLine();
            out.write(prenume.getText());
            out.newLine();
            out.write(adresa.getText());
            out.newLine();
            out.write(telefon.getText());
            out.newLine();
            out.write(text1+cant1.getText());
            out.newLine();
            out.write(text2+denprod1.getText());
            out.newLine();
            if (denprod2.getText().length()!=0 && cant2.getText().length()!=0 ){
            out.write(text1+cant2.getText());
            out.newLine();
            out.write(text2+denprod2.getText());
            out.newLine();
            }else{
                out.write("");
            }
            if (denprod3.getText().length()!=0 && cant3.getText().length()!=0 ){
            out.write(text1+cant3.getText());
            out.newLine();
            out.write(text2+denprod3.getText());
            out.newLine();
            }else{
                out.write("");
            }
            out.write(text3+prettotal1.getText());
            out.close();
            JOptionPane.showMessageDialog(this,"Comanda a fost efectuata.Va multumim!");
            }else JOptionPane.showMessageDialog(null,"Verificati campul telefon!");
        }catch(Exception e){
            System.err.println("Ërror: " +e.getMessage());
        }
    }//GEN-LAST:event_comandaActionPerformed

    private void numeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeActionPerformed
    }//GEN-LAST:event_numeActionPerformed

    private void prettotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prettotal1ActionPerformed
        
    }//GEN-LAST:event_prettotal1ActionPerformed

    private void cant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant1ActionPerformed

    }//GEN-LAST:event_cant1ActionPerformed

    private void prettotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prettotalActionPerformed
          if (denprod1.getText().length()!=0 && cant1.getText().length()!=0 ){
            if (denprod1.getText().equals("Tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*91;
            if (denprod1.getText().equals("Felie tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*13;
            if (denprod1.getText().equals("Tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*71;
            if (denprod1.getText().equals("Felie tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*14;
            if (denprod1.getText().equals("Tort Amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*71;
            if (denprod1.getText().equals("Tort Cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*70;
            if (denprod1.getText().equals("Tort Diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*63;
              if (denprod1.getText().equals("Felie tort amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*14;
              if (denprod1.getText().equals("Felie tort cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*13;
            if (denprod1.getText().equals("Felie tort diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant1.getText())*10;
          
            if (denprod2.getText().equals("Tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*91;
            if (denprod2.getText().equals("Felie tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*13;
            if (denprod2.getText().equals("Tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*71;
            if (denprod2.getText().equals("Felie tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*14;
            if (denprod2.getText().equals("Tort Amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*71;
            if (denprod2.getText().equals("Tort Diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*63;
            if (denprod2.getText().equals("Tort Cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*70;
            if (denprod2.getText().equals("Felie tort amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*14;
           if (denprod2.getText().equals("Felie tort cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*13;
            if (denprod2.getText().equals("Felie tort diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*10;
            if (denprod2.getText().equals("Buchet gladiole"))
        PretTotal=PretTotal+Integer.parseInt(cant2.getText())*66;
          
            if (denprod3.getText().equals("Tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*91;
            if (denprod3.getText().equals("Felie tort de morcovi"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*13;
            if (denprod3.getText().equals("Tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*71;
            if (denprod3.getText().equals("Felie tort Afrodita"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*14;
            if (denprod3.getText().equals("Tort Amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*71;
            if (denprod3.getText().equals("Tort Diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*63;
            if (denprod3.getText().equals("Tort Cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*70;
            if (denprod3.getText().equals("Felie tort amandina"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*14;
             if (denprod3.getText().equals("Felie tort cocktail"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*13;
            if (denprod3.getText().equals("Felie tort diplomat"))
        PretTotal=PretTotal+Integer.parseInt(cant3.getText())*10;
 
          
            prettotal1.setText(PretTotal+" Lei");
            PretTotal=0;
        }
                                                 
        
    }//GEN-LAST:event_prettotalActionPerformed

    private void cant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant2ActionPerformed

    }//GEN-LAST:event_cant2ActionPerformed

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed
                
    }//GEN-LAST:event_telefonActionPerformed
   public boolean esteNumar(String input){
       try{
           Integer.parseInt(input);
           return true;
           }catch(Exception e){
               return false;
           }
   }
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comanda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresa;
    private javax.swing.JTextField cant1;
    private javax.swing.JTextField cant2;
    private javax.swing.JTextField cant3;
    private javax.swing.JButton comanda;
    private javax.swing.JTextField denprod1;
    private javax.swing.JTextField denprod2;
    private javax.swing.JTextField denprod3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nume;
    private javax.swing.JTextField prenume;
    private javax.swing.JButton prettotal;
    private javax.swing.JTextField prettotal1;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
