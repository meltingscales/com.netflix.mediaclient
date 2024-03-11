package o;

import com.netflix.mediaclient.drm.NetflixMediaDrm;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;

/* renamed from: o.aPy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1833aPy {
    private final int a;
    private final String b;
    private final String c;
    private final CryptoProvider d;
    private final int e;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }

    public C1833aPy(CryptoProvider cryptoProvider, NetflixMediaDrm netflixMediaDrm) {
        C8632dsu.c((Object) cryptoProvider, "");
        C8632dsu.c((Object) netflixMediaDrm, "");
        this.d = cryptoProvider;
        String resourceRatingTier = netflixMediaDrm.getResourceRatingTier();
        C8632dsu.a(resourceRatingTier, "");
        this.c = resourceRatingTier;
        this.e = netflixMediaDrm.getMaxSecurityLevel();
        String oemCryptoApiVersion = netflixMediaDrm.getOemCryptoApiVersion();
        C8632dsu.a(oemCryptoApiVersion, "");
        this.b = oemCryptoApiVersion;
        this.a = netflixMediaDrm.getMaxSessionCount();
    }
}
