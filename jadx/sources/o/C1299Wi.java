package o;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.util.PlayContext;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.C1255Uq;
import o.C1299Wi;
import o.C8632dsu;
import o.InterfaceC1251Um;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.VX;
import o.dpR;

@ActivityScoped
/* renamed from: o.Wi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1299Wi implements VC {
    public static final c e = new c(null);
    private final Activity a;
    private final InterfaceC1284Vt b;
    private final InterfaceC1285Vu c;
    private final VB d;

    @Inject
    public C1299Wi(Activity activity, InterfaceC1284Vt interfaceC1284Vt, InterfaceC1285Vu interfaceC1285Vu, VB vb) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) interfaceC1285Vu, "");
        C8632dsu.c((Object) vb, "");
        this.a = activity;
        this.b = interfaceC1284Vt;
        this.c = interfaceC1285Vu;
        this.d = vb;
    }

    /* renamed from: o.Wi$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("CommanderMessageInfraImpl");
        }
    }

    @Override // o.VC
    public void b(final String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item", "Search");
        WL.d.e(this.b.g(), CommanderFlexEventType.c, linkedHashMap);
        if (((dpR) C9726vo.d(C1329Xm.c.a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.CommanderMessageInfraImpl$search$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                b(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void b(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1299Wi.e.getLogTag();
                interfaceC1251Um.b(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), str);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendSearchCommand can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.VC
    public void e(final String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        if (((dpR) C9726vo.d(C1329Xm.c.a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.CommanderMessageInfraImpl$play$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                d(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void d(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1299Wi.e.getLogTag();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), str);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: sendPlayCommand can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
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
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    @Override // o.VC
    public void d(InterfaceC5160btX interfaceC5160btX, VideoType videoType) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) videoType, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String aH_ = interfaceC5160btX.aH_();
        if (aH_ == null) {
            aH_ = "";
        }
        linkedHashMap.put("episodeId", aH_);
        WL.d.e(this.b.g(), CommanderFlexEventType.p, linkedHashMap);
        PlaybackLauncher a = aGH.a(this.a);
        PlayContext playContext = PlayContextImp.c;
        C8632dsu.a(playContext, "");
        PlaybackLauncher.b.a(a, interfaceC5160btX, videoType, playContext, null, null, 24, null);
    }

    @Override // o.VC
    public void c(int i) {
        this.d.b(i);
    }

    @Override // o.VC
    public void b() {
        C1329Xm.c.f();
    }

    @Override // o.VC
    public InterfaceC8822dzv<Drawable> c(InterfaceC8812dzl<Long> interfaceC8812dzl) {
        C8632dsu.c((Object) interfaceC8812dzl, "");
        e.getLogTag();
        return this.c.e(interfaceC8812dzl);
    }

    @Override // o.VC
    public void b(long j) {
        e.getLogTag();
        C1329Xm.c.d(new C1257Us(j));
    }

    @Override // o.VC
    public void a() {
        e.getLogTag();
        C1329Xm.c.h();
    }
}
