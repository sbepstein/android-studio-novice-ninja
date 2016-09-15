package com.android.ninja;

import android.content.Context;
import android.content.pm.PackageManager;

import java.util.Arrays;
import java.util.List;

/**
 * PostFix functionality
 *
 * @author Aziz Kadhi
 */
public class PostFix {
    public PostFix(Context ctx, int value) {
        // To see the entire list go to Settings -> Editor -> General -> Postfix Completion

        // try
        // uncomment and type try + enter
//        ctx.getApplicationContext().

        // nn and cast
        // type ctx.nn + enter


        // not
        // type .not right after 0
        if (value == 0) {

        }


        // option = iter, for, fori and forr
        // just append .option to values
        List<Integer> values = Arrays.asList(1, 2, 3);







    }

    private PackageManager process(Object ctx) {

        // type ctx.instanceof + enter + Context + enter + getMP + cmd + w (until the entire statement is selected) +
        // option + cmd + v + pm

        // The final output should look like this
        // PackageManager pm = ctx instanceof Context ? ((Context) ctx).getPackageManager() : null;


        return null;

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
    // inst (troublesome)
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

    public void next() {
        new LiveTemplate();
    }
}
