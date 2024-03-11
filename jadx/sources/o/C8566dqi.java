package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.dqi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8566dqi {
    public static <T> List<T> e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C8632dsu.a(singletonList, "");
        return singletonList;
    }

    public static <E> List<E> a() {
        return new ListBuilder();
    }

    public static <E> List<E> e(int i) {
        return new ListBuilder(i);
    }

    public static <E> List<E> o(List<E> list) {
        C8632dsu.c((Object) list, "");
        return ((ListBuilder) list).a();
    }

    public static <T> T[] a(int i, T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> Object[] d(T[] tArr, boolean z) {
        C8632dsu.c((Object) tArr, "");
        if (z && C8632dsu.c(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C8632dsu.a(copyOf, "");
        return copyOf;
    }
}
