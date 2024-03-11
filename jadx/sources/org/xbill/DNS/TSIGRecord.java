package org.xbill.DNS;

import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes5.dex */
public class TSIGRecord extends Record {
    private Name alg;
    private int error;
    private Duration fudge;
    private int originalID;
    private byte[] other;
    private byte[] signature;
    private Instant timeSigned;

    public Name getAlgorithm() {
        return this.alg;
    }

    public int getError() {
        return this.error;
    }

    public Duration getFudge() {
        return this.fudge;
    }

    public byte[] getOther() {
        return this.other;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public Instant getTimeSigned() {
        return this.timeSigned;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TSIGRecord() {
    }

    public TSIGRecord(Name name, int i, long j, Name name2, Instant instant, Duration duration, byte[] bArr, int i2, int i3, byte[] bArr2) {
        super(name, 250, i, j);
        this.alg = Record.checkName("alg", name2);
        this.timeSigned = instant;
        Record.checkU16("fudge", (int) duration.b());
        this.fudge = duration;
        this.signature = bArr;
        this.originalID = Record.checkU16("originalID", i2);
        this.error = Record.checkU16(UmaAlert.ICON_ERROR, i3);
        this.other = bArr2;
    }

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.alg = new Name(dNSInput);
        this.timeSigned = Instant.d((dNSInput.readU16() << 32) + dNSInput.readU32());
        this.fudge = Duration.b(dNSInput.readU16());
        this.signature = dNSInput.readByteArray(dNSInput.readU16());
        this.originalID = dNSInput.readU16();
        this.error = dNSInput.readU16();
        int readU16 = dNSInput.readU16();
        if (readU16 > 0) {
            this.other = dNSInput.readByteArray(readU16);
        } else {
            this.other = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    @Override // org.xbill.DNS.Record
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.String rrToString() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.TSIGRecord.rrToString():java.lang.String");
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.alg.toWire(dNSOutput, null, z);
        long d = this.timeSigned.d();
        dNSOutput.writeU16((int) (d >> 32));
        dNSOutput.writeU32(d & 4294967295L);
        dNSOutput.writeU16((int) this.fudge.b());
        dNSOutput.writeU16(this.signature.length);
        dNSOutput.writeByteArray(this.signature);
        dNSOutput.writeU16(this.originalID);
        dNSOutput.writeU16(this.error);
        byte[] bArr = this.other;
        if (bArr != null) {
            dNSOutput.writeU16(bArr.length);
            dNSOutput.writeByteArray(this.other);
            return;
        }
        dNSOutput.writeU16(0);
    }
}
