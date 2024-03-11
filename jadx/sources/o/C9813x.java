package o;

import android.database.AbstractWindowedCursor;

/* renamed from: o.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9813x {
    public static final C9813x b = new C9813x();

    private C9813x() {
    }

    public static final void e(AbstractWindowedCursor abstractWindowedCursor, long j) {
        C8632dsu.c((Object) abstractWindowedCursor, "");
        abstractWindowedCursor.setWindow(C9685v.e(null, j));
    }
}
