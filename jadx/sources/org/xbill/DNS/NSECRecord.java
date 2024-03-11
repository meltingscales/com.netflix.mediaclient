package org.xbill.DNS;

/* loaded from: classes5.dex */
public class NSECRecord extends Record {
    private Name next;
    private TypeBitmap types;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.next = new Name(dNSInput);
        this.types = new TypeBitmap(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.next.toWire(dNSOutput, null, false);
        this.types.toWire(dNSOutput);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.next);
        if (!this.types.empty()) {
            sb.append(' ');
            sb.append(this.types.toString());
        }
        return sb.toString();
    }
}
