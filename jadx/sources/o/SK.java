package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class SK {
    private static boolean e = false;

    public static StaticLayout b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5) {
        synchronized (SK.class) {
            if (e) {
                return null;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, i, i2, textPaint, i3);
            obtain.setAlignment(alignment);
            obtain.setTextDirection(TextDirectionHeuristics.LOCALE);
            obtain.setLineSpacing(f2, f);
            obtain.setIncludePad(z);
            obtain.setEllipsizedWidth(i4);
            obtain.setMaxLines(i5);
            obtain.setEllipsize(truncateAt);
            return obtain.build();
        }
    }
}
