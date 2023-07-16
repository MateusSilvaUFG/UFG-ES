package CURSO_VIDEO.JAVA;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela{
    public static void main(String[] args) {
        
        Toolkit ferramenta = Toolkit.getDefaultToolkit();

        Dimension screenSize = ferramenta.getScreenSize();

        int screenWidth = (int) screenSize.getWidth();
        int screenHight = (int) screenSize.getHeight();

        System.out.println("Resolução da tela: " + screenWidth + "x" + screenHight);
    }

}