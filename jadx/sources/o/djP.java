package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;

/* loaded from: classes5.dex */
public class djP extends djG {
    private final String b;
    private final String e;

    @Override // o.djG
    public String d() {
        return this.b;
    }

    public String e() {
        return this.e;
    }

    public djP(C8401dkf c8401dkf) {
        super(djI.j);
        try {
            this.b = c8401dkf.g("identity");
            this.e = c8401dkf.g("pubkeyid");
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "RSA authdata " + c8401dkf, e);
        }
    }

    @Override // o.djG
    public C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("identity", this.b);
        e.e("pubkeyid", this.e);
        return e;
    }

    @Override // o.djG
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djP) {
            djP djp = (djP) obj;
            return super.equals(obj) && this.b.equals(djp.b) && this.e.equals(djp.e);
        }
        return false;
    }

    @Override // o.djG
    public int hashCode() {
        int hashCode = super.hashCode();
        return hashCode ^ (this.b + "|" + this.e).hashCode();
    }
}
