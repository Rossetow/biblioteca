/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.biblioteca.projeto;
import com.senac.biblioteca.swing.HomeFrame;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;

/**
 *
 * @author Aluno TDS
 */
public class BibliotecaProjeto {

    public static void main(String[] args) {
        FlatLightFlatIJTheme.setup();
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
    }
}
