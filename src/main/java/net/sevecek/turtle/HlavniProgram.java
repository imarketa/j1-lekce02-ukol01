package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setPenColor(Color.magenta);

        //start přesun k domečku
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(350);
        zofka.turnLeft (90);
        zofka.move(450);
        zofka.turnRight(180);

        NakresliDomecek(zofka);

        //přesun k prasátku
        zofka.penUp();

        zofka.move(15);
        zofka.turnRight(90);
        zofka.move(250);

        NakresliPrasatko(zofka);

        //přesun k domečku II. od prasátka
        zofka.penUp();
        zofka.move(108);
        zofka.turnLeft(112);

        NakresliDomecek(zofka);

        //přesun k horním domečkům
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(520);
        zofka.turnRight(90);
        zofka.move(300);

        for (int i = 0; 5 > i; i++) {
            NakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnLeft(90);
        }
        //přesun ke sluníčku

        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(600);

        Slunce(zofka);

        //přesun ke jménu
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(850);
        zofka.turnRight(180);

        //jméno
        //M
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();

        zofka.move(20);
        zofka.turnLeft(90);

        //A
        zofka.penDown();
        zofka.turnRight(15);
        zofka.move(100);
        zofka.turnRight(145);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(45);
        zofka.turnLeft(70);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(45);
        zofka.turnLeft(90);

        zofka.move(80);
        zofka.turnLeft(90);
    }
    private void Paprsek(Turtle zofka, int uhel) {
        zofka.turnRight(90);
        zofka.move(20);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.penDown();
}

    private void Slunce(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; 12 > i; i++) {
            zofka.move(20);
            zofka.turnLeft(30);
           Paprsek(zofka,30*i);
        }
    }


    private void NakresliPrasatko(Turtle zofka) {
        //nakresli prasátko
        zofka.penDown();
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(40);
        zofka.penUp();

        //přesun k předním nožičkám
        zofka.turnRight(120);
        zofka.move(40);
        zofka.turnLeft(5);

        //nakresli nozicky
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(45);

        //přesun k zadním nožičkám
        zofka.turnRight(95);
        zofka.move(80);
        zofka.turnLeft(45);

        //prasátko zadní nožičky
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnLeft(35);

        //přesun k ocásku
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(90);
        zofka.penDown();

        //prasátko ocásek
        for (int i = 0; 6 > i; i++) {
            zofka.move(4);
            zofka.turnLeft(8);
        }
        zofka.turnRight(60);
    }


    private void NakresliDomecek(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(100.0);
            zofka.turnRight(90.0);
        }
        zofka.penUp();
        zofka.move(100.0);
        zofka.penDown();

        zofka.turnRight(30.0);
        zofka.move(100.0);
        zofka.turnRight(120.0);
        zofka.move(100);

        zofka.turnRight(30.0);
        zofka.penUp();
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.move(100.0);
        zofka.turnRight(90.0);
        zofka.penDown();
    }
}

