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
public class Altersvorsorge 
{
  public float bAV,Riester,Gesetzliche,Rürup,Private, zinssatzr, zinssatzp, einkommenb, einkommenn, inflation, rKapital, Kapitalb, alter, ralter, lalter = 0; 
  public int privat, riester, privateinz, riestereinz , riestergewinn, privatgewinn, privatbutton , riesterbutton= 0;
public float calcrbedarf()
{
    float riesterwin = 0,privatwin = 0,rürupwin = 0,gesetzwin = 0,bavwin = 0;
        riesterwin = Riester*12*(lalter - ralter);
        privatwin = privat*12*(lalter - ralter);
        rürupwin = Rürup*12*(lalter - ralter);
        gesetzwin = Gesetzliche*12*(lalter - ralter);
        bavwin = bAV*12*(lalter - ralter);
        rKapital = Kapitalb - riesterwin - privatwin - rürupwin - gesetzwin - bavwin;
return rKapital;
}
}

