package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class djG implements InterfaceC8400dke {
    private final Map<C8404dki, byte[]> c = new HashMap();
    private final djI e;

    public djI a() {
        return this.e;
    }

    public abstract String d();

    public abstract C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki);

    /* JADX INFO: Access modifiers changed from: protected */
    public djG(djI dji) {
        this.e = dji;
    }

    public static djG d(MslContext mslContext, C8401dkf c8401dkf, dkO dko) {
        try {
            String g = c8401dkf.g("scheme");
            djI a = mslContext.a(g);
            if (a == null) {
                throw new MslEntityAuthException(C8373dje.cd, g);
            }
            C8401dkf b = c8401dkf.b("authdata", mslContext.e());
            djK d = mslContext.d(a);
            if (d == null) {
                throw new MslEntityAuthException(C8373dje.p, a.c());
            }
            return d.c(mslContext, b, dko);
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "entityauthdata " + c8401dkf, e);
        }
    }

    public static djG e(MslContext mslContext, C8401dkf c8401dkf) {
        return d(mslContext, c8401dkf, null);
    }

    @Override // o.InterfaceC8400dke
    public final byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.c.containsKey(c8404dki)) {
            return this.c.get(c8404dki);
        }
        byte[] c = abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
        this.c.put(c8404dki, c);
        return c;
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("scheme", this.e.c());
        e.e("authdata", e(abstractC8399dkd, c8404dki));
        return e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djG) {
            return this.e.equals(((djG) obj).e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }
}
