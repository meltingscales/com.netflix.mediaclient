package org.xbill.DNS;

import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import o.C9573sE;
import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class DNSSEC {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final ECKeyInfo ECDSA_P256;
    private static final ECKeyInfo ECDSA_P384;
    private static final ECKeyInfo GOST;
    private static char a$s39$27 = 0;
    private static int b = 0;
    private static char b$s37$27 = 0;
    private static char c$s38$27 = 0;
    private static int d = 1;
    private static char d$s40$27;

    /* loaded from: classes6.dex */
    public static class KeyMismatchException extends DNSSECException {
    }

    /* loaded from: classes6.dex */
    public static class MalformedKeyException extends DNSSECException {
    }

    /* loaded from: classes6.dex */
    public static class SignatureExpiredException extends DNSSECException {
    }

    /* loaded from: classes6.dex */
    public static class SignatureNotYetValidException extends DNSSECException {
    }

    /* loaded from: classes6.dex */
    public static class UnsupportedAlgorithmException extends DNSSECException {
    }

    static void a() {
        b$s37$27 = (char) 13378;
        c$s38$27 = (char) 1251;
        d$s40$27 = (char) 53332;
        a$s39$27 = (char) 20750;
    }

    /* loaded from: classes5.dex */
    public static class Algorithm {
        private static Mnemonic algs;

        static {
            Mnemonic mnemonic = new Mnemonic("DNSSEC algorithm", 2);
            algs = mnemonic;
            mnemonic.setMaximum(PrivateKeyType.INVALID);
            algs.setNumericAllowed(true);
            algs.add(1, "RSAMD5");
            algs.add(2, "DH");
            algs.add(3, "DSA");
            algs.add(5, "RSASHA1");
            algs.add(6, "DSA-NSEC3-SHA1");
            algs.add(7, "RSA-NSEC3-SHA1");
            algs.add(8, "RSASHA256");
            algs.add(10, "RSASHA512");
            algs.add(12, "ECC-GOST");
            algs.add(13, "ECDSAP256SHA256");
            algs.add(14, "ECDSAP384SHA384");
            algs.add(15, "ED25519");
            algs.add(16, "ED448");
            algs.add(252, "INDIRECT");
            algs.add(253, "PRIVATEDNS");
            algs.add(254, "PRIVATEOID");
        }

        public static String string(int i) {
            return algs.getText(i);
        }
    }

    /* loaded from: classes6.dex */
    public static class DNSSECException extends Exception {
        DNSSECException(String str) {
            super(str);
        }
    }

    /* loaded from: classes6.dex */
    public static class SignatureVerificationException extends DNSSECException {
        SignatureVerificationException() {
            super("signature verification failed");
        }
    }

    /* loaded from: classes6.dex */
    public static class IncompatibleKeyException extends IllegalArgumentException {
        IncompatibleKeyException() {
            super("incompatible keys");
        }
    }

    /* loaded from: classes6.dex */
    public static class NoSignatureException extends DNSSECException {
        NoSignatureException() {
            super("no signature found");
        }
    }

    /* loaded from: classes5.dex */
    static class ECKeyInfo {
        public BigInteger a;
        public BigInteger b;
        EllipticCurve curve;
        public BigInteger gx;
        public BigInteger gy;
        int length;
        public BigInteger n;
        public BigInteger p;
        ECParameterSpec spec;

        ECKeyInfo(int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.length = i;
            this.p = new BigInteger(str, 16);
            this.a = new BigInteger(str2, 16);
            this.b = new BigInteger(str3, 16);
            this.gx = new BigInteger(str4, 16);
            this.gy = new BigInteger(str5, 16);
            this.n = new BigInteger(str6, 16);
            this.curve = new EllipticCurve(new ECFieldFp(this.p), this.a, this.b);
            this.spec = new ECParameterSpec(this.curve, new ECPoint(this.gx, this.gy), this.n, 1);
        }
    }

    static {
        a();
        Object[] objArr = new Object[1];
        c(1, new char[]{10597, 35277}, objArr);
        GOST = new ECKeyInfo(32, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", "A6", ((String) objArr[0]).intern(), "8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893");
        ECDSA_P256 = new ECKeyInfo(32, "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", "FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", "5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", "FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
        ECDSA_P384 = new ECKeyInfo(48, "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", "B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", "AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", "3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
        int i = b + 89;
        d = i % 128;
        int i2 = i % 2;
    }

    private static void c(int i, char[] cArr, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        C9573sE c9573sE = new C9573sE();
        char[] cArr2 = new char[cArr.length];
        c9573sE.b = 0;
        char[] cArr3 = new char[2];
        while (c9573sE.b < cArr.length) {
            int i4 = $10 + 29;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[c9573sE.b];
                cArr3[1] = cArr[c9573sE.b - 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[c9573sE.b];
                cArr3[1] = cArr[c9573sE.b + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (a$s39$27 ^ (-3358735357273865631L))))) ^ ((c2 >>> 5) + ((char) (d$s40$27 ^ (-3358735357273865631L))))));
                cArr3[1] = c3;
                cArr3[0] = (char) (c2 - (((c3 >>> 5) + ((char) (c$s38$27 ^ (-3358735357273865631L)))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (b$s37$27 ^ (-3358735357273865631L)))))));
                i5 -= 40503;
                i2++;
            }
            cArr2[c9573sE.b] = cArr3[0];
            cArr2[c9573sE.b + 1] = cArr3[1];
            c9573sE.b += 2;
        }
        String str = new String(cArr2, 0, i);
        int i8 = $10 + 87;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }
}
