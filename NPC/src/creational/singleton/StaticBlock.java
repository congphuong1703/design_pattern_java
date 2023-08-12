package creational.singleton;

public class StaticBlock {

    //Object sẽ được khởi tạo khi class được load.
    private static StaticBlock instance;

    static {
        try{
            instance = new StaticBlock();
        }catch (Exception e){
            System.out.print("Exception occured in creating creational.singleton instance");
        }
    }

    private StaticBlock(){

    }

    public static StaticBlock getInstance(){
        return instance;
    }
}
