package org.xbill.DNS;

import org.chromium.net.PrivateKeyType;

/* loaded from: classes5.dex */
public class ARecord extends Record {
    private int addr;

    private static byte[] toArray(int i) {
        return new byte[]{(byte) ((i >>> 24) & PrivateKeyType.INVALID), (byte) ((i >>> 16) & PrivateKeyType.INVALID), (byte) ((i >>> 8) & PrivateKeyType.INVALID), (byte) (i & PrivateKeyType.INVALID)};
    }

    private static int fromArray(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.addr = fromArray(dNSInput.readByteArray(4));
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return Address.toDottedQuad(toArray(this.addr));
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU32(this.addr & 4294967295L);
    }
}
