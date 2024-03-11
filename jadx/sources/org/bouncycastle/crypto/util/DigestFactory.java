package org.bouncycastle.crypto.util;

import com.netflix.android.org.json.zip.JSONzip;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes6.dex */
public final class DigestFactory {
    private static final Map cloneMap;

    static {
        HashMap hashMap = new HashMap();
        cloneMap = hashMap;
        hashMap.put(createMD5().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.1
        });
        hashMap.put(createSHA1().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.2
        });
        hashMap.put(createSHA224().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.3
        });
        hashMap.put(createSHA256().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.4
        });
        hashMap.put(createSHA384().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.5
        });
        hashMap.put(createSHA512().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.6
        });
        hashMap.put(createSHA3_224().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.7
        });
        hashMap.put(createSHA3_256().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.8
        });
        hashMap.put(createSHA3_384().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.9
        });
        hashMap.put(createSHA3_512().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.10
        });
        hashMap.put(createSHAKE128().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.11
        });
        hashMap.put(createSHAKE256().getAlgorithmName(), new Object() { // from class: org.bouncycastle.crypto.util.DigestFactory.12
        });
    }

    public static Digest createMD5() {
        return new MD5Digest();
    }

    public static Digest createMD5PRF() {
        return new MD5Digest();
    }

    public static Digest createSHA1() {
        return new SHA1Digest();
    }

    public static Digest createSHA1PRF() {
        return new SHA1Digest(CryptoServicePurpose.PRF);
    }

    public static Digest createSHA224() {
        return new SHA224Digest();
    }

    public static Digest createSHA224PRF() {
        return new SHA224Digest(CryptoServicePurpose.PRF);
    }

    public static Digest createSHA256() {
        return SHA256Digest.newInstance();
    }

    public static Digest createSHA256PRF() {
        return new SHA256Digest(CryptoServicePurpose.PRF);
    }

    public static Digest createSHA384() {
        return new SHA384Digest();
    }

    public static Digest createSHA384PRF() {
        return new SHA384Digest(CryptoServicePurpose.PRF);
    }

    public static Digest createSHA3_224() {
        return new SHA3Digest(224);
    }

    public static Digest createSHA3_224PRF() {
        return new SHA3Digest(224, CryptoServicePurpose.PRF);
    }

    public static Digest createSHA3_256() {
        return new SHA3Digest(JSONzip.end);
    }

    public static Digest createSHA3_256PRF() {
        return new SHA3Digest(JSONzip.end, CryptoServicePurpose.PRF);
    }

    public static Digest createSHA3_384() {
        return new SHA3Digest(384);
    }

    public static Digest createSHA3_384PRF() {
        return new SHA3Digest(384, CryptoServicePurpose.PRF);
    }

    public static Digest createSHA3_512() {
        return new SHA3Digest(512);
    }

    public static Digest createSHA3_512PRF() {
        return new SHA3Digest(512, CryptoServicePurpose.PRF);
    }

    public static Digest createSHA512() {
        return new SHA512Digest();
    }

    public static Digest createSHA512PRF() {
        return new SHA512Digest(CryptoServicePurpose.PRF);
    }

    public static Digest createSHAKE128() {
        return new SHAKEDigest(128);
    }

    public static Digest createSHAKE256() {
        return new SHAKEDigest(JSONzip.end);
    }
}
