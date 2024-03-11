package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;

/* loaded from: classes6.dex */
public abstract class ASN1GraphicString extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GraphicString.class, 25) { // from class: org.bouncycastle.asn1.ASN1GraphicString.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GraphicString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1GraphicString(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new NullPointerException("'contents' cannot be null");
        }
        this.contents = z ? Arrays.clone(bArr) : bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1GraphicString createPrimitive(byte[] bArr) {
        return new DERGraphicString(bArr, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GraphicString) {
            return Arrays.areEqual(this.contents, ((ASN1GraphicString) aSN1Primitive).contents);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 25, this.contents);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }
}
