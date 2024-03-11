package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        C8632dsu.c((Object) display, "");
        C8632dsu.c((Object) point, "");
        display.getRealSize(point);
    }
}
