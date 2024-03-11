package o;

/* renamed from: o.gX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8957gX extends AbstractC9015hc {
    private final String b;

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8957gX) && C8632dsu.c((Object) this.b, (Object) ((C8957gX) obj).b);
    }

    public int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "BLabel(label=" + this.b + ')';
    }
}
