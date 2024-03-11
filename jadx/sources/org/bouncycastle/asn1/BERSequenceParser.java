package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes6.dex */
public class BERSequenceParser implements ASN1SequenceParser {
    private ASN1StreamParser _parser;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BERSequenceParser(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BERSequence parse(ASN1StreamParser aSN1StreamParser) {
        return new BERSequence(aSN1StreamParser.readVector());
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return parse(this._parser);
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
