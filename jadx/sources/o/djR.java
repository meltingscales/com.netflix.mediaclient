package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class djR extends djG {
    private final byte[] a;
    private final byte[] b;
    private final dkJ c;
    private byte[] d;
    private final String e;
    private final byte[] f;

    public String b() {
        return this.e;
    }

    @Override // o.djG
    public String d() {
        return null;
    }

    public djR(String str, byte[] bArr, byte[] bArr2, dkJ dkj, C8392djx c8392djx, byte[] bArr3) {
        super(djL.t);
        this.e = str;
        this.f = bArr;
        this.b = bArr2;
        this.c = dkj;
        this.a = bArr3;
        if (c8392djx == null) {
            throw new MslEntityAuthException(C8377dji.dy, "App Id Signer cannot be null.");
        }
        try {
            this.d = c8392djx.c(c()).d();
        } catch (MslCryptoException e) {
            throw new MslCryptoException(C8377dji.dD, e);
        }
    }

    public djR(C8401dkf c8401dkf) {
        super(djL.t);
        try {
            this.e = c8401dkf.g("devtype");
            this.f = c8401dkf.e("keyrequest");
            this.b = c8401dkf.e("duid");
            this.c = new dkJ(c8401dkf.g("appid"), c8401dkf.c("appkeyversion"));
            this.d = c8401dkf.e("apphmac");
            this.a = c8401dkf.e("devicetoken", (byte[]) null);
        } catch (MslEncoderException e) {
            C8373dje c8373dje = C8373dje.bd;
            throw new MslEncodingException(c8373dje, "widevine app id authdata " + c8401dkf.toString(), e);
        }
    }

    public byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(this.e.getBytes());
            byteArrayOutputStream.write(this.f);
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(this.c.e().getBytes());
            byteArrayOutputStream.write(String.valueOf(this.c.d()).getBytes());
            byte[] bArr = this.a;
            if (bArr != null) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new MslInternalException("Failed to serialize WidevineAppIdAuthData for HMAC generation.");
        }
    }

    @Override // o.djG
    public C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        e.e("devtype", this.e);
        e.e("keyrequest", (Object) this.f);
        e.e("duid", (Object) this.b);
        e.e("appid", this.c.e());
        e.e("appkeyversion", Integer.valueOf(this.c.d()));
        byte[] bArr = this.a;
        if (bArr != null) {
            e.e("devicetoken", (Object) bArr);
        }
        e.e("apphmac", (Object) this.d);
        return e;
    }

    @Override // o.djG
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djR) {
            djR djr = (djR) obj;
            return super.equals(obj) && this.e.equals(djr.e) && Arrays.equals(this.f, djr.f) && Arrays.equals(this.b, djr.b) && Arrays.equals(this.d, djr.d) && Arrays.equals(this.a, djr.a) && this.c.equals(djr.c);
        }
        return false;
    }

    @Override // o.djG
    public int hashCode() {
        int hashCode = super.hashCode();
        int hashCode2 = this.e.hashCode();
        int hashCode3 = Arrays.hashCode(this.f);
        int hashCode4 = this.b.hashCode();
        int hashCode5 = this.c.hashCode();
        return (((((hashCode ^ hashCode2) ^ hashCode3) ^ hashCode4) ^ hashCode5) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.d);
    }
}
