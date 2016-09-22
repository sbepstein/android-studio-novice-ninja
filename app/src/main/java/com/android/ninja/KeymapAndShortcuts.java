package com.android.ninja;


import android.widget.ImageView;
import java.io.File;

/**
 * Use the available shortcuts and edit the keymap to create your own
 *
 * 15 minutes
 *
 * @author Aziz Kadhi
 */
public class KeymapAndShortcuts {

    ////////////////////////////////////
    //
    //   ENTER ACTION OR OPTION NAME
    //
    //        cmd + shift + a
    //
    ////////////////////////////////////

    String nameIsAName;


    // IntelliJ was designed to be used 100% without a mouse (and no need for tabs!)

                      // Reformat code: cmd + option + l
    // Optimize imports: ctrl + option + o (hard to remember)


    public KeymapAndShortcuts() {
        updateYourKeymap();
        codeKatas();
        navigation();
        moveMeF6();
        textEditing();
        textNavigation();
        advancedTextEditing();


    }

    public void updateYourKeymap() {
        // Again...if you can't remember a shortcut use cmd + shift + a
        // Search for keymap or
        // cmd + , -> Keymap -> right click on a entry and select: Add Keyboard Shortcut
    }

    String hippieCompletion;

    public void codeKatas() {
        // Quick doc: fn + F1
        // Parameter info: cmd + p
        new ImageView(new MainActivity()).getBaseline();

        // Smart type completion: ctrl + space
        StringBuilder builder = new StringBuilder();
//        new ImageView((new MainActivity())).setOnClickListener();


        // Complete current statement: cmd + shift + enter
//        if (builder == null)

        // hippie completion: option + / (slash)
        String h;

    }

    public void navigation() {

        // Move backward: cmd + [ (right bracket)
        // Move forward: cmd + ]
        // Go to last edit: cmd + shift + delete (or cmd + shift + backspace if you are using a keyboard)
        // Recent edited files: cmd + shift + e
        // Recent files: cmd + e


        // Show/hide Project/Structure/x: cmd + 1  (you can do the same thing with other views, just use cmd + number)
        // Alternative to using "Structure" navigation pane: fn + cmd + F12
        // Split editor vertically: control + option + cmd
        // Quickly close a tab: shift + click

        // Open file/folder in Finder: fn + option + cmd + F12


        // Bookmarks
        // Create bookmark: ctrl + shift + x where x = [0-9]
        // Go to bookmark: ctrl + [0-9]
        // New basic: fn + F3
        // Show all bookmarks: cmd + fn + F3

        // A favorite of mine...Go to next highlighted error
        // fn + F2


        refactorValue();
        moveMeF6();
    }

    public static void moveMeF6() {
        // The F6 family of crucial refactorings:
        // 1) Move: fn + F6
        // 2) Rename: cmd + shift + F6
        // 3) Change method signature: cmd + fn + F6

    }

    public void refactorValue() {
        // cmd + option + v, f, c, or p
        // 1) var: v
        // 2) field: f
        // 3) constant: c
        // 4) parameter: p
        // Use the value below to create a var, a field, a constant or a parameter. Type 1 and select it

        // 10

    }



    public void textEditing() {
        // Clipboard history: cmd + shift + v
        // Paste simple (very convenient when you are copying text from an external source and need to keep the
        // formatting intact): cmd + option + shift + v

        // Expand (shrink) selection: cmd + w  (cmd + shift + w)
        String aziz = "scooter fanboy";
        int[] horsepower = {10, 20, 30, 40, 50};
        for (int hp : horsepower) {
            System.out.println(hp);
        }
        // Duplicate me: cmd + d
        String cloneMe = null;

        // Delete me: fn + shift + delete (keyboard: cmd + backspace)
        String deleteMe;

        // Move me up/down: cmd + shift + arrow up/down
        String moveMeUpOrDown;

        // Play with my case: cmd + shift + u
        String toggleCase;

        // Join me: ctrl + shift + j  (join)
        String joinMe = "You say I am crazy " +
                "Cause you don't think I know what you have done";
    }

    public void textNavigation() {
        // Move caret from start to end of the statement (and vice versa): cmd + arrow
        String moveCaretToStartEnd = "She has a new album, I really like her voice";

        // Move caret between camel hump words: option + arrow
        String moveCaretBetweenCamelHumps = "theSpeedOfLightCannotBeAchievedByASolidObject";

        // * Select camel hump chunks: option + shift + arrow (vs cmd + shift + arrow)
        String selectCamelHumps = "theSpeedOfLightCannotBeAchievedByASolidObject";
    }


    public void advancedTextEditing() {
        // Sublime style code editing.

        // 3 ways to do the same thing:
        // Column selection mode: cmd + shift + 8
        // Hard way: multi-cursor selection (if editing multiple words): option + shift + mouse
        // Easy way: multi-edit: select the target (if editing same word), in this case word Mouse, cmd + ctrl + g

        int moveMouseRight;
        int moveMouseLeft;
        int moveMouseUp;
        int moveMouseDown;

    }

    private int findMe;

    public void next() {
        new Debugger();
    }


}
