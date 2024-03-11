package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslKeyExchangeException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;

/* renamed from: o.dky  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8420dky implements InterfaceC8400dke {
    private final C8415dkt c;
    private final dkO d;

    protected abstract C8401dkf a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki);

    public dkO c() {
        return this.d;
    }

    public C8415dkt d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8420dky(dkO dko, C8415dkt c8415dkt) {
        this.d = dko;
        this.c = c8415dkt;
    }

    public static AbstractC8420dky d(MslContext mslContext, C8401dkf c8401dkf) {
        AbstractC8399dkd e = mslContext.e();
        try {
            dkO dko = new dkO(mslContext, c8401dkf.b("mastertoken", e));
            String g = c8401dkf.g("scheme");
            C8415dkt b = mslContext.b(g);
            if (b == null) {
                throw new MslKeyExchangeException(C8373dje.ck, g);
            }
            C8401dkf b2 = c8401dkf.b("keydata", e);
            AbstractC8411dkp c = mslContext.c(b);
            if (c == null) {
                throw new MslKeyExchangeException(C8373dje.ae, b.b());
            }
            return c.b(mslContext, dko, b2);
        } catch (MslEncoderException e2) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "keyresponsedata " + c8401dkf, e2);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("mastertoken", this.d);
        e.e("scheme", this.c.b());
        e.e("keydata", a(abstractC8399dkd, c8404dki));
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8420dky) {
            AbstractC8420dky abstractC8420dky = (AbstractC8420dky) obj;
            return this.d.equals(abstractC8420dky.d) && this.c.equals(abstractC8420dky.c);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode() ^ this.c.hashCode();
    }
}
