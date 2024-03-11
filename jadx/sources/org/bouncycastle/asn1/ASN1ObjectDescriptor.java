package org.bouncycastle.asn1;

/* loaded from: classes6.dex */
public final class ASN1ObjectDescriptor extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1ObjectDescriptor.class, 7) { // from class: org.bouncycastle.asn1.ASN1ObjectDescriptor.1
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return new ASN1ObjectDescriptor((ASN1GraphicString) ASN1GraphicString.TYPE.fromImplicitConstructed(aSN1Sequence));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return new ASN1ObjectDescriptor((ASN1GraphicString) ASN1GraphicString.TYPE.fromImplicitPrimitive(dEROctetString));
        }
    };
    private final ASN1GraphicString baseGraphicString;

    public ASN1ObjectDescriptor(ASN1GraphicString aSN1GraphicString) {
        if (aSN1GraphicString == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.baseGraphicString = aSN1GraphicString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectDescriptor createPrimitive(byte[] bArr) {
        return new ASN1ObjectDescriptor(ASN1GraphicString.createPrimitive(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            return this.baseGraphicString.asn1Equals(((ASN1ObjectDescriptor) aSN1Primitive).baseGraphicString);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeIdentifier(z, 7);
        this.baseGraphicString.encode(aSN1OutputStream, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return this.baseGraphicString.encodedLength(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return ~this.baseGraphicString.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        ASN1GraphicString aSN1GraphicString = (ASN1GraphicString) this.baseGraphicString.toDERObject();
        return aSN1GraphicString == this.baseGraphicString ? this : new ASN1ObjectDescriptor(aSN1GraphicString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        ASN1GraphicString aSN1GraphicString = (ASN1GraphicString) this.baseGraphicString.toDLObject();
        return aSN1GraphicString == this.baseGraphicString ? this : new ASN1ObjectDescriptor(aSN1GraphicString);
    }
}
