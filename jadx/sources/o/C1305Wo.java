package o;

import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.cdx.api.DeviceType;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import o.C1255Uq;
import o.C1305Wo;
import o.C8632dsu;
import o.InterfaceC1251Um;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.VZ;
import o.dpR;

@ActivityScoped
/* renamed from: o.Wo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1305Wo implements VG {
    public static final c c = new c(null);
    private final VB d;
    private final InterfaceC1284Vt e;

    @Inject
    public C1305Wo(InterfaceC1284Vt interfaceC1284Vt, VB vb) {
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) vb, "");
        this.e = interfaceC1284Vt;
        this.d = vb;
    }

    /* renamed from: o.Wo$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ProfileSwitchInfraImpl");
        }
    }

    @Override // o.VG
    public boolean d(VZ vz) {
        C8632dsu.c((Object) vz, "");
        UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
        InterfaceC5283bvo j = k != null ? k.j() : null;
        if (j == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C8632dsu.a(j, "");
        String profileGuid = j.getProfileGuid();
        C8632dsu.a(profileGuid, "");
        String g = vz.g();
        if ((profileGuid.length() <= 0 || g.length() <= 0 || !C8632dsu.c((Object) profileGuid, (Object) g)) && g.length() > 0) {
            this.d.c(vz, g, j);
            return true;
        }
        return false;
    }

    @Override // o.VG
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("targetProfileId", str);
        WL.d.e(this.e.g(), CommanderFlexEventType.B, linkedHashMap);
        this.d.a(str);
    }

    @Override // o.VG
    public VT b() {
        return C1317Xa.e.e();
    }

    @Override // o.VG
    public void a() {
        C1317Xa.e.d((VT) null);
    }

    @Override // o.VG
    public void d(VZ vz, final String str) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) vz, "");
        C8632dsu.c((Object) str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("controllerProfileId", str);
        WL.d.e(this.e.g(), CommanderFlexEventType.B, linkedHashMap);
        if (((dpR) C9726vo.d(C1329Xm.c.a(), vz, new drX<InterfaceC1251Um, VZ, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.ProfileSwitchInfraImpl$switchProfileOnTargetDevice$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC1251Um interfaceC1251Um, VZ vz2) {
                e(interfaceC1251Um, vz2);
                return dpR.c;
            }

            public final void e(InterfaceC1251Um interfaceC1251Um, VZ vz2) {
                C8632dsu.c((Object) interfaceC1251Um, "");
                C8632dsu.c((Object) vz2, "");
                C1305Wo.c.getLogTag();
                interfaceC1251Um.e(new C1255Uq(vz2.e(), vz2.b(), vz2.h(), vz2.c(), DeviceType.a, vz2.g(), vz2.j(), false, 128, null), str);
            }
        })) == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-37761: switchProfile can not be called", null, null, false, k, false, false, 96, null);
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
}
