package org.xbill.DNS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class EmptyRecord extends Record {
    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return "";
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
    }
}
