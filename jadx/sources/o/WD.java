package o;

import com.netflix.mediaclient.cdx.api.event.type.LocationType;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import o.C1302Wl;

/* loaded from: classes3.dex */
public final class WD implements UJ {
    public static final a e = new a(null);

    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LocationType.values().length];
            try {
                iArr[LocationType.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationType.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationType.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocationType.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocationType.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocationType.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("LocationEventCallbackImpl");
        }
    }

    @Override // o.UJ
    public void d(UY uy) {
        C8632dsu.c((Object) uy, "");
        LocationType a2 = uy.a();
        e.getLogTag();
        e(a2, uy);
    }

    private final void e(LocationType locationType, UY uy) {
        a aVar = e;
        aVar.getLogTag();
        int i = b.b[locationType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C1320Xd.c.b().d(null);
            a();
            C1317Xa c1317Xa = C1317Xa.e;
            InterfaceC8812dzl<VX> d = c1317Xa.d();
            VX b2 = c1317Xa.d().b();
            d.d(b2 != null ? VX.e(b2, null, TargetDeviceUiState.a, null, null, null, null, null, 125, null) : null);
            C1331Xo.b.c();
        } else if (i != 4) {
            if (i != 5) {
                return;
            }
            aVar.getLogTag();
            C1317Xa c1317Xa2 = C1317Xa.e;
            InterfaceC8812dzl<VX> d2 = c1317Xa2.d();
            VX b3 = c1317Xa2.d().b();
            d2.d(b3 != null ? VX.e(b3, null, TargetDeviceUiState.e, null, null, null, null, null, 125, null) : null);
            C1331Xo.b.c();
        } else {
            C1329Xm.c.h();
            C1320Xd.c.b().d(uy.d());
            aVar.getLogTag();
            C1317Xa c1317Xa3 = C1317Xa.e;
            InterfaceC8812dzl<VX> d3 = c1317Xa3.d();
            VX b4 = c1317Xa3.d().b();
            d3.d(b4 != null ? VX.e(b4, null, TargetDeviceUiState.d, null, null, null, null, null, 125, null) : null);
            C1331Xo.b.j();
        }
    }

    private final void a() {
        e.getLogTag();
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d = c1317Xa.d();
        VX b2 = c1317Xa.d().b();
        d.d(b2 != null ? VX.e(b2, null, null, null, null, null, null, null, 3, null) : null);
        c1317Xa.d((C1302Wl.d) null);
    }
}
