package o;

/* renamed from: o.hd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9016hd extends AbstractC9015hc {
    private final String b;

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9016hd) && C8632dsu.c((Object) this.b, (Object) ((C9016hd) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "BVariable(name=" + this.b + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9016hd(String str) {
        super(null);
        C8632dsu.c((Object) str, "");
        this.b = str;
    }
}
