package org.bouncycastle.asn1;

/* loaded from: classes6.dex */
public class BERBitString extends ASN1BitString {
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(byte[] bArr, int i) {
        this(bArr, i, 1000);
    }

    public BERBitString(byte[] bArr, int i, int i2) {
        super(bArr, i);
        this.elements = null;
        this.segmentLimit = i2;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, 1000);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length != 0) {
            if (length != 1) {
                int i = length - 1;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr = aSN1BitStringArr[i3].contents;
                    if (bArr[0] != 0) {
                        throw new IllegalArgumentException("only the last nested bitstring can have padding");
                    }
                    i2 += bArr.length - 1;
                }
                byte[] bArr2 = aSN1BitStringArr[i].contents;
                byte b = bArr2[0];
                byte[] bArr3 = new byte[i2 + bArr2.length];
                bArr3[0] = b;
                int i4 = 1;
                for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
                    byte[] bArr4 = aSN1BitString.contents;
                    int length2 = bArr4.length - 1;
                    System.arraycopy(bArr4, 1, bArr3, i4, length2);
                    i4 += length2;
                }
                return bArr3;
            }
            return aSN1BitStringArr[0].contents;
        }
        return new byte[]{0};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        if (!encodeConstructed()) {
            byte[] bArr = this.contents;
            DLBitString.encode(aSN1OutputStream, z, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.contents;
            if (bArr2.length >= 2) {
                byte b = bArr2[0];
                int length = bArr2.length;
                int i = length - 1;
                int i2 = this.segmentLimit - 1;
                while (i > i2) {
                    DLBitString.encode(aSN1OutputStream, true, (byte) 0, this.contents, length - i, i2);
                    i -= i2;
                }
                DLBitString.encode(aSN1OutputStream, true, b, this.contents, length - i, i);
            }
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z, this.contents.length);
        }
        int i = z ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return i;
            }
            int length = bArr.length;
            int i2 = this.segmentLimit;
            int i3 = (length - 2) / (i2 - 1);
            return i + (DLBitString.encodedLength(true, i2) * i3) + DLBitString.encodedLength(true, this.contents.length - (i3 * (this.segmentLimit - 1)));
        }
        int i4 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i4 >= aSN1BitStringArr.length) {
                return i;
            }
            i += aSN1BitStringArr[i4].encodedLength(true);
            i4++;
        }
    }
}
