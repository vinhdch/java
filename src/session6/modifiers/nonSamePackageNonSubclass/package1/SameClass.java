package session6.modifiers.nonSamePackageNonSubclass.package1;

public class SameClass {

    void defaultMethod() {
        System.out.println("demo deault");
    }

    private void privateMethod() {
        System.out.println("demo private");
    }

    protected void protectedMethod() {
        System.out.println("demo protected");
    }

    public void publicMethod() {
        System.out.println("demo public");
    }

    public void allMethod() {
        defaultMethod();
        privateMethod();
        publicMethod();
        protectedMethod();
    }
}
