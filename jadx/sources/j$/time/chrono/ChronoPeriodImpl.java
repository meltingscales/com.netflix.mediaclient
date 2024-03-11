package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.AbstractC8520doq;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8533dpc;
import o.doX;
import o.doY;

/* loaded from: classes6.dex */
final class ChronoPeriodImpl implements InterfaceC8533dpc, Serializable {
    private static final List d;
    private static final long serialVersionUID = 57387258289L;
    final int a;
    private final InterfaceC8528doy b;
    final int c;
    final int e;

    static {
        List a;
        a = AbstractC8520doq.a(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
        d = a;
    }

    ChronoPeriodImpl(InterfaceC8528doy interfaceC8528doy, int i, int i2, int i3) {
        Objects.requireNonNull(interfaceC8528doy, "chrono");
        this.b = interfaceC8528doy;
        this.a = i;
        this.c = i2;
        this.e = i3;
    }

    private void a(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        InterfaceC8528doy interfaceC8528doy = (InterfaceC8528doy) doy.b(AbstractC8538dph.c());
        if (interfaceC8528doy == null || this.b.equals(interfaceC8528doy)) {
            return;
        }
        String b = this.b.b();
        String b2 = interfaceC8528doy.b();
        throw new DateTimeException("Chronology mismatch, expected: " + b + ", actual: " + b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoPeriodImpl b(DataInput dataInput) {
        return new ChronoPeriodImpl(InterfaceC8528doy.a(dataInput.readUTF()), dataInput.readInt(), dataInput.readInt(), dataInput.readInt());
    }

    private long c() {
        ValueRange a = this.b.a(ChronoField.y);
        if (a.b() && a.c()) {
            return (a.e() - a.d()) + 1;
        }
        return -1L;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public InterfaceC8528doy a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.b.b());
        dataOutput.writeInt(this.a);
        dataOutput.writeInt(this.c);
        dataOutput.writeInt(this.e);
    }

    @Override // o.InterfaceC8533dpc
    public doX b(doX dox) {
        long j;
        ChronoUnit chronoUnit;
        a(dox);
        if (this.c == 0) {
            int i = this.a;
            if (i != 0) {
                j = i;
                chronoUnit = ChronoUnit.YEARS;
                dox = dox.b(j, chronoUnit);
            }
        } else {
            long c = c();
            if (c > 0) {
                dox = dox.b((this.a * c) + this.c, ChronoUnit.MONTHS);
            } else {
                int i2 = this.a;
                if (i2 != 0) {
                    dox = dox.b(i2, ChronoUnit.YEARS);
                }
                j = this.c;
                chronoUnit = ChronoUnit.MONTHS;
                dox = dox.b(j, chronoUnit);
            }
        }
        int i3 = this.e;
        return i3 != 0 ? dox.b(i3, ChronoUnit.DAYS) : dox;
    }

    public boolean e() {
        return this.a == 0 && this.c == 0 && this.e == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChronoPeriodImpl) {
            ChronoPeriodImpl chronoPeriodImpl = (ChronoPeriodImpl) obj;
            return this.a == chronoPeriodImpl.a && this.c == chronoPeriodImpl.c && this.e == chronoPeriodImpl.e && this.b.equals(chronoPeriodImpl.b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.a + Integer.rotateLeft(this.c, 8)) + Integer.rotateLeft(this.e, 16)) ^ this.b.hashCode();
    }

    public String toString() {
        if (e()) {
            String obj = a().toString();
            return obj + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a().toString());
        sb.append(' ');
        sb.append('P');
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.e;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new Ser((byte) 9, this);
    }
}
