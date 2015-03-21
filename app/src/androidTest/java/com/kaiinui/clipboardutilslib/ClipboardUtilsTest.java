package com.kaiinui.clipboardutilslib;

import android.content.Context;
import android.test.AndroidTestCase;

/**
 * Created by kaiinui on 2015/03/22.
 */
public class ClipboardUtilsTest extends AndroidTestCase {
    public void testItCopiesText() throws Throwable {
        final Context context = getContext();

        ClipboardUtils.copyText(context, "sake");

        assertEquals("sake", ClipboardUtils.getText(context));
    }
}
