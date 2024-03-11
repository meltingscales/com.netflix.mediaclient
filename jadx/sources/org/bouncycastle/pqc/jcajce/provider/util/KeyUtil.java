package org.bouncycastle.pqc.jcajce.provider.util;

import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.crypto.util.SubjectPublicKeyInfoFactory;

/* loaded from: classes6.dex */
public class KeyUtil {
    public static byte[] getEncodedPrivateKeyInfo(PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.getEncoded("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter, ASN1Set aSN1Set) {
        if (asymmetricKeyParameter.isPrivate()) {
            try {
                return getEncodedPrivateKeyInfo(PrivateKeyInfoFactory.createPrivateKeyInfo(asymmetricKeyParameter, aSN1Set));
            } catch (Exception unused) {
                return null;
            }
        }
        throw new IllegalArgumentException("public key found");
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.getEncoded("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) {
        if (asymmetricKeyParameter.isPrivate()) {
            throw new IllegalArgumentException("private key found");
        }
        try {
            return getEncodedSubjectPublicKeyInfo(SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
        } catch (Exception unused) {
            return null;
        }
    }
}
