package org.xbill.DNS;

import com.fasterxml.jackson.core.JsonFactory;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;
import org.xbill.DNS.utils.base16;

/* loaded from: classes5.dex */
public abstract class Record implements Cloneable, Comparable<Record> {
    private static final DecimalFormat byteFormat;
    protected int dclass;
    protected Name name;
    protected long ttl;
    protected int type;

    public Name getAdditionalName() {
        return null;
    }

    public int getDClass() {
        return this.dclass;
    }

    public Name getName() {
        return this.name;
    }

    public int getRRsetType() {
        return this.type;
    }

    public long getTTL() {
        return this.ttl;
    }

    public int getType() {
        return this.type;
    }

    protected abstract void rrFromWire(DNSInput dNSInput);

    protected abstract String rrToString();

    protected abstract void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTTL(long j) {
        this.ttl = j;
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        byteFormat = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Record() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Record(Name name, int i, int i2, long j) {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        Type.check(i);
        DClass.check(i2);
        TTL.check(j);
        this.name = name;
        this.type = i;
        this.dclass = i2;
        this.ttl = j;
    }

    private static Record getEmptyRecord(Name name, int i, int i2, long j, boolean z) {
        Record emptyRecord;
        if (z) {
            Supplier<Record> factory = Type.getFactory(i);
            if (factory != null) {
                emptyRecord = factory.get();
            } else {
                emptyRecord = new UNKRecord();
            }
        } else {
            emptyRecord = new EmptyRecord();
        }
        emptyRecord.name = name;
        emptyRecord.type = i;
        emptyRecord.dclass = i2;
        emptyRecord.ttl = j;
        return emptyRecord;
    }

    private static Record newRecord(Name name, int i, int i2, long j, int i3, DNSInput dNSInput) {
        Record emptyRecord = getEmptyRecord(name, i, i2, j, dNSInput != null);
        if (dNSInput != null) {
            if (dNSInput.remaining() < i3) {
                throw new WireParseException("truncated record");
            }
            dNSInput.setActive(i3);
            emptyRecord.rrFromWire(dNSInput);
            if (dNSInput.remaining() > 0) {
                throw new WireParseException("invalid record length");
            }
            dNSInput.clearActive();
        }
        return emptyRecord;
    }

    public static Record newRecord(Name name, int i, int i2, long j) {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        Type.check(i);
        DClass.check(i2);
        TTL.check(j);
        return getEmptyRecord(name, i, i2, j, false);
    }

    public static Record newRecord(Name name, int i, int i2) {
        return newRecord(name, i, i2, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Record fromWire(DNSInput dNSInput, int i, boolean z) {
        Name name = new Name(dNSInput);
        int readU16 = dNSInput.readU16();
        int readU162 = dNSInput.readU16();
        if (i == 0) {
            return newRecord(name, readU16, readU162);
        }
        long readU32 = dNSInput.readU32();
        int readU163 = dNSInput.readU16();
        if (readU163 == 0 && z && (i == 1 || i == 2)) {
            return newRecord(name, readU16, readU162, readU32);
        }
        return newRecord(name, readU16, readU162, readU32, readU163, dNSInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toWire(DNSOutput dNSOutput, int i, Compression compression) {
        this.name.toWire(dNSOutput, compression);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (i == 0) {
            return;
        }
        dNSOutput.writeU32(this.ttl);
        int current = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, compression, false);
        dNSOutput.writeU16At((dNSOutput.current() - current) - 2, current);
    }

    public byte[] toWire(int i) {
        DNSOutput dNSOutput = new DNSOutput();
        toWire(dNSOutput, i, null);
        return dNSOutput.toByteArray();
    }

    private void toWireCanonical(DNSOutput dNSOutput, boolean z) {
        this.name.toWireCanonical(dNSOutput);
        dNSOutput.writeU16(this.type);
        dNSOutput.writeU16(this.dclass);
        if (z) {
            dNSOutput.writeU32(0L);
        } else {
            dNSOutput.writeU32(this.ttl);
        }
        int current = dNSOutput.current();
        dNSOutput.writeU16(0);
        rrToWire(dNSOutput, null, true);
        dNSOutput.writeU16At((dNSOutput.current() - current) - 2, current);
    }

    private byte[] toWireCanonical(boolean z) {
        DNSOutput dNSOutput = new DNSOutput();
        toWireCanonical(dNSOutput, z);
        return dNSOutput.toByteArray();
    }

    public byte[] toWireCanonical() {
        return toWireCanonical(false);
    }

    public byte[] rdataToWireCanonical() {
        DNSOutput dNSOutput = new DNSOutput();
        rrToWire(dNSOutput, null, true);
        return dNSOutput.toByteArray();
    }

    public String rdataToString() {
        return rrToString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        if (sb.length() < 8) {
            sb.append("\t");
        }
        if (sb.length() < 16) {
            sb.append("\t");
        }
        sb.append("\t");
        if (Options.check("BINDTTL")) {
            sb.append(TTL.format(this.ttl));
        } else {
            sb.append(this.ttl);
        }
        sb.append("\t");
        if (this.dclass != 1 || !Options.check("noPrintIN")) {
            sb.append(DClass.string(this.dclass));
            sb.append("\t");
        }
        sb.append(Type.string(this.type));
        String rrToString = rrToString();
        if (!rrToString.equals("")) {
            sb.append("\t");
            sb.append(rrToString);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String byteArrayToString(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                sb.append('\\');
                sb.append(byteFormat.format(i));
            } else if (i == 34 || i == 92) {
                sb.append('\\');
                sb.append((char) i);
            } else {
                sb.append((char) i);
            }
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String unknownToString(byte[] bArr) {
        return "\\# " + bArr.length + " " + base16.toString(bArr);
    }

    public boolean sameRRset(Record record) {
        return getRRsetType() == record.getRRsetType() && this.dclass == record.dclass && this.name.equals(record.name);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Record) {
            Record record = (Record) obj;
            if (this.type == record.type && this.dclass == record.dclass && this.name.equals(record.name)) {
                return Arrays.equals(rdataToWireCanonical(), record.rdataToWireCanonical());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : toWireCanonical(true)) {
            i += (i << 3) + (b & 255);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Record cloneRecord() {
        try {
            return (Record) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Record record) {
        if (this == record) {
            return 0;
        }
        int compareTo = this.name.compareTo(record.name);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = this.dclass - record.dclass;
        if (i != 0) {
            return i;
        }
        int i2 = this.type - record.type;
        if (i2 != 0) {
            return i2;
        }
        byte[] rdataToWireCanonical = rdataToWireCanonical();
        byte[] rdataToWireCanonical2 = record.rdataToWireCanonical();
        int min = Math.min(rdataToWireCanonical.length, rdataToWireCanonical2.length);
        for (int i3 = 0; i3 < min; i3++) {
            byte b = rdataToWireCanonical[i3];
            byte b2 = rdataToWireCanonical2[i3];
            if (b != b2) {
                return (b & 255) - (b2 & 255);
            }
        }
        return rdataToWireCanonical.length - rdataToWireCanonical2.length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int checkU8(String str, int i) {
        if (i < 0 || i > 255) {
            throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 8 bit value");
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int checkU16(String str, int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("\"" + str + "\" " + i + " must be an unsigned 16 bit value");
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long checkU32(String str, long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("\"" + str + "\" " + j + " must be an unsigned 32 bit value");
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Name checkName(String str, Name name) {
        if (name.isAbsolute()) {
            return name;
        }
        throw new RelativeNameException("'" + name + "' on field " + str + " is not an absolute name");
    }
}
