package org.xbill.DNS;

import j$.time.Duration;
import java.util.OptionalInt;

/* loaded from: classes5.dex */
public class TcpKeepaliveOption extends EDNSOption {
    private static final Duration UPPER_LIMIT = Duration.a(6553600);
    private OptionalInt timeout;

    public TcpKeepaliveOption() {
        super(11);
        this.timeout = OptionalInt.empty();
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionFromWire(DNSInput dNSInput) {
        int remaining = dNSInput.remaining();
        if (remaining == 0) {
            this.timeout = OptionalInt.empty();
        } else if (remaining == 2) {
            this.timeout = OptionalInt.of(dNSInput.readU16());
        } else {
            throw new WireParseException("invalid length (" + remaining + ") of the data in the edns_tcp_keepalive option");
        }
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionToWire(DNSOutput dNSOutput) {
        if (this.timeout.isPresent()) {
            dNSOutput.writeU16(this.timeout.getAsInt());
        }
    }

    @Override // org.xbill.DNS.EDNSOption
    String optionToString() {
        return this.timeout.isPresent() ? String.valueOf(this.timeout.getAsInt()) : "-";
    }
}
