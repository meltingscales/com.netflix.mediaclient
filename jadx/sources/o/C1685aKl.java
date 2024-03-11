package o;

import android.graphics.Rect;
import android.util.Rational;

/* renamed from: o.aKl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1685aKl {
    public static final Rational e(C1686aKm c1686aKm) {
        C8632dsu.c((Object) c1686aKm, "");
        Float b = c1686aKm.b();
        if (b != null) {
            return new Rational((int) (b.floatValue() * 1000), 1000);
        }
        return null;
    }

    public static final void e(C1686aKm c1686aKm, Rect rect) {
        C8632dsu.c((Object) c1686aKm, "");
        C8632dsu.c((Object) rect, "");
        Rect rect2 = new Rect();
        c1686aKm.getGlobalVisibleRect(rect2);
        c1686aKm.getGlobalVisibleRect(rect);
        if (c1686aKm.getWidth() > rect2.width()) {
            int i = (-(c1686aKm.getWidth() - rect2.width())) / 2;
            rect.left = i;
            rect.right = i + c1686aKm.getWidth();
        } else if (c1686aKm.getHeight() >= rect2.height()) {
            int i2 = (-(c1686aKm.getHeight() - rect2.height())) / 2;
            rect.top = i2;
            rect.bottom = i2 + c1686aKm.getHeight();
        } else {
            Float b = c1686aKm.b();
            if (b != null) {
                float floatValue = b.floatValue();
                if (floatValue > rect2.width() / rect2.height()) {
                    int width = (int) (rect2.width() / floatValue);
                    int height = (rect2.height() - width) / 2;
                    rect.top = height;
                    rect.bottom = height + width;
                } else if (floatValue < rect2.width() / rect2.height()) {
                    int height2 = rect2.height() * ((int) floatValue);
                    int width2 = (rect2.width() - height2) / 2;
                    rect.left = width2;
                    rect.right = width2 + height2;
                }
            }
        }
    }
}
