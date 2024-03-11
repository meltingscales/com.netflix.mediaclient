package com.netflix.ale;

import com.netflix.ale.gson.AleGson;
import java.util.List;
import kotlin.Pair;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.duD;

/* loaded from: classes5.dex */
public abstract class JweBase implements Jwe {
    public static final Companion Companion = new Companion(null);
    public static final int JWE_TAG_SIZE = 16;
    private final AleCrypto crypto;
    private final JweEncScheme enc;
    private final Number ivLength;
    private final String kid;
    private String testJoseHeader;
    private final AleUtil util;

    protected abstract byte[] doDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    protected abstract Pair<byte[], byte[]> doEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* JADX INFO: Access modifiers changed from: protected */
    public final AleCrypto getCrypto() {
        return this.crypto;
    }

    protected final JweEncScheme getEnc() {
        return this.enc;
    }

    protected final Number getIvLength() {
        return this.ivLength;
    }

    protected final String getKid() {
        return this.kid;
    }

    protected final AleUtil getUtil() {
        return this.util;
    }

    public final void setTempJoseHeader(String str) {
        C8632dsu.c((Object) str, "");
        this.testJoseHeader = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JweBase(AleCrypto aleCrypto, AleUtil aleUtil, JweEncScheme jweEncScheme, String str, Number number) {
        C8632dsu.c((Object) aleCrypto, "");
        C8632dsu.c((Object) aleUtil, "");
        C8632dsu.c((Object) jweEncScheme, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) number, "");
        this.crypto = aleCrypto;
        this.util = aleUtil;
        this.enc = jweEncScheme;
        this.kid = str;
        this.ivLength = number;
        this.testJoseHeader = "";
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.netflix.ale.Jwe
    public String encrypt(byte[] bArr) {
        C8632dsu.c((Object) bArr, "");
        String joseHeaderB64 = getJoseHeaderB64();
        AleCrypto aleCrypto = this.crypto;
        Number number = this.ivLength;
        C8632dsu.d(number);
        byte[] randomBytes = aleCrypto.getRandomBytes(((Integer) number).intValue());
        String bytesToBase64Url = this.util.bytesToBase64Url(randomBytes);
        Pair<byte[], byte[]> doEncrypt = doEncrypt(bArr, this.util.stringToUtf8Bytes(joseHeaderB64), randomBytes);
        String bytesToBase64Url2 = this.util.bytesToBase64Url(doEncrypt.b());
        String bytesToBase64Url3 = this.util.bytesToBase64Url(doEncrypt.c());
        return joseHeaderB64 + ".." + bytesToBase64Url + '.' + bytesToBase64Url2 + '.' + bytesToBase64Url3;
    }

    @Override // com.netflix.ale.Jwe
    public byte[] decrypt(String str) {
        List d;
        C8632dsu.c((Object) str, "");
        if (str.length() == 0) {
            throw new Exception("empty input");
        }
        d = duD.d((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        if (d.size() != 5) {
            throw new Exception("malformed JWE envelope");
        }
        if (((CharSequence) d.get(1)).length() > 0) {
            throw new Exception("expected no CEK");
        }
        byte[] stringToUtf8Bytes = this.util.stringToUtf8Bytes((String) d.get(0));
        byte[] base64ToBytes = this.util.base64ToBytes((String) d.get(2));
        byte[] base64ToBytes2 = this.util.base64ToBytes((String) d.get(3));
        byte[] base64ToBytes3 = this.util.base64ToBytes((String) d.get(4));
        int length = base64ToBytes.length;
        Number number = this.ivLength;
        if (!(number instanceof Integer) || length != number.intValue()) {
            throw new Exception("iv wrong length (found " + base64ToBytes.length + ", expected " + this.ivLength);
        } else if (base64ToBytes3.length != 16) {
            throw new Exception("tag wrong length (found " + base64ToBytes3.length + ", expected 16");
        } else {
            byte[] doDecrypt = doDecrypt(base64ToBytes, stringToUtf8Bytes, base64ToBytes2, base64ToBytes3);
            try {
                parseJoseHeader(this.util.utf8BytesToString(this.util.base64ToBytes(this.util.utf8BytesToString(stringToUtf8Bytes))));
                return doDecrypt;
            } catch (Throwable th) {
                throw new Exception(th.getMessage(), th);
            }
        }
    }

    private final JoseHeader parseJoseHeader(String str) {
        try {
            Object fromJson = AleGson.Companion.create().fromJson(str, (Class<Object>) JoseHeader.class);
            C8632dsu.a(fromJson, "");
            JoseHeader joseHeader = (JoseHeader) fromJson;
            if (!joseHeader.isValid()) {
                throw new Exception("unexpected JWE header contents - " + joseHeader.enumerateProblems());
            } else if (!C8632dsu.c((Object) joseHeader.getAlg(), (Object) "dir")) {
                throw new Exception("incompatible JWE header - alg parameter must be `dir', but was given `" + joseHeader.getAlg() + '\'');
            } else if (joseHeader.getEnc() != this.enc) {
                throw new Exception("incompatible JWE header - enc parameter mismatch: given `" + joseHeader.getEnc() + "' but expected `" + this.enc + '\'');
            } else if (C8632dsu.c((Object) joseHeader.getKid(), (Object) this.kid)) {
                return joseHeader;
            } else {
                throw new Exception("mismatched kid - given `" + joseHeader.getKid() + "' but expected `" + this.kid + '\'');
            }
        } catch (Throwable th) {
            throw new Error("malformed JWE header", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] catByteArrays(byte[][] bArr) {
        C8632dsu.c((Object) bArr, "");
        if (bArr.length == 0) {
            return new byte[0];
        }
        if (bArr.length == 1) {
            return bArr[0];
        }
        byte[] bArr2 = new byte[0];
        for (byte[] bArr3 : bArr) {
            bArr2 = C8564dqg.a(bArr2, bArr3);
        }
        return bArr2;
    }

    private final String getJoseHeaderB64() {
        return this.util.bytesToBase64Url(this.util.stringToUtf8Bytes(getJoseHeader()));
    }

    private final String getJoseHeader() {
        if (!C8632dsu.c((Object) this.testJoseHeader, (Object) "")) {
            String str = this.testJoseHeader;
            this.testJoseHeader = "";
            return str;
        }
        String json = AleGson.Companion.create().toJson(new JoseHeader("dir", this.enc, this.kid));
        C8632dsu.a(json, "");
        return json;
    }
}
