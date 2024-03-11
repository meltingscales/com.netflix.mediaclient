package org.bouncycastle.asn1.cryptlib;

import o.C9586sT;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes6.dex */
public class CryptlibObjectIdentifiers {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int a = 1;
    public static final ASN1ObjectIdentifier cryptlib;
    public static final ASN1ObjectIdentifier curvey25519;
    private static int e;
    private static long e$s69$34;
    public static final ASN1ObjectIdentifier ecc;

    static {
        a();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
        cryptlib = aSN1ObjectIdentifier;
        Object[] objArr = new Object[1];
        b(1, new char[]{19034, 48070, 19051, 20807, 49110}, objArr);
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(((String) objArr[0]).intern()).branch("5");
        ecc = branch;
        Object[] objArr2 = new Object[1];
        b(1, new char[]{19034, 48070, 19051, 20807, 49110}, objArr2);
        curvey25519 = branch.branch(((String) objArr2[0]).intern());
        int i = a + 65;
        e = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    static void a() {
        e$s69$34 = -2391635252272735803L;
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        int i2 = 2 % 2;
        C9586sT c9586sT = new C9586sT();
        char[] b = C9586sT.b(e$s69$34 ^ 7567248728798573470L, cArr, i);
        c9586sT.d = 4;
        int i3 = $10 + 103;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (c9586sT.d < b.length) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            c9586sT.b = c9586sT.d - 4;
            b[c9586sT.d] = (char) ((b[c9586sT.d] ^ b[c9586sT.d % 4]) ^ (c9586sT.b * (e$s69$34 ^ 7567248728798573470L)));
            c9586sT.d++;
        }
        objArr[0] = new String(b, 4, b.length - 4);
    }
}
