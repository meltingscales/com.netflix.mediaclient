package com.netflix.mediaclient.net;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.net.PlayServicesCronetProvider;
import dagger.hilt.EntryPoints;
import o.C1044Mm;
import o.InterfaceC1597aHe;
import o.aHX;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.impl.ImplVersion;
import org.chromium.net.impl.NativeCronetProvider;

@Keep
/* loaded from: classes3.dex */
public class NetflixCronetProvider extends CronetProvider {
    private static final String TAG = "NetflixCronetProvider";
    private static boolean nativeCrash;
    @SuppressLint({"StaticFieldLeak"})
    private static CronetProvider sProvider;

    /* loaded from: classes3.dex */
    public enum PreferredCronetProvider {
        NATIVE,
        PLAY_SERVICES
    }

    public static boolean isNativeCrash() {
        return nativeCrash;
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return TAG;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        return "9999.0.0.0";
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    public NetflixCronetProvider(Context context) {
        super(context.getApplicationContext());
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        return getProvider(this.mContext).createBuilder();
    }

    public static CronetProvider getProvider(Context context) {
        CronetProvider cronetProvider;
        synchronized (NetflixCronetProvider.class) {
            if (sProvider == null) {
                for (PreferredCronetProvider preferredCronetProvider : ((aHX) EntryPoints.get(context, aHX.class)).as()) {
                    try {
                        int i = AnonymousClass1.e[preferredCronetProvider.ordinal()];
                        if (i == 1) {
                            sProvider = new NativeCronetProvider(context);
                            System.loadLibrary("cronet." + ImplVersion.getCronetVersion());
                            nativeCrash = false;
                        } else if (i == 2 && CronetProviderInstaller.isInstalled()) {
                            sProvider = new PlayServicesCronetProvider(context);
                        }
                    } catch (UnsatisfiedLinkError e) {
                        InterfaceC1597aHe.c("SPY-35111 - UnsatisfiedLinkError for cronet", e);
                        nativeCrash = true;
                    }
                }
                CronetProvider cronetProvider2 = sProvider;
                if (cronetProvider2 == null) {
                    C1044Mm.d(TAG, "Unable to create Cronet Builder");
                    if (0 != 0) {
                        throw null;
                    }
                } else {
                    C1044Mm.d(TAG, "Using Cronet implementation: %s %s", cronetProvider2.getName(), sProvider.getVersion());
                }
            }
            cronetProvider = sProvider;
        }
        return cronetProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.net.NetflixCronetProvider$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PreferredCronetProvider.values().length];
            e = iArr;
            try {
                iArr[PreferredCronetProvider.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[PreferredCronetProvider.PLAY_SERVICES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String getUnderlyingCronetVersion(Context context) {
        return getProvider(context.getApplicationContext()).getVersion();
    }
}
