package j$.time;

import j$.time.zone.ZoneRules;
import j$.time.zone.ZoneRulesException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8539dpi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ZoneRegion extends ZoneId implements Serializable {
    private static final long serialVersionUID = 8386373296231747096L;
    private final String a;
    private final transient ZoneRules b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRegion(String str, ZoneRules zoneRules) {
        this.a = str;
        this.b = zoneRules;
    }

    private static void b(String str) {
        int length = str.length();
        if (length < 2) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId d(DataInput dataInput) {
        return ZoneId.b(dataInput.readUTF(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRegion e(String str, boolean z) {
        ZoneRules zoneRules;
        Objects.requireNonNull(str, "zoneId");
        b(str);
        try {
            zoneRules = AbstractC8539dpi.b(str, true);
        } catch (ZoneRulesException e) {
            if (z) {
                throw e;
            }
            zoneRules = null;
        }
        return new ZoneRegion(str, zoneRules);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(DataOutput dataOutput) {
        dataOutput.writeUTF(this.a);
    }

    @Override // j$.time.ZoneId
    public ZoneRules c() {
        ZoneRules zoneRules = this.b;
        return zoneRules != null ? zoneRules : AbstractC8539dpi.b(this.a, false);
    }

    @Override // j$.time.ZoneId
    public String d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public void d(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        b(dataOutput);
    }
}
