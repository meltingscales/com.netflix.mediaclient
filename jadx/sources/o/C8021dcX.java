package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;

/* renamed from: o.dcX  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8021dcX {
    public static void b(NetflixActivity netflixActivity, boolean z, PlayVerifierVault playVerifierVault) {
        UserAgent c = C8126deW.c(netflixActivity);
        boolean z2 = c != null && c.q();
        C1044Mm.b("nf_age", String.format(" isAgeProtected: %b, isAgeVerified: %b", Boolean.valueOf(z), Boolean.valueOf(z2)));
        if (z && !z2) {
            C8022dcY.a().b(netflixActivity, playVerifierVault, netflixActivity);
        } else {
            a(netflixActivity, playVerifierVault, netflixActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(NetflixActivity netflixActivity, PlayVerifierVault playVerifierVault, InterfaceC8018dcU interfaceC8018dcU) {
        if (playVerifierVault != null) {
            C8082ddf.a().b(netflixActivity, playVerifierVault.i(), playVerifierVault, interfaceC8018dcU);
        } else {
            C1044Mm.d("nf_age", "vault null, skipping pin and play");
        }
    }
}
