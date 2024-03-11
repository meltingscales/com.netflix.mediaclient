package org.xbill.DNS;

/* loaded from: classes5.dex */
public class NSRecord extends SingleCompressedNameBase {
    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getSingleName();
    }
}
