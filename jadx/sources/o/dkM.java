package o;

import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.MslMessageException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class dkM implements InterfaceC8400dke {
    private final byte[] c;
    protected final AbstractC8393djy d;
    private final MslConstants.CompressionAlgorithm e;
    private final boolean f;
    private final long g;
    private final C8401dkf h;
    private final long j;
    protected final Map<C8404dki, byte[]> b = new HashMap();
    protected final Map<C8404dki, C8401dkf> a = new HashMap();

    public long a() {
        return this.g;
    }

    public long b() {
        return this.j;
    }

    public boolean c() {
        return this.f;
    }

    public byte[] d() {
        return this.c;
    }

    public MslConstants.CompressionAlgorithm e() {
        return this.e;
    }

    public dkM(MslContext mslContext, long j, long j2, boolean z, MslConstants.CompressionAlgorithm compressionAlgorithm, byte[] bArr, AbstractC8393djy abstractC8393djy) {
        byte[] bArr2;
        if (j < 0 || j > 9007199254740992L) {
            throw new MslInternalException("Sequence number " + j + " is outside the valid range.");
        } else if (j2 < 0 || j2 > 9007199254740992L) {
            throw new MslInternalException("Message ID " + j2 + " is outside the valid range.");
        } else {
            if (compressionAlgorithm == null || (bArr2 = C8428dlf.e(compressionAlgorithm, bArr)) == null || bArr2.length >= bArr.length) {
                this.e = null;
                bArr2 = bArr;
            } else {
                this.e = compressionAlgorithm;
            }
            this.j = j;
            this.g = j2;
            this.f = z;
            this.c = bArr;
            C8401dkf e = mslContext.e().e();
            this.h = e;
            e.e("sequencenumber", Long.valueOf(j));
            e.e("messageid", Long.valueOf(j2));
            if (z) {
                e.e("endofmsg", Boolean.valueOf(z));
            }
            MslConstants.CompressionAlgorithm compressionAlgorithm2 = this.e;
            if (compressionAlgorithm2 != null) {
                e.e("compressionalgo", compressionAlgorithm2.name());
            }
            e.e(NotificationFactory.DATA, (Object) bArr2);
            this.d = abstractC8393djy;
        }
    }

    public dkM(MslContext mslContext, C8401dkf c8401dkf, AbstractC8393djy abstractC8393djy) {
        AbstractC8399dkd e = mslContext.e();
        this.d = abstractC8393djy;
        try {
            byte[] e2 = c8401dkf.e("payload");
            if (!abstractC8393djy.b(e2, c8401dkf.e("signature"), e)) {
                throw new MslCryptoException(C8373dje.bt);
            }
            byte[] e3 = abstractC8393djy.e(e2, e);
            try {
                C8401dkf c = e.c(e3);
                this.h = c;
                long b = c.b("sequencenumber");
                this.j = b;
                if (b < 0 || b > 9007199254740992L) {
                    C8373dje c8373dje = C8373dje.bs;
                    throw new MslException(c8373dje, "payload chunk payload " + c);
                }
                long b2 = c.b("messageid");
                this.g = b2;
                if (b2 < 0 || b2 > 9007199254740992L) {
                    C8373dje c8373dje2 = C8373dje.bp;
                    throw new MslException(c8373dje2, "payload chunk payload " + c);
                }
                boolean a = c.h("endofmsg") ? c.a("endofmsg") : false;
                this.f = a;
                if (c.h("compressionalgo")) {
                    String g = c.g("compressionalgo");
                    try {
                        this.e = MslConstants.CompressionAlgorithm.valueOf(g);
                    } catch (IllegalArgumentException e4) {
                        throw new MslMessageException(C8373dje.bZ, g, e4);
                    }
                } else {
                    this.e = null;
                }
                byte[] e5 = c.e(NotificationFactory.DATA);
                if (e5.length == 0) {
                    if (!a) {
                        throw new MslMessageException(C8373dje.bn);
                    }
                    this.c = new byte[0];
                    return;
                }
                MslConstants.CompressionAlgorithm compressionAlgorithm = this.e;
                if (compressionAlgorithm == null) {
                    this.c = e5;
                } else {
                    this.c = C8428dlf.d(compressionAlgorithm, e5);
                }
            } catch (MslEncoderException e6) {
                C8373dje c8373dje3 = C8373dje.bd;
                throw new MslEncodingException(c8373dje3, "payload chunk payload " + C8427dle.e(e3), e6);
            }
        } catch (MslEncoderException e7) {
            C8373dje c8373dje4 = C8373dje.bd;
            throw new MslEncodingException(c8373dje4, "payload chunk " + c8401dkf, e7);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.b.containsKey(c8404dki)) {
            return this.b.get(c8404dki);
        }
        byte[] c = abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
        this.b.put(c8404dki, c);
        return c;
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.a.containsKey(c8404dki)) {
            return this.a.get(c8404dki);
        }
        try {
            byte[] a = this.d.a(abstractC8399dkd.c(this.h, c8404dki), abstractC8399dkd, c8404dki);
            try {
                byte[] b = this.d.b(a, abstractC8399dkd, c8404dki);
                C8401dkf e = abstractC8399dkd.e();
                e.e("payload", (Object) a);
                e.e("signature", (Object) b);
                this.a.put(c8404dki, e);
                return e;
            } catch (MslCryptoException e2) {
                throw new MslEncoderException("Error signing the payload.", e2);
            }
        } catch (MslCryptoException e3) {
            throw new MslEncoderException("Error encrypting the payload.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dkM) {
            dkM dkm = (dkM) obj;
            return this.j == dkm.j && this.g == dkm.g && this.f == dkm.f && this.e == dkm.e && Arrays.equals(this.c, dkm.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.j).hashCode();
        int hashCode2 = Long.valueOf(this.g).hashCode();
        int hashCode3 = Boolean.valueOf(this.f).hashCode();
        MslConstants.CompressionAlgorithm compressionAlgorithm = this.e;
        return (((hashCode ^ hashCode2) ^ hashCode3) ^ (compressionAlgorithm != null ? compressionAlgorithm.hashCode() : 0)) ^ Arrays.hashCode(this.c);
    }
}
