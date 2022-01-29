package com.example.nesnetabanliprogramlama3.İnterface;

public class İnterfaceMain {
    public static void main(String args[]){

        Object aslan=new Aslan();

        Elma elma=new Elma();

        AmasyaElmasi amasyaElmasi= new AmasyaElmasi();

        Eatable tavuk= new Tavuk();

        Object [] nesneler = new Object[]{aslan,elma,amasyaElmasi,tavuk};

        for (Object o:nesneler){
            if (o instanceof Eatable){
                ((Eatable)o).howToEat();
            }
            if (o instanceof Squueezable){
                ((Squueezable)o).howToSqueeze();
            }

        }


    }
}
