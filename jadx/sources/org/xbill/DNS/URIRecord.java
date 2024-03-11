package org.xbill.DNS;

/* loaded from: classes5.dex */
public class URIRecord extends Record {
    private int priority;
    private byte[] target = new byte[0];
    private int weight;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.priority = dNSInput.readU16();
        this.weight = dNSInput.readU16();
        this.target = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.priority + " " + this.weight + " " + Record.byteArrayToString(this.target, true);
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.priority);
        dNSOutput.writeU16(this.weight);
        dNSOutput.writeByteArray(this.target);
    }
}
