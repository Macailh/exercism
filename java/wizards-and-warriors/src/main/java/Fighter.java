abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }

}

class Wizard extends Fighter {
    private boolean isVulnerable;

    public Wizard() {
        this.isVulnerable = true;
    }

    @Override
    boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return isVulnerable ? 3 : 12;
    }

    void prepareSpell() {
        this.isVulnerable = false;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
