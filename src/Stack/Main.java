package Stack;

public class Main {

    private static final int[] DATA = { 1,2,3,4,6,7,8 };

    public static void main(String[] args) {
        GetAllSubsetByStack get = new GetAllSubsetByStack();
        get.populateSubset(DATA, 0, DATA.length);
    }
}