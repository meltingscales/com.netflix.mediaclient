package o;

/* renamed from: o.cAp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5524cAp {
    private final AbstractC5271bvc b;

    public C5524cAp(AbstractC5271bvc abstractC5271bvc) {
        C8632dsu.c((Object) abstractC5271bvc, "");
        this.b = abstractC5271bvc;
    }

    public final C5208buS d() {
        return this.b.e();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5524cAp) {
            return C8632dsu.c((Object) d().b(), (Object) ((C5524cAp) obj).d().b());
        }
        return false;
    }

    public int hashCode() {
        return d().b().hashCode();
    }
}
