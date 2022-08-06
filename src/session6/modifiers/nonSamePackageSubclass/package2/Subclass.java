package session6.modifiers.nonSamePackageSubclass.package2;

import session6.modifiers.samePackageNonSubclass.SameClass;

public class Subclass extends SameClass {

    public void demoAll() {
        publicMethod(); // nhung method con lai k dung duoc
        protectedMethod();
    }
}
