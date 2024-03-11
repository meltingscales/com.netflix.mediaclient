package o;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: o.dep  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8145dep extends MetricAffectingSpan {
    private final Typeface c;

    public C8145dep(Typeface typeface) {
        this.c = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        c(textPaint, this.c);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        c(textPaint, this.c);
    }

    private static void c(Paint paint, Typeface typeface) {
        paint.setTypeface(typeface);
    }
}
