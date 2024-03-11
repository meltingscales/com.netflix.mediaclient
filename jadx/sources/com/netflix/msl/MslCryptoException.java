package com.netflix.msl;

import o.C8373dje;
import o.djG;
import o.dkO;

/* loaded from: classes5.dex */
public class MslCryptoException extends MslException {
    private static final long serialVersionUID = -7618578454440397528L;

    public MslCryptoException(C8373dje c8373dje) {
        super(c8373dje);
    }

    public MslCryptoException(C8373dje c8373dje, String str) {
        super(c8373dje, str);
    }

    public MslCryptoException(C8373dje c8373dje, String str, Throwable th) {
        super(c8373dje, str, th);
    }

    public MslCryptoException(C8373dje c8373dje, Throwable th) {
        super(c8373dje, th);
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: a */
    public MslCryptoException e(dkO dko) {
        super.e(dko);
        return this;
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: a */
    public MslCryptoException d(djG djg) {
        super.d(djg);
        return this;
    }
}
