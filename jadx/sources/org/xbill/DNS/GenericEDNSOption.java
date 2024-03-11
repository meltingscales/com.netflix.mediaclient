package org.xbill.DNS;

import org.xbill.DNS.utils.base16;

/* loaded from: classes5.dex */
public class GenericEDNSOption extends EDNSOption {
    private byte[] data;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GenericEDNSOption(int i) {
        super(i);
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionFromWire(DNSInput dNSInput) {
        this.data = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionToWire(DNSOutput dNSOutput) {
        dNSOutput.writeByteArray(this.data);
    }

    @Override // org.xbill.DNS.EDNSOption
    String optionToString() {
        return "<" + base16.toString(this.data) + ">";
    }
}
