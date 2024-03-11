package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: o.aDf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1490aDf extends AbstractC9055iP {
    private final AbstractC9055iP c;

    public C1490aDf(AbstractC9055iP abstractC9055iP) {
        C8632dsu.c((Object) abstractC9055iP, "");
        this.c = abstractC9055iP;
    }

    @Override // o.AbstractC9055iP
    public void c() {
        this.c.c();
    }

    @Override // o.InterfaceC9052iM
    public C9053iN d(String str, C9044iE c9044iE) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("BYPASS_DISK_CACHE")) {
            return null;
        }
        return this.c.d(str, c9044iE);
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        List i;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (!c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.c.e(collection, c9044iE);
        }
        i = C8569dql.i();
        return i;
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> e;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        if (!c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.c.e(c9053iN, c9044iE);
        }
        e = dqN.e();
        return e;
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> e;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (!c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.c.c(collection, c9044iE);
        }
        e = dqN.e();
        return e;
    }

    @Override // o.AbstractC9055iP
    public int a(String str) {
        C8632dsu.c((Object) str, "");
        return this.c.a(str);
    }
}
