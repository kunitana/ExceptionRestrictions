public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballExceptions{}
    public StormyInning(String s) throws Foul, BaseballExceptions{}

    //void walk() throws PopFoul{} //impossible, PopFoul was not represented in InningClass
    //public void event() throws RainedOut{} //impossible, RainedOut is represented in interface, which can't add exceptions to existed methods

    public void rainHard() throws RainedOut{}

    public void event(){}

    public void atBat() throws PopFoul{}

    public static void main(String[] args) {
        try{
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e){
            System.out.println("Pop foul");
        } catch (RainedOut e){
            System.out.println("Rained out");
        } catch (BaseballExceptions e) {
            System.out.println("Generic baseball exception");
        }
        //Strike is not actual for daughter version
     try{
         Inning i = new StormyInning();
         i.atBat();
     } catch (Strike e) {
         System.out.println("Strike");
     } catch (Foul e) {
         System.out.println("Foul");
     } catch (RainedOut e) {
         System.out.println("Rained out");
     } catch (BaseballExceptions e) {
         System.out.println("Generic");
     }
    }
}
