package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public final class dqV {
    public static final <E> E[] e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        return (E[]) new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String d(T[] tArr, int i, int i2, Collection<? extends T> collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            T t = tArr[i + i3];
            if (t == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(t);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int a(T[] tArr, int i, int i2) {
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            T t = tArr[i + i4];
            i3 = (i3 * 31) + (t != null ? t.hashCode() : 0);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean a(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C8632dsu.c(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> T[] b(T[] tArr, int i) {
        C8632dsu.c((Object) tArr, "");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C8632dsu.a(tArr2, "");
        return tArr2;
    }

    public static final <E> void d(E[] eArr, int i) {
        C8632dsu.c((Object) eArr, "");
        eArr[i] = null;
    }

    public static final <E> void d(E[] eArr, int i, int i2) {
        C8632dsu.c((Object) eArr, "");
        while (i < i2) {
            d(eArr, i);
            i++;
        }
    }
}
