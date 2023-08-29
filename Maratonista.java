/* Matheus Terra Portes Maldonado */

package Prova_Mensal_POO;

public class Maratonista extends Pessoa implements Corredor {

    public void correr() {
        System.out.println(getNome() +" começou a correr...");
    }
}
