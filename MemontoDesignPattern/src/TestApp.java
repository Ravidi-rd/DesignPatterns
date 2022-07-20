/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;


public class TestApp {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

        Burger burger=new Burger("Burger  : A , chicken layer ,"+" Burger Basket Edited Time : "+ dateFormat.format(new Date()));
        burger.save();
        burger.setBurgerData("Burger : A , chicken layer with white source ,"+" Burger Basket Edited Time : "+ dateFormat.format(new Date()));
        burger.save();
        burger.setBurgerData("Burger : A , chicken layer with white source and chilly source ,"+" Burger Basket Edited Time : "+ dateFormat.format(new Date()));

        burger.save();
        burger.undo();

        System.out.println("Burger Layers: "+burger.getLayer());


        burger.undo();

        System.out.println("Burger Layers: "+burger.getLayer());
    }

}

class Burger {

    private String layer;
    CareTaker careTaker=new CareTaker();

    public Burger(String layer) {

        this.layer= layer;
    }

    public void setBurgerData(String layer) {
        this.layer = layer ;

    }



    public String getLayer() {
        return layer;
    }





    public void save() {
        System.out.println(layer);
        careTaker.addMemento(new Memento(layer));

    }

    public void undo() {

        this.layer=careTaker.getMemento().getLayer();




    }

}

class Memento {


    private final String layer;

    public Memento(String layer) {

        this.layer = layer;
    }



    public String getLayer() {
        return layer;
    }

}

class CareTaker {

    private final Stack<Memento> mementos = new Stack<>();


    public void addMemento(Memento memento) {

        mementos.add(memento);

    }

    public Memento getMemento() {


        return mementos.pop();
    }

}

