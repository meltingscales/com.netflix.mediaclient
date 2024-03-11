package o;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Build;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.crypto.WidevineL1ForcedFallbackReason;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aQf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1841aQf {
    public static final e d = new e(null);
    private final CryptoProvider a;
    private NetflixMediaDrm b;
    private final CryptoErrorManager c;
    private final aPR e;
    private final AtomicBoolean f;
    private AtomicInteger h;
    private int j;

    /* renamed from: o.aQf$a */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CryptoProvider.values().length];
            try {
                iArr[CryptoProvider.WIDEVINE_L1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoProvider.WIDEVINE_L3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    public final aPR a() {
        return this.e;
    }

    public final NetflixMediaDrm b() {
        return this.b;
    }

    public C1841aQf(NetflixMediaDrm netflixMediaDrm, CryptoProvider cryptoProvider, CryptoErrorManager cryptoErrorManager, aPR apr) {
        C8632dsu.c((Object) netflixMediaDrm, "");
        C8632dsu.c((Object) cryptoProvider, "");
        C8632dsu.c((Object) cryptoErrorManager, "");
        C8632dsu.c((Object) apr, "");
        this.b = netflixMediaDrm;
        this.a = cryptoProvider;
        this.c = cryptoErrorManager;
        this.e = apr;
        this.f = new AtomicBoolean(false);
    }

    /* renamed from: o.aQf$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    private final void b(NotProvisionedException notProvisionedException) {
        C1044Mm.b("WidevineProvisioningProvider", notProvisionedException, "Device is not provisioned, start provisioning workflow!", new Object[0]);
        try {
            g();
        } catch (Throwable th) {
            C1044Mm.b("WidevineProvisioningProvider", th, "Fatal error, can not recover on start provisioning!!", new Object[0]);
            aPR apr = this.e;
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.i;
            C8632dsu.a(netflixImmutableStatus, "");
            apr.c(netflixImmutableStatus);
        }
    }

    private final void a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            this.b.closeSession(bArr);
        } catch (Throwable th) {
            C1044Mm.b("WidevineProvisioningProvider", th, "Failed to close test session!", new Object[0]);
        }
    }

    private final boolean b(Throwable th) {
        NetflixMediaDrm c2 = this.e.c(th, this.a);
        if (c2 != null) {
            this.b = c2;
            return true;
        }
        return false;
    }

    private final void g() {
        NetflixMediaDrm.ProvisionRequest provisionRequest;
        synchronized (this.f) {
            this.f.set(false);
            dpR dpr = dpR.c;
        }
        try {
            provisionRequest = this.b.getProvisionRequest();
        } catch (Throwable th) {
            if (b(th)) {
                provisionRequest = this.b.getProvisionRequest();
            } else {
                throw th;
            }
        }
        C8632dsu.d(provisionRequest);
        aPS.c(provisionRequest, new c(provisionRequest.getDefaultUrl())).execute(new Void[0]);
    }

    /* renamed from: o.aQf$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC1836aQa {
        final /* synthetic */ String d;

        c(String str) {
            this.d = str;
        }

        @Override // o.InterfaceC1836aQa
        public void a(byte[] bArr) {
            Map d;
            Map k;
            Throwable th;
            Map d2;
            Map k2;
            Throwable th2;
            Map d3;
            Map k3;
            Throwable th3;
            String str = Build.DISPLAY;
            if (bArr != null) {
                try {
                    C1841aQf.this.b().provideProvisionResponse(bArr);
                    C1841aQf.this.f();
                    return;
                } catch (DeniedByServerException e) {
                    C1044Mm.b("WidevineProvisioningProvider", e, "Server declined Widevine provisioning request. Server URL: " + this.d, new Object[0]);
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    String str2 = "Server declined Widevine provisioning request. Server URL: " + this.d + ". Build: " + str;
                    d3 = dqE.d();
                    k3 = dqE.k(d3);
                    C1596aHd c1596aHd = new C1596aHd(str2, e, null, true, k3, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b = c1596aHd.b();
                        if (b != null) {
                            c1596aHd.a(errorType.c() + " " + b);
                        }
                    }
                    if (c1596aHd.b() != null && c1596aHd.i != null) {
                        th3 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th3 = new Throwable(c1596aHd.b());
                    } else {
                        th3 = c1596aHd.i;
                        if (th3 == null) {
                            th3 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th3);
                    } else {
                        dVar.e().b(c1596aHd, th3);
                    }
                    aPR a2 = C1841aQf.this.a();
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.p;
                    C8632dsu.a(netflixImmutableStatus, "");
                    a2.c(netflixImmutableStatus);
                    return;
                } catch (Throwable th4) {
                    C1044Mm.b("WidevineProvisioningProvider", th4, "Fatal error on set Widevine provisioning response", new Object[0]);
                    InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                    String str3 = "Fatal error on set Widevine provisioning response received from URL: " + this.d + ". Build: " + str;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd2 = new C1596aHd(str3, th4, null, true, k2, false, false, 96, null);
                    ErrorType errorType2 = c1596aHd2.a;
                    if (errorType2 != null) {
                        c1596aHd2.e.put("errorType", errorType2.c());
                        String b2 = c1596aHd2.b();
                        if (b2 != null) {
                            c1596aHd2.a(errorType2.c() + " " + b2);
                        }
                    }
                    if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                        th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                    } else if (c1596aHd2.b() != null) {
                        th2 = new Throwable(c1596aHd2.b());
                    } else {
                        th2 = c1596aHd2.i;
                        if (th2 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    }
                    InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a3 = dVar2.a();
                    if (a3 != null) {
                        a3.e(c1596aHd2, th2);
                    } else {
                        dVar2.e().b(c1596aHd2, th2);
                    }
                    aPR a4 = C1841aQf.this.a();
                    NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.i;
                    C8632dsu.a(netflixImmutableStatus2, "");
                    a4.c(netflixImmutableStatus2);
                    return;
                }
            }
            C1044Mm.d("WidevineProvisioningProvider", "Failed to get provisioning certificate");
            InterfaceC1598aHf.c cVar3 = InterfaceC1598aHf.a;
            String str4 = "Failed to get provisioning certificate. Response is null from URL " + this.d;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd3 = new C1596aHd(str4, null, null, true, k, false, false, 96, null);
            ErrorType errorType3 = c1596aHd3.a;
            if (errorType3 != null) {
                c1596aHd3.e.put("errorType", errorType3.c());
                String b3 = c1596aHd3.b();
                if (b3 != null) {
                    c1596aHd3.a(errorType3.c() + " " + b3);
                }
            }
            if (c1596aHd3.b() != null && c1596aHd3.i != null) {
                th = new Throwable(c1596aHd3.b(), c1596aHd3.i);
            } else if (c1596aHd3.b() != null) {
                th = new Throwable(c1596aHd3.b());
            } else {
                th = c1596aHd3.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a5 = dVar3.a();
            if (a5 != null) {
                a5.e(c1596aHd3, th);
            } else {
                dVar3.e().b(c1596aHd3, th);
            }
            aPR a6 = C1841aQf.this.a();
            NetflixImmutableStatus netflixImmutableStatus3 = InterfaceC1078Nw.f13379o;
            C8632dsu.a(netflixImmutableStatus3, "");
            a6.c(netflixImmutableStatus3);
        }

        @Override // o.InterfaceC1836aQa
        public void a(int i) {
            C1044Mm.d("WidevineProvisioningProvider", "Blacklisted Widevine plugin? Do NOT use it!");
            C1841aQf c1841aQf = C1841aQf.this;
            String str = this.d;
            C8632dsu.a(str, "");
            c1841aQf.d(str);
            aPR a = C1841aQf.this.a();
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.t;
            C8632dsu.a(netflixImmutableStatus, "");
            a.c(netflixImmutableStatus);
        }
    }

    public final void e() {
        boolean z;
        byte[] bArr = null;
        try {
            try {
                bArr = this.b.openSession(NetflixMediaDrm.SessionType.OFFLINE);
                try {
                    this.b.getKeyRequest(bArr, aPC.n, "application/xml", 2, new HashMap<>());
                    this.b.closeSession(bArr);
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (z) {
                        this.c.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST, th);
                    }
                    a(bArr);
                    if (!a(th)) {
                        return;
                    }
                    C1044Mm.e("WidevineProvisioningProvider", "checkIfDeviceIsProvisioned:: Widevine is provisioned. Ready!");
                    c();
                    this.e.c();
                }
            } catch (NotProvisionedException e2) {
                a((byte[]) null);
                b(e2);
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        C1044Mm.e("WidevineProvisioningProvider", "checkIfDeviceIsProvisioned:: Widevine is provisioned. Ready!");
        c();
        this.e.c();
    }

    private final void c() {
        if (this.j > 1) {
            C1044Mm.e("WidevineProvisioningProvider", "Need to refresh Widevine metadata since System ID may be incorrect");
            C1842aQg.a.c();
        }
    }

    private final boolean a(Throwable th) {
        boolean z;
        if (b(th)) {
            byte[] bArr = null;
            try {
                bArr = this.b.openSession(NetflixMediaDrm.SessionType.OFFLINE);
                z = true;
                try {
                    this.b.getKeyRequest(bArr, aPC.n, "application/xml", 2, new HashMap<>());
                    this.b.closeSession(bArr);
                    C1044Mm.e("WidevineProvisioningProvider", "shouldProceedOnGenericError:: able to recover, proceed with init and report that crypto manager is ready.");
                    return true;
                } catch (Throwable unused) {
                    if (z) {
                        this.c.a(ErrorSource.msl, StatusCode.DRM_FAILURE_MEDIADRM_GET_KEY_REQUEST, th);
                    }
                    a(bArr);
                    C1044Mm.b("WidevineProvisioningProvider", th, "Fatal error, can not recover!", new Object[0]);
                    aPR apr = this.e;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.k;
                    C8632dsu.a(netflixImmutableStatus, "");
                    apr.c(netflixImmutableStatus);
                    return false;
                }
            } catch (Throwable unused2) {
                z = false;
            }
        } else {
            C1044Mm.b("WidevineProvisioningProvider", th, "Fatal error, can not recover!", new Object[0]);
            aPR apr2 = this.e;
            NetflixImmutableStatus netflixImmutableStatus2 = InterfaceC1078Nw.k;
            C8632dsu.a(netflixImmutableStatus2, "");
            apr2.c(netflixImmutableStatus2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(String str) {
        Map d2;
        Map k;
        Throwable th;
        Map d3;
        Map k2;
        Throwable th2;
        int i = a.b[this.a.ordinal()];
        if (i == 1) {
            C1044Mm.e("WidevineProvisioningProvider", "MediaDrm failed for Widevine L1, fail back to Widevine L3");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("WIDEVINE_FORCED_FALLBACK_TO_L3_15002. Provisioning failed with status code 400 " + str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
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
            C8189dfg.a(WidevineL1ForcedFallbackReason.TO_L3_15002);
        } else if (i == 2) {
            C1044Mm.e("WidevineProvisioningProvider", "MediaDrm failed for Widevine L3, should fail back to legacy crypto scheme if that was possible, but it is not.");
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d3 = dqE.d();
            k2 = dqE.k(d3);
            C1596aHd c1596aHd2 = new C1596aHd("WIDEVINE_FALLBACK_TO_LEGACY: 15002. Provisioning failed with status code 400 " + str, null, null, true, k2, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b2 = c1596aHd2.b();
                if (b2 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b2);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th2 = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th2 = new Throwable(c1596aHd2.b());
            } else {
                th2 = c1596aHd2.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1598aHf a3 = dVar2.a();
            if (a3 != null) {
                a3.e(c1596aHd2, th2);
            } else {
                dVar2.e().b(c1596aHd2, th2);
            }
        } else {
            C1044Mm.d("WidevineProvisioningProvider", "Crypto provider was not supported for this error " + this.a);
        }
    }

    private final int j() {
        if (this.h == null) {
            this.h = new AtomicInteger(d());
        }
        AtomicInteger atomicInteger = this.h;
        C8632dsu.d(atomicInteger);
        return atomicInteger.get();
    }

    private final int d() {
        int a2 = Config_FastProperty_Crypto.Companion.a();
        if (a2 > 0) {
            C1044Mm.e("WidevineProvisioningProvider", "Maximal number of provisioning request allowed " + a2);
            return a2;
        }
        C1044Mm.j("WidevineProvisioningProvider", "Maximal number of provisioning request allowed " + a2 + " is invalid, using default 2");
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        int i = this.j + 1;
        this.j = i;
        if (i < j()) {
            int i2 = this.j;
            C1044Mm.e("WidevineProvisioningProvider", "Check if we need to provision again (v16 use case) iteration: " + i2 + "...");
            e();
            return;
        }
        C1044Mm.e("WidevineProvisioningProvider", "Device is provisioned, report success.");
        this.e.c();
    }
}
