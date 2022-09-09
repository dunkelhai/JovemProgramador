package application;

import model.entities.Car;
import model.entities.Carro;
import model.entities.CrossFox;
import model.entities.Fox;

public class Program {
    public static void main(String[] args) {
        Car delrey = new Car(1, 500.0);
        Car ferrari = new Car();
        Fox carro1 = new Fox();
        CrossFox carro2 = new CrossFox();
        carro1.acelerar();
        carro2.acelerar();
        Car teste1 = new Car();
        delrey.setSunRoof(true);
        delrey.setModel("1987");
        System.out.println(delrey);
        Carro teste3 = new Carro();
        teste3.setNome("TESTE");
        System.out.println(teste3.getNome());



    }
}
