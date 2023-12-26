package org.example;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ProxyImage implements MyImage {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

