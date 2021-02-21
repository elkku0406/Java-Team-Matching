/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarjaohjelma;
/**
 *
 * @author elkku
 */
public class Algoritmi {//Luokka Algoritmi
public void Algo() {//Metodi Algo
    int tiimit = 8;//Tiimien määrä
    int erat = 4;//Erien määrä
    int[] kierros = new int[tiimit]; //Kierrokset
    int n = tiimit /2;
    for (int i = 0; i < n; i++) {//Looppi, jolla saadaan tiimit numeroita			
        kierros[i] = i + 1;
	kierros[tiimit - i - 1] = kierros[i] + n;
	}							
    for(int e = 1; e <= erat; e++) {//Erä looppi    
        System.out.println(String.format("Erä %d", e));//Kirjoittaa Erän numerom
        for (int i = 0; i < n; i++) {//Matsi for looppi					
            System.out.println(String.format("Tiimi %d vastaan Tiimi %d",kierros[i],kierros[tiimit - i - 1]));					 
        }   //Ylempi kirjoittaa Tiimi vs eri Tiimi ja ottaa vastaavat tiimit pois siitä erästä
        int k = kierros[1];
        for (int i = 1; i < tiimit - 1; i++) {//Kierros for looppi, jolla saadaan vaihdettua vastustajat
            int k2 = kierros[i+1];//Ettei ole pelkästään samoja vastustajia vaan eri vastustajat
            kierros[i+1] = k;//Eli tämä osio pyörittää tiimejä, jotta tulee eri vastustaja
            k = k2;
        }
            kierros[1] = k;		
    }
}
}



