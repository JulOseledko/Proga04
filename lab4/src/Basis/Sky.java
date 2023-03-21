package Basis;

import Dop.Body;
import Dop.Vibe;

public class Sky extends MinorCharacters implements Vibe {
    private String name;

    public Sky(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void giveVibe(Epithets e) {
        Body b = Body.HEAD3;
        Protagonists p = new Protagonists("Незнайка");
        System.out.print("персонаж " + p + " видел " + b + " " + e.toString() + " " + this.name);
    }

    public static class Clouds {
        public static void whiteClouds() {
            System.out.print(" с белыми облаками ");

        }
    }

    public static class Sun {
        public static void shineSun() {
            System.out.println("и сияющим в вышине солнышком");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
