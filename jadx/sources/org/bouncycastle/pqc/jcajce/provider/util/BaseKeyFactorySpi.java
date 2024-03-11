package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: classes6.dex */
public abstract class BaseKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    private final ASN1ObjectIdentifier keyOid = null;
    private final Set<ASN1ObjectIdentifier> keyOids;

    public BaseKeyFactorySpi(Set<ASN1ObjectIdentifier> set) {
        this.keyOids = set;
    }

    private void checkAlgorithm(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = this.keyOid;
        if (aSN1ObjectIdentifier2 != null) {
            if (aSN1ObjectIdentifier2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
                return;
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + aSN1ObjectIdentifier);
        } else if (this.keyOids.contains(aSN1ObjectIdentifier)) {
        } else {
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + aSN1ObjectIdentifier);
        }
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                checkAlgorithm(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
                return generatePrivate(privateKeyInfo);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded());
                checkAlgorithm(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
                return generatePublic(subjectPublicKeyInfo);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }
}
