package o;

import com.netflix.msl.MslInternalException;
import com.netflix.msl.util.MslContext;

/* loaded from: classes5.dex */
public class dkN implements dkS {
    @Override // o.dkS
    public C8373dje a(MslContext mslContext, dkO dko, long j) {
        return null;
    }

    @Override // o.dkS
    public C8373dje b(MslContext mslContext, dkO dko) {
        return null;
    }

    @Override // o.dkS
    public C8373dje c(MslContext mslContext, dkO dko) {
        return null;
    }

    @Override // o.dkS
    public C8373dje e(MslContext mslContext, dkO dko, dkU dku) {
        return null;
    }

    @Override // o.dkS
    public dkU c(MslContext mslContext, dkR dkr, dkO dko) {
        throw new MslInternalException("Creating user ID tokens is unsupported by the token factory.");
    }

    @Override // o.dkS
    public dkU a(MslContext mslContext, dkU dku, dkO dko) {
        throw new MslInternalException("Renewing master tokens is unsupported by the token factory.");
    }

    @Override // o.dkS
    public dkR a(MslContext mslContext, String str) {
        throw new MslInternalException("Creating users is unsupported by the token factory.");
    }
}
