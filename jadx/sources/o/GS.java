package o;

/* loaded from: classes3.dex */
public final class GS extends GW {
    private final String c;

    public final String a() {
        return this.c;
    }

    @Override // o.GW
    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GS) && C8632dsu.c((Object) this.c, (Object) ((GS) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GS(String str) {
        super(null);
        C8632dsu.c((Object) str, "");
        this.c = str;
    }

    public String toString() {
        return e();
    }

    @Override // o.GW
    public String e() {
        String b = b();
        return "\"" + b + "\"";
    }
}
