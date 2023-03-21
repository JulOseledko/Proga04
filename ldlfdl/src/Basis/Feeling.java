package Basis;

import Dop.Body;
import Dop.Compare;
import Dop.Vibe;

public class Feeling implements Vibe {
    private String Name;
    public Feeling(String name){
        this.Name = name;
    }
    public static void goodFeelings(){
        class Mirth {
            public static void fun() {
                Protagonists p = new Protagonists("Незнайка"){
                    @Override
                    public void see(){
                        System.out.println("увидев друзей-коротышек");
                    }
                };
                System.out.print("персонаж " + p + " весело засмеялся, ");
                p.see();
            }
            public static void joy(){
                System.out.println("которые радостно приветствовали родную Землю");
            }
        }
        Mirth.fun();
        Mirth.joy();

    }
    public void named(){
        Compare c = Compare.AS;
        System.out.println(c + " называется " + this.Name);
    }

    public void good() {
        System.out.println(this.Name + " хорошее и лучше нет");
    }


    @Override
    public void giveVibe(Epithets e) {
        Compare c = Compare.ASIF;
        Body b = Body.LAP;
        System.out.println(c + " " + e.toString() + " " + this.Name + " переполняет " + b);
    }
}
