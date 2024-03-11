package com.netflix.mediaclient.acquisition.components;

import android.text.TextPaint;
import android.text.style.URLSpan;
import o.C8632dsu;

/* loaded from: classes5.dex */
public class URLSpanNoUnderline extends URLSpan {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLSpanNoUnderline(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        C8632dsu.c((Object) textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
