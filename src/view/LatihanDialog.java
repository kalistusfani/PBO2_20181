/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author user only
 */
public class LatihanDialog extends JDialog {

    private JLabel namaLabel;

    public LatihanDialog() {
        init();
    }

    public LatihanDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 250, 50, 10);
        this.add(namaLabel);
    }
}