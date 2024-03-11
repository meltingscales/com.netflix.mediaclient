package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import o.C8632dsu;

/* renamed from: o.vK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9696vK {
    public static final void e(TextView textView, boolean z, int i, int i2) {
        C8632dsu.c((Object) textView, "");
        Context context = textView.getContext();
        if (z) {
            i = i2;
        }
        textView.setTextColor(ContextCompat.getColor(context, i));
    }

    public static final void c(TextView textView, Spannable spannable) {
        C8632dsu.c((Object) textView, "");
        C8632dsu.c((Object) spannable, "");
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        C8632dsu.d(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            final String url = uRLSpan.getURL();
            spannable.setSpan(new URLSpan(url) { // from class: com.netflix.android.kotlinx.TextViewKt$setUnderlineStrippedText$spanNoUnderline$1
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    C8632dsu.c((Object) textPaint, "");
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, spanStart, spanEnd, 0);
        }
        textView.setText(spannable);
    }

    public static /* synthetic */ void a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = textView.getCompoundDrawables()[0];
        }
        if ((i & 2) != 0) {
            drawable2 = textView.getCompoundDrawables()[1];
        }
        if ((i & 4) != 0) {
            drawable3 = textView.getCompoundDrawables()[2];
        }
        if ((i & 8) != 0) {
            drawable4 = textView.getCompoundDrawables()[3];
        }
        c(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static final void c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C8632dsu.c((Object) textView, "");
        textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public static /* synthetic */ void c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = textView.getCompoundDrawablesRelative()[0];
        }
        if ((i & 2) != 0) {
            drawable2 = textView.getCompoundDrawablesRelative()[1];
        }
        if ((i & 4) != 0) {
            drawable3 = textView.getCompoundDrawablesRelative()[2];
        }
        if ((i & 8) != 0) {
            drawable4 = textView.getCompoundDrawablesRelative()[3];
        }
        b(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static final void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C8632dsu.c((Object) textView, "");
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
