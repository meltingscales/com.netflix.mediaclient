package com.netflix.msl.crypto;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.io.MslEncoderException;
import o.AbstractC8399dkd;
import o.C8373dje;
import o.C8401dkf;
import o.C8404dki;
import o.C8427dle;
import o.InterfaceC8400dke;

/* loaded from: classes5.dex */
public class MslCiphertextEnvelope implements InterfaceC8400dke {
    private final String a;
    private MslConstants.CipherSpec b;
    private final byte[] c;
    private final byte[] d;
    private final Version e;

    public byte[] b() {
        return this.d;
    }

    public byte[] c() {
        return this.c;
    }

    /* loaded from: classes5.dex */
    public enum Version {
        V1,
        V2;

        public static Version e(int i) {
            if (i != 1) {
                if (i == 2) {
                    return V2;
                }
                throw new IllegalArgumentException("Unknown ciphertext envelope version " + i + ".");
            }
            return V1;
        }

        public int c() {
            int i = AnonymousClass5.a[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 2;
                }
                throw new MslInternalException("No integer value defined for version " + this + ".");
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.msl.crypto.MslCiphertextEnvelope$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Version.values().length];
            a = iArr;
            try {
                iArr[Version.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Version.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static Version a(C8401dkf c8401dkf) {
        if (!c8401dkf.h("version")) {
            return Version.V1;
        }
        try {
            return Version.e(c8401dkf.c("version"));
        } catch (MslEncoderException unused) {
            return Version.V1;
        } catch (IllegalArgumentException e) {
            C8373dje c8373dje = C8373dje.cb;
            throw new MslCryptoException(c8373dje, "ciphertext envelope " + c8401dkf, e);
        }
    }

    public MslCiphertextEnvelope(String str, byte[] bArr, byte[] bArr2) {
        this.e = Version.V1;
        this.a = str;
        this.b = null;
        this.d = bArr;
        this.c = bArr2;
    }

    public MslCiphertextEnvelope(MslConstants.CipherSpec cipherSpec, byte[] bArr, byte[] bArr2) {
        this.e = Version.V2;
        this.a = null;
        this.b = cipherSpec;
        this.d = bArr;
        this.c = bArr2;
    }

    public MslCiphertextEnvelope(C8401dkf c8401dkf) {
        this(c8401dkf, a(c8401dkf));
    }

    public MslCiphertextEnvelope(C8401dkf c8401dkf, Version version) {
        int i = AnonymousClass5.a[version.ordinal()];
        if (i == 1) {
            try {
                this.e = Version.V1;
                this.a = c8401dkf.g("keyid");
                this.b = null;
                this.d = c8401dkf.h("iv") ? c8401dkf.e("iv") : null;
                this.c = c8401dkf.e("ciphertext");
                c8401dkf.e("sha256");
            } catch (MslEncoderException e) {
                C8373dje c8373dje = C8373dje.bd;
                throw new MslEncodingException(c8373dje, "ciphertext envelope " + c8401dkf, e);
            }
        } else if (i == 2) {
            try {
                Version e2 = Version.e(c8401dkf.c("version"));
                this.e = e2;
                if (!Version.V2.equals(e2)) {
                    C8373dje c8373dje2 = C8373dje.cb;
                    throw new MslCryptoException(c8373dje2, "ciphertext envelope " + c8401dkf.toString());
                }
                this.a = null;
                try {
                    this.b = MslConstants.CipherSpec.b(c8401dkf.g("cipherspec"));
                    this.d = c8401dkf.h("iv") ? c8401dkf.e("iv") : null;
                    this.c = c8401dkf.e("ciphertext");
                } catch (IllegalArgumentException e3) {
                    C8373dje c8373dje3 = C8373dje.cc;
                    throw new MslCryptoException(c8373dje3, "ciphertext envelope " + c8401dkf, e3);
                }
            } catch (MslEncoderException e4) {
                C8373dje c8373dje4 = C8373dje.bd;
                throw new MslEncodingException(c8373dje4, "ciphertext envelope " + c8401dkf, e4);
            }
        } else {
            C8373dje c8373dje5 = C8373dje.cs;
            throw new MslCryptoException(c8373dje5, "ciphertext envelope version " + version);
        }
    }

    @Override // o.InterfaceC8400dke
    public byte[] c(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        return abstractC8399dkd.c(b(abstractC8399dkd, c8404dki), c8404dki);
    }

    @Override // o.InterfaceC8400dke
    public C8401dkf b(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        C8401dkf e = abstractC8399dkd.e();
        int i = AnonymousClass5.a[this.e.ordinal()];
        if (i == 1) {
            e.e("keyid", this.a);
            byte[] bArr = this.d;
            if (bArr != null) {
                e.e("iv", (Object) bArr);
            }
            e.e("ciphertext", (Object) this.c);
            e.e("sha256", (Object) C8427dle.e("AA=="));
        } else if (i == 2) {
            e.e("version", Integer.valueOf(this.e.c()));
            e.e("cipherspec", this.b.toString());
            byte[] bArr2 = this.d;
            if (bArr2 != null) {
                e.e("iv", (Object) bArr2);
            }
            e.e("ciphertext", (Object) this.c);
        } else {
            throw new MslEncoderException("Ciphertext envelope version " + this.e + " encoding unsupported.");
        }
        return e;
    }
}
