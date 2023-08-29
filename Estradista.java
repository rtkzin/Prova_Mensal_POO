/* Matheus Terra Portes Maldonado */

package Prova_Mensal_POO;

public class Estradista extends Pessoa implements Ciclista {
    public void pedalar() {
        System.out.println(getNome() +" pedala em estradas...");
    }
}
