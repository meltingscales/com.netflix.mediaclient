package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslKeyExchangeException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;

/* renamed from: o.dkq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8412dkq implements InterfaceC8400dke {
    private final C8415dkt c;

    protected abstract C8401dkf a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki);

    public C8415dkt e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8412dkq(C8415dkt c8415dkt) {
        this.c = c8415dkt;
    }

    public static AbstractC8412dkq a(MslContext mslContext, C8401dkf c8401dkf) {
        try {
            String g = c8401dkf.g("scheme");
            C8415dkt b = mslContext.b(g);
            if (b == null) {
                throw new MslKeyExchangeException(C8373dje.ck, g);
            }
            C8401dkf b2 = c8401dkf.b("keydata", mslContext.e());
            AbstractC8411dkp c = mslContext.c(b);
            if (c == null) {
                throw new MslKeyExchangeException(C8373dje.ae, b.b());
            }
            return c.b(mslContext, b2, g);
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "keyrequestdata " + c8401dkf, e);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("scheme", this.c.b());
        e.e("keydata", a(abstractC8399dkd, c8404dki));
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8412dkq) {
            return this.c.equals(((AbstractC8412dkq) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
