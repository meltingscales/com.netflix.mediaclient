package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import o.aPC;

/* loaded from: classes3.dex */
public class aPN extends aPM {
    public aPN(Context context, aOV aov, aPC.e eVar, CryptoErrorManager cryptoErrorManager) {
        super(context, CryptoProvider.WIDEVINE_L1, aov, eVar, cryptoErrorManager);
    }

    @Override // o.aPA
    protected void h() {
        C1044Mm.e(aPM.l, "No need to set security level L1...");
    }
}
