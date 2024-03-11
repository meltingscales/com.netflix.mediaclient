package o;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import java.util.ArrayList;

/* renamed from: o.Xx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1340Xx {
    public static final Spanned a(Spanned spanned, Activity activity) {
        C8632dsu.c((Object) spanned, "");
        C8632dsu.c((Object) activity, "");
        SpannableString spannableString = new SpannableString(spanned);
        Typeface e = C1336Xt.e(activity);
        Object[] spans = spannableString.getSpans(0, spannableString.length(), StyleSpan.class);
        C8632dsu.a(spans, "");
        ArrayList<StyleSpan> arrayList = new ArrayList();
        for (Object obj : spans) {
            if (((StyleSpan) obj).getStyle() == 1) {
                arrayList.add(obj);
            }
        }
        for (StyleSpan styleSpan : arrayList) {
            int spanStart = spannableString.getSpanStart(styleSpan);
            int spanEnd = spannableString.getSpanEnd(styleSpan);
            spannableString.removeSpan(styleSpan);
            spannableString.setSpan(new C8145dep(e), spanStart, spanEnd, 33);
        }
        return spannableString;
    }
}
