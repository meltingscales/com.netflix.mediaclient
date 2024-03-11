package o;

import java.util.Collection;
import java.util.Set;

/* renamed from: o.aDe  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1489aDe extends AbstractC9055iP {
    private final AbstractC9055iP c;
    private final AbstractC9055iP e;

    public C1489aDe(AbstractC9055iP abstractC9055iP, AbstractC9055iP abstractC9055iP2) {
        C8632dsu.c((Object) abstractC9055iP, "");
        this.e = abstractC9055iP;
        this.c = abstractC9055iP2;
    }

    @Override // o.AbstractC9055iP
    public void c() {
        this.e.c();
        AbstractC9055iP abstractC9055iP = this.c;
        if (abstractC9055iP != null) {
            abstractC9055iP.c();
        }
    }

    @Override // o.InterfaceC9052iM
    public C9053iN d(String str, C9044iE c9044iE) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.e.d(str, c9044iE);
        }
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP abstractC9055iP = this.c;
            if (abstractC9055iP != null) {
                return abstractC9055iP.d(str, c9044iE);
            }
        } else {
            C9053iN d = this.e.d(str, c9044iE);
            if (d != null) {
                return d;
            }
            AbstractC9055iP abstractC9055iP2 = this.c;
            if (abstractC9055iP2 != null) {
                return abstractC9055iP2.d(str, c9044iE);
            }
        }
        return null;
    }

    @Override // o.InterfaceC9052iM
    public Collection<C9053iN> e(Collection<String> collection, C9044iE c9044iE) {
        Set e;
        Collection<C9053iN> e2;
        Set e3;
        Collection<C9053iN> e4;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.e.e(collection, c9044iE);
        }
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP abstractC9055iP = this.c;
            if (abstractC9055iP == null || (e4 = abstractC9055iP.e(collection, c9044iE)) == null) {
                e3 = dqN.e();
                return e3;
            }
            return e4;
        }
        Collection<C9053iN> e5 = this.e.e(collection, c9044iE);
        if (e5.isEmpty()) {
            AbstractC9055iP abstractC9055iP2 = this.c;
            if (abstractC9055iP2 == null || (e2 = abstractC9055iP2.e(collection, c9044iE)) == null) {
                e = dqN.e();
                return e;
            }
            return e2;
        }
        return e5;
    }

    @Override // o.AbstractC9055iP
    public Set<String> e(C9053iN c9053iN, C9044iE c9044iE) {
        Set<String> e;
        Set<String> set;
        Set<String> c;
        Set<String> e2;
        Set<String> e3;
        Set<String> e4;
        C8632dsu.c((Object) c9053iN, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.e.e(c9053iN, c9044iE);
        }
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP abstractC9055iP = this.c;
            if (abstractC9055iP == null || (e4 = abstractC9055iP.e(c9053iN, c9044iE)) == null) {
                e3 = dqN.e();
                return e3;
            }
            return e4;
        }
        Set<String> e5 = this.e.e(c9053iN, c9044iE);
        AbstractC9055iP abstractC9055iP2 = this.c;
        if (abstractC9055iP2 == null || (e2 = abstractC9055iP2.e(c9053iN, c9044iE)) == null) {
            e = dqN.e();
            set = e;
        } else {
            set = e2;
        }
        c = dqM.c(e5, set);
        return c;
    }

    @Override // o.AbstractC9055iP
    public Set<String> c(Collection<C9053iN> collection, C9044iE c9044iE) {
        Set<String> e;
        Set<String> set;
        Set<String> c;
        Set<String> c2;
        Set<String> e2;
        Set<String> c3;
        C8632dsu.c((Object) collection, "");
        C8632dsu.c((Object) c9044iE, "");
        if (c9044iE.c("BYPASS_DISK_CACHE")) {
            return this.e.c(collection, c9044iE);
        }
        if (c9044iE.c("BYPASS_MEMORY_CACHE")) {
            AbstractC9055iP abstractC9055iP = this.c;
            if (abstractC9055iP == null || (c3 = abstractC9055iP.c(collection, c9044iE)) == null) {
                e2 = dqN.e();
                return e2;
            }
            return c3;
        }
        Set<String> c4 = this.e.c(collection, c9044iE);
        AbstractC9055iP abstractC9055iP2 = this.c;
        if (abstractC9055iP2 == null || (c2 = abstractC9055iP2.c(collection, c9044iE)) == null) {
            e = dqN.e();
            set = e;
        } else {
            set = c2;
        }
        c = dqM.c(c4, set);
        return c;
    }

    @Override // o.AbstractC9055iP
    public int a(String str) {
        C8632dsu.c((Object) str, "");
        int a = this.e.a(str);
        AbstractC9055iP abstractC9055iP = this.c;
        return Math.max(a, abstractC9055iP != null ? abstractC9055iP.a(str) : 0);
    }
}
