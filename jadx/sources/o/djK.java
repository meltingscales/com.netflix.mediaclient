package o;

import com.netflix.msl.util.MslContext;

/* loaded from: classes5.dex */
public abstract class djK {
    private final djI a;

    public abstract djG e(MslContext mslContext, C8401dkf c8401dkf);

    public djI e() {
        return this.a;
    }

    public abstract AbstractC8393djy e(MslContext mslContext, djG djg);

    /* JADX INFO: Access modifiers changed from: protected */
    public djK(djI dji) {
        this.a = dji;
    }

    public djG c(MslContext mslContext, C8401dkf c8401dkf, dkO dko) {
        return e(mslContext, c8401dkf);
    }
}
