package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("public: "+publicField);
    }

    void defaultMethod(){
        System.out.println("default: "+defaultField);
    }

    private void privateMethod(){
        System.out.println("private: "+privateField);
    }

    public void innerAccess(){
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
