package o;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.SlidingWindowKt$windowedIterator$1;

/* loaded from: classes.dex */
public final class dqQ {
    public static final void d(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> d(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        Iterator<List<T>> c;
        C8632dsu.c((Object) it, "");
        if (it.hasNext()) {
            c = dtV.c(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
            return c;
        }
        return C8577dqt.c;
    }
}
