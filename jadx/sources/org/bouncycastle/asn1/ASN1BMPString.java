package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public abstract class ASN1BMPString extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final char[] string;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.string = cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.string = cArr;
    }

    static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.string, ((ASN1BMPString) aSN1Primitive).string);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        int length = this.string.length;
        aSN1OutputStream.writeIdentifier(z, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            char[] cArr = this.string;
            char c = cArr[i];
            char c2 = cArr[i + 1];
            char c3 = cArr[i + 2];
            char c4 = cArr[i + 3];
            i += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i >= length) {
            return;
        }
        int i2 = 0;
        while (true) {
            char c5 = this.string[i];
            i++;
            bArr[i2] = (byte) (c5 >> '\b');
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) c5;
            if (i >= length) {
                aSN1OutputStream.write(bArr, 0, i3);
                return;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.string.length * 2);
    }

    public final String getString() {
        return new String(this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public String toString() {
        return getString();
    }
}
