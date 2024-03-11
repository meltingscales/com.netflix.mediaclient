package com.netflix.mediaclient.acquisition.lib.util.kotlinx;

import android.widget.TextView;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes3.dex */
public final class TextViewKt {
    public static final void setTextOrGone(TextView textView, CharSequence charSequence) {
        boolean g;
        C8632dsu.c((Object) textView, "");
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        if (text != null) {
            g = C8691duz.g(text);
            if (!g) {
                textView.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
    }

    public static final void setTextOrInvisible(TextView textView, CharSequence charSequence) {
        boolean g;
        C8632dsu.c((Object) textView, "");
        textView.setText(charSequence);
        CharSequence text = textView.getText();
        if (text != null) {
            g = C8691duz.g(text);
            if (!g) {
                textView.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(4);
    }
}
