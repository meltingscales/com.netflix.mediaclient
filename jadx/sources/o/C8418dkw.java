package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.io.MslEncoderException;
import java.util.Arrays;

/* renamed from: o.dkw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8418dkw extends AbstractC8412dkq {
    private final byte[] b;
    private final byte[] e;

    public byte[] d() {
        return this.e;
    }

    public C8418dkw(byte[] bArr, byte[] bArr2) {
        super(C8419dkx.i);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Key request data must be defined and non-empty.");
        }
        if (bArr2 != null && bArr2.length == 0) {
            throw new IllegalArgumentException("If device unique id is defined it must be non-empty.");
        }
        this.e = bArr;
        this.b = bArr2;
    }

    public C8418dkw(C8401dkf c8401dkf) {
        super(C8419dkx.i);
        try {
            this.e = c8401dkf.e("keyrequest");
            this.b = c8401dkf.e("duid", (byte[]) null);
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "keydata " + c8401dkf, e);
        }
    }

    @Override // o.AbstractC8412dkq
    protected C8401dkf a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("keyrequest", (Object) this.e);
        byte[] bArr = this.b;
        if (bArr != null) {
            e.e("duid", (Object) bArr);
        }
        return e;
    }

    @Override // o.AbstractC8412dkq
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8418dkw) {
            C8418dkw c8418dkw = (C8418dkw) obj;
            return super.equals(obj) && Arrays.equals(this.e, c8418dkw.e) && Arrays.equals(this.b, c8418dkw.b);
        }
        return false;
    }

    @Override // o.AbstractC8412dkq
    public int hashCode() {
        return (super.hashCode() ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.b);
    }
}
