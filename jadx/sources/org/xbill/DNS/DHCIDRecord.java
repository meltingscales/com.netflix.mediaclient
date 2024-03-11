package org.xbill.DNS;

import org.xbill.DNS.utils.base64;

/* loaded from: classes5.dex */
public class DHCIDRecord extends Record {
    private byte[] data;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.data = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeByteArray(this.data);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return base64.toString(this.data);
    }
}
