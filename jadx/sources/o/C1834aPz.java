package o;

import android.content.Context;
import com.netflix.cl.Logger;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.esn.WidevineL1NotSupportedWhenExpectedException;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_WidevineFailureHandling;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.aPz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1834aPz {
    private static CryptoProvider b;
    private static Boolean d;
    private static CryptoProvider e;
    private static String h;
    public static final C1834aPz a = new C1834aPz();
    private static String c = "nf_msl_CryptoProviderFactory";

    public final CryptoProvider a() {
        return e;
    }

    public final CryptoProvider b() {
        return b;
    }

    public final String c() {
        return h;
    }

    private C1834aPz() {
    }

    static {
        String name;
        Context d2 = AbstractApplicationC1040Mh.d();
        h = C8157dfA.e(d2, "nf_drm_system_id", (String) null);
        b = CryptoProvider.b(C8157dfA.e(d2, "nf_drm_crypto_provider", (String) null));
        String str = c;
        Object[] objArr = new Object[2];
        CryptoProvider cryptoProvider = e;
        String str2 = "N/A";
        objArr[0] = (cryptoProvider == null || (r2 = cryptoProvider.name()) == null) ? "N/A" : "N/A";
        CryptoProvider cryptoProvider2 = b;
        if (cryptoProvider2 != null && (name = cryptoProvider2.name()) != null) {
            str2 = name;
        }
        objArr[1] = str2;
        C1044Mm.a(str, "currentDrmSystem: %s, previousDrmSystem: %s", objArr);
    }

    public final CryptoProvider c(Context context, aPY apy) {
        CryptoProvider cryptoProvider;
        synchronized (this) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) apy, "");
            if (e == null) {
                e = e(context, apy);
            }
            cryptoProvider = e;
            C8632dsu.d(cryptoProvider);
        }
        return cryptoProvider;
    }

    private final CryptoProvider e(Context context, aPY apy) {
        Throwable th;
        CryptoProvider cryptoProvider;
        synchronized (this) {
            if (apy.e()) {
                C1044Mm.e(c, "Widevine L1 is enabled, check if we failed before");
                if (e(context)) {
                    C1044Mm.j(c, "Widevine L1 was in approved list, but it failed on this device, see fallback option.");
                } else {
                    C1044Mm.e(c, "Widevine L1 did not failed on this device and L1 was in approved list, check if device really supports L1.");
                    C1842aQg c1842aQg = C1842aQg.a;
                    if (c1842aQg.f()) {
                        if (c(apy)) {
                            C1044Mm.e(c, "getCryptoProvider:Widevine L3 will be used, keeping on already used Widevine L3.");
                            cryptoProvider = CryptoProvider.WIDEVINE_L3;
                        } else {
                            C1044Mm.e(c, "getCryptoProvider:Widevine L1 will be used");
                            cryptoProvider = CryptoProvider.WIDEVINE_L1;
                        }
                        return cryptoProvider;
                    } else if (c(apy)) {
                        C1044Mm.e(c, "getCryptoProvider: device is Widevine L1 approved, but reports no Widevine L1. Widevine L3 will be used, keeping on already used Widevine L3.");
                        return CryptoProvider.WIDEVINE_L3;
                    } else {
                        e();
                        C1044Mm.j(c, "getCryptoProvider:Widevine L1 is not supported on device or it has problem in playback, go for fallback");
                        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                        C1596aHd d2 = new C1596aHd("Falling to L3 when device should support L1", null, null, false, null, false, false, 126, null).b(false).b(ErrorType.w).d(c1842aQg.a());
                        String i = c1842aQg.i();
                        if (i == null) {
                            i = "";
                        }
                        C1596aHd e2 = d2.e("securityLevelRaw", i);
                        ErrorType errorType = e2.a;
                        if (errorType != null) {
                            e2.e.put("errorType", errorType.c());
                            String b2 = e2.b();
                            if (b2 != null) {
                                String c2 = errorType.c();
                                e2.a(c2 + " " + b2);
                            }
                        }
                        if (e2.b() != null && e2.i != null) {
                            th = new Throwable(e2.b(), e2.i);
                        } else if (e2.b() != null) {
                            th = new Throwable(e2.b());
                        } else {
                            th = e2.i;
                            if (th == null) {
                                th = new Throwable("Handled exception with no message");
                            } else if (th == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        }
                        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                        InterfaceC1598aHf a2 = dVar.a();
                        if (a2 != null) {
                            a2.e(e2, th);
                        } else {
                            dVar.e().b(e2, th);
                        }
                    }
                }
            } else {
                C1044Mm.j(c, "Widevine L1 is NOT enabled, see fallback option.");
            }
            if (b(context)) {
                C1044Mm.j(c, "Widevine L3 failed on this device, fallback to legacy, report an error.");
            } else if (e(apy)) {
                C1044Mm.e(c, "getCryptoProvider: Widevine L3");
                return CryptoProvider.WIDEVINE_L3;
            } else {
                C1044Mm.e(c, "getCryptoProvider: use legacy crypto because KK device can not support L3!");
            }
            return CryptoProvider.LEGACY;
        }
    }

    private final boolean e(Context context) {
        return C8157dfA.b(context, "disable_widevine", false);
    }

    private final boolean b(Context context) {
        return C8157dfA.b(context, "nf_disable_widevine_l3_v3", false);
    }

    private final void e() {
        Map d2;
        Map k;
        Throwable th;
        boolean j = AbstractApplicationC1040Mh.getInstance().o().j();
        C1044Mm.a(c, "App started by user: %b", Boolean.valueOf(!j));
        if (j) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("Background launch:: Widevine L1 not supported by device even if it should be!", null, null, true, k, false, false, 96, null);
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
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            Logger.INSTANCE.flush();
            if (Config_FastProperty_WidevineFailureHandling.Companion.c()) {
                throw new WidevineL1NotSupportedWhenExpectedException();
            }
        }
    }

    private final boolean e(aPY apy) {
        String h2 = C1842aQg.a.h();
        C1044Mm.a(c, "MediaDrm system ID is: %s", h2);
        if (C8168dfL.g(h2)) {
            return false;
        }
        if (C8632dsu.c((Object) "4266", (Object) h2)) {
            C1044Mm.j(c, "Device is using Widevine L3 4266! Valid %b per config", Boolean.valueOf(apy.b()));
            apy.b();
        }
        if (d()) {
            C1044Mm.j(c, "System ID is one used to trigger Widevine recovery workflow for Widevine v16. Treat it as valid.");
            return true;
        }
        int length = h2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = C8632dsu.d(h2.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (h2.subSequence(i, length + 1).toString().length() > 5) {
            return false;
        }
        C1044Mm.e(c, "Valid System ID.");
        return true;
    }

    public final boolean c(aPY apy) {
        synchronized (this) {
            C8632dsu.c((Object) apy, "");
            Boolean bool = d;
            if (bool != null) {
                C1044Mm.j(c, "shouldKeepDeviceOnWidevineL3:: keepDeviceOnWidevineL3 %b", bool);
                Boolean bool2 = d;
                C8632dsu.d(bool2);
                return bool2.booleanValue();
            }
            C1044Mm.j(c, "shouldKeepDeviceOnWidevineL3:: keepDeviceOnWidevineL3 null");
            boolean z = true;
            if (!apy.e()) {
                C1044Mm.j(c, "Device should be on L3, we should not end here");
                d = Boolean.TRUE;
                return true;
            } else if (C8159dfC.i()) {
                C1044Mm.j(c, "Device is updated from stub, we do not need to keep it on L3");
                d = Boolean.FALSE;
                return false;
            } else {
                boolean b2 = b(apy);
                if (b != CryptoProvider.WIDEVINE_L3) {
                    String str = c;
                    Object[] objArr = new Object[1];
                    CryptoProvider cryptoProvider = b;
                    objArr[0] = (cryptoProvider == null || (r1 = cryptoProvider.name()) == null) ? "" : "";
                    C1044Mm.a(str, "Previous crypto was %s, by configuration L1 is enabled, go for L1.", objArr);
                    d = Boolean.FALSE;
                    return false;
                }
                if (b2) {
                    C1044Mm.j(c, "Previous crypto was L3, by configuration L1 is enabled, exception was granted to return device to L1.");
                    d = Boolean.FALSE;
                    C8157dfA.d(AbstractApplicationC1040Mh.d(), "pref_wl1_exception", true);
                    z = false;
                } else {
                    C1044Mm.e(c, "Previous crypto was L3, by configuration L1 is enabled, keep L3.");
                    d = Boolean.TRUE;
                }
                return z;
            }
        }
    }

    private final boolean b(aPY apy) {
        return new aPP(apy).d();
    }

    private final boolean d() {
        return new aPW().c();
    }
}
