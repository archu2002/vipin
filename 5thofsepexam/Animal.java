package com.wipro.pday4;

abstract class Anim {
    
    abstract void name();
    abstract void type();
}


class Cow extends Anim {
    void name() {
        System.out.println("Cow");
    }

    void type() {
        System.out.println("Herbivore");
    }
}


class Crocodile extends Anim {

    void name() {
        System.out.println("Crocodile");
    }

    void type() {
        System.out.println("Carnivore");
    }
}


class Lion extends Anim {
 
    void name() {
        System.out.println("Lion");
    }

    void type() {
        System.out.println("Carnivore");
    }
}

public class Animal {
    public static void main(String[] args) {
       Anim cow = new Cow();
        Anim crocodile = new Crocodile();
        Anim lion = new Lion();
      System.out.println("first animal :");
        cow.name();
        cow.type();
        System.out.println();
        System.out.println("second animal : ");
        crocodile.name();
        crocodile.type();
        System.out.println();
        System.out.println("third animal :");
        lion.name();
        lion.type();
    }
}

