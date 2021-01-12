package parkiran;
import javax.swing.*;


public class MainMenu extends javax.swing.JFrame {

    
    public MainMenu() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuParkir = new javax.swing.JMenu();
        MenuPendapatan = new javax.swing.JMenu();
        MenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/desktop-resize.png"))); // NOI18N

        MenuParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parking-sign.png"))); // NOI18N
        MenuParkir.setText("Parkir");
        MenuParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuParkirMousePressed(evt);
            }
        });
        jMenuBar1.add(MenuParkir);

        MenuPendapatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pendapatan Parkir.png"))); // NOI18N
        MenuPendapatan.setText("Pendapatan");
        MenuPendapatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuPendapatanMousePressed(evt);
            }
        });
        jMenuBar1.add(MenuPendapatan);

        MenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit-resize.png"))); // NOI18N
        MenuExit.setText("Exit");
        MenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuExitMousePressed(evt);
            }
        });
        jMenuBar1.add(MenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuExitMousePressed
    Object[] options = {"Ya","Tidak, Tetap di halaman"};
    int dialog = JOptionPane.showOptionDialog(this,"Anda Yakin Akan Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    if(dialog == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_MenuExitMousePressed

    private void MenuParkirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuParkirMousePressed
        new FormParkir(this, true).setVisible(true);
    }//GEN-LAST:event_MenuParkirMousePressed

    private void MenuPendapatanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPendapatanMousePressed
        new FormPendapatan(this, true).setVisible(true);
    }//GEN-LAST:event_MenuPendapatanMousePressed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuExit;
    private javax.swing.JMenu MenuParkir;
    private javax.swing.JMenu MenuPendapatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
