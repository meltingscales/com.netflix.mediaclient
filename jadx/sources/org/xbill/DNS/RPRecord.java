package org.xbill.DNS;

/* loaded from: classes5.dex */
public class RPRecord extends Record {
    private Name mailbox;
    private Name textDomain;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.mailbox = new Name(dNSInput);
        this.textDomain = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.mailbox + " " + this.textDomain;
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.mailbox.toWire(dNSOutput, null, z);
        this.textDomain.toWire(dNSOutput, null, z);
    }
}
