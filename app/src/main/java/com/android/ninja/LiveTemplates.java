package com.android.ninja;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

/**
 * Live templates have been around for a long time. They can really save you from typing a lot of keystrokes
 *
 * @author Aziz Kadhi
 */

public class LiveTemplates {
    private static final String TAG = LiveTemplates.class.getSimpleName();
    private Context ctx = new MainActivity();



    // Create constants: psf + enter

    // Constant string: psfs + enter

    // Create method: mp + enter


    public void moreTemplates() {
        // gone/visible file templates
        ImageView modelTimageView = new ImageView(ctx);
        // Type gone + enter + mTi + tab + enter
        
        List<Integer> values = Arrays.asList(1, 3, 3);
        // Type it

    }

    // To generate a method that starts an activity: type starter


    public void next() {
        new LanguageInjection();
    }

}


