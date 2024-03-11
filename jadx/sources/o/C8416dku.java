package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslMessageException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.dku  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8416dku extends dkC {
    protected final djG c;
    protected final MslContext d;
    protected final C8401dkf e;
    private final MslConstants.ResponseCode f;
    private final int g;
    private final String h;
    private final long i;
    private final Long j;

    /* renamed from: o  reason: collision with root package name */
    private final String f13859o;
    protected final Map<C8404dki, byte[]> b = new HashMap();
    protected final Map<C8404dki, C8401dkf> a = new HashMap();

    public int a() {
        return this.g;
    }

    public long b() {
        return this.i;
    }

    public MslConstants.ResponseCode c() {
        return this.f;
    }

    public djG d() {
        return this.c;
    }

    public String e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8416dku(MslContext mslContext, byte[] bArr, djG djg, byte[] bArr2) {
        MslConstants.ResponseCode responseCode;
        this.d = mslContext;
        AbstractC8399dkd e = mslContext.e();
        try {
            this.c = djg;
            if (djg == null) {
                throw new MslMessageException(C8373dje.aP);
            }
            djI a = djg.a();
            djK d = mslContext.d(a);
            if (d == null) {
                throw new MslEntityAuthException(C8373dje.p, a.c());
            }
            AbstractC8393djy e2 = d.e(mslContext, djg);
            if (!e2.b(bArr, bArr2, e)) {
                throw new MslCryptoException(C8373dje.bb).d(djg);
            }
            byte[] e3 = e2.e(bArr, e);
            try {
                C8401dkf c = e.c(e3);
                this.e = c;
                long b = c.b("messageid");
                this.i = b;
                if (b < 0 || b > 9007199254740992L) {
                    C8373dje c8373dje = C8373dje.aR;
                    throw new MslMessageException(c8373dje, "errordata " + c).d(djg);
                }
                try {
                    this.j = c.h("timestamp") ? Long.valueOf(c.b("timestamp")) : null;
                    MslConstants.ResponseCode responseCode2 = MslConstants.ResponseCode.FAIL;
                    try {
                        responseCode = MslConstants.ResponseCode.b(c.c("errorcode"));
                    } catch (IllegalArgumentException unused) {
                        responseCode = MslConstants.ResponseCode.FAIL;
                    }
                    this.f = responseCode;
                    if (this.e.h("internalcode")) {
                        int c2 = this.e.c("internalcode");
                        this.g = c2;
                        if (c2 < 0) {
                            C8373dje c8373dje2 = C8373dje.K;
                            throw new MslMessageException(c8373dje2, "errordata " + this.e).d(djg).a(this.i);
                        }
                    } else {
                        this.g = -1;
                    }
                    this.h = this.e.b("errormsg", (String) null);
                    this.f13859o = this.e.b("usermsg", (String) null);
                } catch (MslEncoderException e4) {
                    C8373dje c8373dje3 = C8373dje.bd;
                    throw new MslEncodingException(c8373dje3, "errordata " + this.e, e4).d(djg).a(this.i);
                }
            } catch (MslEncoderException e5) {
                C8373dje c8373dje4 = C8373dje.bd;
                throw new MslEncodingException(c8373dje4, "errordata " + C8427dle.e(e3), e5).d(djg);
            }
        } catch (MslCryptoException e6) {
            e6.d(djg);
            throw e6;
        } catch (MslEntityAuthException e7) {
            e7.d(djg);
            throw e7;
        }
    }

    public Date h() {
        if (this.j != null) {
            return new Date(this.j.longValue() * 1000);
        }
        return null;
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
        djK d = this.d.d(this.c.a());
        if (d == null) {
            throw new MslEncoderException("No entity authentication factory found for entity.");
        }
        try {
            AbstractC8393djy e = d.e(this.d, this.c);
            try {
                byte[] a = e.a(abstractC8399dkd.c(this.e, c8404dki), abstractC8399dkd, c8404dki);
                try {
                    byte[] c = e.c(a, abstractC8399dkd, c8404dki, this);
                    C8401dkf e2 = abstractC8399dkd.e();
                    e2.e("entityauthdata", this.c);
                    e2.e("errordata", (Object) a);
                    e2.e("signature", (Object) c);
                    this.a.put(c8404dki, e2);
                    return e2;
                } catch (MslCryptoException e3) {
                    throw new MslEncoderException("Error signing the error data.", e3);
                }
            } catch (MslCryptoException e4) {
                throw new MslEncoderException("Error encrypting the error data.", e4);
            }
        } catch (MslCryptoException e5) {
            throw new MslEncoderException("Error creating the entity crypto context.", e5);
        } catch (MslEntityAuthException e6) {
            throw new MslEncoderException("Error creating the entity crypto context.", e6);
        }
    }

    public boolean equals(Object obj) {
        Long l;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8416dku) {
            C8416dku c8416dku = (C8416dku) obj;
            if (this.c.equals(c8416dku.c) && ((((l = this.j) != null && l.equals(c8416dku.j)) || (this.j == null && c8416dku.j == null)) && this.i == c8416dku.i && this.f == c8416dku.f && this.g == c8416dku.g && ((str = this.h) == (str2 = c8416dku.h) || (str != null && str.equals(str2))))) {
                String str3 = this.f13859o;
                String str4 = c8416dku.f13859o;
                if (str3 == str4) {
                    return true;
                }
                if (str3 != null && str3.equals(str4)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        Long l = this.j;
        int hashCode2 = l != null ? l.hashCode() : 0;
        int hashCode3 = Long.valueOf(this.i).hashCode();
        int hashCode4 = this.f.hashCode();
        int hashCode5 = Integer.valueOf(this.g).hashCode();
        String str = this.h;
        int hashCode6 = str != null ? str.hashCode() : 0;
        String str2 = this.f13859o;
        return (((((hashCode ^ hashCode2) ^ hashCode3) ^ hashCode4) ^ hashCode5) ^ hashCode6) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
