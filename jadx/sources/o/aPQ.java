package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import o.aPC;

/* loaded from: classes3.dex */
public class aPQ extends aPM {
    public aPQ(Context context, aOV aov, aPC.e eVar, CryptoErrorManager cryptoErrorManager) {
        super(context, CryptoProvider.WIDEVINE_L3, aov, eVar, cryptoErrorManager);
    }

    @Override // o.aPA
    protected void h() {
        C1044Mm.e(aPM.l, "Set security level L3...");
        C8189dfg.d(this.h);
    }
}
