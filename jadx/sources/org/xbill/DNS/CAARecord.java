package org.xbill.DNS;

/* loaded from: classes5.dex */
public class CAARecord extends Record {
    private int flags;
    private byte[] tag;
    private byte[] value;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.flags = dNSInput.readU8();
        this.tag = dNSInput.readCountedString();
        this.value = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.flags + " " + Record.byteArrayToString(this.tag, false) + " " + Record.byteArrayToString(this.value, true);
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.flags);
        dNSOutput.writeCountedString(this.tag);
        dNSOutput.writeByteArray(this.value);
    }
}
