package strategy.bases;

public abstract class Hero {

    private String heroName;
    private strategy.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour;
    private strategy.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour;
    private strategy.interfaces.IHeroAttackType IHeroAttackType;

    public Hero(strategy.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour, strategy.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour, strategy.interfaces.IHeroAttackType IHeroAttackType) {
        this.IHeroAttributeBehaviour = IHeroAttributeBehaviour;
        this.IHeroComplexityBehaviour = IHeroComplexityBehaviour;
        this.IHeroAttackType = IHeroAttackType;
    }

    public void performAttribute() {
        this.IHeroAttributeBehaviour.attribute();
    }

    public void performComplexity() {
        this.IHeroComplexityBehaviour.complexity();
    }

    public void performAttackType() {
        this.IHeroAttackType.attackType();
    }

    public abstract void display();

    public abstract void response();

    public abstract void getHeroName();

    public strategy.interfaces.IHeroAttributeBehaviour getIHeroAttributeBehaviour() {
        return IHeroAttributeBehaviour;
    }

    public void setIHeroAttributeBehaviour(strategy.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour) {
        this.IHeroAttributeBehaviour = IHeroAttributeBehaviour;
    }

    public strategy.interfaces.IHeroComplexityBehaviour getIHeroComplexityBehaviour() {
        return IHeroComplexityBehaviour;
    }

    public void setIHeroComplexityBehaviour(strategy.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour) {
        this.IHeroComplexityBehaviour = IHeroComplexityBehaviour;
    }

    public strategy.interfaces.IHeroAttackType getIHeroAttackType() {
        return IHeroAttackType;
    }

    public void setIHeroAttackType(strategy.interfaces.IHeroAttackType IHeroAttackType) {
        this.IHeroAttackType = IHeroAttackType;
    }
}
