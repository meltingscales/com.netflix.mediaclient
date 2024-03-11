package com.netflix.msl.crypto;

import o.AbstractC8389dju;

/* loaded from: classes5.dex */
public class RsaCryptoContext extends AbstractC8389dju {

    /* loaded from: classes5.dex */
    public enum Mode {
        ENCRYPT_DECRYPT_OAEP,
        ENCRYPT_DECRYPT_PKCS1,
        WRAP_UNWRAP,
        SIGN_VERIFY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RsaCryptoContext(com.netflix.msl.util.MslContext r9, java.lang.String r10, java.security.PrivateKey r11, java.security.PublicKey r12, com.netflix.msl.crypto.RsaCryptoContext.Mode r13) {
        /*
            r8 = this;
            com.netflix.msl.crypto.RsaCryptoContext$Mode r9 = com.netflix.msl.crypto.RsaCryptoContext.Mode.ENCRYPT_DECRYPT_PKCS1
            boolean r9 = r9.equals(r13)
            java.lang.String r0 = "nullOp"
            if (r9 == 0) goto Ld
            java.lang.String r9 = "RSA/ECB/PKCS1Padding"
            goto L17
        Ld:
            com.netflix.msl.crypto.RsaCryptoContext$Mode r9 = com.netflix.msl.crypto.RsaCryptoContext.Mode.ENCRYPT_DECRYPT_OAEP
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L19
            java.lang.String r9 = "RSA/ECB/OAEPPadding"
        L17:
            r5 = r9
            goto L1a
        L19:
            r5 = r0
        L1a:
            com.netflix.msl.crypto.RsaCryptoContext$Mode r9 = com.netflix.msl.crypto.RsaCryptoContext.Mode.ENCRYPT_DECRYPT_OAEP
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L25
            javax.crypto.spec.OAEPParameterSpec r9 = javax.crypto.spec.OAEPParameterSpec.DEFAULT
            goto L26
        L25:
            r9 = 0
        L26:
            r6 = r9
            com.netflix.msl.crypto.RsaCryptoContext$Mode r9 = com.netflix.msl.crypto.RsaCryptoContext.Mode.SIGN_VERIFY
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L31
            java.lang.String r0 = "SHA256withRSA"
        L31:
            r7 = r0
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.netflix.msl.crypto.RsaCryptoContext$Mode r9 = com.netflix.msl.crypto.RsaCryptoContext.Mode.WRAP_UNWRAP
            if (r13 == r9) goto L3e
            return
        L3e:
            com.netflix.msl.MslInternalException r9 = new com.netflix.msl.MslInternalException
            java.lang.String r10 = "Wrap/unwrap unsupported."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.msl.crypto.RsaCryptoContext.<init>(com.netflix.msl.util.MslContext, java.lang.String, java.security.PrivateKey, java.security.PublicKey, com.netflix.msl.crypto.RsaCryptoContext$Mode):void");
    }
}
