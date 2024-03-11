package o;

import com.netflix.android.org.json.JSONObject;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;
import com.netflix.mediaclient.service.msl.client.WidevineContextException;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.crypto.MslCiphertextEnvelope;
import com.netflix.msl.crypto.MslSignatureEnvelope;
import com.netflix.msl.util.MslContext;
import o.aPC;

/* renamed from: o.aZh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2085aZh extends AbstractC8393djy {
    private transient aPC.a a;
    private aPC.c b;
    private transient CryptoProvider c;
    private MslContext d;
    private aPC.c e;

    private C2085aZh(MslContext mslContext, JSONObject jSONObject) {
        String string = jSONObject.getString("encryptionKeyId");
        String optString = jSONObject.optString("hmacKeyId");
        String optString2 = jSONObject.optString("keySetId");
        String optString3 = jSONObject.optString("keySecLevel");
        if (C8168dfL.g(optString3)) {
            CryptoProvider a = C1834aPz.a.a();
            this.c = a;
            C1044Mm.a("nf_msl_WidevineCryptoContext", "Upgrade from older release, Widevine security level was not known, assume current: %s", a);
        } else {
            CryptoProvider b = CryptoProvider.b(optString3);
            this.c = b;
            C1044Mm.a("nf_msl_WidevineCryptoContext", "Widevine security level was known %s, found %s", optString3, b);
            CryptoProvider cryptoProvider = this.c;
            if (cryptoProvider == null || (cryptoProvider != CryptoProvider.WIDEVINE_L1 && cryptoProvider != CryptoProvider.WIDEVINE_L3)) {
                C1044Mm.e("nf_msl_WidevineCryptoContext", "Widevine security level was known before %s, but it is not supported. This should not happen. Use current", optString3);
                this.c = C1834aPz.a.a();
            } else {
                C1044Mm.a("nf_msl_WidevineCryptoContext", "Widevine security level was known before %s, restore it.", cryptoProvider);
            }
        }
        C1044Mm.e("nf_msl_WidevineCryptoContext", "WidevineCryptoContex:: restoring crypto session....");
        if (mslContext == null) {
            throw new IllegalStateException("MSL context is null!");
        }
        this.d = mslContext;
        this.b = new aPC.c(string);
        this.e = new aPC.c(optString);
        aPC.a c = aPB.d(this.c).c(new aPC.c(optString2));
        this.a = c;
        if (c == null) {
            throw new IllegalStateException("Unable to restore crypto session!");
        }
    }

    public C2085aZh(MslContext mslContext, String str, C8418dkw c8418dkw, C8417dkv c8417dkv, dkO dko) {
        C1044Mm.e("nf_msl_WidevineCryptoContext", "WidevineCryptoContex::");
        if (mslContext == null) {
            throw new IllegalStateException("MSL context is null!");
        }
        if (c8418dkw == null) {
            throw new IllegalStateException("CDM request is null!");
        }
        if (c8417dkv == null) {
            throw new IllegalStateException("CDM response is null!");
        }
        CryptoProvider a = C1834aPz.a.a();
        this.c = a;
        C1044Mm.a("nf_msl_WidevineCryptoContext", "Creating new WidevineCryptoContext for identity %s when crypto provider is %s", str, a);
        this.d = mslContext;
        this.b = new aPC.c(c8417dkv.a());
        this.e = new aPC.c(c8417dkv.e());
        this.a = aPB.d(this.c).c(c8418dkw, c8417dkv.b(), this.b, this.e);
    }

    @Override // o.AbstractC8393djy
    public byte[] a(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.b == null) {
            throw new MslCryptoException(C8373dje.k, "no encryption/decryption key");
        }
        C1044Mm.a("nf_msl_WidevineCryptoContext", "encrypt:: %s", this.c);
        try {
            byte[] bArr2 = new byte[16];
            this.d.j().nextBytes(bArr2);
            return new MslCiphertextEnvelope("", bArr2, bArr.length != 0 ? aPB.d(this.c).e(this.a, this.b, bArr, bArr2) : new byte[0]).c(abstractC8399dkd, c8404dki);
        } catch (Throwable th) {
            throw new WidevineContextException("WidevineCryptoContext::encrypt failed.", StatusCode.MSL_WV_ENCRYPT_ERROR, th);
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] e(byte[] bArr, AbstractC8399dkd abstractC8399dkd) {
        if (this.b == null) {
            throw new MslCryptoException(C8373dje.j, "no encryption/decryption key");
        }
        try {
            MslCiphertextEnvelope mslCiphertextEnvelope = new MslCiphertextEnvelope(abstractC8399dkd.c(bArr));
            byte[] c = mslCiphertextEnvelope.c();
            if (c.length == 0) {
                return new byte[0];
            }
            return aPB.d(this.c).d(this.a, this.b, c, mslCiphertextEnvelope.b());
        } catch (Throwable th) {
            throw new WidevineContextException("WidevineCryptoContext::decrypt failed.", StatusCode.MSL_WV_DECRYPT_ERROR, th);
        }
    }

    @Override // o.AbstractC8393djy
    public byte[] b(byte[] bArr, AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.e == null) {
            throw new MslCryptoException(C8373dje.bR, "No signature key.");
        }
        try {
            return new MslSignatureEnvelope(aPB.d(this.c).a(this.a, this.e, bArr)).a(abstractC8399dkd, c8404dki);
        } catch (Throwable th) {
            throw new WidevineContextException("WidevineCryptoContext::sign failed.", StatusCode.MSL_WV_SIGN_ERROR, th);
        }
    }

    @Override // o.AbstractC8393djy
    public boolean b(byte[] bArr, byte[] bArr2, AbstractC8399dkd abstractC8399dkd) {
        if (this.e == null) {
            throw new MslCryptoException(C8373dje.dl, "No signature key.");
        }
        try {
            return aPB.d(this.c).a(this.a, this.e, bArr, MslSignatureEnvelope.c(bArr2, abstractC8399dkd).d());
        } catch (MslCryptoException e) {
            throw e;
        } catch (MslEncodingException e2) {
            throw new MslCryptoException(C8373dje.bT, e2);
        } catch (Throwable th) {
            throw new WidevineContextException("WidevineCryptoContext::verify failed.", StatusCode.MSL_WV_VERIFY_ERROR, th);
        }
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encryptionKeyId", this.b.b());
        jSONObject.put("hmacKeyId", this.e.b());
        jSONObject.put("keySetId", this.a.b.b());
        jSONObject.put("keySecLevel", this.c.name());
        return jSONObject;
    }

    public String toString() {
        return "WidevineCryptoContext{encryptionKeyId='" + this.b + "', hmacKeyId='" + this.e + "', ctx=" + this.d + ", cryptoSession='" + this.a + "'}";
    }

    public void d() {
        C1044Mm.e("nf_msl_WidevineCryptoContext", "Widevine crypto context, release crypto session!");
        aPB.d(this.c).d(this.a);
    }

    public static C2085aZh b(MslContext mslContext, JSONObject jSONObject) {
        return new C2085aZh(mslContext, jSONObject);
    }
}
