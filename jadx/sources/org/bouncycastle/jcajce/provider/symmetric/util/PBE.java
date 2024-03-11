package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: classes6.dex */
public interface PBE {

    /* loaded from: classes6.dex */
    public static class Util {
        private static PBEParametersGenerator makePBEGenerator(int i, int i2) {
            if (i == 0 || i == 4) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 5) {
                            return new PKCS5S1ParametersGenerator(new MD2Digest());
                        }
                        throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                    }
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
            } else if (i != 1 && i != 5) {
                if (i == 2) {
                    switch (i2) {
                        case 0:
                            return new PKCS12ParametersGenerator(DigestFactory.createMD5PRF());
                        case 1:
                            return new PKCS12ParametersGenerator(DigestFactory.createSHA1PRF());
                        case 2:
                            return new PKCS12ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                        case 3:
                            return new PKCS12ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                        case 4:
                            return new PKCS12ParametersGenerator(DigestFactory.createSHA256PRF());
                        case 5:
                            return new PKCS12ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                        case 6:
                            return new PKCS12ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                        case 7:
                            return new PKCS12ParametersGenerator(DigestFactory.createSHA224PRF());
                        case 8:
                            return new PKCS12ParametersGenerator(DigestFactory.createSHA384PRF());
                        case 9:
                            return new PKCS12ParametersGenerator(DigestFactory.createSHA512PRF());
                        default:
                            throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                }
                return new OpenSSLPBEParametersGenerator();
            } else {
                switch (i2) {
                    case 0:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createMD5PRF());
                    case 1:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1PRF());
                    case 2:
                        return new PKCS5S2ParametersGenerator(new RIPEMD160Digest(CryptoServicePurpose.PRF));
                    case 3:
                        return new PKCS5S2ParametersGenerator(new TigerDigest(CryptoServicePurpose.PRF));
                    case 4:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256PRF());
                    case 5:
                        return new PKCS5S2ParametersGenerator(new MD2Digest(CryptoServicePurpose.PRF));
                    case 6:
                        return new PKCS5S2ParametersGenerator(new GOST3411Digest(CryptoServicePurpose.PRF));
                    case 7:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224PRF());
                    case 8:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384PRF());
                    case 9:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512PRF());
                    case 10:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_224PRF());
                    case 11:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_256PRF());
                    case 12:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_384PRF());
                    case 13:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_512PRF());
                    case 14:
                        return new PKCS5S2ParametersGenerator(new SM3Digest(CryptoServicePurpose.PRF));
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            }
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedParameters = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                } else {
                    DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                }
            }
            return generateDerivedParameters;
        }
    }
}
