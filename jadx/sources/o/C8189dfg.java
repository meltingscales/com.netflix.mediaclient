package o;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.drm.NetflixMediaDrmFactory;
import com.netflix.mediaclient.drm.PlatformMediaDrm;
import com.netflix.mediaclient.service.configuration.MediaDrmConsumer;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.crypto.WidevineL1ForcedFallbackReason;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.dfg  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8189dfg {
    public static final UUID d = NetflixMediaDrm.WIDEVINE_SCHEME;
    public static final AtomicBoolean e = new AtomicBoolean();

    public static void b(String str, NetflixMediaDrm netflixMediaDrm, byte[] bArr) {
    }

    public static int e() {
        C1842aQg c1842aQg = C1842aQg.a;
        if (c1842aQg.k()) {
            if (c1842aQg.f()) {
                return CryptoProvider.WIDEVINE_L1.d;
            }
            return CryptoProvider.WIDEVINE_L3.d;
        }
        return CryptoProvider.LEGACY.d;
    }

    private static void b(NetflixMediaDrm netflixMediaDrm) {
        if (aPB.e().l() == CryptoProvider.WIDEVINE_L3) {
            d(netflixMediaDrm);
        }
    }

    public static void d(NetflixMediaDrm netflixMediaDrm) {
        C1044Mm.e("MediaDrmUtils", "Forcing L3 security level...");
        C1842aQg.a.e(netflixMediaDrm);
    }

    private static void c(NetflixMediaDrm netflixMediaDrm) {
        try {
            netflixMediaDrm.setPropertyString(NetflixMediaDrm.PROPERTY_APP_ID, AbstractApplicationC1040Mh.getInstance().getPackageName());
        } catch (Exception e2) {
            C1044Mm.e("WidevineMediaDrm", "ignore exceptions", e2);
        }
    }

    public static NetflixMediaDrm d(MediaDrmConsumer mediaDrmConsumer, NetflixMediaDrm.OnEventListener onEventListener) {
        if (mediaDrmConsumer.equals(MediaDrmConsumer.OFFLINE)) {
            e.set(true);
        }
        return e(onEventListener);
    }

    public static NetflixMediaDrm e(MediaDrmConsumer mediaDrmConsumer, NetflixMediaDrm.OnEventListener onEventListener, Long l) {
        if (mediaDrmConsumer.equals(MediaDrmConsumer.OFFLINE)) {
            e.set(true);
        }
        return e(onEventListener);
    }

    public static NetflixMediaDrm e(NetflixMediaDrm.OnEventListener onEventListener) {
        PlatformMediaDrm createPlatformMediaDrm = NetflixMediaDrmFactory.createPlatformMediaDrm(d);
        if (onEventListener != null) {
            createPlatformMediaDrm.setOnEventListener(onEventListener);
        }
        b(createPlatformMediaDrm);
        c(createPlatformMediaDrm);
        return createPlatformMediaDrm;
    }

    public static String b(byte[] bArr) {
        return bArr == null ? "[null]" : bArr.length < 1 ? "[empty]" : Base64.encodeToString(bArr, 2);
    }

    public static boolean b() {
        return C1842aQg.a.f();
    }

    public static void b(Context context) {
        C8157dfA.e(context, "disable_widevine");
        C8157dfA.e(context, "nf_disable_widevine_l3_v3");
    }

    public static boolean d(Context context, aPY apy) {
        if (apy.e()) {
            return true;
        }
        return e(context);
    }

    private static boolean e(Context context) {
        if (C8168dfL.h(C8157dfA.e(context, "nf_drm_acckeymap", (String) null))) {
            return true;
        }
        return C8168dfL.h(C8157dfA.e(context, "nf_msl_store_json", (String) null));
    }

    public static boolean d() {
        if (C1834aPz.a.a() == CryptoProvider.LEGACY && C4466bez.b()) {
            return C8054ddD.o();
        }
        return false;
    }

    public static void a(Status status, ErrorSource errorSource) {
        if (status == InterfaceC1078Nw.h && C4466bez.b() && C8054ddD.o()) {
            CryptoErrorManager cryptoErrorManager = (CryptoErrorManager) C1332Xp.b(CryptoErrorManager.class);
            if (C1834aPz.a.a() == CryptoProvider.WIDEVINE_L1) {
                cryptoErrorManager.a(errorSource, StatusCode.WIDEVINE_L1_FAILURE_OS_UPGRADE, null);
            } else {
                cryptoErrorManager.a(errorSource, StatusCode.WIDEVINE_L3_FAILURE_OS_UPGRADE, null);
            }
        }
    }

    public static boolean a() {
        C1842aQg c1842aQg = C1842aQg.a;
        if (c1842aQg.k()) {
            return false;
        }
        if (NetflixMediaDrm.SYSTEM_ID_FAILURE_TO_RETRIEVE.equals(c1842aQg.h()) || "SECURITY_LEVEL_GET_FAILURE".equals(c1842aQg.j())) {
            C1044Mm.j("MediaDrmUtils", "isPluginInBadState:: we failed to retrieve property, plugin is in bad state.");
            return true;
        }
        C1044Mm.e("MediaDrmUtils", "Widevine is not supported.");
        return false;
    }

    public static String c() {
        NetflixMediaDrm netflixMediaDrm;
        byte[] bArr;
        String str = null;
        try {
            netflixMediaDrm = e((NetflixMediaDrm.OnEventListener) null);
            try {
                bArr = netflixMediaDrm.openSession(NetflixMediaDrm.SessionType.STREAMING);
            } catch (Throwable th) {
                th = th;
                bArr = null;
            }
            try {
                str = b(netflixMediaDrm.getKeyRequest(bArr, aPC.n, "", 1, null).getData());
                if (bArr != null) {
                    try {
                        netflixMediaDrm.closeSession(bArr);
                    } catch (Throwable th2) {
                        C1044Mm.b("MediaDrmUtils", th2, "Failed to close opened crypto session!", new Object[0]);
                    }
                }
                try {
                    netflixMediaDrm.close();
                } catch (Throwable th3) {
                    C1044Mm.b("MediaDrmUtils", th3, "Failed to close MediaDrm. It should NOT happen.", new Object[0]);
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    C1044Mm.b("MediaDrmUtils", th, "Failed to get CAD challenge", new Object[0]);
                    if (netflixMediaDrm != null) {
                        if (bArr != null) {
                            try {
                                netflixMediaDrm.closeSession(bArr);
                            } catch (Throwable th5) {
                                C1044Mm.b("MediaDrmUtils", th5, "Failed to close opened crypto session!", new Object[0]);
                            }
                        }
                        try {
                            netflixMediaDrm.close();
                        } catch (Throwable th6) {
                            C1044Mm.b("MediaDrmUtils", th6, "Failed to close MediaDrm. It should NOT happen.", new Object[0]);
                        }
                    }
                    return str;
                } catch (Throwable th7) {
                    if (netflixMediaDrm != null) {
                        if (bArr != null) {
                            try {
                                netflixMediaDrm.closeSession(bArr);
                            } catch (Throwable th8) {
                                C1044Mm.b("MediaDrmUtils", th8, "Failed to close opened crypto session!", new Object[0]);
                            }
                        }
                        try {
                            netflixMediaDrm.close();
                        } catch (Throwable th9) {
                            C1044Mm.b("MediaDrmUtils", th9, "Failed to close MediaDrm. It should NOT happen.", new Object[0]);
                        }
                    }
                    throw th7;
                }
            }
        } catch (Throwable th10) {
            th = th10;
            netflixMediaDrm = null;
            bArr = null;
        }
        return str;
    }

    public static boolean e(String str, IPlayer.PlaybackType playbackType, aOV aov) {
        return c(aov);
    }

    public static boolean c(aOV aov) {
        return aov.w().J_() == CryptoProvider.WIDEVINE_L1;
    }

    public static void a(WidevineL1ForcedFallbackReason widevineL1ForcedFallbackReason) {
        C8157dfA.d(AbstractApplicationC1040Mh.d(), "disable_widevine", true);
        C8157dfA.a(AbstractApplicationC1040Mh.d(), "disable_widevine_l1_reason", widevineL1ForcedFallbackReason.name());
    }

    public static void e(CryptoErrorManager.CryptoFailbackCause cryptoFailbackCause) {
        if (cryptoFailbackCause == CryptoErrorManager.CryptoFailbackCause.BLACKLISTED) {
            a(WidevineL1ForcedFallbackReason.TO_L3_AFTER_BLACKLISTED);
        } else if (cryptoFailbackCause == CryptoErrorManager.CryptoFailbackCause.WORKFLOW) {
            a(WidevineL1ForcedFallbackReason.TO_L3_AFTER_WORKFLOW);
        }
    }

    public static void e(Context context, String str) {
        C8157dfA.a(context, "nf_drm_esn", str);
    }
}
