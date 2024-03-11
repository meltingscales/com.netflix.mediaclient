package org.xbill.DNS;

/* loaded from: classes5.dex */
abstract class U16NameBase extends Record {
    protected Name nameField;
    protected int u16Field;

    /* JADX INFO: Access modifiers changed from: protected */
    public Name getNameField() {
        return this.nameField;
    }

    @Override // org.xbill.DNS.Record
    protected void rrFromWire(DNSInput dNSInput) {
        this.u16Field = dNSInput.readU16();
        this.nameField = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    protected String rrToString() {
        return this.u16Field + " " + this.nameField;
    }

    @Override // org.xbill.DNS.Record
    protected void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU16(this.u16Field);
        this.nameField.toWire(dNSOutput, null, z);
    }
}
