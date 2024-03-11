package org.xbill.DNS;

import org.xbill.DNS.utils.base16;

/* loaded from: classes5.dex */
public class SSHFPRecord extends Record {
    private int alg;
    private int digestType;
    private byte[] fingerprint;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.alg = dNSInput.readU8();
        this.digestType = dNSInput.readU8();
        this.fingerprint = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.alg + " " + this.digestType + " " + base16.toString(this.fingerprint);
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.alg);
        dNSOutput.writeU8(this.digestType);
        dNSOutput.writeByteArray(this.fingerprint);
    }
}