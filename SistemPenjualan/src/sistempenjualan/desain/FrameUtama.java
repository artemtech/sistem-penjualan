package sistempenjualan.desain;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author altintop
 */
public class FrameUtama extends javax.swing.JFrame {
//    private PanelSupplier panelSupplier;
//    private PanelStok panelStok;
//    private PanelPenjualan panelPenjualan;
//    private PanelPembelian panelPembelian;

    public PanelKasir2 panelKasir;

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonSupplier = new javax.swing.JButton();
        jButtonStok = new javax.swing.JButton();
        jButtonPenjualan = new javax.swing.JButton();
        jButtonPembelian = new javax.swing.JButton();
        jButtonKasir = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemDataSupplier = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemDataBarang = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemDataPelanggan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemBantuan = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemTentangKami = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Point Of Sales - Multirasa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/supplier.png"))); // NOI18N
        jButtonSupplier.setText("Supplier");
        jButtonSupplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSupplier.setFocusable(false);
        jButtonSupplier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSupplier.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonSupplier.setMinimumSize(new java.awt.Dimension(70, 70));
        jButtonSupplier.setPreferredSize(new java.awt.Dimension(96, 96));
        jButtonSupplier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupplierActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSupplier);

        jButtonStok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/stok.png"))); // NOI18N
        jButtonStok.setText("Stock");
        jButtonStok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStok.setFocusable(false);
        jButtonStok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonStok.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonStok.setMinimumSize(new java.awt.Dimension(70, 70));
        jButtonStok.setPreferredSize(new java.awt.Dimension(96, 96));
        jButtonStok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStokActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonStok);

        jButtonPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/penjualan.png"))); // NOI18N
        jButtonPenjualan.setText("Penjualan");
        jButtonPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPenjualan.setFocusable(false);
        jButtonPenjualan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPenjualan.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonPenjualan.setMinimumSize(new java.awt.Dimension(70, 70));
        jButtonPenjualan.setPreferredSize(new java.awt.Dimension(96, 96));
        jButtonPenjualan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPenjualanActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPenjualan);

        jButtonPembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/pembelian.png"))); // NOI18N
        jButtonPembelian.setText("Pembelian");
        jButtonPembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPembelian.setFocusable(false);
        jButtonPembelian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPembelian.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonPembelian.setMinimumSize(new java.awt.Dimension(70, 70));
        jButtonPembelian.setPreferredSize(new java.awt.Dimension(96, 96));
        jButtonPembelian.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPembelianActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPembelian);

        jButtonKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/kasir.png"))); // NOI18N
        jButtonKasir.setText("Kasir");
        jButtonKasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonKasir.setFocusable(false);
        jButtonKasir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonKasir.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonKasir.setMinimumSize(new java.awt.Dimension(70, 70));
        jButtonKasir.setPreferredSize(new java.awt.Dimension(96, 96));
        jButtonKasir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKasirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonKasir);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/power.png"))); // NOI18N
        jMenuItemExit.setText("Keluar");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master Data");

        jMenuItemDataSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/supplier_16.png"))); // NOI18N
        jMenuItemDataSupplier.setText("Data Supplier");
        jMenu2.add(jMenuItemDataSupplier);
        jMenu2.add(jSeparator2);

        jMenuItemDataBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistempenjualan/images/stok_16.png"))); // NOI18N
        jMenuItemDataBarang.setText("Data Barang");
        jMenu2.add(jMenuItemDataBarang);
        jMenu2.add(jSeparator1);

        jMenuItemDataPelanggan.setText("Pelanggan");
        jMenu2.add(jMenuItemDataPelanggan);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Bantuan");

        jMenuItemBantuan.setText("Bantuan");
        jMenu3.add(jMenuItemBantuan);
        jMenu3.add(jSeparator3);

        jMenuItemTentangKami.setText("Tentang Kami");
        jMenu3.add(jMenuItemTentangKami);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desktopPane)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        onExit();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        onExit();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jButtonStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStokActionPerformed
//        try {
//            if (panelStok == null) {
//                panelStok = new PanelStok();
//                desktopPane.add(panelStok);
//            }else{
//                panelStok.toFront();
//            }
//            panelStok.setVisible(true);
//            panelStok.setSelected(true);
//            panelStok.setSize(desktopPane.getSize());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jButtonStokActionPerformed

    private void jButtonPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPenjualanActionPerformed
//        try {
//            if (panelPenjualan == null) {
//                panelPenjualan = new PanelPenjualan();
//                desktopPane.add(panelPenjualan);
//            }else{
//                panelPenjualan.toFront();
//            }
//            panelPenjualan.setVisible(true);
//            panelPenjualan.setSelected(true);
//            panelPenjualan.setSize(desktopPane.getSize());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jButtonPenjualanActionPerformed

    private void jButtonPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPembelianActionPerformed
//        try {
//            if (panelPembelian == null) {
//                panelPembelian = new PanelPembelian();
//                desktopPane.add(panelPembelian);
//            }else{
//                panelPembelian.toFront();
//            }
//            panelPembelian.setVisible(true);
//            panelPembelian.setSelected(true);
//            panelPembelian.setSize(desktopPane.getSize());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jButtonPembelianActionPerformed

    private void jButtonKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKasirActionPerformed
        try {
            if (panelKasir == null) {
                panelKasir = new PanelKasir2();
                desktopPane.add(panelKasir);
            } else {
                panelKasir.toFront();
            }
            panelKasir.setVisible(true);
            panelKasir.setSelected(true);
            panelKasir.setSize(desktopPane.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonKasirActionPerformed

    private void jButtonSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupplierActionPerformed
//        try {
//            if (panelSupplier == null) {
//                panelSupplier = new PanelSupplier();
//                desktopPane.add(panelSupplier);
//            }else{
//                panelSupplier.toFront();
//            }
//            panelSupplier.setVisible(true);
//            panelSupplier.setSelected(true);
//            panelSupplier.setSize(desktopPane.getSize());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jButtonSupplierActionPerformed

    private void onExit() {
        int choice = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonKasir;
    private javax.swing.JButton jButtonPembelian;
    private javax.swing.JButton jButtonPenjualan;
    private javax.swing.JButton jButtonStok;
    private javax.swing.JButton jButtonSupplier;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemBantuan;
    private javax.swing.JMenuItem jMenuItemDataBarang;
    private javax.swing.JMenuItem jMenuItemDataPelanggan;
    private javax.swing.JMenuItem jMenuItemDataSupplier;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemTentangKami;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
