package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslUserAuthException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dlb  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC8424dlb implements InterfaceC8400dke {
    private final Map<C8404dki, byte[]> a = new HashMap();
    private final dkZ d;

    public dkZ d() {
        return this.d;
    }

    public abstract C8401dkf d(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8424dlb(dkZ dkz) {
        this.d = dkz;
    }

    public static AbstractC8424dlb e(MslContext mslContext, dkO dko, C8401dkf c8401dkf) {
        try {
            String g = c8401dkf.g("scheme");
            dkZ e = mslContext.e(g);
            if (e == null) {
                throw new MslUserAuthException(C8373dje.cj, g);
            }
            AbstractC8425dlc e2 = mslContext.e(e);
            if (e2 == null) {
                throw new MslUserAuthException(C8373dje.cG, e.d());
            }
            return e2.c(mslContext, dko, c8401dkf.b("authdata", mslContext.e()));
        } catch (MslEncoderException e3) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "userauthdata " + c8401dkf, e3);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.a.containsKey(c8404dki)) {
            return this.a.get(c8404dki);
        }
        byte[] c = abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
        this.a.put(c8404dki, c);
        return c;
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("scheme", this.d.d());
        e.e("authdata", d(abstractC8399dkd, c8404dki));
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8424dlb) {
            return this.d.equals(((AbstractC8424dlb) obj).d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }
}
