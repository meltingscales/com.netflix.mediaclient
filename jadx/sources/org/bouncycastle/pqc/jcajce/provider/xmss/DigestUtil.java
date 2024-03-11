package org.bouncycastle.pqc.jcajce.provider.xmss;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* loaded from: classes6.dex */
class DigestUtil {
    DigestUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier getDigestOID(String str) {
        if (str.equals("SHA-256")) {
            return NISTObjectIdentifiers.id_sha256;
        }
        if (str.equals("SHA-512")) {
            return NISTObjectIdentifiers.id_sha512;
        }
        if (str.equals("SHAKE128")) {
            return NISTObjectIdentifiers.id_shake128;
        }
        if (str.equals("SHAKE256")) {
            return NISTObjectIdentifiers.id_shake256;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
