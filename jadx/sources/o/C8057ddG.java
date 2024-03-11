package o;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

/* renamed from: o.ddG  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8057ddG {
    private final Context d;

    @Inject
    public C8057ddG(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        this.d = context;
    }

    public final AdvertisingIdClient.Info e() {
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.d);
        C8632dsu.a(advertisingIdInfo, "");
        return advertisingIdInfo;
    }
}
