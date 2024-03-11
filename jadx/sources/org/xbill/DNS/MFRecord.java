package org.xbill.DNS;

/* loaded from: classes5.dex */
public class MFRecord extends SingleNameBase {
    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getSingleName();
    }
}
