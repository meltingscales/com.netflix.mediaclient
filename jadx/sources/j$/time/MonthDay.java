package j$.time;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.doE;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes6.dex */
public final class MonthDay implements doY, doW, Comparable, Serializable {
    private static final doE d = new DateTimeFormatterBuilder().b("--").d(ChronoField.y, 2).c('-').d(ChronoField.h, 2).n();
    private static final long serialVersionUID = -939150713474957432L;
    private final int a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.MonthDay$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoField.values().length];
            e = iArr;
            try {
                iArr[ChronoField.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoField.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private MonthDay(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static MonthDay c(Month month, int i) {
        Objects.requireNonNull(month, SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH);
        ChronoField.h.d(i);
        if (i <= month.e()) {
            return new MonthDay(month.c(), i);
        }
        String name = month.name();
        throw new DateTimeException("Illegal value for DayOfMonth field, value " + i + " is not valid for month " + name);
    }

    public static MonthDay d(int i, int i2) {
        return c(Month.c(i), i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MonthDay d(DataInput dataInput) {
        return d(dataInput.readByte(), dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 13, this);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        int i;
        if (interfaceC8535dpe instanceof ChronoField) {
            int i2 = AnonymousClass5.e[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i2 == 1) {
                i = this.a;
            } else if (i2 != 2) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            } else {
                i = this.b;
            }
            return i;
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return d(interfaceC8535dpe).a(a(interfaceC8535dpe), interfaceC8535dpe);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.c() ? IsoChronology.d : super.b(interfaceC8537dpg);
    }

    public Month c() {
        return Month.c(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(MonthDay monthDay) {
        int i = this.b - monthDay.b;
        return i == 0 ? this.a - monthDay.a : i;
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe == ChronoField.y ? interfaceC8535dpe.a() : interfaceC8535dpe == ChronoField.h ? ValueRange.a(1L, c().b(), c().e()) : super.d(interfaceC8535dpe);
    }

    @Override // o.doW
    public doX e(doX dox) {
        if (InterfaceC8528doy.d(dox).equals(IsoChronology.d)) {
            doX d2 = dox.d(ChronoField.y, this.b);
            ChronoField chronoField = ChronoField.h;
            return d2.d(chronoField, Math.min(d2.d(chronoField).e(), this.a));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.y || interfaceC8535dpe == ChronoField.h : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonthDay) {
            MonthDay monthDay = (MonthDay) obj;
            return this.b == monthDay.b && this.a == monthDay.a;
        }
        return false;
    }

    public int hashCode() {
        return (this.b << 6) + this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.b < 10 ? "0" : "");
        sb.append(this.b);
        sb.append(this.a < 10 ? "-0" : "-");
        sb.append(this.a);
        return sb.toString();
    }
}
