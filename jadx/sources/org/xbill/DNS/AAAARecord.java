package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes5.dex */
public class AAAARecord extends Record {
    private byte[] address;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.address = dNSInput.readByteArray(16);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        try {
            InetAddress byAddress = InetAddress.getByAddress(null, this.address);
            if (byAddress.getAddress().length == 4) {
                return "::ffff:" + byAddress.getHostAddress();
            }
            return byAddress.getHostAddress();
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeByteArray(this.address);
    }
}
