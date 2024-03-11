package o;

import com.netflix.msl.MslInternalException;
import com.netflix.msl.util.MslContext;
import o.AbstractC8411dkp;

/* renamed from: o.aZi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2086aZi extends AbstractC8411dkp {
    public C2086aZi() {
        super(C8419dkx.i);
    }

    @Override // o.AbstractC8411dkp
    public AbstractC8412dkq e(MslContext mslContext, C8401dkf c8401dkf) {
        return new C8418dkw(c8401dkf);
    }

    @Override // o.AbstractC8411dkp
    public AbstractC8420dky b(MslContext mslContext, dkO dko, C8401dkf c8401dkf) {
        return new C8417dkv(dko, c8401dkf);
    }

    @Override // o.AbstractC8411dkp
    public AbstractC8411dkp.d d(MslContext mslContext, C8404dki c8404dki, AbstractC8412dkq abstractC8412dkq, dkO dko) {
        throw new MslInternalException("Client will not generate a keyx  response");
    }

    @Override // o.AbstractC8411dkp
    public AbstractC8411dkp.d c(MslContext mslContext, C8404dki c8404dki, AbstractC8412dkq abstractC8412dkq, djG djg) {
        throw new MslInternalException("Client will not generate a keyx  response");
    }

    @Override // o.AbstractC8411dkp
    public AbstractC8393djy b(MslContext mslContext, AbstractC8412dkq abstractC8412dkq, AbstractC8420dky abstractC8420dky, dkO dko) {
        return new C2085aZh(mslContext, mslContext.a((MslContext.ReauthCode) null).d(), (C8418dkw) abstractC8412dkq, (C8417dkv) abstractC8420dky, dko);
    }
}
