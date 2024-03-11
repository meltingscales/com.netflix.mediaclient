package org.xbill.DNS;

/* loaded from: classes5.dex */
public class KXRecord extends U16NameBase {
    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getNameField();
    }
}
