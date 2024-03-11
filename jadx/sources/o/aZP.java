package o;

import android.net.TrafficStats;
import com.netflix.mediaclient.service.net.probe.IpProbeOkHttp$probe$2;
import com.netflix.mediaclient.service.net.probe.IpProbeOkHttp$startProbe$1;
import com.netflix.mediaclient.service.user.UserAgent;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C7823dGr;
import o.C7826dGu;

/* loaded from: classes3.dex */
public final class aZP implements aZT {
    public static final c b = new c(null);
    private final UserAgent d;
    private final aOV e;

    private final void e(C7824dGs c7824dGs, String str) {
    }

    public aZP(UserAgent userAgent, aOV aov) {
        C8632dsu.c((Object) userAgent, "");
        C8632dsu.c((Object) aov, "");
        this.d = userAgent;
        this.e = aov;
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.aZT
    public void d() {
        if (!C8153dex.z()) {
            C1044Mm.j("IpProbe", "IP probing is NOT enabled, exit");
            return;
        }
        C1044Mm.e("IpProbe", "IP probing is enabled...");
        if (!this.d.v()) {
            C1044Mm.j("IpProbe", "User is NOT signed in, exit");
            return;
        }
        C8737dwr.c(dwY.c(GF.c()), new e(CoroutineExceptionHandler.Key), null, new IpProbeOkHttp$startProbe$1(this, null), 2, null);
    }

    /* loaded from: classes3.dex */
    public static final class e extends dqT implements CoroutineExceptionHandler {
        public e(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            C1044Mm.b("IpProbe", th, "Failed probe", new Object[0]);
        }
    }

    public final Object b(InterfaceC8585dra<? super dpR> interfaceC8585dra) {
        return C8738dws.c(GF.d(), new IpProbeOkHttp$probe$2(this, null), interfaceC8585dra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str, String str2, Inet4Address[] inet4AddressArr) {
        if (inet4AddressArr == null) {
            C1044Mm.j("IpProbe", "IPv4 address not available");
            return;
        }
        if (!(inet4AddressArr.length == 0)) {
            C1044Mm.e("IpProbe", "Execute IPv4 probe...");
            c(str, inet4AddressArr[0], str2, new d());
            return;
        }
        C1044Mm.j("IpProbe", "IPv4 address not available");
    }

    private final void c(String str, InetAddress inetAddress, String str2, InterfaceC7814dGi interfaceC7814dGi) {
        aZR azr = aZR.e;
        String e2 = azr.e(str, str2);
        C1044Mm.e("IpProbe", "doProbe: " + e2 + ", address " + inetAddress);
        C7823dGr b2 = new C7823dGr.b().b(interfaceC7814dGi).b();
        C7826dGu.b a2 = new C7826dGu.b().a(e2);
        for (Map.Entry<String, String> entry : azr.c(this.d, this.e).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C1044Mm.e("IpProbe", "Headers: " + ((Object) key) + "= " + ((Object) value));
            a2.e(entry.getKey(), entry.getValue());
        }
        C7826dGu a3 = a2.a();
        TrafficStats.setThreadStatsTag(42);
        C7824dGs e3 = b2.a(a3).e();
        try {
            e(e3, e2);
            dpR dpr = dpR.c;
            C8608drx.a(e3, null);
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str, String str2, Inet6Address[] inet6AddressArr) {
        if (inet6AddressArr == null) {
            C1044Mm.j("IpProbe", "IPv6 address not available");
            return;
        }
        if (!(inet6AddressArr.length == 0)) {
            C1044Mm.e("IpProbe", "Execute IPv6 probe...");
            c(str, inet6AddressArr[0], str2, new a());
            return;
        }
        C1044Mm.j("IpProbe", "IPv6 address not available");
    }

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC7814dGi {
        @Override // o.InterfaceC7814dGi
        public List<InetAddress> a(String str) {
            C8632dsu.c((Object) str, "");
            List<InetAddress> a = InterfaceC7814dGi.a.a(str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                if (Inet4Address.class.isInstance((InetAddress) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC7814dGi {
        @Override // o.InterfaceC7814dGi
        public List<InetAddress> a(String str) {
            C8632dsu.c((Object) str, "");
            List<InetAddress> a = InterfaceC7814dGi.a.a(str);
            ArrayList arrayList = new ArrayList();
            for (Object obj : a) {
                if (Inet6Address.class.isInstance((InetAddress) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }
}
