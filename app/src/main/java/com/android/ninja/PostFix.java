package com.android.ninja;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * PostFix functionality
 * <p/>
 * Google field naming convention:
 * Non-public, non-static field names start with m.
 * Static field names start with s.
 * Other fields start with a lower case letter.
 * Public static final fields (constants) are ALL_CAPS_WITH_UNDERSCORES.
 *
 * @author Aziz Kadhi
 */
public class PostFix {
    public PostFix(Context ctx, int value) {
        // To see the entire list go to Settings -> Editor -> General -> Postfix Completion

        // try
        ctx.getApplicationContext();

        // nn and cast

        // not
        process(ctx);


        // for, fori and forr
        int[] values = {1, 2, 3};



    }

    private PackageManager process(Object ctx) {
       return ctx instanceof Context ? ((Context) ctx).getPackageManager() : null;

    }


    private int mFindMe;

    // Available Postfix
    // !
    // assert
    // cast
    // else
    // field
    // for
    // fori
    // format
    // forr
    // if
    // inst
    // instanceof
    // iter
    // nn
    // not
    // notnull
    // null
    // par
    // return
    // sout
    // switch
    // synchronized
    // throw
    // try
    // twr
    // var
    // while
}
