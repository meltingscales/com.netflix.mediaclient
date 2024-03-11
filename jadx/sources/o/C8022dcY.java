package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;

/* renamed from: o.dcY  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8022dcY {
    private static C8022dcY b = new C8022dcY();

    public static C8022dcY a() {
        return b;
    }

    private C8022dcY() {
    }

    public void b(NetflixActivity netflixActivity, PlayVerifierVault playVerifierVault, InterfaceC8018dcU interfaceC8018dcU) {
        if (a(playVerifierVault)) {
            C8012dcO e = C8012dcO.e(playVerifierVault);
            e.d(interfaceC8018dcU);
            e.show(netflixActivity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
        }
    }

    private boolean a(PlayVerifierVault playVerifierVault) {
        return !PlayVerifierVault.RequestedBy.e.c().equals(playVerifierVault.b());
    }
}
