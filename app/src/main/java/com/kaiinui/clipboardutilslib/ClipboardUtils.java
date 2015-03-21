package com.kaiinui.clipboardutilslib;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;

/**
 * Created by kaiinui on 2015/03/22.
 */
public final class ClipboardUtils {
    /**
     * A helper to copy the text to the clipboard.
     *
     * @param context
     * @param text A text to copy.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void copyText(Context context, String text) {
        final ClipboardManager clipboard = getClipboard(context);
        clipboard.setPrimaryClip(ClipData.newPlainText("Copied Text", text));
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static String getText(Context context) {
        final ClipboardManager clipboard = getClipboard(context);
        final ClipData clipData = clipboard.getPrimaryClip();

        return clipData.getItemAt(0).getText().toString();
    }

    // @Helpers

    private static ClipboardManager getClipboard(Context context) {
        return (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
    }
}
