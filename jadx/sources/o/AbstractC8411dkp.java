package o;

import com.netflix.msl.util.MslContext;

/* renamed from: o.dkp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8411dkp {
    private final C8415dkt a;

    /* renamed from: o.dkp$d */
    /* loaded from: classes5.dex */
    public static class d {
        public final AbstractC8420dky b;
        public final AbstractC8393djy c;
    }

    public abstract AbstractC8393djy b(MslContext mslContext, AbstractC8412dkq abstractC8412dkq, AbstractC8420dky abstractC8420dky, dkO dko);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC8420dky b(MslContext mslContext, dkO dko, C8401dkf c8401dkf);

    public abstract d c(MslContext mslContext, C8404dki c8404dki, AbstractC8412dkq abstractC8412dkq, djG djg);

    public C8415dkt c() {
        return this.a;
    }

    public abstract d d(MslContext mslContext, C8404dki c8404dki, AbstractC8412dkq abstractC8412dkq, dkO dko);

    protected abstract AbstractC8412dkq e(MslContext mslContext, C8401dkf c8401dkf);

    public AbstractC8411dkp(C8415dkt c8415dkt) {
        this.a = c8415dkt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8412dkq b(MslContext mslContext, C8401dkf c8401dkf, String str) {
        return e(mslContext, c8401dkf);
    }
}
