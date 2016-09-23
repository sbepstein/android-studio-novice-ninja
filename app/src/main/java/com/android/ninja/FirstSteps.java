package com.android.ninja;


/**
 * Basic functionality
 *
 * @author Aziz Kadhi
 */
public class FirstSteps {


    ////////////////////////////////////
    //
    //   ENTER ACTION OR OPTION NAME
    //
    //        cmd + shift + a
    //
    ////////////////////////////////////

    // The MOST important shortcut: find the shortcut associated with an action
    // cmd + shift + a

    public FirstSteps() {
        howToWatchYourBack();
        configureCodeGeneration();
        openSesameShiftShift();
    }

    public void howToWatchYourBack() {
        // Use Local History. WHY?
        // Right click any file or folder and click on Local History
        // then select Show History

        // Before making any significant changes, I suggest you label the current codebase
        // Same steps as above, right below Show History, click on Put Label...

        // *** IMPORTANT ***
        // Use this move with care, larger history == slower IDE, the default is 5 days
        // cmd + shift + a then type registry-> -DlocalHistory.daysToKeep
    }

    public void configureCodeGeneration() {
        // To open "Settings" use cmd + , (comma)


        // Navigate to Settings->Editor->Code Style->Java->Code Generation
        // http://jakewharton.com/just-say-no-to-hungarian-notation/
        // Configure the Field and Static Field entries.
    }

    public void openSesameShiftShift() {
        // Go to class: cmd + o
        // Go to file: cmd + shift + o
        //             type / to filter by folders

        // Go to symbol: cmd + option + o
        //              type MA.mFindMe or D.mFindMe

        // Find in path: cmd + shift + f
        //               IntelliJ IDEA 15: 2 tabs: Options and Preview (x), preview allows us to find something without
        //               navigating outside the dialog.

        // **** IMPORTANT ****
        // Recommended way to search is Search Everywhere: shift + shift (double shift)
        // Classes/files/plugins/EVERYTHING!

    }

    public void next() {
        new KeymapAndShortcuts();
    }




}
