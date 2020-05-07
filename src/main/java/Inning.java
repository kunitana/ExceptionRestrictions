abstract class Inning {
    public Inning() throws BaseballExceptions{}
    public void event() throws BaseballExceptions{}
    public abstract void atBat() throws Strike, Foul;
    public void walk(){}
}
