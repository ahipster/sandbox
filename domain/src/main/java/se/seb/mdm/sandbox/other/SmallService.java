package se.seb.mdm.sandbox.other;

public class SmallService extends EmptyService {


    private int count;

    {
        count = 0;
    }



    static
    {
        System.out.println("Hello!!");
    }



    private static final String NAME = "John";


    public SmallService() {
    }

    public SmallService(int count) {
        this.count = count;
    }

}
