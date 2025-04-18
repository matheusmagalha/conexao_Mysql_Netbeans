/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/salvando";
    private static final String USUARIO = "root";
    private static final String SENHA = "0000"; // Substitua pela sua senha real

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("✅ Conectado com sucesso ao banco de dados!");
            return conexao;
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar: " + e.getMessage());
            return null;
        }
    }

}
