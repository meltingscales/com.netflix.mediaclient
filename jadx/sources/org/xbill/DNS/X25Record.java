package org.xbill.DNS;

/* loaded from: classes5.dex */
public class X25Record extends Record {
    private byte[] address;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.address = dNSInput.readCountedString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.address);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return Record.byteArrayToString(this.address, true);
    }
}
