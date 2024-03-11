package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class dkQ implements InterfaceC8400dke {
    private final MslContext a;
    private final Map<C8404dki, byte[]> b;
    private final MslConstants.CompressionAlgorithm c;
    private final AbstractC8393djy d;
    private final byte[] e;
    private final byte[] f;
    private final boolean g;
    private final String h;
    private final Map<C8404dki, C8401dkf> i;
    private final long j;
    private final boolean l;
    private final long m;
    private final byte[] n;

    /* renamed from: o  reason: collision with root package name */
    private final byte[] f13857o;

    public byte[] a() {
        return this.f;
    }

    public long b() {
        return this.j;
    }

    public boolean c() {
        return this.j != -1;
    }

    public String d() {
        return this.h;
    }

    public long e() {
        return this.m;
    }

    public boolean f() {
        return this.m != -1;
    }

    public boolean h() {
        return this.j == -1 && this.m == -1;
    }

    private static AbstractC8393djy c(AbstractC8399dkd abstractC8399dkd, C8401dkf c8401dkf, Map<String, AbstractC8393djy> map) {
        try {
            byte[] e = c8401dkf.e("tokendata");
            if (e.length == 0) {
                C8373dje c8373dje = C8373dje.bJ;
                throw new MslEncodingException(c8373dje, "servicetoken " + c8401dkf);
            }
            String g = abstractC8399dkd.c(e).g("name");
            if (map.containsKey(g)) {
                return map.get(g);
            }
            return map.get("");
        } catch (MslEncoderException e2) {
            C8373dje c8373dje2 = C8373dje.bd;
            throw new MslEncodingException(c8373dje2, "servicetoken " + c8401dkf, e2);
        }
    }

    public dkQ(MslContext mslContext, C8401dkf c8401dkf, dkO dko, dkU dku, Map<String, AbstractC8393djy> map) {
        this(mslContext, c8401dkf, dko, dku, c(mslContext.e(), c8401dkf, map));
    }

    public dkQ(MslContext mslContext, C8401dkf c8401dkf, dkO dko, dkU dku, AbstractC8393djy abstractC8393djy) {
        this.b = new HashMap();
        this.i = new HashMap();
        this.a = mslContext;
        this.d = abstractC8393djy;
        AbstractC8399dkd e = mslContext.e();
        try {
            byte[] e2 = c8401dkf.e("tokendata");
            this.n = e2;
            if (e2.length == 0) {
                C8373dje c8373dje = C8373dje.bJ;
                throw new MslEncodingException(c8373dje, "servicetoken " + c8401dkf).e(dko).b(dku);
            }
            byte[] e3 = c8401dkf.e("signature");
            this.f13857o = e3;
            boolean b = abstractC8393djy != null ? abstractC8393djy.b(e2, e3, e) : false;
            this.l = b;
            try {
                C8401dkf c = e.c(e2);
                this.h = c.g("name");
                if (c.h("mtserialnumber")) {
                    long b2 = c.b("mtserialnumber");
                    this.j = b2;
                    if (b2 < 0 || b2 > 9007199254740992L) {
                        C8373dje c8373dje2 = C8373dje.bG;
                        throw new MslException(c8373dje2, "servicetokendata " + c).e(dko).b(dku);
                    }
                } else {
                    this.j = -1L;
                }
                if (c.h("uitserialnumber")) {
                    long b3 = c.b("uitserialnumber");
                    this.m = b3;
                    if (b3 < 0 || b3 > 9007199254740992L) {
                        C8373dje c8373dje3 = C8373dje.bM;
                        throw new MslException(c8373dje3, "servicetokendata " + c).e(dko).b(dku);
                    }
                } else {
                    this.m = -1L;
                }
                boolean a = c.a("encrypted");
                this.g = a;
                if (c.h("compressionalgo")) {
                    String g = c.g("compressionalgo");
                    try {
                        this.c = MslConstants.CompressionAlgorithm.valueOf(g);
                    } catch (IllegalArgumentException e4) {
                        throw new MslException(C8373dje.bZ, g, e4);
                    }
                } else {
                    this.c = null;
                }
                byte[] e5 = c.e("servicedata");
                if (b) {
                    if (a && e5.length > 0) {
                        e5 = abstractC8393djy.e(e5, e);
                    }
                    this.e = e5;
                    MslConstants.CompressionAlgorithm compressionAlgorithm = this.c;
                    this.f = compressionAlgorithm != null ? C8428dlf.d(compressionAlgorithm, e5) : e5;
                } else {
                    this.e = e5;
                    this.f = e5.length == 0 ? new byte[0] : null;
                }
                long j = this.j;
                if (j != -1 && (dko == null || j != dko.c())) {
                    C8373dje c8373dje4 = C8373dje.bA;
                    throw new MslException(c8373dje4, "st mtserialnumber " + this.j + "; mt " + dko).e(dko).b(dku);
                }
                long j2 = this.m;
                if (j2 != -1) {
                    if (dku == null || j2 != dku.a()) {
                        C8373dje c8373dje5 = C8373dje.bK;
                        throw new MslException(c8373dje5, "st uitserialnumber " + this.m + "; uit " + dku).e(dko).b(dku);
                    }
                }
            } catch (MslCryptoException e6) {
                e6.e(dko);
                e6.b(dku);
                throw e6;
            } catch (MslEncoderException e7) {
                C8373dje c8373dje6 = C8373dje.bd;
                throw new MslEncodingException(c8373dje6, "servicetokendata " + C8427dle.e(this.n), e7).e(dko).b(dku);
            }
        } catch (MslCryptoException e8) {
            e8.e(dko);
            throw e8;
        } catch (MslEncoderException e9) {
            C8373dje c8373dje7 = C8373dje.bd;
            throw new MslEncodingException(c8373dje7, "servicetoken " + c8401dkf, e9).e(dko).b(dku);
        }
    }

    public boolean c(dkO dko) {
        return dko != null && dko.c() == this.j;
    }

    public boolean b(dkU dku) {
        return dku != null && dku.a() == this.m;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @Override // o.InterfaceC8400dke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.C8401dkf b(o.AbstractC8399dkd r8, o.C8404dki r9) {
        /*
            r7 = this;
            java.util.Map<o.dki, o.dkf> r0 = r7.i
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L11
            java.util.Map<o.dki, o.dkf> r8 = r7.i
            java.lang.Object r8 = r8.get(r9)
            o.dkf r8 = (o.C8401dkf) r8
            return r8
        L11:
            byte[] r0 = r7.n
            if (r0 != 0) goto L92
            byte[] r1 = r7.f13857o
            if (r1 == 0) goto L1b
            goto L92
        L1b:
            boolean r0 = r7.g     // Catch: com.netflix.msl.MslCryptoException -> L89
            if (r0 == 0) goto L2b
            byte[] r0 = r7.e     // Catch: com.netflix.msl.MslCryptoException -> L89
            int r1 = r0.length     // Catch: com.netflix.msl.MslCryptoException -> L89
            if (r1 <= 0) goto L2b
            o.djy r1 = r7.d     // Catch: com.netflix.msl.MslCryptoException -> L89
            byte[] r0 = r1.a(r0, r8, r9)     // Catch: com.netflix.msl.MslCryptoException -> L89
            goto L2d
        L2b:
            byte[] r0 = r7.e     // Catch: com.netflix.msl.MslCryptoException -> L89
        L2d:
            o.dkf r1 = r8.e()
            java.lang.String r2 = r7.h
            java.lang.String r3 = "name"
            r1.e(r3, r2)
            long r2 = r7.j
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L49
            java.lang.String r6 = "mtserialnumber"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.e(r6, r2)
        L49:
            long r2 = r7.m
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L58
            java.lang.String r4 = "uitserialnumber"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.e(r4, r2)
        L58:
            boolean r2 = r7.g
            java.lang.String r3 = "encrypted"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.e(r3, r2)
            com.netflix.msl.MslConstants$CompressionAlgorithm r2 = r7.c
            if (r2 == 0) goto L70
            java.lang.String r3 = "compressionalgo"
            java.lang.String r2 = r2.name()
            r1.e(r3, r2)
        L70:
            java.lang.String r2 = "servicedata"
            r1.e(r2, r0)
            byte[] r0 = r8.c(r1, r9)
            o.djy r1 = r7.d     // Catch: com.netflix.msl.MslCryptoException -> L80
            byte[] r1 = r1.b(r0, r8, r9)     // Catch: com.netflix.msl.MslCryptoException -> L80
            goto L94
        L80:
            r8 = move-exception
            com.netflix.msl.io.MslEncoderException r9 = new com.netflix.msl.io.MslEncoderException
            java.lang.String r0 = "Error signing the token data."
            r9.<init>(r0, r8)
            throw r9
        L89:
            r8 = move-exception
            com.netflix.msl.io.MslEncoderException r9 = new com.netflix.msl.io.MslEncoderException
            java.lang.String r0 = "Error encrypting the service data."
            r9.<init>(r0, r8)
            throw r9
        L92:
            byte[] r1 = r7.f13857o
        L94:
            o.dkf r8 = r8.e()
            java.lang.String r2 = "tokendata"
            r8.e(r2, r0)
            java.lang.String r0 = "signature"
            r8.e(r0, r1)
            java.util.Map<o.dki, o.dkf> r0 = r7.i
            r0.put(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dkQ.b(o.dkd, o.dki):o.dkf");
    }

    public String toString() {
        AbstractC8399dkd e = this.a.e();
        C8401dkf e2 = e.e();
        e2.e("name", this.h);
        e2.e("mtserialnumber", Long.valueOf(this.j));
        e2.e("uitserialnumber", Long.valueOf(this.m));
        e2.e("servicedata", "(redacted)");
        C8401dkf e3 = e.e();
        e3.e("tokendata", e2);
        Object obj = this.f13857o;
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
        if (obj instanceof dkQ) {
            dkQ dkq = (dkQ) obj;
            return this.h.equals(dkq.h) && this.j == dkq.j && this.m == dkq.m;
        }
        return false;
    }

    public int hashCode() {
        return (this.h + ":" + String.valueOf(this.j) + ":" + String.valueOf(this.m)).hashCode();
    }
}
