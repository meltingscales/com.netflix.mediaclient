package org.bouncycastle.asn1;

import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class DEROutputStream extends DLOutputStream {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DEROutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1OutputStream
    public DEROutputStream getDERSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().toDERObject().encode(this, true);
        }
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    void writePrimitive(ASN1Primitive aSN1Primitive, boolean z) {
        aSN1Primitive.toDERObject().encode(this, z);
    }

    @Override // org.bouncycastle.asn1.DLOutputStream, org.bouncycastle.asn1.ASN1OutputStream
    void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.toDERObject().encode(this, true);
        }
    }
}
