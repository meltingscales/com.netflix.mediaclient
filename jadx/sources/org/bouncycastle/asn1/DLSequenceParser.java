package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class DLSequenceParser implements ASN1SequenceParser {
    private ASN1StreamParser _parser;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DLSequenceParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return DLFactory.createSequence(this._parser.readVector());
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
