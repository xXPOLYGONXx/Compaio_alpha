/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altersvorsorge_tool;

/**
 *
 * @author jamie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Altersvorsorge i = new Altersvorsorge(); 
      Altersvorsorge_Tool_UI j = new Altersvorsorge_Tool_UI(i);
      System.out.println("Test j: " + j);
      j.setVisible(true);
    }
    
}
