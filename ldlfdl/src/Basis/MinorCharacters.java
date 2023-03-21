package Basis;

import Dop.Body;
import Dop.Compare;
import Dop.Vibe;

public class MinorCharacters extends Characters implements Vibe {
    private String Name;
    public MinorCharacters(String name) {
        this.Name = name;
    }

    public void fly(Protagonists p){
        Body b = Body.HEAD1;
        System.out.println("объект " + this.Name + " слетела " + b + " персонажа " + p.toString());
    }

    public void blowing(Protagonists p){
        Body b = Body.HAIR;
        System.out.print("объект " + this.Name + " шевелил " + b + " персонажа " + p.toString() + " ");
    }

    @Override
    public void description(String information) {
        Compare c = Compare.LIKE;
        System.out.println(c + " " + information + " объекту " + this.Name);
    }

    @Override
    public void giveVibe(Epithets e) {
        ActionFeel weasel = new ActionFeel("пригревало");
        System.out.print("объект " + e.toString() + " " + this.Name);
        weasel.clarifyDetails();
    }

    @Override
    public String toString(){
        return this.Name;
    }
}
