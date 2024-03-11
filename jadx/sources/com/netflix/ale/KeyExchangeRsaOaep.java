package com.netflix.ale;

import com.google.gson.Gson;
import com.netflix.ale.gson.AleGson;
import java.util.Map;
import o.C8632dsu;
import o.dpD;
import o.dqD;

/* loaded from: classes5.dex */
public final class KeyExchangeRsaOaep extends KeyExchangeBase implements KeyExchange {
    private final AleKeyPair keypair;
    private final String pubkeySpkiB64;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ KeyExchangeRsaOaep(com.netflix.ale.AleCrypto r7, com.netflix.ale.AleUtil r8, com.netflix.ale.AleScheme r9, com.netflix.ale.AleKeyPair r10, java.lang.String r11, int r12, o.C8627dsp r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L8
            com.netflix.ale.AleKeyPair r10 = r7.generateRsaOaepKey()
        L8:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L11
            java.lang.String r11 = r7.exportPublicKey(r4)
        L11:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.ale.KeyExchangeRsaOaep.<init>(com.netflix.ale.AleCrypto, com.netflix.ale.AleUtil, com.netflix.ale.AleScheme, com.netflix.ale.AleKeyPair, java.lang.String, int, o.dsp):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyExchangeRsaOaep(AleCrypto aleCrypto, AleUtil aleUtil, AleScheme aleScheme, AleKeyPair aleKeyPair, String str) {
        super(AleKeyxScheme.RSA_OAEP_256, aleCrypto, aleUtil, aleScheme);
        C8632dsu.c((Object) aleCrypto, "");
        C8632dsu.c((Object) aleUtil, "");
        C8632dsu.c((Object) aleScheme, "");
        C8632dsu.c((Object) aleKeyPair, "");
        C8632dsu.c((Object) str, "");
        this.keypair = aleKeyPair;
        this.pubkeySpkiB64 = str;
    }

    @Override // com.netflix.ale.KeyExchange
    public KeyxRequestData getKeyxRequestData() {
        Map b;
        AleKeyxScheme aleKeyxScheme = AleKeyxScheme.RSA_OAEP_256;
        b = dqD.b(dpD.a("pubkey", this.pubkeySpkiB64));
        return new KeyxRequestData(aleKeyxScheme, b);
    }

    public final AleKey getPublicKey() {
        return this.keypair.getPublicKey();
    }

    @Override // com.netflix.ale.KeyExchange
    public Jwe processKeyxResponse(KeyxResponseData keyxResponseData) {
        RsaOaepKeyxResponseData rsaOaepKeyxResponseData;
        C8632dsu.c((Object) keyxResponseData, "");
        if (keyxResponseData.getScheme() != AleKeyxScheme.RSA_OAEP_256) {
            throw new Exception("incompatible key response scheme");
        }
        String kid = keyxResponseData.getKid();
        if (keyxResponseData.getData() instanceof Map) {
            Object obj = ((Map) keyxResponseData.getData()).get("wrappedkey");
            C8632dsu.d(obj);
            rsaOaepKeyxResponseData = new RsaOaepKeyxResponseData((String) obj);
        } else {
            Gson create = AleGson.Companion.create();
            Object data = keyxResponseData.getData();
            C8632dsu.d(data);
            Object fromJson = create.fromJson((String) data, (Class<Object>) RsaOaepKeyxResponseData.class);
            C8632dsu.a(fromJson, "");
            rsaOaepKeyxResponseData = (RsaOaepKeyxResponseData) fromJson;
        }
        if (!rsaOaepKeyxResponseData.isValid()) {
            throw new Exception("incompatible key response data");
        }
        return createJweFromKey(getCrypto().rsaOaepDecrypt(this.keypair.getPrivateKey(), getUtil().base64ToBytes(rsaOaepKeyxResponseData.getWrappedkey())), kid);
    }
}
