/*soldo liquido*/
package boletin2.pkg1112;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin21112 {

    public static void main(String[] args) {
  float soldototal , km , dias ;
  int ventas;
  System.out.println("soldo total=");
  Scanner dato=new Scanner(System.in);
  soldototal=dato.nextFloat();
  System.out.println("nº de ventas=");
  Scanner dato1=new Scanner(System.in);
  ventas=dato1.nextInt();
  System.out.println("distancia percorrida=");
  Scanner dato2=new Scanner(System.in);
  km=dato2.nextFloat();
  System.out.println("dias de desprazamento=");
  Scanner dato3=new Scanner(System.in);
  dias=dato3.nextFloat();
  float comision , quilometraxe , dietas , soldoliquido ;
  comision=(float) (ventas*0.05);
  quilometraxe=km*2;
  dietas=dias*30;
  soldoliquido= soldototal + comision + quilometraxe + dietas;
  System.out.println("Soldo liquido="+soldoliquido+"€");
  /*aqui comeza o 2.12 , irpf + retencionSS */
  double irpf;
  irpf=soldoliquido*0.18;
  System.out.println("Soldo final="+((soldoliquido-irpf)-36)+"€");
  
  
  
  
  
  
  
  
  
  
  
    }
    
}
