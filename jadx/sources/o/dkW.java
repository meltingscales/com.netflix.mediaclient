package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class dkW extends AbstractC8424dlb {
    private static final Logger b = LoggerFactory.getLogger(dkW.class);
    private final MslContext a;
    private String c;
    private final dkO d;
    private final Map<C8404dki, C8401dkf> e;
    private final dkU f;
    private final String g;
    private final dkO i;

    private static AbstractC8393djy e(MslContext mslContext, dkO dko) {
        AbstractC8393djy d = mslContext.h().d(dko);
        return d != null ? d : new djB(mslContext, dko);
    }

    public dkW(MslContext mslContext, dkO dko, dkU dku, dkO dko2, String str) {
        super(dkT.b);
        this.e = new HashMap();
        this.a = mslContext;
        this.d = dko;
        this.f = dku;
        this.g = null;
        this.i = dko2;
        this.c = str == null ? "" : str;
        if (dko2 == null) {
            throw new NullPointerException("target masterToken is null");
        }
        if (dku == null) {
            throw new NullPointerException("userIdToken is null");
        }
        b.debug("Target ESN = {}", dko2.b());
    }

    @Override // o.AbstractC8424dlb
    public C8401dkf d(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.e.containsKey(c8404dki)) {
            return this.e.get(c8404dki);
        }
        try {
            AbstractC8393djy e = e(this.a, this.d);
            C8401dkf e2 = abstractC8399dkd.e();
            e2.e("useridtoken", this.f);
            Object obj = this.g;
            if (obj != null) {
                e2.e("entityidentity", obj);
            }
            Object obj2 = this.i;
            if (obj2 != null) {
                e2.e("mastertoken", obj2);
            }
            try {
                byte[] a = e.a(abstractC8399dkd.c(e2, c8404dki), abstractC8399dkd, c8404dki);
                Object b2 = e.b(a, abstractC8399dkd, c8404dki);
                C8401dkf e3 = abstractC8399dkd.e();
                e3.e("mastertoken", this.d);
                e3.e("userdata", (Object) a);
                e3.e("signature", b2);
                e3.e("auxinfo", this.c);
                C8401dkf c = abstractC8399dkd.c(abstractC8399dkd.c(e3, c8404dki));
                this.e.put(c8404dki, c);
                return c;
            } catch (MslCryptoException e4) {
                throw new MslEncoderException("Error encrypting and signing the authentication data.", e4);
            }
        } catch (MslMasterTokenException e5) {
            throw new MslEncoderException("Master token crypto context cannot be retrieved or created.", e5);
        }
    }

    @Override // o.AbstractC8424dlb
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkW) {
            dkW dkw = (dkW) obj;
            return super.equals(obj) && this.d.equals(dkw.d) && this.f.equals(dkw.f) && this.g.equals(dkw.g) && this.c.equals(dkw.c);
        }
        return false;
    }

    @Override // o.AbstractC8424dlb
    public int hashCode() {
        return (((super.hashCode() ^ this.d.hashCode()) ^ this.f.hashCode()) ^ this.g.hashCode()) ^ this.c.hashCode();
    }
}
