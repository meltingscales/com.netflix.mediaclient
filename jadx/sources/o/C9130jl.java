package o;

/* renamed from: o.jl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9130jl {
    private final String c;
    private final String d;

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9130jl) {
            C9130jl c9130jl = (C9130jl) obj;
            return C8632dsu.c((Object) this.c, (Object) c9130jl.c) && C8632dsu.c((Object) this.d, (Object) c9130jl.d);
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RecordForKey(key=" + this.c + ", record=" + this.d + ')';
    }

    public C9130jl(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.c = str;
        this.d = str2;
    }
}
