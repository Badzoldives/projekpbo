package com.example.projekpbo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField UsernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private Button LoginButton;

    @FXML
    private AnchorPane rootPane;

    @FXML
    void initialize() {
        // Menambahkan penanganan acara untuk tombol login
        LoginButton.setOnAction(event -> {
            String username = UsernameTextField.getText();
            String password = passwordPasswordField.getText();
            // Anda dapat menambahkan logika pengecekan kredensial di sini
            // Misalnya, memeriksa dengan database atau hardcoded
            if (validateCredentials(username , password)) {
                System.out.println("Login berhasil!");
                navigateToMainMenu(event);
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        });
    }

    // Metode untuk memeriksa kredensial pengguna (contoh sederhana)
    private boolean validateCredentials(String username, String password) {
        // Anda dapat mengganti logika ini dengan cara yang sesuai
        return username.equals("admin") && password.equals("123");
    }

    // Metode untuk menavigasi ke halaman utama setelah login berhasil
    private void navigateToMainMenu(ActionEvent event) {
        try {
            // Load file FXML untuk halaman utama
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-utama.fxml"));

            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            // Mendapatkan stage dari rootPane (AnchorPane) dari controller saat ini
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Mengatur scene utama dengan halaman utama dan menampilkan stage
            stage.setScene(scene);
            stage.setTitle("MenuUtama");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
