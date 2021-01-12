package parkiran;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.PrintJob;
import java.awt.Graphics;
import java.awt.Font;
import java.sql.*;

public class FormParkir extends javax.swing.JFrame {

    DefaultTableModel masuk, keluar;
    koneksiDB konek = new koneksiDB();

    public FormParkir(java.awt.Frame parent, boolean modal) {
        initComponents();
        konek.koneksiDB();
        btnSimpan.setBackground(Color.green);
        btnHapus.setBackground(Color.red);
        btnCari.setBackground(Color.yellow);
        btnBayar.setBackground(Color.red);
        btnPrint.setBackground(Color.green);
        btnClear.setBackground(Color.blue);
        tampilMasuk();
        tampilKeluar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbiaya = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cbJenis = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtnopol = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMasuk = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtknopol = new javax.swing.JTextField();
        txtknotiket = new javax.swing.JTextField();
        txtkjenis = new javax.swing.JTextField();
        txtkdurasihari = new javax.swing.JTextField();
        txtkbiayaparkir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtkjammasuk = new javax.swing.JTextField();
        txtkdurasijam = new javax.swing.JTextField();
        txtkbiayatotal = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtktglmasuk = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableKeluar = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuParkir = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        lblbiaya.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Kendaraan");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Jenis Kendaraan-", "Motor", "Mobil", "" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtnopol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnopolKeyTyped(evt);
            }
        });

        jLabel11.setText("No Polisi");

        jLabel12.setText("Jenis");

        tableMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tanggal Masuk", "Jam Masuk"
            }
        ));
        jScrollPane1.setViewportView(tableMasuk);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnopol)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Masuk Parkir", jPanel1);

        jLabel2.setText("No Polisi");

        jLabel3.setText("No Tiket");

        jLabel4.setText("Jenis");

        jLabel5.setText("Durasi Hari");

        jLabel6.setText("Biaya Parkir");

        txtknopol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtknopolKeyTyped(evt);
            }
        });

        jLabel7.setText("Jam Masuk");

        jLabel8.setText("Durasi Jam");

        jLabel9.setText("Biaya Total");

        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money-resize.png"))); // NOI18N
        btnBayar.setText("Keluar Parkir");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parking-ticket-resize.png"))); // NOI18N
        btnPrint.setText("Cetak");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/x-button-resize.png"))); // NOI18N
        btnClear.setText("Bersihkan");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lens-resize.png"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel10.setText("Tgl Masuk");

        tableKeluar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Tiket", "No. Pol", "Jenis", "Tgl Keluar", "Jam Keluar", "Biaya"
            }
        ));
        jScrollPane2.setViewportView(tableKeluar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBayar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtknopol, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtkdurasihari, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(txtktglmasuk))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtknotiket, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtkjenis))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkjammasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkdurasijam, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkbiayatotal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtkbiayaparkir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtknopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtknotiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtkjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCari)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtkjammasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtktglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtkdurasihari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtkdurasijam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtkbiayaparkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtkbiayatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Keluar Parkir", jPanel2);

        menuParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/parking-sign-resize.png"))); // NOI18N
        menuParkir.setText("Menu Parkir");

        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit-resize.png"))); // NOI18N
        menuExit.setText("Keluar");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuParkir.add(menuExit);

        jMenuBar1.add(menuParkir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        dispose();
    }//GEN-LAST:event_menuExitActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (txtnopol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor polisi belum di isi!");
        } else if (cbJenis.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih");
        } else {
            String nopol, jenis, sql;
            nopol = txtnopol.getText();
            jenis = cbJenis.getSelectedItem().toString();

            sql = "INSERT INTO data(no_pol,jenis,tgl_masuk,jam_masuk)"
                    + "VALUES('" + nopol + "','" + jenis + "',CURDATE(),CURTIME())";
            try {
                konek.stm = konek.conn.createStatement();
                konek.stm.execute(sql);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data gagal disimpan" + e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        resetAll();
        tampilMasuk();
        tampilKeluar();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        txtnopol.setText("");
        cbJenis.setSelectedIndex(0);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if (txtknopol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomer Polisi kosong!");
        } else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator(',');
            rupiah.setDecimalFormatSymbols(formatRp);

            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) durasi_hari, (TIME_FORMAT(CURTIME(), '%H')-TIME_FORMAT(jam_masuk, '%H')) durasi_jam "
                    + "FROM data WHERE no_pol='" + txtknopol.getText() + "' AND biaya=0";
            try {
                konek.stm = konek.conn.createStatement();
                konek.rs = konek.stm.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Kesalahan query!" + ex);
            }
            int size = 0;
            try {
                int biayamobil = 0, biayamotor = 0;
                String ambilbiaya = "select from* biaya";
                Statement stm = konek.conn.createStatement();
                ResultSet rs = stm.executeQuery(ambilbiaya);
                while(rs.next()){
                    biayamotor = rs.getInt("motor");
                    biayamobil = rs.getInt("mobil");
                    System.out.println(biayamotor);
                    System.out.println(biayamobil);
                }
                while (konek.rs.next()) {
                    size++;
                    txtknotiket.setText(konek.rs.getString("no_tiket").toString());
                    txtkjenis.setText(konek.rs.getString("jenis").toString());
                    txtktglmasuk.setText(konek.rs.getString("tgl_masuk").toString());
                    txtkjammasuk.setText(konek.rs.getString("jam_masuk").toString());
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_total;
                    if (txtkjenis.getText().equals("Mobil")) {
                        txtkbiayaparkir.setText(rupiah.format(biayamobil));
                        biaya = biayamobil;
                    } else {
                        txtkbiayaparkir.setText(rupiah.format(biayamotor));
                        biaya = biayamotor;
                    }
                    if (hari > 0) {
                        txtkdurasihari.setText("" + hari + " hari");
                        txtkdurasijam.setText("-");
                        biaya_total = biaya + (5000 * hari);
                        txtkbiayatotal.setText(rupiah.format(biaya_total));
                        lblbiaya.setText("" + biaya_total);
                    } else {
                        txtkdurasihari.setText("0 hari");
                        txtkdurasijam.setText(konek.rs.getString("durasi_jam").toString() + " jam");
                        biaya_total = biaya + (1000 * jam);
                        txtkbiayatotal.setText(rupiah.format(biaya_total));
                        lblbiaya.setText("" + biaya_total);
                    }
                }
                if (size == 0) {
                    JOptionPane.showMessageDialog(this, "Data tidak ditamukan!");
                    return;
                }
                konek.rs.close();
                konek.stm.close();
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtknopolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtknopolKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_txtknopolKeyTyped

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        if (txtknopol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Kosong!");
        } else {
            int biaya = Integer.parseInt(lblbiaya.getText());
            String sql, notiket;
            notiket = txtknotiket.getText();

            sql = "UPDATE data SET tgl_keluar = CURDATE(), jam_keluar = CURTIME(), biaya = '" + biaya + "' "
                    + "WHERE no_tiket = '" + notiket + "'";
            try {
                konek.stm = konek.conn.createStatement();
                konek.stm.execute(sql);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Data Gagal Disimpan!" + e);
                return;
            }
            JOptionPane.showMessageDialog(this, " Data Berhasil Diperbaharui");
            resetAll();
            tampilMasuk();
            tampilKeluar();
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (txtknopol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Masih Kosong");
        } else {
            PrintJob p = getToolkit().getPrintJob(this, "Cetak Tiket", null);

            Graphics g = p.getGraphics();
            g.setFont(new Font("Serif", Font.BOLD, 20));
            g.drawString("TIKET NO: " + txtknotiket.getText(), 200, 18);
            g.drawLine(10, 30, 600, 30);
            g.setFont(new Font("Courier New", Font.PLAIN, 12));
            g.drawString("No. Pol", 10, 50);
            g.drawString(" : ", 100, 50);
            g.drawString(txtknopol.getText(), 160, 50);

            g.drawString("Jenis", 10, 60);
            g.drawString(" : ", 100, 60);
            g.drawString(txtkjenis.getText(), 160, 60);

            g.drawString("Tanggal Masuk", 10, 80);
            g.drawString(" : ", 100, 80);
            g.drawString(txtktglmasuk.getText(), 160, 80);

            g.drawString("Jam Masuk", 10, 90);
            g.drawString(" : ", 100, 90);
            g.drawString(txtkjammasuk.getText(), 160, 90);

            g.drawString("Durasi Hari", 10, 100);
            g.drawString(" : ", 100, 100);
            g.drawString(txtkdurasihari.getText(), 160, 100);

            g.drawString("Biaya Parkir", 10, 120);
            g.drawString(" : ", 100, 120);
            g.drawString(txtkbiayaparkir.getText(), 160, 120);

            g.drawString("Biaya Total", 10, 120);
            g.drawString(" : ", 100, 120);
            g.drawString(txtkbiayatotal.getText(), 160, 120);

            g.setFont(new Font("Courier New", Font.PLAIN, 8));
            g.drawString("*Parkir lebih dari 1 jam dikenakan biaya tambahan Rp 1000,00 Bberlaku kelipatan jam", 10, 150);
            g.drawString("*Parkir lebih dari 1 hari dikenakan biaya tambahan Rp 50.000,00 Bberlaku kelipatan jam", 10, 160);

            p.end();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtknopol.setText("");
        txtknotiket.setText("");
        txtkjenis.setText("");
        txtktglmasuk.setText("");
        txtkjammasuk.setText("");
        txtkdurasihari.setText("");
        txtkdurasijam.setText("");
        txtkbiayaparkir.setText("");
        txtkbiayatotal.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtnopolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnopolKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
    }//GEN-LAST:event_txtnopolKeyTyped

    public void resetAll() {
        txtnopol.setText("");
        cbJenis.setSelectedIndex(0);
        masuk = (DefaultTableModel) tableMasuk.getModel();
        keluar = (DefaultTableModel) tableKeluar.getModel();
        int rowCount1 = masuk.getRowCount();
        int rowCount2 = keluar.getRowCount();

        for (int i = rowCount1 - 1; i >= 0; i--) {
            masuk.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
    }

    public void tampilMasuk() {
        masuk = (DefaultTableModel) tableMasuk.getModel();
        try {
            konek.stm = konek.conn.createStatement();
            String query = "SELECT * FROM data WHERE biaya = 0 ORDER BY no_tiket DESC LIMIT 25";
            konek.rs = konek.stm.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");

                String[] data = {no_tiket, no_pol, jenis, tgl_masuk, jam_masuk};
                masuk.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data" + e);
        }
        tableMasuk.setModel(masuk);
    }

    public void tampilKeluar() {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator(',');
        rupiah.setDecimalFormatSymbols(formatRp);

        keluar = (DefaultTableModel) tableKeluar.getModel();
        try {
            konek.stm = konek.conn.createStatement();
            String query = "SELECT * FROM data WHERE biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC LIMIT 15";
            konek.rs = konek.stm.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_total = (rupiah.format(biaya2));

                String[] data = {no_tiket, no_pol, jenis, tgl_keluar, jam_keluar, biaya_total};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data" + e);
        }
        tableKeluar.setModel(keluar);
    }

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
            java.util.logging.Logger.getLogger(FormParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormParkir dialog = new FormParkir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbiaya;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuParkir;
    private javax.swing.JTable tableKeluar;
    private javax.swing.JTable tableMasuk;
    private javax.swing.JTextField txtkbiayaparkir;
    private javax.swing.JTextField txtkbiayatotal;
    private javax.swing.JTextField txtkdurasihari;
    private javax.swing.JTextField txtkdurasijam;
    private javax.swing.JTextField txtkjammasuk;
    private javax.swing.JTextField txtkjenis;
    private javax.swing.JTextField txtknopol;
    private javax.swing.JTextField txtknotiket;
    private javax.swing.JTextField txtktglmasuk;
    private javax.swing.JTextField txtnopol;
    // End of variables declaration//GEN-END:variables
}
