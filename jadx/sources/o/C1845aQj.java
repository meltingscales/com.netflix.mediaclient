package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.configuration.esn.WidevineL1NotSupportedAfterOsUpgradeException;
import com.netflix.mediaclient.service.configuration.esn.WidevineNotSupportedException;
import com.netflix.mediaclient.util.DeviceCategory;
import java.util.Objects;

/* renamed from: o.aQj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1845aQj {
    public static InterfaceC1843aQh a(Context context, aOV aov) {
        C1044Mm.e("nf_esn", "Create ESN: device with Widevine support, return ESN CDM implementation!");
        CryptoProvider a = C1834aPz.a.a();
        Objects.requireNonNull(a);
        e(a);
        AbstractC1838aQc b = b(aov, a, aov.r());
        b.i(context);
        return b;
    }

    private static AbstractC1838aQc b(aOV aov, CryptoProvider cryptoProvider, DeviceCategory deviceCategory) {
        return new C1844aQi(cryptoProvider, deviceCategory);
    }

    private static void e(CryptoProvider cryptoProvider) {
        if (cryptoProvider == CryptoProvider.LEGACY) {
            if (C8189dfg.d()) {
                throw new WidevineL1NotSupportedAfterOsUpgradeException();
            }
            throw new WidevineNotSupportedException();
        }
    }
}
