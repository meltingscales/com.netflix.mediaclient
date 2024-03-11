package o;

import o.AbstractC8899fS;
import o.InterfaceC8888fH;

/* renamed from: o.gp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8975gp<VM extends AbstractC8899fS<S>, S extends InterfaceC8888fH> {
    private final AbstractC8979gt a;
    private final Class<? extends VM> c;
    private final Class<? extends S> d;
    private final drM<S, S> e;

    public final AbstractC8979gt a() {
        return this.a;
    }

    public final Class<? extends S> b() {
        return this.d;
    }

    public final Class<? extends VM> d() {
        return this.c;
    }

    public final drM<S, S> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8975gp) {
            C8975gp c8975gp = (C8975gp) obj;
            return C8632dsu.c(this.a, c8975gp.a) && C8632dsu.c(this.c, c8975gp.c) && C8632dsu.c(this.d, c8975gp.d) && C8632dsu.c(this.e, c8975gp.e);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "StateRestorer(viewModelContext=" + this.a + ", viewModelClass=" + this.c + ", stateClass=" + this.d + ", toRestoredState=" + this.e + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8975gp(AbstractC8979gt abstractC8979gt, Class<? extends VM> cls, Class<? extends S> cls2, drM<? super S, ? extends S> drm) {
        C8632dsu.c((Object) abstractC8979gt, "");
        C8632dsu.c((Object) cls, "");
        C8632dsu.c((Object) cls2, "");
        C8632dsu.c((Object) drm, "");
        this.a = abstractC8979gt;
        this.c = cls;
        this.d = cls2;
        this.e = drm;
    }
}
