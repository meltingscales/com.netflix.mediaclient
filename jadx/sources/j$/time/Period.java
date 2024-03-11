package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import o.AbstractC8520doq;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8533dpc;
import o.doX;
import o.doY;

/* loaded from: classes5.dex */
public final class Period implements InterfaceC8533dpc, Serializable {
    private static final List b;
    private static final long serialVersionUID = -3587258372562876L;
    private final int c;
    private final int d;
    private final int f;
    public static final Period e = new Period(0, 0, 0);
    private static final Pattern a = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    static {
        List a2;
        a2 = AbstractC8520doq.a(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
        b = a2;
    }

    private Period(int i, int i2, int i3) {
        this.f = i;
        this.c = i2;
        this.d = i3;
    }

    private static Period a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? e : new Period(i, i2, i3);
    }

    public static Period b(int i) {
        return a(0, 0, i);
    }

    public static Period c(int i, int i2, int i3) {
        return a(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Period e(DataInput dataInput) {
        return c(dataInput.readInt(), dataInput.readInt(), dataInput.readInt());
    }

    private void e(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        InterfaceC8528doy interfaceC8528doy = (InterfaceC8528doy) doy.b(AbstractC8538dph.c());
        if (interfaceC8528doy == null || IsoChronology.d.equals(interfaceC8528doy)) {
            return;
        }
        String b2 = interfaceC8528doy.b();
        throw new DateTimeException("Chronology mismatch, expected: ISO, actual: " + b2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 14, this);
    }

    public boolean a() {
        return this == e;
    }

    public long b() {
        return (this.f * 12) + this.c;
    }

    @Override // o.InterfaceC8533dpc
    public doX b(doX dox) {
        long b2;
        ChronoUnit chronoUnit;
        e(dox);
        if (this.c == 0) {
            int i = this.f;
            if (i != 0) {
                b2 = i;
                chronoUnit = ChronoUnit.YEARS;
                dox = dox.b(b2, chronoUnit);
            }
        } else {
            b2 = b();
            if (b2 != 0) {
                chronoUnit = ChronoUnit.MONTHS;
                dox = dox.b(b2, chronoUnit);
            }
        }
        int i2 = this.d;
        return i2 != 0 ? dox.b(i2, ChronoUnit.DAYS) : dox;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        dataOutput.writeInt(this.f);
        dataOutput.writeInt(this.c);
        dataOutput.writeInt(this.d);
    }

    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            return this.f == period.f && this.c == period.c && this.d == period.d;
        }
        return false;
    }

    public int hashCode() {
        return this.f + Integer.rotateLeft(this.c, 8) + Integer.rotateLeft(this.d, 16);
    }

    public String toString() {
        if (this == e) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.f;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
