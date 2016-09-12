package com.android.ninja;

import android.content.Context;

/**
 * Basic functionality
 * <p/>
 * Google field naming convention:
 * Non-public, non-static field names start with m.
 * Static field names start with s.
 * Other fields start with a lower case letter.
 * Public static final fields (constants) are ALL_CAPS_WITH_UNDERSCORES.
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


    public FirstSteps() {
        howToWatchYourBack();
        configureCodeGeneration();
        openSesame();
    }

    public void howToWatchYourBack() {
        // Use Local History. WHY?
        // Right click any file or folder and click on Local History (5th from the bottom)
        // then select Show History

        // Before making any significant changes, I suggest you label the current codebase
        // Same steps as above, right below Show History, click on Put Label...
    }

    public void configureCodeGeneration() {
        // To open "Settings" use cmd + ,

        // Navigate to Settings->Editor->Code Style->Java->Code Generation
        // Configure the Field and Static Field entries.

    }

    public void openSesame() {
        // Go to class: cmd + o
        // Go to file: cmd + shift + o
        //             type / to filter by folders

        // Go to symbol: cmd + option + o
        //              type MA.mFindMe or D.mFindMe

        // Find in path: cmd + shift + f
        //               IntelliJ IDEA 15: 2 tabs: Options and Preview (x), preview allows us to find something without
        //               navigating outside the dialog.

        // Recommended way to search is Search Everywhere: shift + shift (double shift)
        // Classes/files/plugins/EVERYTHING!

    }



}
