package org.xbill.DNS;

/* loaded from: classes5.dex */
public class PXRecord extends Record {
    private Name map822;
    private Name mapX400;
    private int preference;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.preference = dNSInput.readU16();
        this.map822 = new Name(dNSInput);
        this.mapX400 = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.preference + " " + this.map822 + " " + this.mapX400;
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.preference);
        this.map822.toWire(dNSOutput, null, z);
        this.mapX400.toWire(dNSOutput, null, z);
    }
}
