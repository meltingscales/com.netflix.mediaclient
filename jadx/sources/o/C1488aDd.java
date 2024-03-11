package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: o.aDd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1488aDd extends AbstractC9055iP {
    private final AbstractC9055iP d;

    public C1488aDd(AbstractC9055iP abstractC9055iP) {
        C8632dsu.c((Object) abstractC9055iP, "");
        this.d = abstractC9055iP;
    }

    private final void e() {
        if (b() == null || this.d.b() == b()) {
            return;
        }
        AbstractC9055iP abstractC9055iP = this.d;
        AbstractC9055iP b = b();
        C8632dsu.d(b);
        abstractC9055iP.a(b);
    }

    @Override // o.AbstractC9055iP
    public void c() {
        e();
        this.d.c();
    }

    @Override // o.InterfaceC9052iM
    public C9053iN d(String str, C9044iE c9044iE) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        e();
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP b = b();
            if (b != null) {
                return b.d(str, c9044iE);
            }
            return null;
        }
        return this.d.d(str, c9044iE);
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        List i;
        Collection<C9053iN> e;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        e();
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP b = b();
            if (b == null || (e = b.e(collection, c9044iE)) == null) {
                i = C8569dql.i();
                return i;
            }
            return e;
        }
        return this.d.e(collection, c9044iE);
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> e;
        Set<String> e2;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        e();
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP b = b();
            if (b == null || (e2 = b.e(c9053iN, c9044iE)) == null) {
                e = dqN.e();
                return e;
            }
            return e2;
        }
        return this.d.e(c9053iN, c9044iE);
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> e;
        Set<String> c;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        e();
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP b = b();
            if (b == null || (c = b.c(collection, c9044iE)) == null) {
                e = dqN.e();
                return e;
            }
            return c;
        }
        return this.d.c(collection, c9044iE);
    }

    @Override // o.AbstractC9055iP
    public int a(String str) {
        C8632dsu.c((Object) str, "");
        e();
        return this.d.a(str);
    }
}
