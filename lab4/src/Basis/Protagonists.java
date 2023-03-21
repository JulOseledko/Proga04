package Basis;

import Dop.Body;
import Dop.EarthException;
import Dop.Vibe;

public class Protagonists extends Characters implements Vibe {
    private String Name;

    public Protagonists(String name) {
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }

    public void see() {
        System.out.print("персонаж " + this.Name + " видел ");
    }

    public void kiss() {
        ActionFeel ks = new ActionFeel();
        MinorCharacters earth = new MinorCharacters("земля");
        System.out.print("персонаж " + this.Name);
        ks.onKiss(earth);
    }

    public void whisper() {
        System.out.println("персонаж " + this.Name + " прошептал");
    }

    public void stepEarth(Protagonists p) throws EarthException{
        if (this.Name.equals(p.getName())){
            System.out.println(p + " выплакал все слезы, которые у него были и встал с земли");
        }else{
            throw new EarthException(p + " ступили на землю");
        }
    }
    public void completion(){
        System.out.println("вот какой коротышка был этот персонаж " + this.Name);
    }

    @Override
    public String toString() {
        return this.Name;
    }

    @Override
    public void description(String information) {
        Body b = Body.LAP;
        MinorCharacters earth = new MinorCharacters("земля");
        System.out.print("персонаж " + this.Name + " " + information + " " + b + " к объекту " + earth + " ");
    }

    @Override
    public void giveVibe(Epithets e) {
        System.out.print("персонаж " + this.Name + " сделал " + e.toString() + " шагов, ");
    }

}

