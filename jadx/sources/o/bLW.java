package o;

import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.AbstractC3828bMd;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.bLR;
import o.dpR;

/* loaded from: classes4.dex */
public final class bLW extends AbstractC3828bMd {
    private final long c;
    private final int g;
    private final C1619aI h;
    public static final e b = new e(null);
    public static final int a = 8;

    public /* synthetic */ bLW(dwU dwu, C1619aI c1619aI, LifecycleOwner lifecycleOwner, long j, int i, drM drm, drM drm2, drO dro, int i2, C8627dsp c8627dsp) {
        this(dwu, c1619aI, lifecycleOwner, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 50 : i, (i2 & 32) != 0 ? new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyVideoAutoPlay$1
            public final void b(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                b(blr);
                return dpR.c;
            }
        } : drm, (i2 & 64) != 0 ? new drM<bLR<?>, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyVideoAutoPlay$2
            public final void e(bLR<?> blr) {
                C8632dsu.c((Object) blr, "");
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(bLR<?> blr) {
                e(blr);
                return dpR.c;
            }
        } : drm2, (i2 & 128) != 0 ? new drO<Boolean>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.tracking.EpoxyVideoAutoPlay$3
            @Override // o.drO
            /* renamed from: b */
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        } : dro);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bLW(dwU dwu, C1619aI c1619aI, LifecycleOwner lifecycleOwner, long j, int i, drM<? super bLR<?>, dpR> drm, drM<? super bLR<?>, dpR> drm2, drO<Boolean> dro) {
        super(dwu, lifecycleOwner, j, drm, drm2, dro);
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) c1619aI, "");
        C8632dsu.c((Object) lifecycleOwner, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) drm2, "");
        C8632dsu.c((Object) dro, "");
        this.h = c1619aI;
        this.c = j;
        this.g = i;
        g();
        if (1 <= i && i < 101) {
            c1619aI.b(Integer.valueOf(i));
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Invalid visibility ratio, must be greater than 0 and less or equals to 100: " + i, null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                c1596aHd.a(errorType.c() + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
        c1619aI.b((Integer) 50);
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("EpoxyVideoAutoPlay");
        }
    }

    @Override // o.AbstractC3828bMd
    public void d(boolean z) {
        this.h.b();
    }

    public final <T extends AbstractC3073as<V>, V> InterfaceC4732bk<T, V> a() {
        return new InterfaceC4732bk() { // from class: o.bLT
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bLW.d(bLW.this, abstractC3073as, obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(bLW blw, AbstractC3073as abstractC3073as, Object obj, int i) {
        C8632dsu.c((Object) blw, "");
        if (abstractC3073as instanceof bLR) {
            if (i == 5) {
                long j = blw.c;
                C8632dsu.d(obj);
                blw.a((bLR) abstractC3073as, j, (AbstractC3179au) obj);
            } else if (i != 6) {
            } else {
                C8632dsu.d(obj);
                AbstractC3828bMd.b(blw, (AbstractC3179au) obj, (bLR) abstractC3073as, false, 4, null);
            }
        }
    }

    public final <T extends AbstractC3073as<V>, V> InterfaceC4732bk<T, V> c() {
        return new InterfaceC4732bk() { // from class: o.bLX
            @Override // o.InterfaceC4732bk
            public final void b(AbstractC3073as abstractC3073as, Object obj, int i) {
                bLW.a(bLW.this, abstractC3073as, obj, i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bLW blw, AbstractC3073as abstractC3073as, Object obj, int i) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) blw, "");
        if (abstractC3073as instanceof bLR) {
            if (i == 4) {
                C8632dsu.d(obj);
                AbstractC3828bMd.c cVar = new AbstractC3828bMd.c((bLR) abstractC3073as, (AbstractC3179au) obj);
                AbstractC3828bMd.c cVar2 = blw.h().get(Long.valueOf(abstractC3073as.b()));
                if (cVar2 != null) {
                    blw.j().remove(cVar2);
                    blw.h().remove(Long.valueOf(abstractC3073as.b()));
                }
                blw.h().put(Long.valueOf(abstractC3073as.b()), cVar);
                blw.j().add(cVar);
                if (blw.f() == null) {
                    blw.d();
                    return;
                }
                return;
            }
            C8632dsu.d(obj);
            AbstractC3828bMd.b(blw, (AbstractC3179au) obj, (bLR) abstractC3073as, false, 4, null);
            AbstractC3828bMd.c cVar3 = blw.h().get(Long.valueOf(abstractC3073as.b()));
            if (cVar3 != null) {
                blw.j().remove(cVar3);
                blw.h().remove(Long.valueOf(abstractC3073as.b()));
            }
            blw.d();
            return;
        }
        InterfaceC1598aHf.c cVar4 = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Users must implement AutoPlayableModel", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b2);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }
}
