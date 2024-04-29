package com.example.projekpbo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class MenuUtama {

    @FXML
    private ImageView imgDataSiswa;

    @FXML
    private ImageView imgDataGuru;

    @FXML
    private ImageView imgMataPelajaran;

    @FXML
    private ImageView imgHasilRapot;

    @FXML
    private Label lblMenuUtama;

    public void initialize() {
        File gambarsiswa = new File("src/students.png");
        imgDataSiswa.setImage(new Image(gambarsiswa.toURI().toString()));
        File file = new File("src/classroom.png");
        imgDataGuru.setImage(new Image(file.toURI().toString()));
        File pelajaran = new File("src/learn.png");
        imgMataPelajaran.setImage(new Image(pelajaran.toURI().toString()));
        File rapot = new File("src/graduation.png");
        imgHasilRapot.setImage(new Image(rapot.toURI().toString()));
//        lblMenuUtama.setText("menu-utama");
    }

    @FXML
    public void buttonDiKlik(){
        System.out.println("button di klik");
    }
    // Tambahkan metode atau logika lain sesuai kebutuhan aplikasi Anda

}
