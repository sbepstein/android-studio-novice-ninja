package com.android.ninja;

/**
 * Language injection
 *
 * @author Aziz Kadhi
 */
public class LanguageInjection {
    // Inject language:
    // 1) Put cursor inside the empty string, press option + enter then select Inject language or reference
    // 2) To invoke the fragment editor: alt + enter then select Edit JSON Fragment
    String jsonStr = "{\n" +
            "  \"name\": \"aziz\",\n" +
            "  \"job\": \"rastaman\"\n" +
            "  \"age\"\n" +
            "}";

    // Inject Regex:
    // 1) Same as above, execute step 1
    // 2) Copy the regex into the empty string
    // 3) Move cursor to empty string and press option + enter then select Check RegExp
    // 4) Start type random numbers and notice how it's checked (533424343 is a valid one).

    // ^5[1-5][0-9]{5,}$
    String visaRegex = "";

    public void next() {
        new Agenda();
    }


}
