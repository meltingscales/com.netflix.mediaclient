package o;

/* renamed from: o.dsy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8636dsy implements InterfaceC8622dsk {
    private final String c;
    private final Class<?> e;

    @Override // o.InterfaceC8622dsk
    public Class<?> d() {
        return this.e;
    }

    public C8636dsy(Class<?> cls, String str) {
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) str, "");
        this.e = cls;
        this.c = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8636dsy) && C8632dsu.c(d(), ((C8636dsy) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
