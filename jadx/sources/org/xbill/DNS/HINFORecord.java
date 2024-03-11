package org.xbill.DNS;

/* loaded from: classes5.dex */
public class HINFORecord extends Record {
    private byte[] cpu;
    private byte[] os;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.cpu = dNSInput.readCountedString();
        this.os = dNSInput.readCountedString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.cpu);
        dNSOutput.writeCountedString(this.os);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return Record.byteArrayToString(this.cpu, true) + " " + Record.byteArrayToString(this.os, true);
    }
}
