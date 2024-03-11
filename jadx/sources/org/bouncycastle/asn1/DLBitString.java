package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class DLBitString extends ASN1BitString {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DLBitString(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte b, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 3, b, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 3, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(boolean z, int i) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 3, this.contents);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
