package org.bouncycastle.asn1;

/* loaded from: classes6.dex */
public class BERSet extends ASN1Set {
    public BERSet() {
    }

    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BERSet(boolean z, ASN1Encodable[] aSN1EncodableArr) {
        super(z, aSN1EncodableArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingIL(z, 49, this.elements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        int i = z ? 4 : 3;
        int length = this.elements.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.elements[i2].toASN1Primitive().encodedLength(true);
        }
        return i;
    }
}
