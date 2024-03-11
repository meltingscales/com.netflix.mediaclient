package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.tokens.DeviceIdentity;
import com.netflix.msl.util.MslContext;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public class dkO implements InterfaceC8400dke {
    private final SecretKey a;
    private dkJ b;
    private final MslContext c;
    private final Map<C8404dki, byte[]> d;
    private DeviceIdentity e;
    private final long f;
    private final String g;
    private final C8401dkf h;
    private final long i;
    private final Map<C8404dki, C8401dkf> j;
    private final byte[] k;
    private final C8401dkf l;
    private final dkP m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13856o;
    private final boolean p;
    private final SecretKey q;
    private final byte[] s;

    public dkP a() {
        return this.m;
    }

    public String b() {
        return this.g;
    }

    public long c() {
        return this.n;
    }

    public SecretKey d() {
        return this.a;
    }

    public long e() {
        return this.f13856o;
    }

    public boolean f() {
        return this.p;
    }

    public boolean g() {
        return this.l != null;
    }

    public SecretKey j() {
        return this.q;
    }

    public dkO(MslContext mslContext, Date date, Date date2, long j, long j2, C8401dkf c8401dkf, String str, SecretKey secretKey, SecretKey secretKey2) {
        this(mslContext, date, date2, j, j2, c8401dkf, str, secretKey, secretKey2, null, null, null);
    }

    public dkO(MslContext mslContext, Date date, Date date2, long j, long j2, C8401dkf c8401dkf, String str, SecretKey secretKey, SecretKey secretKey2, dkP dkp, dkJ dkj, DeviceIdentity deviceIdentity) {
        this.d = new HashMap();
        this.j = new HashMap();
        if (date2.before(date)) {
            throw new MslInternalException("Cannot construct a master token that expires before its renewal window opens.");
        }
        if (j < 0 || j > 9007199254740992L) {
            throw new MslInternalException("Sequence number " + j + " is outside the valid range.");
        } else if (j2 < 0 || j2 > 9007199254740992L) {
            throw new MslInternalException("Serial number " + j2 + " is outside the valid range.");
        } else {
            this.c = mslContext;
            this.i = date.getTime() / 1000;
            this.f = date2.getTime() / 1000;
            this.f13856o = j;
            this.n = j2;
            this.h = c8401dkf;
            this.g = str;
            this.a = secretKey;
            this.q = secretKey2;
            this.m = dkp;
            this.b = dkj;
            this.e = deviceIdentity;
            byte[] encoded = secretKey.getEncoded();
            byte[] encoded2 = secretKey2.getEncoded();
            try {
                MslConstants.EncryptionAlgo c = MslConstants.EncryptionAlgo.c(secretKey.getAlgorithm());
                MslConstants.SignatureAlgo d = MslConstants.SignatureAlgo.d(secretKey2.getAlgorithm());
                AbstractC8399dkd e = mslContext.e();
                C8401dkf e2 = e.e();
                this.l = e2;
                if (c8401dkf != null) {
                    e2.e("issuerdata", c8401dkf);
                }
                e2.e("identity", str);
                e2.e("encryptionkey", (Object) encoded);
                e2.e("encryptionalgorithm", c);
                e2.e("hmackey", (Object) encoded2);
                e2.e("signaturekey", (Object) encoded2);
                e2.e("signaturealgorithm", d);
                if (this.b != null) {
                    C8401dkf e3 = e.e();
                    e3.e("identity", this.b.e());
                    e3.e("keyversion", Integer.valueOf(this.b.d()));
                    e2.e("appid", e3);
                }
                if (this.e != null) {
                    C8401dkf e4 = e.e();
                    e4.e("identity", this.e.c());
                    e2.e("devid", e4);
                }
                this.s = null;
                this.k = null;
                this.p = true;
            } catch (IllegalArgumentException e5) {
                C8373dje c8373dje = C8373dje.bU;
                throw new MslCryptoException(c8373dje, "encryption algorithm: " + this.a.getAlgorithm() + "; signature algorithm: " + this.q.getAlgorithm(), e5);
            }
        }
    }

    private DeviceIdentity c(AbstractC8399dkd abstractC8399dkd) {
        return new DeviceIdentity(this.l.b("devid", abstractC8399dkd).g("identity"));
    }

    private dkJ d(AbstractC8399dkd abstractC8399dkd) {
        C8401dkf b = this.l.b("appid", abstractC8399dkd);
        return new dkJ(b.g("identity"), b.c("keyversion"));
    }

    public dkO(MslContext mslContext, C8401dkf c8401dkf) {
        byte[] e;
        this.d = new HashMap();
        this.j = new HashMap();
        this.c = mslContext;
        AbstractC8393djy b = mslContext.b();
        AbstractC8399dkd e2 = mslContext.e();
        try {
            byte[] e3 = c8401dkf.e("tokendata");
            this.s = e3;
            if (e3.length == 0) {
                C8373dje c8373dje = C8373dje.aL;
                throw new MslEncodingException(c8373dje, "mastertoken " + c8401dkf);
            }
            byte[] e4 = c8401dkf.e("signature");
            this.k = e4;
            boolean b2 = b.b(e3, e4, e2);
            this.p = b2;
            try {
                C8401dkf c = e2.c(e3);
                long b3 = c.b("renewalwindow");
                this.i = b3;
                long b4 = c.b("expiration");
                this.f = b4;
                if (b4 < b3) {
                    C8373dje c8373dje2 = C8373dje.aw;
                    throw new MslException(c8373dje2, "mastertokendata " + c);
                }
                long b5 = c.b("sequencenumber");
                this.f13856o = b5;
                if (b5 < 0 || b5 > 9007199254740992L) {
                    C8373dje c8373dje3 = C8373dje.az;
                    throw new MslException(c8373dje3, "mastertokendata " + c);
                }
                long b6 = c.b("serialnumber");
                this.n = b6;
                if (b6 < 0 || b6 > 9007199254740992L) {
                    C8373dje c8373dje4 = C8373dje.aE;
                    throw new MslException(c8373dje4, "mastertokendata " + c);
                }
                byte[] e5 = c.e("sessiondata");
                if (e5.length == 0) {
                    C8373dje c8373dje5 = C8373dje.aG;
                    throw new MslEncodingException(c8373dje5, "mastertokendata " + c);
                }
                byte[] e6 = b2 ? b.e(e5, e2) : null;
                this.m = c.h("requirements") ? new dkP(c.b("requirements", e2)) : null;
                if (e6 == null) {
                    this.l = null;
                    this.h = null;
                    this.g = null;
                    this.a = null;
                    this.q = null;
                    return;
                }
                try {
                    C8401dkf c2 = e2.c(e6);
                    this.l = c2;
                    this.h = c2.h("issuerdata") ? c2.b("issuerdata", e2) : null;
                    this.g = c2.g("identity");
                    byte[] e7 = c2.e("encryptionkey");
                    String b7 = c2.b("encryptionalgorithm", "AES");
                    if (c2.h("signaturekey")) {
                        e = c2.e("signaturekey");
                    } else {
                        e = c2.e("hmackey");
                    }
                    String b8 = c2.b("signaturealgorithm", "HmacSHA256");
                    this.b = c2.h("appid") ? d(e2) : null;
                    this.e = c2.h("devid") ? c(e2) : null;
                    try {
                        String encryptionAlgo = MslConstants.EncryptionAlgo.c(b7).toString();
                        String signatureAlgo = MslConstants.SignatureAlgo.d(b8).toString();
                        try {
                            this.a = new SecretKeySpec(e7, encryptionAlgo);
                            this.q = new SecretKeySpec(e, signatureAlgo);
                        } catch (IllegalArgumentException e8) {
                            throw new MslCryptoException(C8373dje.aA, e8);
                        }
                    } catch (IllegalArgumentException e9) {
                        C8373dje c8373dje6 = C8373dje.bU;
                        throw new MslCryptoException(c8373dje6, "encryption algorithm: " + b7 + "; signature algorithm" + b8, e9);
                    }
                } catch (MslEncoderException e10) {
                    C8373dje c8373dje7 = C8373dje.aC;
                    throw new MslEncodingException(c8373dje7, "sessiondata " + C8427dle.e(e6), e10);
                }
            } catch (MslEncoderException e11) {
                C8373dje c8373dje8 = C8373dje.aH;
                throw new MslEncodingException(c8373dje8, "mastertokendata " + C8427dle.e(this.s), e11);
            }
        } catch (MslEncoderException e12) {
            C8373dje c8373dje9 = C8373dje.bd;
            throw new MslEncodingException(c8373dje9, "mastertoken " + c8401dkf, e12);
        }
    }

    public boolean a(Date date) {
        if (date != null) {
            return this.i * 1000 <= date.getTime();
        } else if (f()) {
            return this.i * 1000 <= this.c.f();
        } else {
            return true;
        }
    }

    public boolean b(Date date) {
        if (date != null) {
            return this.f * 1000 <= date.getTime();
        } else if (f()) {
            return this.f * 1000 <= this.c.f();
        } else {
            return false;
        }
    }

    public boolean d(dkO dko) {
        long j = this.f13856o;
        long j2 = dko.f13856o;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return i == 0 ? this.f > dko.f : i > 0 ? j2 >= j - 9007199254740865L : j < j2 - 9007199254740865L;
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
        if (this.j.containsKey(c8404dki)) {
            return this.j.get(c8404dki);
        }
        byte[] bArr2 = this.s;
        if (bArr2 == null && this.k == null) {
            try {
                AbstractC8393djy b = this.c.b();
                try {
                    byte[] a = b.a(abstractC8399dkd.c(this.l, c8404dki), abstractC8399dkd, c8404dki);
                    C8401dkf e = abstractC8399dkd.e();
                    e.e("renewalwindow", Long.valueOf(this.i));
                    e.e("expiration", Long.valueOf(this.f));
                    e.e("sequencenumber", Long.valueOf(this.f13856o));
                    e.e("serialnumber", Long.valueOf(this.n));
                    e.e("sessiondata", (Object) a);
                    dkP dkp = this.m;
                    if (dkp != null) {
                        e.e("requirements", dkp);
                    }
                    byte[] c = abstractC8399dkd.c(e, c8404dki);
                    try {
                        bArr = b.b(c, abstractC8399dkd, c8404dki);
                        bArr2 = c;
                    } catch (MslCryptoException e2) {
                        throw new MslEncoderException("Error signing the token data.", e2);
                    }
                } catch (MslCryptoException e3) {
                    throw new MslEncoderException("Error encrypting the session data.", e3);
                }
            } catch (MslCryptoException e4) {
                throw new MslEncoderException("Error creating the MSL crypto context.", e4);
            }
        } else {
            bArr = this.k;
        }
        C8401dkf e5 = abstractC8399dkd.e();
        e5.e("tokendata", (Object) bArr2);
        e5.e("signature", (Object) bArr);
        this.j.put(c8404dki, e5);
        return e5;
    }

    public String toString() {
        AbstractC8399dkd e = this.c.e();
        C8401dkf e2 = e.e();
        e2.e("renewalwindow", Long.valueOf(this.i));
        e2.e("expiration", Long.valueOf(this.f));
        e2.e("sequencenumber", Long.valueOf(this.f13856o));
        e2.e("serialnumber", Long.valueOf(this.n));
        dkP dkp = this.m;
        if (dkp != null) {
            try {
                e2.e("requirements", dkp.b(e, C8404dki.b));
            } catch (MslEncoderException unused) {
            }
        }
        e2.e("sessiondata", "(redacted)");
        C8401dkf e3 = e.e();
        e3.e("tokendata", e2);
        Object obj = this.k;
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
        if (obj instanceof dkO) {
            dkO dko = (dkO) obj;
            return this.n == dko.n && this.f13856o == dko.f13856o && this.f == dko.f;
        }
        return false;
    }

    public int hashCode() {
        return (String.valueOf(this.n) + ":" + String.valueOf(this.f13856o) + ":" + String.valueOf(this.f)).hashCode();
    }
}
