package utilities;

import JavaMain.day34_StaticContinue_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiersTest2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        // System.out.println(AccessModifiers.defaultData);
                // default is not reachable outside the package.

        AccessModifiers.method1();
        //AccessModifiers.method2();  //default
        //AccessModifiers.method3();  //private


    }
}
