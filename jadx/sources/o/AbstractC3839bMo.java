package o;

import com.netflix.mediaclient.service.error.crypto.ErrorSource;

/* renamed from: o.bMo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC3839bMo extends AbstractC3834bMj {
    protected static String d = "nf_crypto_error_msl";

    @Override // o.AbstractC3834bMj
    ErrorSource a() {
        return ErrorSource.msl;
    }
}
