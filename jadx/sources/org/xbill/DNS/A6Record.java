package org.xbill.DNS;

import java.net.InetAddress;

/* loaded from: classes5.dex */
public class A6Record extends Record {
    private Name prefix;
    private int prefixBits;
    private InetAddress suffix;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        int readU8 = dNSInput.readU8();
        this.prefixBits = readU8;
        int i = (135 - readU8) / 8;
        if (readU8 < 128) {
            byte[] bArr = new byte[16];
            dNSInput.readByteArray(bArr, 16 - i, i);
            this.suffix = InetAddress.getByAddress(bArr);
        }
        if (this.prefixBits > 0) {
            this.prefix = new Name(dNSInput);
        }
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.prefixBits);
        if (this.suffix != null) {
            sb.append(" ");
            sb.append(this.suffix.getHostAddress());
        }
        if (this.prefix != null) {
            sb.append(" ");
            sb.append(this.prefix);
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.prefixBits);
        InetAddress inetAddress = this.suffix;
        if (inetAddress != null) {
            int i = (135 - this.prefixBits) / 8;
            dNSOutput.writeByteArray(inetAddress.getAddress(), 16 - i, i);
        }
        Name name = this.prefix;
        if (name != null) {
            name.toWire(dNSOutput, null, z);
        }
    }
}
