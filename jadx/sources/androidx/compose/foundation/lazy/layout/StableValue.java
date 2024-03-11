package androidx.compose.foundation.lazy.layout;

import o.C8632dsu;
import o.drN;

@drN
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m388constructorimpl(T t) {
        return t;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m389equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && C8632dsu.c(obj, ((StableValue) obj2).m392unboximpl());
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m390hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m391toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m389equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m390hashCodeimpl(this.value);
    }

    public String toString() {
        return m391toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m392unboximpl() {
        return this.value;
    }
}
