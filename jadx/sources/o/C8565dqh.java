package o;

import java.lang.reflect.Array;

/* renamed from: o.dqh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C8565dqh {
    public static final <T> T[] d(T[] tArr, int i) {
        C8632dsu.c((Object) tArr, "");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        C8632dsu.d(newInstance);
        return (T[]) ((Object[]) newInstance);
    }

    public static final void e(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
