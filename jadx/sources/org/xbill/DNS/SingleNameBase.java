package org.xbill.DNS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class SingleNameBase extends Record {
    protected Name singleName;

    /* JADX INFO: Access modifiers changed from: protected */
    public Name getSingleName() {
        return this.singleName;
    }

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.singleName = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.singleName.toString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.singleName.toWire(dNSOutput, null, z);
    }
}
