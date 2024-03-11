package com.netflix.msl;

import o.C8373dje;
import o.djG;
import o.dkO;

/* loaded from: classes5.dex */
public class MslEntityAuthException extends MslException {
    private static final long serialVersionUID = 5335550727677217303L;

    public MslEntityAuthException(C8373dje c8373dje) {
        super(c8373dje);
    }

    public MslEntityAuthException(C8373dje c8373dje, String str) {
        super(c8373dje, str);
    }

    public MslEntityAuthException(C8373dje c8373dje, String str, Throwable th) {
        super(c8373dje, str, th);
    }

    public MslEntityAuthException(C8373dje c8373dje, Throwable th) {
        super(c8373dje, th);
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: b */
    public MslEntityAuthException e(dkO dko) {
        super.e(dko);
        return this;
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: e */
    public MslEntityAuthException d(djG djg) {
        super.d(djg);
        return this;
    }
}
