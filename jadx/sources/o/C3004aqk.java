package o;

/* renamed from: o.aqk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3004aqk {
    private final AbstractC8997hK<C3003aqj> a;
    private final C2973aqF b;
    private final AbstractC8997hK<String> c;

    public final AbstractC8997hK<C3003aqj> a() {
        return this.a;
    }

    public final C2973aqF c() {
        return this.b;
    }

    public final AbstractC8997hK<String> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3004aqk) {
            C3004aqk c3004aqk = (C3004aqk) obj;
            return C8632dsu.c(this.c, c3004aqk.c) && C8632dsu.c(this.b, c3004aqk.b) && C8632dsu.c(this.a, c3004aqk.a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public String toString() {
        AbstractC8997hK<String> abstractC8997hK = this.c;
        C2973aqF c2973aqF = this.b;
        AbstractC8997hK<C3003aqj> abstractC8997hK2 = this.a;
        return "LolomoContext(aroCategoryId=" + abstractC8997hK + ", mapAnnotations=" + c2973aqF + ", cxuiAnnotations=" + abstractC8997hK2 + ")";
    }

    public C3004aqk(AbstractC8997hK<String> abstractC8997hK, C2973aqF c2973aqF, AbstractC8997hK<C3003aqj> abstractC8997hK2) {
        C8632dsu.c((Object) abstractC8997hK, "");
        C8632dsu.c((Object) c2973aqF, "");
        C8632dsu.c((Object) abstractC8997hK2, "");
        this.c = abstractC8997hK;
        this.b = c2973aqF;
        this.a = abstractC8997hK2;
    }
}
