package com.android.ninja;

/**
 * Description
 * <p/>
 * Google field naming convention:
 * Non-public, non-static field names start with m.
 * Static field names start with s.
 * Other fields start with a lower case letter.
 * Public static final fields (constants) are ALL_CAPS_WITH_UNDERSCORES.
 *
 * @author Aziz Kadhi
 */
public class CodeGeneration {

    public void surroundWith() {
        // cmd + option + t
        System.out.println("Hello");

        // Cool feature: unwrap/delete/undo: cmd + shift + delete
        if (true) {
            System.out.println();
        }
    }


    // Code generator: cmd + n
    // Code "fixer": option  +  enter

    // Move cursor to class and press option + enter then select implement methods
    // Move cursor to class name (Parcelable) then select Add Parcelable implementation.
//    static class CrucialInfoParcelable implements Parcelable {
//
//    }

    interface ImplementMe {
        /**
         * First thing
         *
         * @param isLazy
         */
        void doOneThing(boolean isLazy);

        /**
         * Second thing
         *
         * @param txt
         */
        void doAnotherThing(String txt);

        /**
         * Snoopy
         *
         * @return
         */
        String whatsMyName();
    }

//class Implementer implements ImplementMe {
//  // The hard way.
//}

    // Generate getters/setters/toString/equals...
// Alternative: use Lombok plugin
    class Model {

        String look = "right";
        String see = "left";
        String watch = "above";


    }

}

