package com.example.paginadelogin.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;


public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirHome() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirProdutos() {
            carregarTela("Produtos.fxml");
    }

    @FXML
    public void abrirClientes() {
        carregarTela("Clientes.fxml");
    }

    public void abrirAjuda(ActionEvent event) {

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Sobre o sistema");
        alert.setHeaderText("Informações do sistema");
        alert.setContentText(
                "Nome: Sistema de Reservas\n" +
                        "Versão: 1.0\n" +
                        "Desenvolvedor: Isabella Carmélia\n" +
                        "Ano: 2026"
        );
        alert.showAndWait();
    }

    private void carregarTela(String fxml) {
    try {
        root.setCenter(
                FXMLLoader.load(getClass().getResource("/fxml/" + fxml))
        );
    } catch (Exception e) {
        e.printStackTrace();
       }
    }
}