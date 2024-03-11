package org.xbill.DNS;

import java.net.InetAddress;
import org.xbill.DNS.utils.base64;

/* loaded from: classes5.dex */
public class IPSECKEYRecord extends Record {
    private int algorithmType;
    private Object gateway;
    private int gatewayType;
    private byte[] key;
    private int precedence;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.xbill.DNS.Record
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void rrFromWire(org.xbill.DNS.DNSInput r3) {
        /*
            r2 = this;
            int r0 = r3.readU8()
            r2.precedence = r0
            int r0 = r3.readU8()
            r2.gatewayType = r0
            int r0 = r3.readU8()
            r2.algorithmType = r0
            int r0 = r2.gatewayType
            if (r0 == 0) goto L46
            r1 = 1
            if (r0 == r1) goto L3c
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 != r1) goto L27
            org.xbill.DNS.Name r0 = new org.xbill.DNS.Name
            r0.<init>(r3)
            r2.gateway = r0
            goto L49
        L27:
            org.xbill.DNS.WireParseException r3 = new org.xbill.DNS.WireParseException
            java.lang.String r0 = "invalid gateway type"
            r3.<init>(r0)
            throw r3
        L2f:
            r0 = 16
            byte[] r0 = r3.readByteArray(r0)
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)
            r2.gateway = r0
            goto L49
        L3c:
            r0 = 4
            byte[] r0 = r3.readByteArray(r0)
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)
            goto L47
        L46:
            r0 = 0
        L47:
            r2.gateway = r0
        L49:
            int r0 = r3.remaining()
            if (r0 <= 0) goto L55
            byte[] r3 = r3.readByteArray()
            r2.key = r3
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.IPSECKEYRecord.rrFromWire(org.xbill.DNS.DNSInput):void");
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.precedence);
        sb.append(" ");
        sb.append(this.gatewayType);
        sb.append(" ");
        sb.append(this.algorithmType);
        sb.append(" ");
        int i = this.gatewayType;
        if (i == 0) {
            sb.append(".");
        } else if (i == 1 || i == 2) {
            sb.append(((InetAddress) this.gateway).getHostAddress());
        } else if (i == 3) {
            sb.append(this.gateway);
        }
        if (this.key != null) {
            sb.append(" ");
            sb.append(base64.toString(this.key));
        }
        return sb.toString();
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.precedence);
        dNSOutput.writeU8(this.gatewayType);
        dNSOutput.writeU8(this.algorithmType);
        int i = this.gatewayType;
        if (i == 1 || i == 2) {
            dNSOutput.writeByteArray(((InetAddress) this.gateway).getAddress());
        } else if (i == 3) {
            ((Name) this.gateway).toWire(dNSOutput, null, z);
        }
        byte[] bArr = this.key;
        if (bArr != null) {
            dNSOutput.writeByteArray(bArr);
        }
    }
}
