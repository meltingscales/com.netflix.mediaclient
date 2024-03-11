package o;

import java.util.Arrays;

/* renamed from: o.cl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6849cl<V> {
    private final Throwable c;
    private final V d;

    public V b() {
        return this.d;
    }

    public Throwable e() {
        return this.c;
    }

    public C6849cl(V v) {
        this.d = v;
        this.c = null;
    }

    public C6849cl(Throwable th) {
        this.c = th;
        this.d = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6849cl) {
            C6849cl c6849cl = (C6849cl) obj;
            if (b() == null || !b().equals(c6849cl.b())) {
                if (e() == null || c6849cl.e() == null) {
                    return false;
                }
                return e().toString().equals(e().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), e()});
    }
}
