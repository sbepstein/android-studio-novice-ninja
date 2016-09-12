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
public class LanguageInjection {
    // Inject language:
    // 1) Put cursor inside the empty string, press option + enter then select Inject language or reference
    // 2) To invoke the fragment editor: alt + enter then select Edit JSON Fragment
    String jsonStr = "";

    // Inject Regex:
    // 1) Same as above, execute step 1
    // 2) Copy the regex into the empty string
    // 3) Move cursor to empty string and press option + enter then select Check RegExp
    // 4) Start type random numbers and notice how it's checked (533424343 is a valid one).

    // ^5[1-5][0-9]{5,}$
    String visaRegex = "";

}
