package org.xbill.DNS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
abstract class TXTBase extends Record {
    protected List<byte[]> strings;

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.strings = new ArrayList(2);
        while (dNSInput.remaining() > 0) {
            this.strings.add(dNSInput.readCountedString());
        }
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        StringBuilder sb = new StringBuilder();
        Iterator<byte[]> it = this.strings.iterator();
        while (it.hasNext()) {
            sb.append(Record.byteArrayToString(it.next(), true));
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        for (byte[] bArr : this.strings) {
            dNSOutput.writeCountedString(bArr);
        }
    }
}