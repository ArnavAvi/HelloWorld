package com.epam.Behavioural_Design_Pattern;

class Soldier {
    private SoldierBehavior behavior;
    private String type;

    public Soldier(SoldierBehavior behavior, String type) {
        super();
        this.behavior = behavior;
        this.type = type;
    }

    public void stance() {
        System.out.println(type);
        behavior.stance();
    }
}


interface SoldierBehavior {
    public void stance();
}


class AggresiveMode implements SoldierBehavior {

    @Override
    public void stance() {
        System.out.println("Attack enemy at sight.");
    }
}

class DefensiveMode implements SoldierBehavior {

    @Override
    public void stance() {
        System.out.println("Attack only when attacked.");

    }
}

public class Strategy {

    public static void main(String[] args) {
        Soldier s1 = new Soldier(new DefensiveMode(), "Pikeman");
        Soldier s2 = new Soldier(new AggresiveMode(), "Militia");
        Soldier s3 = new Soldier(new DefensiveMode(), "Knight");
        s1.stance();
        s2.stance();
        s3.stance();
    }
}
