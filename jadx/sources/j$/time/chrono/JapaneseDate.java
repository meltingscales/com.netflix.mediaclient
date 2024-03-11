package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC8526dow;
import o.InterfaceC8529doz;
import o.InterfaceC8533dpc;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;

/* loaded from: classes6.dex */
public final class JapaneseDate extends ChronoLocalDateImpl implements Serializable {
    static final LocalDate c = LocalDate.a(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private transient int b;
    private transient JapaneseEra d;
    private final transient LocalDate e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.JapaneseDate$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoField.values().length];
            e = iArr;
            try {
                iArr[ChronoField.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoField.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[ChronoField.A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[ChronoField.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[ChronoField.a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[ChronoField.e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[ChronoField.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[ChronoField.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[ChronoField.B.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JapaneseDate(LocalDate localDate) {
        if (localDate.a((InterfaceC8526dow) c)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.d = JapaneseEra.c(localDate);
        this.b = (localDate.j() - this.d.f().j()) + 1;
        this.e = localDate;
    }

    JapaneseDate(JapaneseEra japaneseEra, int i, LocalDate localDate) {
        if (localDate.a((InterfaceC8526dow) c)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.d = japaneseEra;
        this.b = i;
        this.e = localDate;
    }

    private JapaneseDate a(int i) {
        return c(g(), i);
    }

    private JapaneseDate a(LocalDate localDate) {
        return localDate.equals(this.e) ? this : new JapaneseDate(localDate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseDate a(JapaneseEra japaneseEra, int i, int i2) {
        Objects.requireNonNull(japaneseEra, "era");
        int j = japaneseEra.f().j();
        LocalDate a = i == 1 ? LocalDate.a(j, (japaneseEra.f().e() + i2) - 1) : LocalDate.a((j + i) - 1, i2);
        if (a.a((InterfaceC8526dow) japaneseEra.f()) || japaneseEra != JapaneseEra.c(a)) {
            throw new DateTimeException("Invalid parameters");
        }
        return new JapaneseDate(japaneseEra, i, a);
    }

    public static JapaneseDate b(JapaneseEra japaneseEra, int i, int i2, int i3) {
        Objects.requireNonNull(japaneseEra, "era");
        LocalDate a = LocalDate.a((japaneseEra.f().j() + i) - 1, i2, i3);
        if (a.a((InterfaceC8526dow) japaneseEra.f()) || japaneseEra != JapaneseEra.c(a)) {
            throw new DateTimeException("year, month, and day not valid for Era");
        }
        return new JapaneseDate(japaneseEra, i, a);
    }

    private JapaneseDate c(JapaneseEra japaneseEra, int i) {
        return a(this.e.b(JapaneseChronology.b.e(japaneseEra, i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseDate c(DataInput dataInput) {
        return JapaneseChronology.b.b(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 4, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    public /* bridge */ /* synthetic */ long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        return super.a(dox, interfaceC8540dpj);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            switch (AnonymousClass2.e[((ChronoField) interfaceC8535dpe).ordinal()]) {
                case 2:
                    return this.b == 1 ? (this.e.e() - this.d.f().e()) + 1 : this.e.e();
                case 3:
                    return this.b;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
                case 8:
                    return this.d.b();
                default:
                    return this.e.a(interfaceC8535dpe);
            }
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: a */
    public JapaneseChronology d() {
        return JapaneseChronology.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: a */
    public JapaneseDate c(long j) {
        return a(this.e.d(j));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public JapaneseDate e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (JapaneseDate) super.e(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public JapaneseDate d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            if (a(chronoField) == j) {
                return this;
            }
            int[] iArr = AnonymousClass2.e;
            int i = iArr[chronoField.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                int a = d().a(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 3) {
                    return a(a);
                }
                if (i2 == 8) {
                    return c(JapaneseEra.d(a), this.b);
                }
                if (i2 == 9) {
                    return a(this.e.b(a));
                }
            }
            return a(this.e.d(interfaceC8535dpe, j));
        }
        return (JapaneseDate) super.d(interfaceC8535dpe, j);
    }

    @Override // o.InterfaceC8526dow
    public final InterfaceC8529doz a(LocalTime localTime) {
        return super.a(localTime);
    }

    public int b() {
        return this.e.m();
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: c */
    public JapaneseEra g() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        dataOutput.writeInt(b(ChronoField.B));
        dataOutput.writeByte(b(ChronoField.y));
        dataOutput.writeByte(b(ChronoField.h));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: d */
    public JapaneseDate h(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (JapaneseDate) super.b(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: d */
    public JapaneseDate b(InterfaceC8533dpc interfaceC8533dpc) {
        return (JapaneseDate) super.b(interfaceC8533dpc);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            if (!e(interfaceC8535dpe)) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass2.e[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return d().a(chronoField);
                    }
                    int j = this.d.f().j();
                    JapaneseEra i2 = this.d.i();
                    return i2 != null ? ValueRange.b(1L, (i2.f().j() - j) + 1) : ValueRange.b(1L, 999999999 - j);
                }
                return ValueRange.b(1L, k());
            }
            return ValueRange.b(1L, b());
        }
        return interfaceC8535dpe.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: e */
    public JapaneseDate b(long j) {
        return a(this.e.c(j));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: e */
    public JapaneseDate d(doW dow) {
        return (JapaneseDate) super.a(dow);
    }

    @Override // o.InterfaceC8526dow, o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe != ChronoField.c && interfaceC8535dpe != ChronoField.a && interfaceC8535dpe != ChronoField.e && interfaceC8535dpe != ChronoField.d) {
            if (interfaceC8535dpe instanceof ChronoField) {
                return interfaceC8535dpe.d();
            }
            if (interfaceC8535dpe != null && interfaceC8535dpe.a(this)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JapaneseDate) {
            return this.e.equals(((JapaneseDate) obj).e);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public int hashCode() {
        return d().b().hashCode() ^ this.e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: i */
    public JapaneseDate d(long j) {
        return a(this.e.h(j));
    }

    @Override // o.InterfaceC8526dow
    public int k() {
        JapaneseEra i = this.d.i();
        int k = (i == null || i.f().j() != this.e.j()) ? this.e.k() : i.f().e() - 1;
        return this.b == 1 ? k - (this.d.f().e() - 1) : k;
    }

    @Override // o.InterfaceC8526dow
    public long l() {
        return this.e.l();
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
