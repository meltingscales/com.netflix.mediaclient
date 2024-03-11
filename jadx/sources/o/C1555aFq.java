package o;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$persistChanges$1;
import dagger.hilt.android.EntryPointAccessors;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.Result;
import o.AbstractC7773dEv;
import o.C1540aFb;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aFR;
import o.aFS;
import o.aFW;
import o.dBT;
import o.dEI;
import o.dEP;

/* renamed from: o.aFq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1555aFq implements InterfaceC1545aFg {
    private final Context a;
    private final Set<InterfaceC1544aFf> b;
    private final AtomicReference<C1563aFy> c;
    private final Set<InterfaceC1543aFe> d;
    private final dwU e;
    private final boolean f;
    private final AtomicReference<C1563aFy> g;
    private final InterfaceC1550aFl h;
    private final AtomicReference<C1563aFy> i;
    private final aFO<aFW> j;
    private final aFT n;

    /* JADX WARN: Multi-variable type inference failed */
    public C1555aFq(Context context, InterfaceC1550aFl interfaceC1550aFl, dwU dwu, Set<? extends InterfaceC1544aFf> set, Set<? extends InterfaceC1543aFe> set2, boolean z) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) interfaceC1550aFl, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) set, "");
        C8632dsu.c((Object) set2, "");
        this.a = context;
        this.h = interfaceC1550aFl;
        this.e = dwu;
        this.b = set;
        this.d = set2;
        this.f = z;
        this.n = new aFT();
        this.c = new AtomicReference<>(C1557aFs.e());
        this.g = new AtomicReference<>(C1557aFs.e());
        this.i = new AtomicReference<>(C1557aFs.e());
        aFO<aFW> afo = new aFO<>(new Provider() { // from class: o.aFr
            @Override // javax.inject.Provider
            public final Object get() {
                File h;
                h = C1555aFq.h(C1555aFq.this);
                return h;
            }
        }, new drM<aFW, String>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$storage$2
            @Override // o.drM
            /* renamed from: e */
            public final String invoke(aFW afw) {
                C8632dsu.c((Object) afw, "");
                AbstractC7773dEv d = C1540aFb.d();
                d.d();
                return d.e(aFW.Companion.a(), (dBT<aFW>) afw);
            }
        }, new drM<String, aFW>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$storage$3
            @Override // o.drM
            /* renamed from: e */
            public final aFW invoke(String str) {
                C8632dsu.c((Object) str, "");
                AbstractC7773dEv d = C1540aFb.d();
                d.d();
                return (aFW) d.d(aFW.Companion.a(), str);
            }
        }, new Provider() { // from class: o.aFo
            @Override // javax.inject.Provider
            public final Object get() {
                aFW j;
                j = C1555aFq.j();
                return j;
            }
        }, new drM<Throwable, aFW>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$storage$5
            @Override // o.drM
            /* renamed from: e */
            public final aFW invoke(Throwable th) {
                Throwable th2;
                Throwable th3;
                C8632dsu.c((Object) th, "");
                if (th instanceof IOException) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    C1596aHd d = new C1596aHd("Error loading config", null, null, false, null, false, false, 126, null).b(ErrorType.g).d(th);
                    ErrorType errorType = d.a;
                    if (errorType != null) {
                        d.e.put("errorType", errorType.c());
                        String b = d.b();
                        if (b != null) {
                            String c = errorType.c();
                            d.a(c + " " + b);
                        }
                    }
                    if (d.b() != null && d.i != null) {
                        th3 = new Throwable(d.b(), d.i);
                    } else if (d.b() != null) {
                        th3 = new Throwable(d.b());
                    } else {
                        th3 = d.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(d, th3);
                    } else {
                        dVar.e().b(d, th3);
                    }
                    return null;
                }
                InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
                C1596aHd d2 = new C1596aHd("Error loading config", null, null, false, null, false, false, 126, null).b(ErrorType.g).d(th);
                ErrorType errorType2 = d2.a;
                if (errorType2 != null) {
                    d2.e.put("errorType", errorType2.c());
                    String b2 = d2.b();
                    if (b2 != null) {
                        String c2 = errorType2.c();
                        d2.a(c2 + " " + b2);
                    }
                }
                if (d2.b() != null && d2.i != null) {
                    th2 = new Throwable(d2.b(), d2.i);
                } else if (d2.b() != null) {
                    th2 = new Throwable(d2.b());
                } else {
                    th2 = d2.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
                InterfaceC1597aHe c3 = dVar3.c();
                if (c3 != null) {
                    c3.d(d2, th2);
                } else {
                    dVar3.e().b(d2, th2);
                }
                return new aFW((aFS) null, (aFR) null, (dEP) null, (dEP) null, 15, (C8627dsp) null);
            }
        });
        this.j = afo;
        if (z) {
            afo.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File h(C1555aFq c1555aFq) {
        C8632dsu.c((Object) c1555aFq, "");
        File e = C1548aFj.e(c1555aFq.a);
        String e2 = c1555aFq.h.e();
        return new File(e, e2 + ".json");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aFW j() {
        return C1557aFs.b();
    }

    @Override // o.InterfaceC1545aFg
    public boolean e() {
        return !i().c().e().isEmpty();
    }

    @Override // o.InterfaceC1545aFg
    public dxD e(dEP dep) {
        C8632dsu.c((Object) dep, "");
        return b(new aFW((aFS) null, (aFR) null, aFA.e.c(dep), i().c().d(), 3, (C8627dsp) null));
    }

    @Override // o.InterfaceC1545aFg
    public dxD a(dEP dep) {
        String b;
        C8632dsu.c((Object) dep, "");
        AbstractC7773dEv d = C1540aFb.d();
        d.d();
        aFW afw = (aFW) d.e((dBP<? extends Object>) aFW.Companion.a(), (dEI) dep);
        if (afw.e().isEmpty() && ((b = afw.c().b()) == null || b.length() == 0)) {
            return dwH.a(dpR.c);
        }
        aFW c = aFW.c(afw, new aFS(System.currentTimeMillis(), ((InterfaceC1245Ug) EntryPointAccessors.fromApplication(this.a, InterfaceC1245Ug.class)).w().h(), Build.VERSION.SDK_INT), null, null, i().c().d(), 6, null);
        for (InterfaceC1544aFf interfaceC1544aFf : this.b) {
            try {
                Result.c cVar = Result.e;
                interfaceC1544aFf.e(this);
                Result.e(dpR.c);
            } catch (Throwable th) {
                Result.c cVar2 = Result.e;
                Result.e(C8556dpz.a(th));
            }
        }
        return b(c);
    }

    public dxD d() {
        return b(new aFW((aFS) null, (aFR) null, (dEP) null, (dEP) null, 15, (C8627dsp) null));
    }

    private final dxD b(aFW afw) {
        C1563aFy c1563aFy;
        C1563aFy c1563aFy2;
        do {
            c1563aFy = this.c.get();
            c1563aFy2 = new C1563aFy(afw);
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.c, c1563aFy, c1563aFy2));
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.i, C1557aFs.e(), c1563aFy2);
        C8632dsu.d(c1563aFy);
        return b(c1563aFy, c1563aFy2);
    }

    @Override // o.InterfaceC1545aFg
    public Map<Integer, Integer> b() {
        Map<Integer, Integer> d;
        Map<Integer, Integer> i = i().c().c().i();
        if (i == null) {
            d = dqE.d();
            return d;
        }
        return i;
    }

    private final dxD b(C1563aFy c1563aFy, C1563aFy c1563aFy2) {
        dxD c;
        c = C8737dwr.c(this.e, null, null, new ConfigScopeState$persistChanges$1(this, c1563aFy, c1563aFy2, null), 3, null);
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T b(C1563aFy c1563aFy, String str, T t, final drM<? super dEI, ? extends T> drm) {
        Object d;
        C8632dsu.c((Object) c1563aFy, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        dEI e = c1563aFy.e(str);
        if (e != null && (d = d(e, new drM<dEI, T>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$interceptConfigAccess$value$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final T invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return drm.invoke(dei);
            }
        })) != 0) {
            t = d;
        }
        C8632dsu.d(t);
        d(str, t);
        return t;
    }

    public final <T> InterfaceC1551aFm<T> d(final String str, final T t, final drM<? super dEI, ? extends T> drm) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        return this.n.a(str, new Provider() { // from class: o.aFp
            @Override // javax.inject.Provider
            public final Object get() {
                Object a;
                a = C1555aFq.a(C1555aFq.this, str, t, drm);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(C1555aFq c1555aFq, String str, Object obj, final drM drm) {
        Object d;
        C8632dsu.c((Object) c1555aFq, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) drm, "");
        dEI e = c1555aFq.i().e(str);
        if (e != null && (d = c1555aFq.d(e, (drM<? super dEI, ? extends Object>) new drM<dEI, T>() { // from class: com.netflix.mediaclient.hendrixconfig.impl.ConfigScopeState$getVolatileConfig$1$value$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final T invoke(dEI dei) {
                C8632dsu.c((Object) dei, "");
                return drm.invoke(dei);
            }
        })) != null) {
            obj = d;
        }
        C8632dsu.d(obj);
        c1555aFq.d(str, obj);
        return obj;
    }

    public final C1563aFy i() {
        C1563aFy c1563aFy = this.c.get();
        if (this.f && c1563aFy == C1557aFs.e()) {
            this.j.b();
            if (this.j.a() && this.c.get() == C1557aFs.e()) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.c, C1557aFs.e(), new C1563aFy(this.j.d()));
            } else {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.c, C1557aFs.e(), C1557aFs.a());
            }
            for (InterfaceC1544aFf interfaceC1544aFf : this.b) {
                try {
                    Result.c cVar = Result.e;
                    interfaceC1544aFf.b(this);
                    Result.e(dpR.c);
                } catch (Throwable th) {
                    Result.c cVar2 = Result.e;
                    Result.e(C8556dpz.a(th));
                }
            }
            C1563aFy c1563aFy2 = this.c.get();
            C8632dsu.a(c1563aFy2, "");
            return c1563aFy2;
        } else if (!this.f && c1563aFy == C1557aFs.e()) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.c, C1557aFs.e(), C1557aFs.a());
            C1563aFy c1563aFy3 = this.c.get();
            C8632dsu.a(c1563aFy3, "");
            return c1563aFy3;
        } else {
            C8632dsu.d(c1563aFy);
            return c1563aFy;
        }
    }

    public final C1563aFy f() {
        C1563aFy c1563aFy = this.g.get();
        if (c1563aFy == C1557aFs.e()) {
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.g, C1557aFs.e(), i());
            C1563aFy c1563aFy2 = this.g.get();
            C8632dsu.a(c1563aFy2, "");
            return c1563aFy2;
        }
        C8632dsu.d(c1563aFy);
        return c1563aFy;
    }

    public final C1563aFy a() {
        C1563aFy c1563aFy = this.i.get();
        if (c1563aFy == C1557aFs.e()) {
            if (!i().c().e().isEmpty()) {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.i, C1557aFs.e(), i());
                C1563aFy c1563aFy2 = this.i.get();
                C8632dsu.a(c1563aFy2, "");
                return c1563aFy2;
            }
            return C1557aFs.a();
        }
        C8632dsu.d(c1563aFy);
        return c1563aFy;
    }

    public String toString() {
        String obj = super.toString();
        String e = this.h.e();
        aFR c = i().c().c();
        return obj + " " + e + "; " + c;
    }

    private final void d(String str, Object obj) {
        for (InterfaceC1543aFe interfaceC1543aFe : this.d) {
            interfaceC1543aFe.a(str, obj);
        }
    }

    private final <T> T d(dEI dei, drM<? super dEI, ? extends T> drm) {
        Throwable th;
        try {
            return drm.invoke(dei);
        } catch (Throwable th2) {
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd d = new C1596aHd("Error accessing config", null, null, false, null, false, false, 126, null).b(ErrorType.g).d(th2);
            ErrorType errorType = d.a;
            if (errorType != null) {
                d.e.put("errorType", errorType.c());
                String b = d.b();
                if (b != null) {
                    String c = errorType.c();
                    d.a(c + " " + b);
                }
            }
            if (d.b() != null && d.i != null) {
                th = new Throwable(d.b(), d.i);
            } else if (d.b() != null) {
                th = new Throwable(d.b());
            } else {
                th = d.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c2 = dVar2.c();
            if (c2 != null) {
                c2.d(d, th);
            } else {
                dVar2.e().b(d, th);
            }
            return null;
        }
    }
}
