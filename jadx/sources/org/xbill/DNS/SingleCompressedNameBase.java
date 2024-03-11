package org.xbill.DNS;

/* loaded from: classes5.dex */
abstract class SingleCompressedNameBase extends SingleNameBase {
    @Override // org.xbill.DNS.SingleNameBase, org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.singleName.toWire(dNSOutput, compression, z);
    }
}
