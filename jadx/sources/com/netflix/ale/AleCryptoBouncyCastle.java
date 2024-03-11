package com.netflix.ale;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class AleCryptoBouncyCastle extends AleCryptoBase {
    public static final int AES_CBC_IV_SIZE = 16;
    public static final String AES_CBC_PKCS5_ALGO = "AES/CBC/PKCS5Padding";
    public static final int AES_GCM_IV_SIZE = 12;
    public static final String AES_GCM_NOPAD_ALGO = "AES/GCM/NoPadding";
    public static final int AES_GCM_TAG_LENGTH_BYTES = 16;
    public static final int HMAC_MIN_KEY_SIZE = 12;
    public static final String JCA_ALG_RSA_OAEP_256 = "RSA/NONE/OAEPWithSHA256AndMGF1Padding";
    public static final int MAX_RANDOM_BYTES = 65536;
    public static final String PROVIDER_BC = "BC";
    public static final String RSA_KEY_ALG = "RSA";
    private final AleUtil aleUtil;
    private final SecureRandom random;
    public static final Companion Companion = new Companion(null);
    private static final String HMAC_SHA256_ALGO = JcaAlgorithm.HMAC_SHA256.getAlgName();

    public AleCryptoBouncyCastle() {
        this(null, null, 3, null);
    }

    public /* synthetic */ AleCryptoBouncyCastle(SecureRandom secureRandom, AleUtil aleUtil, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new SecureRandom() : secureRandom, (i & 2) != 0 ? new AleUtilImpl() : aleUtil);
    }

    public AleCryptoBouncyCastle(SecureRandom secureRandom, AleUtil aleUtil) {
        C8632dsu.c((Object) secureRandom, "");
        C8632dsu.c((Object) aleUtil, "");
        this.random = secureRandom;
        this.aleUtil = aleUtil;
    }

    /* loaded from: classes5.dex */
    public enum JcaAlgorithm {
        AES("AES"),
        HMAC_SHA256("HmacSHA256");
        
        public static final Companion Companion = new Companion(null);
        private final String algName;

        public final String getAlgName() {
            return this.algName;
        }

        JcaAlgorithm(String str) {
            this.algName = str;
        }

        /* loaded from: classes5.dex */
        public static final class Companion {

            /* loaded from: classes5.dex */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AleAlgorithm.values().length];
                    iArr[AleAlgorithm.AES_GCM.ordinal()] = 1;
                    iArr[AleAlgorithm.AES_CBC.ordinal()] = 2;
                    iArr[AleAlgorithm.HMAC_SHA256.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final JcaAlgorithm fromAleAlgorithm(AleAlgorithm aleAlgorithm) {
                C8632dsu.c((Object) aleAlgorithm, "");
                int i = WhenMappings.$EnumSwitchMapping$0[aleAlgorithm.ordinal()];
                if (i == 1 || i == 2) {
                    return JcaAlgorithm.AES;
                }
                if (i == 3) {
                    return JcaAlgorithm.HMAC_SHA256;
                }
                throw new Exception("unsupported algorithm");
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final String getHMAC_SHA256_ALGO() {
            return AleCryptoBouncyCastle.HMAC_SHA256_ALGO;
        }

        public final boolean safeEquals(byte[] bArr, byte[] bArr2) {
            C8632dsu.c((Object) bArr, "");
            C8632dsu.c((Object) bArr2, "");
            if (bArr.length != bArr2.length) {
                return false;
            }
            int length = bArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i | bArr[i2]) ^ bArr2[i2];
            }
            return Integer.valueOf(i).equals(0);
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] getRandomBytes(int i) {
        if (i > 65536) {
            throw new Exception("numBytes requested too large: " + i + " > 65536");
        }
        byte[] bArr = new byte[i];
        this.random.nextBytes(bArr);
        return bArr;
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public AleKey importSymmetricKey(AleAlgorithm aleAlgorithm, byte[] bArr) {
        C8632dsu.c((Object) aleAlgorithm, "");
        C8632dsu.c((Object) bArr, "");
        if (aleAlgorithm == AleAlgorithm.AES_GCM || aleAlgorithm.equals(AleAlgorithm.AES_CBC)) {
            int length = bArr.length;
            if (length != 16 && length != 24 && length != 32) {
                throw new Exception("invalid AES key size `" + bArr.length + '\'');
            }
        } else if (aleAlgorithm == AleAlgorithm.HMAC_SHA256) {
            if (bArr.length < 12) {
                throw new Exception("invalid HMAC key size (too small) `" + bArr.length + "' is less than minimum of 12");
            }
        } else {
            throw new Exception("invalid algorithm specified `" + aleAlgorithm.name() + '\'');
        }
        return new AleKey(aleAlgorithm, new SecretKeySpec(bArr, JcaAlgorithm.Companion.fromAleAlgorithm(aleAlgorithm).getAlgName()));
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public AleKeyPair generateRsaOaepKey() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA_KEY_ALG);
        C8632dsu.a(keyPairGenerator, "");
        keyPairGenerator.initialize(2048, this.random);
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(2048, BigInteger.valueOf(65537L)));
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        C8632dsu.a(generateKeyPair, "");
        AleAlgorithm aleAlgorithm = AleAlgorithm.RSA_OAEP_256;
        PrivateKey privateKey = generateKeyPair.getPrivate();
        C8632dsu.a(privateKey, "");
        AleKey aleKey = new AleKey(aleAlgorithm, privateKey);
        PublicKey publicKey = generateKeyPair.getPublic();
        C8632dsu.a(publicKey, "");
        return new AleKeyPair(aleAlgorithm, aleKey, new AleKey(aleAlgorithm, publicKey));
    }

    private final byte[] bi2bytes(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        return Arrays.copyOfRange(byteArray, byteArray.length - ((int) Math.ceil(bigInteger.bitLength() / 8)), byteArray.length);
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public String exportPublicKey(AleKeyPair aleKeyPair) {
        C8632dsu.c((Object) aleKeyPair, "");
        if (!aleKeyPair.getAlgorithm().isPK()) {
            throw new Exception("keypair does not contain public key, wrong algorithm");
        }
        if (!(aleKeyPair.getPublicKey().getPlatformKey() instanceof PublicKey)) {
            throw new Exception("invalid export key type (not public key)");
        }
        Object platformKey = aleKeyPair.getPublicKey().getPlatformKey();
        AleUtil aleUtil = this.aleUtil;
        byte[] encoded = ((PublicKey) platformKey).getEncoded();
        C8632dsu.a(encoded, "");
        return aleUtil.bytesToBase64Url(encoded);
    }

    private final SecretKey extractAesKey(AleKey aleKey) {
        if (aleKey.getAlgorithm() != AleAlgorithm.AES_CBC && aleKey.getAlgorithm() != AleAlgorithm.AES_GCM) {
            throw new IllegalArgumentException("Ale algorithm is not AES");
        }
        if (!(aleKey.getPlatformKey() instanceof SecretKey)) {
            throw new Exception("invalid platformKey");
        }
        SecretKey secretKey = (SecretKey) aleKey.getPlatformKey();
        String algorithm = secretKey.getAlgorithm();
        JcaAlgorithm jcaAlgorithm = JcaAlgorithm.AES;
        if (algorithm.equals(jcaAlgorithm.getAlgName())) {
            return secretKey;
        }
        throw new IllegalArgumentException("Encryption key must be an " + jcaAlgorithm + " key.");
    }

    private final void checkAesCbcParameters(AleKey aleKey, byte[] bArr) {
        if (aleKey.getAlgorithm() != AleAlgorithm.AES_CBC) {
            throw new Exception("invalid algorithm for aes-cbc encrypt (" + aleKey.getAlgorithm() + ')');
        } else if (bArr.length != 16) {
            throw new IllegalArgumentException("iv wrong size");
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] aesCbcEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        checkAesCbcParameters(aleKey, bArr);
        SecretKey extractAesKey = extractAesKey(aleKey);
        if (bArr2.length == 0) {
            return new byte[0];
        }
        Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_ALGO);
        C8632dsu.a(cipher, "");
        cipher.init(1, extractAesKey, new IvParameterSpec(bArr));
        byte[] doFinal = cipher.doFinal(bArr2);
        C8632dsu.a(doFinal, "");
        return doFinal;
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] aesCbcDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        checkAesCbcParameters(aleKey, bArr);
        SecretKey extractAesKey = extractAesKey(aleKey);
        Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5_ALGO);
        C8632dsu.a(cipher, "");
        cipher.init(2, extractAesKey, new IvParameterSpec(bArr));
        byte[] doFinal = cipher.doFinal(bArr2);
        C8632dsu.a(doFinal, "");
        return doFinal;
    }

    private final void checkAesGcmParameters(AleKey aleKey, byte[] bArr) {
        if (aleKey.getAlgorithm() != AleAlgorithm.AES_GCM) {
            throw new Exception("invalid algorithm for aes-gcm (" + aleKey.getAlgorithm() + ')');
        } else if (bArr.length != 12) {
            throw new IllegalArgumentException("iv wrong size");
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] aesGcmEncrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        checkAesGcmParameters(aleKey, bArr);
        SecretKey extractAesKey = extractAesKey(aleKey);
        if (bArr3.length == 0) {
            return new byte[0];
        }
        Cipher cipher = Cipher.getInstance(AES_GCM_NOPAD_ALGO);
        C8632dsu.a(cipher, "");
        cipher.init(1, extractAesKey, new GCMParameterSpec(128, bArr));
        if (bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        C8632dsu.a(doFinal, "");
        return doFinal;
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] aesGcmDecrypt(AleKey aleKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        C8632dsu.c((Object) bArr3, "");
        checkAesGcmParameters(aleKey, bArr);
        SecretKey extractAesKey = extractAesKey(aleKey);
        if (bArr3.length == 0) {
            return new byte[0];
        }
        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_NOPAD_ALGO);
            C8632dsu.a(cipher, "");
            cipher.init(2, extractAesKey, new GCMParameterSpec(128, bArr));
            if (!(bArr2.length == 0)) {
                cipher.updateAAD(bArr2);
            }
            byte[] doFinal = cipher.doFinal(bArr3);
            C8632dsu.a(doFinal, "");
            return doFinal;
        } catch (AEADBadTagException e) {
            throw new Exception("ciphertext too short", e);
        } catch (Throwable th) {
            throw new Exception("aes-gcm decrypt operation failed", th);
        }
    }

    private final SecretKey extractHmacKey(AleKey aleKey) {
        AleAlgorithm algorithm = aleKey.getAlgorithm();
        AleAlgorithm aleAlgorithm = AleAlgorithm.HMAC_SHA256;
        if (algorithm != aleAlgorithm) {
            throw new IllegalArgumentException("mismatched key algorithm - found `" + aleKey.getAlgorithm().name() + "' but expected `" + aleAlgorithm + '\'');
        } else if (!(aleKey.getPlatformKey() instanceof SecretKey)) {
            throw new Exception("invalid platformKey");
        } else {
            SecretKey secretKey = (SecretKey) aleKey.getPlatformKey();
            String algorithm2 = secretKey.getAlgorithm();
            JcaAlgorithm jcaAlgorithm = JcaAlgorithm.HMAC_SHA256;
            if (algorithm2.equals(jcaAlgorithm.getAlgName())) {
                return secretKey;
            }
            throw new IllegalArgumentException("Signature key must be an " + jcaAlgorithm + " key.");
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] hmacSha256(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        SecretKey extractHmacKey = extractHmacKey(aleKey);
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256_ALGO);
            C8632dsu.a(mac, "");
            mac.init(extractHmacKey);
            byte[] doFinal = mac.doFinal(bArr);
            C8632dsu.a(doFinal, "");
            return doFinal;
        } catch (InvalidKeyException e) {
            throw new Exception("Invalid HMAC key", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception("Invalid MAC algorithm specified", e2);
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public boolean hmacSha256Verify(AleKey aleKey, byte[] bArr, byte[] bArr2) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        C8632dsu.c((Object) bArr2, "");
        SecretKey extractHmacKey = extractHmacKey(aleKey);
        try {
            Mac mac = Mac.getInstance(HMAC_SHA256_ALGO);
            C8632dsu.a(mac, "");
            mac.init(extractHmacKey);
            byte[] doFinal = mac.doFinal(bArr2);
            C8632dsu.a(doFinal, "");
            return Companion.safeEquals(doFinal, bArr);
        } catch (InvalidKeyException e) {
            throw new Exception("Invalid HMAC key", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception("Invalid MAC algorithm specified.", e2);
        }
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] rsaOaepEncrypt(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        if (!(aleKey.getPlatformKey() instanceof RSAPublicKey)) {
            throw new Exception("mismatched key algorithm - not an RSA public key");
        }
        Object platformKey = aleKey.getPlatformKey();
        if (!C8632dsu.c((Object) ((RSAPublicKey) platformKey).getAlgorithm(), (Object) RSA_KEY_ALG)) {
            throw new Exception("mismatched key algorithm - found `" + aleKey.getAlgorithm().getAlgName() + "' but expected `" + AleAlgorithm.RSA_OAEP_256.getAlgName() + '\'');
        }
        Cipher cipher = Cipher.getInstance(JCA_ALG_RSA_OAEP_256, "BC");
        C8632dsu.a(cipher, "");
        cipher.init(1, (Key) platformKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT), this.random);
        byte[] doFinal = cipher.doFinal(bArr);
        C8632dsu.a(doFinal, "");
        return doFinal;
    }

    @Override // com.netflix.ale.AleCryptoBase, com.netflix.ale.AleCrypto
    public byte[] rsaOaepDecrypt(AleKey aleKey, byte[] bArr) {
        C8632dsu.c((Object) aleKey, "");
        C8632dsu.c((Object) bArr, "");
        if (!(aleKey.getPlatformKey() instanceof RSAPrivateKey)) {
            throw new Exception("mismatched key algorithm - not an RSA private key");
        }
        AleAlgorithm algorithm = aleKey.getAlgorithm();
        AleAlgorithm aleAlgorithm = AleAlgorithm.RSA_OAEP_256;
        if (algorithm != aleAlgorithm) {
            throw new IllegalArgumentException("mismatched key algorithm - found `" + aleKey.getAlgorithm().getAlgName() + "' but expected `" + aleAlgorithm.getAlgName() + '\'');
        }
        Cipher cipher = Cipher.getInstance(JCA_ALG_RSA_OAEP_256, "BC");
        C8632dsu.a(cipher, "");
        cipher.init(2, (Key) aleKey.getPlatformKey());
        byte[] doFinal = cipher.doFinal(bArr);
        C8632dsu.a(doFinal, "");
        return doFinal;
    }
}
