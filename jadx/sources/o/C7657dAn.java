package o;

import java.util.ArrayList;

@drN
/* renamed from: o.dAn  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7657dAn<E> {
    private final Object e;

    public static <E> Object b(Object obj) {
        return obj;
    }

    public static int c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String d(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public static boolean e(Object obj, Object obj2) {
        return (obj2 instanceof C7657dAn) && C8632dsu.c(obj, ((C7657dAn) obj2).d());
    }

    public final /* synthetic */ Object d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        return e(this.e, obj);
    }

    public int hashCode() {
        return c(this.e);
    }

    public String toString() {
        return d(this.e);
    }

    public static /* synthetic */ Object a(Object obj, int i, C8627dsp c8627dsp) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static final Object d(Object obj, E e) {
        if (obj == null) {
            return b(e);
        }
        if (obj instanceof ArrayList) {
            C8632dsu.d(obj);
            ((ArrayList) obj).add(e);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return b(arrayList);
    }
}
