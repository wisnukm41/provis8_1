
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whiz
 */
public class therealutama extends javax.swing.JFrame {

    /**
     * Creates new form therealutama
     */
    public therealutama() {
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

        lblRandom3 = new javax.swing.JLabel();
        lblRandom = new javax.swing.JLabel();
        btnTouch = new javax.swing.JButton();
        lblRandom1 = new javax.swing.JLabel();
        lblRandom2 = new javax.swing.JLabel();
        lblRandom4 = new javax.swing.JLabel();
        lblnim = new javax.swing.JLabel();
        lblnama = new javax.swing.JLabel();
        lblkls = new javax.swing.JLabel();

        lblRandom3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRandom3.setText("Identitas Diri");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Real Utama");

        lblRandom.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblRandom.setText("NAMA");

        btnTouch.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        btnTouch.setText("Click Me");
        btnTouch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTouchMouseClicked(evt);
            }
        });

        lblRandom1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblRandom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRandom1.setText("Identitas Diri Tugas 1");

        lblRandom2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblRandom2.setText("KELAS");

        lblRandom4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lblRandom4.setText("NIM");

        lblnim.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lblnama.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lblkls.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(btnTouch)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRandom4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblRandom2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(lblRandom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblkls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblRandom1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRandom4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRandom2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblnim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblkls, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(btnTouch)
                .addGap(61, 61, 61))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(lblRandom1)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTouchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTouchMouseClicked
        // TODO add your handling code here:
        lblnama.setText("Wisnu Murfadilah R");
        lblkls.setText("IF-8/IV");
        lblnim.setText("10118325");
        
        JOptionPane.showMessageDialog(null, "Identitas Sudah Muncul!");
    }//GEN-LAST:event_btnTouchMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTouch;
    private javax.swing.JLabel lblRandom;
    private javax.swing.JLabel lblRandom1;
    private javax.swing.JLabel lblRandom2;
    private javax.swing.JLabel lblRandom3;
    private javax.swing.JLabel lblRandom4;
    private javax.swing.JLabel lblkls;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblnim;
    // End of variables declaration//GEN-END:variables
}
