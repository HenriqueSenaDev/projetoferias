package br.com.ferias.jdbc;

import javax.swing.JOptionPane;

public class TestConnection {

    public static void main(String[] args) {

        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados estabelecida!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: \n" + e);
        }
    }
}
