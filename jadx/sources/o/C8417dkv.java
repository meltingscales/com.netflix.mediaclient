package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;
import java.util.Arrays;

/* renamed from: o.dkv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8417dkv extends AbstractC8420dky {
    private final byte[] a;
    private final byte[] c;
    private final byte[] e;

    public byte[] a() {
        return this.e;
    }

    public byte[] b() {
        return this.c;
    }

    public byte[] e() {
        return this.a;
    }

    public C8417dkv(dkO dko, C8401dkf c8401dkf) {
        super(dko, C8419dkx.i);
        try {
            this.c = c8401dkf.e("cdmkeyresponse");
            this.e = c8401dkf.e("encryptionkeyid");
            this.a = c8401dkf.e("hmackeyid");
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "keydata " + c8401dkf, e);
        }
    }

    @Override // o.AbstractC8420dky
    protected C8401dkf a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("encryptionkeyid", (Object) this.e);
        e.e("hmackeyid", (Object) this.a);
        e.e("cdmkeyresponse", (Object) this.c);
        return e;
    }

    @Override // o.AbstractC8420dky
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8417dkv) {
            C8417dkv c8417dkv = (C8417dkv) obj;
            return super.equals(obj) && Arrays.equals(this.c, c8417dkv.c) && Arrays.equals(this.e, c8417dkv.e) && Arrays.equals(this.a, c8417dkv.a);
        }
        return false;
    }

    @Override // o.AbstractC8420dky
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = Arrays.hashCode(this.c);
        return ((hashCode ^ hashCode2) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.a);
    }
}
