package o;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.util.UUID;
import o.aPC;

/* loaded from: classes3.dex */
public abstract class aPM extends aPA {
    protected static String l = "nf_msl_WidevineCryptoManager";

    @Override // o.aPA
    protected String e() {
        return l;
    }

    @Override // o.aPC
    public CryptoProvider l() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aPM(Context context, CryptoProvider cryptoProvider, aOV aov, aPC.e eVar, CryptoErrorManager cryptoErrorManager) {
        super(context, cryptoProvider, aov, eVar, cryptoErrorManager);
    }

    @Override // o.aPC
    public void o() {
        C1044Mm.e(l, "MSLWidevineCryptoManager::init:");
    }

    @Override // o.aPA
    protected UUID j() {
        return C8189dfg.d;
    }
}
