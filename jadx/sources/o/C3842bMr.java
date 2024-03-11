package o;

import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;

/* renamed from: o.bMr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3842bMr {
    public static InterfaceC1910aSu b(ErrorSource errorSource, StatusCode statusCode) {
        if (errorSource == ErrorSource.msl) {
            return e(statusCode);
        }
        if (errorSource == ErrorSource.offline_playback) {
            if (bML.c(statusCode)) {
                return new bML(statusCode);
            }
            throw new IllegalStateException("Playback error sources not supported at this moment!");
        } else if (errorSource == ErrorSource.streaming_playback) {
            if (bMH.d(statusCode)) {
                return new bMH(statusCode);
            }
            throw new IllegalStateException("Playback error sources not supported at this moment!");
        } else {
            throw new IllegalStateException("Playback error sources not supported at this moment!");
        }
    }

    private static InterfaceC1910aSu e(StatusCode statusCode) {
        if (bME.c(statusCode)) {
            return new bME(statusCode);
        }
        if (bMD.d(statusCode)) {
            return new bMD();
        }
        if (C3850bMz.e(statusCode)) {
            return new C3850bMz();
        }
        if (bMF.b(statusCode)) {
            return new bMF();
        }
        if (bMG.c(statusCode)) {
            return new bMG();
        }
        if (C3847bMw.b(statusCode)) {
            return new C3847bMw();
        }
        if (bMO.a(statusCode)) {
            return new bMO();
        }
        if (C3837bMm.b(statusCode)) {
            return new C3837bMm();
        }
        if (bMM.d(statusCode)) {
            return new bMM();
        }
        if (bMA.d(statusCode)) {
            return new bMA();
        }
        if (C3849bMy.e(statusCode)) {
            return new C3849bMy();
        }
        if (C3843bMs.b(statusCode)) {
            return new C3843bMs();
        }
        if (bMB.b(statusCode)) {
            return new bMB();
        }
        if (bMC.b(statusCode)) {
            return new bMC();
        }
        if (bMI.d(statusCode)) {
            return new bMI();
        }
        if (C3841bMq.c(statusCode)) {
            return new C3841bMq(statusCode);
        }
        return null;
    }
}
