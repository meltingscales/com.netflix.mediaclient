package o;

import android.content.Context;
import android.media.UnsupportedSchemeException;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.EsnMigrationState;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Crypto;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import o.aPC;

/* loaded from: classes3.dex */
public final class aPB {
    private static aPC b;
    private static aPC c;
    private static aPC e;

    private aPB() {
    }

    public static void b(Context context, CryptoErrorManager cryptoErrorManager, aOV aov, aPC.e eVar) {
        synchronized (aPB.class) {
            if (c != null) {
                C1044Mm.d("nf_msl_crypto", "CryptoManagerRegistry::createCryptoInstance: CryptoManager can not be instantiated more than once!");
                return;
            }
            CryptoProvider J_ = aov.w().J_();
            int i = AnonymousClass1.e[J_.ordinal()];
            if (i == 1) {
                if (C8189dfg.d(context, aov.o())) {
                    C1044Mm.j("nf_msl_crypto", "Legacy crypto provider, unable to create Crypto, but Widevine was used before, we may be able to recover");
                    cryptoErrorManager.a(ErrorSource.msl, StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE, null);
                    eVar.d(InterfaceC1078Nw.aA);
                } else {
                    C1044Mm.j("nf_msl_crypto", "Legacy crypto provider, unable to create Crypto");
                    eVar.d(InterfaceC1078Nw.at);
                }
                return;
            }
            if (i == 2) {
                C1044Mm.e("nf_msl_crypto", "CryptoManagerRegistry::createCryptoInstance: create CryptoManager Widevine L1 starts...");
                aPN apn = new aPN(context, aov, eVar, cryptoErrorManager);
                c = apn;
                e = apn;
            } else if (i == 3) {
                C1044Mm.e("nf_msl_crypto", "CryptoManagerRegistry::createCryptoInstance: create CryptoManager Widevine L3 starts...");
                aPQ apq = new aPQ(context, aov, eVar, cryptoErrorManager);
                c = apq;
                b = apq;
            } else {
                C1044Mm.d("nf_msl_crypto", "Not supported crypto: " + J_);
                eVar.d(InterfaceC1078Nw.au);
                return;
            }
            c.o();
            C1044Mm.e("nf_msl_crypto", "CryptoManagerRegistry::createCryptoInstance: create CryptoManager done.");
        }
    }

    /* renamed from: o.aPB$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[CryptoProvider.values().length];
            e = iArr;
            try {
                iArr[CryptoProvider.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[CryptoProvider.WIDEVINE_L1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[CryptoProvider.WIDEVINE_L3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static aPC e() {
        aPC apc;
        synchronized (aPB.class) {
            apc = c;
        }
        return apc;
    }

    private static aPC.e b(final CryptoProvider cryptoProvider) {
        return new aPC.e() { // from class: o.aPB.3
            @Override // o.aPC.e
            public void a() {
            }

            @Override // o.aPC.e
            public void d() {
                C1044Mm.a("nf_msl_crypto", "Crypto menager for previous crypto %s ready", CryptoProvider.this);
            }

            @Override // o.aPC.e
            public void d(Status status) {
                C1044Mm.e("nf_msl_crypto", "Failed to initialize crypto menager for previous crypto %s, status %s", CryptoProvider.this, status);
                aPB.e = null;
                aPB.b = null;
            }
        };
    }

    public static void a(Context context, EsnMigrationState esnMigrationState, CryptoErrorManager cryptoErrorManager, aOV aov) {
        try {
            CryptoProvider cryptoProvider = esnMigrationState.n;
            if (cryptoProvider == CryptoProvider.WIDEVINE_L1) {
                a(context, cryptoErrorManager, aov);
            } else if (cryptoProvider != CryptoProvider.WIDEVINE_L3) {
                C1044Mm.e("nf_msl_crypto", "Crypto provider %s not supported, nothing to initialize", cryptoProvider);
            } else {
                d(context, cryptoErrorManager, aov);
            }
        } catch (UnsupportedSchemeException e2) {
            C1044Mm.b("nf_msl_crypto", e2, "Failed to initialize crypto manager for previous crypto to support esn migration", new Object[0]);
        }
    }

    private static void a(Context context, CryptoErrorManager cryptoErrorManager, aOV aov) {
        if (e != null) {
            C1044Mm.e("nf_msl_crypto", "Previous crypto provider was Widevine L1, already initiated.");
        } else if (!Config_FastProperty_Crypto.isEsnMigrationBetweenDifferentCryptoSecurityLevelsSupported()) {
            C1044Mm.j("nf_msl_crypto", "ESN migration between different crypto security levels is NOT supported, do NOT initialize second crypto provider");
        } else {
            C1044Mm.e("nf_msl_crypto", "Previous crypto provider was Widevine L1, current is different, create instance of Widevine L1 crypto manager.");
            aPN apn = new aPN(context, aov, b(CryptoProvider.WIDEVINE_L1), cryptoErrorManager);
            e = apn;
            apn.o();
        }
    }

    private static void d(Context context, CryptoErrorManager cryptoErrorManager, aOV aov) {
        if (b != null) {
            C1044Mm.e("nf_msl_crypto", "Previous crypto provider was Widevine L3, already initiated.");
        } else if (!Config_FastProperty_Crypto.isEsnMigrationBetweenDifferentCryptoSecurityLevelsSupported()) {
            C1044Mm.j("nf_msl_crypto", "ESN migration between different crypto security levels is NOT supported, do NOT initialize second crypto provider");
        } else {
            C1044Mm.e("nf_msl_crypto", "Previous crypto provider was Widevine L3, current is different, create instance of Widevine L3 crypto manager.");
            aPQ apq = new aPQ(context, aov, b(CryptoProvider.WIDEVINE_L3), cryptoErrorManager);
            b = apq;
            apq.o();
        }
    }

    public static aPC d(CryptoProvider cryptoProvider) {
        synchronized (aPB.class) {
            if (cryptoProvider == CryptoProvider.WIDEVINE_L1) {
                if (e != null) {
                    C1044Mm.e("nf_msl_crypto", "getCryptoManager:: for WidevineL1");
                    return e;
                }
                C1044Mm.j("nf_msl_crypto", "getCryptoManager asked for W1, return default");
                return c;
            } else if (cryptoProvider == CryptoProvider.WIDEVINE_L3) {
                if (b != null) {
                    C1044Mm.e("nf_msl_crypto", "getCryptoManager:: for WidevineL3");
                    return b;
                }
                C1044Mm.j("nf_msl_crypto", "getCryptoManager asked for W3, return default");
                return c;
            } else {
                throw new IllegalStateException("Legacy crypto provider is not supported");
            }
        }
    }
}
