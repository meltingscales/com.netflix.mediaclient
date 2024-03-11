package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.C1255Uq;
import o.C1297Wg;
import o.C8632dsu;
import o.InterfaceC1251Um;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.VX;
import o.dpR;

@ActivityScoped
/* renamed from: o.Wg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297Wg implements InterfaceC1288Vx {
    public static final b c = new b(null);
    private final InterfaceC1284Vt d;

    @Inject
    public C1297Wg(InterfaceC1284Vt interfaceC1284Vt) {
        C8632dsu.c((Object) interfaceC1284Vt, "");
        this.d = interfaceC1284Vt;
    }

    /* renamed from: o.Wg$b */
    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("AudioSubtitlesHandlerInfraImpl");
        }
    }

    @Override // o.InterfaceC1288Vx
    public void a(final boolean z) {
        Map d;
        Map k;
        Throwable th;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(SignupConstants.Error.DEBUG_INFO_ACTION, z ? "On" : "Off");
        WL.d.e(this.d.g(), CommanderFlexEventType.H, linkedHashMap);
        if (((dpR) C9726vo.d(C1329Xm.c.a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.AudioSubtitlesHandlerInfraImpl$toggleTimedTextTrack$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                c(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void c(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1297Wg.c.getLogTag();
                C1297Wg.this.c();
                interfaceC1251Um.d(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), z);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: toggleTimedTextTrack can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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

    private final void c(final String str, final String str2) {
        Map d;
        Map k;
        Throwable th;
        if (((dpR) C9726vo.d(C1329Xm.c.a(), C1317Xa.e.d().b(), new drX<InterfaceC1251Um, VX, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.AudioSubtitlesHandlerInfraImpl$submitSelectedTrackData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VX vx) {
                c(interfaceC1251Um, vx);
                return dpR.c;
            }

            public final void c(InterfaceC1251Um interfaceC1251Um, VX vx) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vx, "");
                C1297Wg.c.getLogTag();
                interfaceC1251Um.c(new C1255Uq(vx.e().e(), vx.e().b(), vx.e().h(), vx.e().c(), DeviceType.a, vx.e().g(), vx.e().j(), false, 128, null), str, str2);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: setTracks can not be called", null, null, false, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b2);
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

    @Override // o.InterfaceC1288Vx
    public void a(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        c.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("audioTrackId", str);
        WL.d.e(this.d.g(), CommanderFlexEventType.b, linkedHashMap);
        c(str, str2);
    }

    @Override // o.InterfaceC1288Vx
    public void b(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        c.getLogTag();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timedTextTrackId", str2);
        WL.d.e(this.d.g(), CommanderFlexEventType.G, linkedHashMap);
        c(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        VO b2;
        c.getLogTag();
        VX b3 = C1317Xa.e.d().b();
        VO vo = (b3 == null || (b2 = b3.b()) == null) ? null : new VO(!b2.d(), b2.e(), b2.a(), b2.b(), b2.c());
        if (vo != null) {
            C1331Xo.b.b(vo);
        }
    }
}
