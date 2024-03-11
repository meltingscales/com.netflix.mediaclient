package o;

import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionType;
import o.C1302Wl;

/* renamed from: o.Xa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1317Xa {
    private static C1302Wl.d a;
    private static VT c;
    private static String f;
    public static final C1317Xa e = new C1317Xa();
    private static final InterfaceC8812dzl<VX> h = dzB.d(null);
    private static final InterfaceC8812dzl<ConnectionState> b = dzB.d(ConnectionState.i);
    private static final InterfaceC8812dzl<ConnectionType> d = dzB.d(null);

    public final InterfaceC8812dzl<ConnectionType> a() {
        return d;
    }

    public final C1302Wl.d b() {
        return a;
    }

    public final InterfaceC8812dzl<ConnectionState> c() {
        return b;
    }

    public final void c(String str) {
        f = str;
    }

    public final InterfaceC8812dzl<VX> d() {
        return h;
    }

    public final void d(VT vt) {
        c = vt;
    }

    public final void d(C1302Wl.d dVar) {
        a = dVar;
    }

    public final VT e() {
        return c;
    }

    public final String i() {
        return f;
    }

    private C1317Xa() {
    }
}
