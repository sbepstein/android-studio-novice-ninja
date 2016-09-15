package com.android.ninja;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @author Aziz Kadhi
 */
public class LiveTemplate {
    private static final String TAG = LiveTemplate.class.getSimpleName();
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

    // Use Parcelable template.
    // Uncomment the class below
    // 2 ways to do it, just put the cursor on Parcelable and then select
    // 1) Implement methods (creates empty methods)
    // 2) Add Parcelable Implementation (which creates all the machinery needed to implement a parcelable)

//    class Model implements Parcelable {
//        String look = "right";
//        String see = "left";
//        String watch = "above";
//
//        // Parcelable
//    }

