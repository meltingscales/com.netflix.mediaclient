package com.netflix.msl.crypto;

import com.netflix.msl.MslConstants;
import com.netflix.msl.MslInternalException;
import o.AbstractC8399dkd;
import o.C8401dkf;
import o.C8404dki;

/* loaded from: classes5.dex */
public class MslSignatureEnvelope {
    private final MslConstants.SignatureAlgo a;
    private final byte[] b;
    private final Version c;

    public byte[] d() {
        return this.b;
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
                throw new IllegalArgumentException("Unknown signature envelope version.");
            }
            return V1;
        }

        public int a() {
            int i = AnonymousClass5.b[ordinal()];
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
    /* renamed from: com.netflix.msl.crypto.MslSignatureEnvelope$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Version.values().length];
            b = iArr;
            try {
                iArr[Version.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Version.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MslSignatureEnvelope(byte[] bArr) {
        this.c = Version.V1;
        this.a = null;
        this.b = bArr;
    }

    public MslSignatureEnvelope(MslConstants.SignatureAlgo signatureAlgo, byte[] bArr) {
        this.c = Version.V2;
        this.a = signatureAlgo;
        this.b = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.netflix.msl.crypto.MslSignatureEnvelope c(byte[] r2, o.AbstractC8399dkd r3) {
        /*
            o.dki r0 = o.C8404dki.a(r2)     // Catch: com.netflix.msl.io.MslEncoderException -> Lc
            if (r0 != 0) goto L7
            goto Lc
        L7:
            o.dkf r3 = r3.c(r2)     // Catch: com.netflix.msl.io.MslEncoderException -> Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 == 0) goto L27
            java.lang.String r0 = "version"
            boolean r1 = r3.h(r0)
            if (r1 != 0) goto L18
            goto L27
        L18:
            int r0 = r3.c(r0)     // Catch: java.lang.IllegalArgumentException -> L21 com.netflix.msl.io.MslEncoderException -> L24
            com.netflix.msl.crypto.MslSignatureEnvelope$Version r0 = com.netflix.msl.crypto.MslSignatureEnvelope.Version.e(r0)     // Catch: java.lang.IllegalArgumentException -> L21 com.netflix.msl.io.MslEncoderException -> L24
            goto L29
        L21:
            com.netflix.msl.crypto.MslSignatureEnvelope$Version r0 = com.netflix.msl.crypto.MslSignatureEnvelope.Version.V1
            goto L29
        L24:
            com.netflix.msl.crypto.MslSignatureEnvelope$Version r0 = com.netflix.msl.crypto.MslSignatureEnvelope.Version.V1
            goto L29
        L27:
            com.netflix.msl.crypto.MslSignatureEnvelope$Version r0 = com.netflix.msl.crypto.MslSignatureEnvelope.Version.V1
        L29:
            int[] r1 = com.netflix.msl.crypto.MslSignatureEnvelope.AnonymousClass5.b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L76
            r1 = 2
            if (r0 != r1) goto L59
            java.lang.String r0 = "algorithm"
            java.lang.String r0 = r3.g(r0)     // Catch: java.lang.IllegalArgumentException -> L4d com.netflix.msl.io.MslEncoderException -> L53
            com.netflix.msl.MslConstants$SignatureAlgo r0 = com.netflix.msl.MslConstants.SignatureAlgo.d(r0)     // Catch: java.lang.IllegalArgumentException -> L4d com.netflix.msl.io.MslEncoderException -> L53
            java.lang.String r1 = "signature"
            byte[] r3 = r3.e(r1)     // Catch: java.lang.IllegalArgumentException -> L4d com.netflix.msl.io.MslEncoderException -> L53
            com.netflix.msl.crypto.MslSignatureEnvelope r1 = new com.netflix.msl.crypto.MslSignatureEnvelope     // Catch: java.lang.IllegalArgumentException -> L4d com.netflix.msl.io.MslEncoderException -> L53
            r1.<init>(r0, r3)     // Catch: java.lang.IllegalArgumentException -> L4d com.netflix.msl.io.MslEncoderException -> L53
            return r1
        L4d:
            com.netflix.msl.crypto.MslSignatureEnvelope r3 = new com.netflix.msl.crypto.MslSignatureEnvelope
            r3.<init>(r2)
            return r3
        L53:
            com.netflix.msl.crypto.MslSignatureEnvelope r3 = new com.netflix.msl.crypto.MslSignatureEnvelope
            r3.<init>(r2)
            return r3
        L59:
            o.dje r3 = o.C8373dje.cC
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "signature envelope "
            r0.append(r1)
            java.lang.String r2 = o.C8427dle.e(r2)
            r0.append(r2)
            com.netflix.msl.MslCryptoException r2 = new com.netflix.msl.MslCryptoException
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r0)
            throw r2
        L76:
            com.netflix.msl.crypto.MslSignatureEnvelope r3 = new com.netflix.msl.crypto.MslSignatureEnvelope
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.crypto.MslSignatureEnvelope.c(byte[], o.dkd):com.netflix.msl.crypto.MslSignatureEnvelope");
    }

    public byte[] a(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        int i = AnonymousClass5.b[this.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C8401dkf e = abstractC8399dkd.e();
                e.e("version", Integer.valueOf(this.c.a()));
                e.e("algorithm", this.a.name());
                e.e("signature", (Object) this.b);
                return abstractC8399dkd.c(e, c8404dki);
            }
            throw new MslInternalException("Signature envelope version " + this.c + " encoding unsupported.");
        }
        return this.b;
    }
}
