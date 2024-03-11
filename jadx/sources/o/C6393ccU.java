package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;

/* renamed from: o.ccU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6393ccU implements InterfaceC6394ccV {
    private Status c;
    public static final b d = new b(null);
    public static final int b = 8;

    public static final C6393ccU c() {
        return d.a();
    }

    public final Status a() {
        return this.c;
    }

    @Override // o.InterfaceC6394ccV
    public boolean d(InterfaceC5125bsp interfaceC5125bsp, String str, int i, int i2, InterfaceC5094bsK interfaceC5094bsK) {
        C8632dsu.c((Object) interfaceC5125bsp, "");
        C8632dsu.c((Object) interfaceC5094bsK, "");
        return interfaceC5125bsp.b(str, i, i2, interfaceC5094bsK);
    }

    @Override // o.InterfaceC6394ccV
    public void d(InterfaceC5125bsp interfaceC5125bsp, String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) interfaceC5125bsp, "");
        C8632dsu.c((Object) str2, "");
        interfaceC5125bsp.c(str2, str, str3, str4);
    }

    @Override // o.InterfaceC6394ccV
    public boolean a(InterfaceC5125bsp interfaceC5125bsp, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC5094bsK interfaceC5094bsK) {
        C8632dsu.c((Object) interfaceC5125bsp, "");
        C8632dsu.c((Object) loMo, "");
        C8632dsu.c((Object) interfaceC5094bsK, "");
        return interfaceC5125bsp.b(loMo, i, i2, z, z2, interfaceC5094bsK);
    }

    @Override // o.InterfaceC6394ccV
    public int c(boolean z) {
        return C8153dex.e(z);
    }

    /* renamed from: o.ccU$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C6393ccU a() {
            return new C6393ccU();
        }
    }
}
