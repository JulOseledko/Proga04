package Basis;

import Dop.Clarify;

public class Meadow extends MinorCharacters{
    public Meadow(String name) {
        super(name);
    }
    public void greenMeadow(){
        Clarify cd = new Clarify() {
            @Override
            public void clarifyDetails() {
                System.out.print("зеленый луг с пестревшими среди изумрудной травы ");
            }
        };
        cd.clarifyDetails();

    }
    public class Flowers {
        public void flower(){
            System.out.println("желтенькими одуванчиками, беленькими ромашками и синими колокольчиками,");
        }

    }
    public class Trees {

        public void tree(){
            System.out.println("деревья с трепещущими на ветру листочками,");
        }

    }
    public class Rivers {
        public void river(){
            System.out.println("синевшая вдали серебристая гладь реки");
        }

    }

}
