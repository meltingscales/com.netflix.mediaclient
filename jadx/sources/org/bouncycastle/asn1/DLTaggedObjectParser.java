package org.bouncycastle.asn1;

/* loaded from: classes6.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean _constructed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DLTaggedObjectParser(int i, int i2, boolean z, ASN1StreamParser aSN1StreamParser) {
        super(i, i2, aSN1StreamParser);
        this._constructed = z;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
    }
}
