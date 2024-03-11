package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;

/* loaded from: classes5.dex */
public class djC extends djG {
    private final String c;
    private final String e;

    public String c() {
        return this.e;
    }

    @Override // o.djG
    public String d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public djC(C8401dkf c8401dkf) {
        super(djI.b);
        try {
            this.c = c8401dkf.g("identity");
            this.e = c8401dkf.g("pubkeyid");
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "ECC authdata " + c8401dkf, e);
        }
    }

    @Override // o.djG
    public C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("identity", this.c);
        e.e("pubkeyid", this.e);
        return e;
    }

    @Override // o.djG
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djC) {
            djC djc = (djC) obj;
            return super.equals(obj) && this.c.equals(djc.c) && this.e.equals(djc.e);
        }
        return false;
    }

    @Override // o.djG
    public int hashCode() {
        int hashCode = super.hashCode();
        return hashCode ^ (this.c + "|" + this.e).hashCode();
    }
}
