package methods;

public class NonStaticMethods1 {

    public int subtractFromNonStatic(int bigger, int smaller){
        bigger = modifyBigger(bigger);
        return bigger - smaller;
    }

    int modifyBigger(int beforeModify){
        return beforeModify + 5;
    }
}
