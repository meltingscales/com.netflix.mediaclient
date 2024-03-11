package o;

/* renamed from: o.hh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9020hh {
    private final String c;
    private final boolean d;

    public final boolean c() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9020hh) {
            C9020hh c9020hh = (C9020hh) obj;
            return C8632dsu.c((Object) this.c, (Object) c9020hh.c) && this.d == c9020hh.d;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "CompiledCondition(name=" + this.c + ", inverted=" + this.d + ')';
    }

    public C9020hh(String str, boolean z) {
        C8632dsu.c((Object) str, "");
        this.c = str;
        this.d = z;
    }
}
