package session6.modifiers.samePackageNonSubclass;

public class NonSubclass {

    public void demoAll() {
        SameClass sameClass = new SameClass();
        sameClass.publicMethod();
        sameClass.defaultMethod();
        sameClass.protectedMethod();
    }
}
