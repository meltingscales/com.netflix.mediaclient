package o;

import com.apollographql.apollo3.cache.normalized.FetchPolicy;
import com.apollographql.apollo3.cache.normalized.NormalizedCache$watch$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o.C8944gK;
import o.C8951gR;
import o.C8954gU;
import o.InterfaceC8990hD;
import o.InterfaceC8991hE;
import o.InterfaceC8999hM;

/* renamed from: o.ir  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9083ir {

    /* renamed from: o.ir$c */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[FetchPolicy.values().length];
            try {
                iArr[FetchPolicy.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchPolicy.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchPolicy.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchPolicy.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchPolicy.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr;
        }
    }

    public static /* synthetic */ C8944gK.e e(C8944gK.e eVar, InterfaceC9080io interfaceC9080io, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(eVar, interfaceC9080io, z);
    }

    public static final C8944gK.e b(C8944gK.e eVar, InterfaceC9080io interfaceC9080io, boolean z) {
        C8632dsu.c((Object) eVar, "");
        C8632dsu.c((Object) interfaceC9080io, "");
        List<InterfaceC9136jr> j = eVar.j();
        if (!(j instanceof Collection) || !j.isEmpty()) {
            for (InterfaceC9136jr interfaceC9136jr : j) {
                if (interfaceC9136jr instanceof C9134jp) {
                    throw new IllegalStateException("Apollo: the normalized cache must be configured before the auto persisted queries".toString());
                }
            }
        }
        return (C8944gK.e) c(eVar.b(new C9123je(interfaceC9080io)).b(C9086iu.d).b(new C9061iV(interfaceC9080io)), z);
    }

    public static final <D extends InterfaceC8999hM.c> dyS<C8954gU<D>> b(C8942gI<D> c8942gI) {
        C8632dsu.c((Object) c8942gI, "");
        return dyR.d(new NormalizedCache$watch$1(c8942gI, null));
    }

    public static final <D extends InterfaceC8999hM.c> dyS<C8954gU<D>> c(C8942gI<D> c8942gI, D d) {
        C8632dsu.c((Object) c8942gI, "");
        return c8942gI.e().e(new C9091iz(d)).i();
    }

    public static final InterfaceC9080io d(C8944gK c8944gK) {
        Object obj;
        InterfaceC9080io e;
        C8632dsu.c((Object) c8944gK, "");
        Iterator<T> it = c8944gK.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC9136jr) obj) instanceof C9061iV) {
                break;
            }
        }
        InterfaceC9136jr interfaceC9136jr = (InterfaceC9136jr) obj;
        if (interfaceC9136jr == null || (e = ((C9061iV) interfaceC9136jr).e()) == null) {
            throw new IllegalStateException("no cache configured".toString());
        }
        return e;
    }

    public static final <T> T d(InterfaceC9038hz<T> interfaceC9038hz, FetchPolicy fetchPolicy) {
        C8632dsu.c((Object) interfaceC9038hz, "");
        C8632dsu.c((Object) fetchPolicy, "");
        return interfaceC9038hz.e(new C9084is(c(fetchPolicy)));
    }

    public static final <T> T a(InterfaceC9038hz<T> interfaceC9038hz, FetchPolicy fetchPolicy) {
        C8632dsu.c((Object) interfaceC9038hz, "");
        C8632dsu.c((Object) fetchPolicy, "");
        return interfaceC9038hz.e(new C9089ix(c(fetchPolicy)));
    }

    public static final <T> T b(InterfaceC9038hz<T> interfaceC9038hz, InterfaceC9136jr interfaceC9136jr) {
        C8632dsu.c((Object) interfaceC9038hz, "");
        C8632dsu.c((Object) interfaceC9136jr, "");
        return interfaceC9038hz.e(new C9084is(interfaceC9136jr));
    }

    private static final InterfaceC9136jr c(FetchPolicy fetchPolicy) {
        int i = c.b[fetchPolicy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return C9085it.d();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C9085it.c();
                }
                return C9085it.a();
            }
            return C9085it.b();
        }
        return C9085it.e();
    }

    public static final <T> T e(InterfaceC9038hz<T> interfaceC9038hz, C9044iE c9044iE) {
        C8632dsu.c((Object) interfaceC9038hz, "");
        C8632dsu.c((Object) c9044iE, "");
        return interfaceC9038hz.e(new C9081ip(c9044iE));
    }

    public static final <T> T c(InterfaceC9038hz<T> interfaceC9038hz, boolean z) {
        C8632dsu.c((Object) interfaceC9038hz, "");
        return interfaceC9038hz.e(new C9045iF(z));
    }

    public static final <D extends InterfaceC8990hD.b> C8942gI<D> b(C8942gI<D> c8942gI, D d) {
        C8632dsu.c((Object) c8942gI, "");
        C8632dsu.c((Object) d, "");
        return c8942gI.e(new C9040iA(d));
    }

    public static final <D extends InterfaceC8991hE.b> InterfaceC9136jr e(C8951gR<D> c8951gR) {
        InterfaceC9136jr c2;
        C8632dsu.c((Object) c8951gR, "");
        C9084is c9084is = (C9084is) c8951gR.b().d(C9084is.e);
        return (c9084is == null || (c2 = c9084is.c()) == null) ? C9085it.a() : c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC9136jr a(InterfaceC9038hz<T> interfaceC9038hz) {
        InterfaceC9136jr e;
        C9089ix c9089ix = (C9089ix) interfaceC9038hz.b().d(C9089ix.c);
        return (c9089ix == null || (e = c9089ix.e()) == null) ? C9085it.e() : e;
    }

    public static final <D extends InterfaceC8991hE.b> boolean c(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9082iq c9082iq = (C9082iq) c8951gR.b().d(C9082iq.b);
        if (c9082iq != null) {
            return c9082iq.c();
        }
        return false;
    }

    public static final <D extends InterfaceC8991hE.b> boolean i(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9090iy c9090iy = (C9090iy) c8951gR.b().d(C9090iy.b);
        if (c9090iy != null) {
            return c9090iy.b();
        }
        return false;
    }

    public static final <D extends InterfaceC8991hE.b> boolean j(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9088iw c9088iw = (C9088iw) c8951gR.b().d(C9088iw.b);
        if (c9088iw != null) {
            return c9088iw.d();
        }
        return false;
    }

    public static final <D extends InterfaceC8991hE.b> boolean f(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9045iF c9045iF = (C9045iF) c8951gR.b().d(C9045iF.d);
        if (c9045iF != null) {
            return c9045iF.e();
        }
        return false;
    }

    public static final <D extends InterfaceC8990hD.b> InterfaceC8990hD.b d(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9040iA c9040iA = (C9040iA) c8951gR.b().d(C9040iA.d);
        if (c9040iA != null) {
            return c9040iA.c();
        }
        return null;
    }

    public static final <D extends InterfaceC8991hE.b> C9044iE a(C8951gR<D> c8951gR) {
        C9044iE b;
        C8632dsu.c((Object) c8951gR, "");
        C9081ip c9081ip = (C9081ip) c8951gR.b().d(C9081ip.b);
        return (c9081ip == null || (b = c9081ip.b()) == null) ? C9044iE.d : b;
    }

    public static final <D extends InterfaceC8991hE.b> C9091iz g(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        return (C9091iz) c8951gR.b().d(C9091iz.e);
    }

    public static final <D extends InterfaceC8991hE.b> boolean c(C8954gU<D> c8954gU) {
        C8632dsu.c((Object) c8954gU, "");
        C9078im a = a(c8954gU);
        return a != null && a.e();
    }

    public static final <D extends InterfaceC8991hE.b> C9078im a(C8954gU<D> c8954gU) {
        C8632dsu.c((Object) c8954gU, "");
        return (C9078im) c8954gU.c.d(C9078im.e);
    }

    public static final <D extends InterfaceC8991hE.b> C8954gU.c<D> c(C8954gU.c<D> cVar, C9078im c9078im) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) c9078im, "");
        return cVar.a(c9078im);
    }

    public static final <D extends InterfaceC8991hE.b> C8951gR.d<D> a(C8951gR.d<D> dVar, boolean z) {
        C8632dsu.c((Object) dVar, "");
        dVar.e(new C9087iv(z));
        return dVar;
    }

    public static final <D extends InterfaceC8991hE.b> boolean b(C8951gR<D> c8951gR) {
        C8632dsu.c((Object) c8951gR, "");
        C9087iv c9087iv = (C9087iv) c8951gR.b().d(C9087iv.c);
        if (c9087iv != null) {
            return c9087iv.e();
        }
        return false;
    }

    public static final <D extends InterfaceC8991hE.b> C9044iE d(C8954gU<D> c8954gU) {
        C9044iE b;
        C8632dsu.c((Object) c8954gU, "");
        C9081ip c9081ip = (C9081ip) c8954gU.c.d(C9081ip.b);
        return (c9081ip == null || (b = c9081ip.b()) == null) ? C9044iE.d : b;
    }
}
