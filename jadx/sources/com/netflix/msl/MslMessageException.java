package com.netflix.msl;

import o.C8373dje;
import o.djG;
import o.dkO;
import o.dkU;

/* loaded from: classes5.dex */
public class MslMessageException extends MslException {
    private static final long serialVersionUID = 8022562525891870639L;

    public MslMessageException(C8373dje c8373dje) {
        super(c8373dje);
    }

    public MslMessageException(C8373dje c8373dje, String str) {
        super(c8373dje, str);
    }

    public MslMessageException(C8373dje c8373dje, String str, Throwable th) {
        super(c8373dje, str, th);
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: a */
    public MslMessageException e(dkO dko) {
        super.e(dko);
        return this;
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: a */
    public MslMessageException d(djG djg) {
        super.d(djg);
        return this;
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: a */
    public MslMessageException b(dkU dku) {
        super.b(dku);
        return this;
    }

    @Override // com.netflix.msl.MslException
    /* renamed from: c */
    public MslMessageException a(long j) {
        super.a(j);
        return this;
    }
}
