package session6.modifiers.nonSamePackageNonSubclass.package2;

import session6.modifiers.samePackageNonSubclass.SameClass;

public class NonSubclass {

    public void demoAll() {
        SameClass sameClass = new SameClass();
        sameClass.publicMethod(); // nhung method con lai k dung duoc
    }
}
