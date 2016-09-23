package com.android.ninja;

import android.content.Context;
import android.os.Parcelable;

/**
 * You barely have to type.
 *
 * @author Aziz Kadhi
 */
public class CodeGeneration {

    private Context ctx = new MainActivity();

    public void surroundWith() {

        // Context sensitive, uncomment
        // 1) Select the statement: cmd + option + t
        // Take a look at the available options
        // 2) Add a semicolon at the end of the statement then perform the steps in step 1

        ctx.getPackageManager();

        // Cool feature: unwrap/delete/undo: cmd + shift + delete (shortcut doesn't allow work, just use cmd + shit + a)
        try {
            System.out.println("World");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    // Code "fixer"
    // Uncomment the class below then move cursor to "Parcelable" then select Add Parcelable implementation.
//    static class CrucialInfoParcelable implements Parcelable {
//        private String name;
//        private int age;
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

    // You can do the same thing after the facts.
    // Uncomment ImplementMe: option + enter -> Implement methods

//class Implementer implements ImplementMe {
//  // The hard way.
//}

    // Column selection mode: cmd + shift + 8
    // Generate getters/setters/toString/equals...
    // Alternative: use Lombok plugin
    class Model {

        String look = "right";
        String see = "left";
        String watch = "above";


    }

    public void next() {
        new PluginButterKnifeFragment();
    }

}

