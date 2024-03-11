package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import o.C8657dts;
import o.dsT;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f) {
        float a;
        int e;
        if (Float.isNaN(f)) {
            return;
        }
        a = C8657dts.a(f, 0.0f, 1.0f);
        e = dsT.e(a * ((float) PrivateKeyType.INVALID));
        textPaint.setAlpha(e);
    }
}
