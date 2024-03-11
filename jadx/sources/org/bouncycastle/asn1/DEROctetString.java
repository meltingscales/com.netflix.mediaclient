package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded("DER"));
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z, byte[] bArr, int i, int i2) {
        aSN1OutputStream.writeEncodingDL(z, 4, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int encodedLength(boolean z, int i) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 4, this.string);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.string.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
