package o;

import o.C9611sw;

/* renamed from: o.sy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9613sy {
    public static final C9611sw.c e = new C9611sw.c();

    public static C9611sw.e a(int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                throw new IllegalArgumentException("Window end can't be less than window start");
            }
            return new C9611sw.e(i, i2);
        }
        throw new IllegalArgumentException("Window start can't be less than 0");
    }
}
