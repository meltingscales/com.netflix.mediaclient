package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import o.C8561dqd;
import o.C8632dsu;
import o.InterfaceC8598drn;
import o.dpT;

/* loaded from: classes.dex */
public final class EnumEntriesList<T extends Enum<T>> extends dpT<T> implements InterfaceC8598drn<T>, Serializable {
    private final T[] e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpQ, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpT, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return d((Enum) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.dpT, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return a((Enum) obj);
        }
        return -1;
    }

    public EnumEntriesList(T[] tArr) {
        C8632dsu.c((Object) tArr, "");
        this.e = tArr;
    }

    @Override // o.dpQ
    public int getSize() {
        return this.e.length;
    }

    @Override // o.dpT, java.util.List
    /* renamed from: b */
    public T get(int i) {
        dpT.Companion.c(i, this.e.length);
        return this.e[i];
    }

    public boolean e(T t) {
        C8632dsu.c((Object) t, "");
        return ((Enum) C8561dqd.a(this.e, t.ordinal())) == t;
    }

    public int d(T t) {
        C8632dsu.c((Object) t, "");
        int ordinal = t.ordinal();
        if (((Enum) C8561dqd.a(this.e, ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    public int a(T t) {
        C8632dsu.c((Object) t, "");
        return indexOf(t);
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.e);
    }
}
