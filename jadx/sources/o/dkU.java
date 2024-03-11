package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class dkU implements InterfaceC8400dke {
    private final MslContext b;
    private final long c;
    private final C8401dkf e;
    private final byte[] f;
    private final long g;
    private final long h;
    private final byte[] i;
    private final long j;
    private final dkR l;
    private final C8401dkf n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f13858o;
    private final Map<C8404dki, byte[]> d = new HashMap();
    private final Map<C8404dki, C8401dkf> a = new HashMap();

    public long a() {
        return this.g;
    }

    public long b() {
        return this.j;
    }

    public boolean c() {
        return this.f13858o;
    }

    public dkR e() {
        return this.l;
    }

    public dkU(MslContext mslContext, C8401dkf c8401dkf, dkO dko) {
        this.b = mslContext;
        AbstractC8393djy b = mslContext.b();
        AbstractC8399dkd e = mslContext.e();
        try {
            byte[] e2 = c8401dkf.e("tokendata");
            this.f = e2;
            if (e2.length == 0) {
                C8373dje c8373dje = C8373dje.dg;
                throw new MslEncodingException(c8373dje, "useridtoken " + c8401dkf).e(dko);
            }
            byte[] e3 = c8401dkf.e("signature");
            this.i = e3;
            boolean b2 = b.b(e2, e3, e);
            this.f13858o = b2;
            try {
                C8401dkf c = e.c(e2);
                long b3 = c.b("renewalwindow");
                this.h = b3;
                long b4 = c.b("expiration");
                this.c = b4;
                if (b4 < b3) {
                    C8373dje c8373dje2 = C8373dje.cO;
                    throw new MslException(c8373dje2, "usertokendata " + c).e(dko);
                }
                long b5 = c.b("mtserialnumber");
                this.j = b5;
                if (b5 < 0 || b5 > 9007199254740992L) {
                    C8373dje c8373dje3 = C8373dje.cS;
                    throw new MslException(c8373dje3, "usertokendata " + c).e(dko);
                }
                long b6 = c.b("serialnumber");
                this.g = b6;
                if (b6 < 0 || b6 > 9007199254740992L) {
                    C8373dje c8373dje4 = C8373dje.cX;
                    throw new MslException(c8373dje4, "usertokendata " + c).e(dko);
                }
                byte[] e4 = c.e("userdata");
                if (e4.length == 0) {
                    throw new MslException(C8373dje.dc).e(dko);
                }
                byte[] e5 = b2 ? b.e(e4, e) : null;
                if (e5 != null) {
                    try {
                        C8401dkf c2 = e.c(e5);
                        this.n = c2;
                        this.e = c2.h("issuerdata") ? c2.b("issuerdata", e) : null;
                        String g = c2.g("identity");
                        if (g == null || g.length() == 0) {
                            C8373dje c8373dje5 = C8373dje.cQ;
                            throw new MslException(c8373dje5, "userdata " + c2).e(dko);
                        }
                        dkR a = mslContext.i().a(mslContext, g);
                        this.l = a;
                        if (a == null) {
                            throw new MslInternalException("TokenFactory.createUser() returned null in violation of the interface contract.");
                        }
                    } catch (MslEncoderException e6) {
                        C8373dje c8373dje6 = C8373dje.dj;
                        throw new MslEncodingException(c8373dje6, "userdata " + C8427dle.e(e5), e6).e(dko);
                    }
                } else {
                    this.n = null;
                    this.e = null;
                    this.l = null;
                }
                if (dko == null || b5 != dko.c()) {
                    C8373dje c8373dje7 = C8373dje.cW;
                    throw new MslException(c8373dje7, "uit mtserialnumber " + b5 + "; mt " + dko).e(dko);
                }
            } catch (MslCryptoException e7) {
                e7.e(dko);
                throw e7;
            } catch (MslEncoderException e8) {
                C8373dje c8373dje8 = C8373dje.dd;
                throw new MslEncodingException(c8373dje8, "usertokendata " + C8427dle.e(this.f), e8).e(dko);
            }
        } catch (MslEncoderException e9) {
            C8373dje c8373dje9 = C8373dje.bd;
            throw new MslEncodingException(c8373dje9, "useridtoken " + c8401dkf, e9).e(dko);
        }
    }

    public boolean d(Date date) {
        if (date != null) {
            return this.h * 1000 <= date.getTime();
        } else if (c()) {
            return this.h * 1000 <= this.b.f();
        } else {
            return true;
        }
    }

    public boolean b(Date date) {
        if (date != null) {
            return this.c * 1000 <= date.getTime();
        } else if (c()) {
            return this.c * 1000 <= this.b.f();
        } else {
            return false;
        }
    }

    public boolean d(dkO dko) {
        return dko != null && dko.c() == this.j;
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.d.containsKey(c8404dki)) {
            return this.d.get(c8404dki);
        }
        byte[] c = abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
        this.d.put(c8404dki, c);
        return c;
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        byte[] bArr;
        if (this.a.containsKey(c8404dki)) {
            return this.a.get(c8404dki);
        }
        byte[] bArr2 = this.f;
        if (bArr2 == null && this.i == null) {
            try {
                AbstractC8393djy b = this.b.b();
                try {
                    byte[] a = b.a(abstractC8399dkd.c(this.n, c8404dki), abstractC8399dkd, c8404dki);
                    C8401dkf e = abstractC8399dkd.e();
                    e.e("renewalwindow", Long.valueOf(this.h));
                    e.e("expiration", Long.valueOf(this.c));
                    e.e("mtserialnumber", Long.valueOf(this.j));
                    e.e("serialnumber", Long.valueOf(this.g));
                    e.e("userdata", (Object) a);
                    byte[] c = abstractC8399dkd.c(e, c8404dki);
                    try {
                        bArr = b.b(c, abstractC8399dkd, c8404dki);
                        bArr2 = c;
                    } catch (MslCryptoException e2) {
                        throw new MslEncoderException("Error signing the token data.", e2);
                    }
                } catch (MslCryptoException e3) {
                    throw new MslEncoderException("Error encrypting the user data.", e3);
                }
            } catch (MslCryptoException e4) {
                throw new MslEncoderException("Error creating the MSL crypto context.", e4);
            }
        } else {
            bArr = this.i;
        }
        C8401dkf e5 = abstractC8399dkd.e();
        e5.e("tokendata", (Object) bArr2);
        e5.e("signature", (Object) bArr);
        this.a.put(c8404dki, e5);
        return e5;
    }

    public String toString() {
        AbstractC8399dkd e = this.b.e();
        C8401dkf e2 = e.e();
        e2.e("renewalwindow", Long.valueOf(this.h));
        e2.e("expiration", Long.valueOf(this.c));
        e2.e("mtserialnumber", Long.valueOf(this.j));
        e2.e("serialnumber", Long.valueOf(this.g));
        e2.e("userdata", "(redacted)");
        C8401dkf e3 = e.e();
        e3.e("tokendata", e2);
        Object obj = this.i;
        if (obj == null) {
            obj = "(null)";
        }
        e3.e("signature", obj);
        return e3.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dkU) {
            dkU dku = (dkU) obj;
            return this.g == dku.g && this.j == dku.j;
        }
        return false;
    }

    public int hashCode() {
        return (String.valueOf(this.g) + ":" + String.valueOf(this.j)).hashCode();
    }
}
