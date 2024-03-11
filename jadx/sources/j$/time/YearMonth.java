package j$.time;

import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.AbstractC8515dol;
import o.AbstractC8538dph;
import o.InterfaceC8528doy;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doE;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes6.dex */
public final class YearMonth implements doX, doW, Comparable, Serializable {
    private static final doE c = new DateTimeFormatterBuilder().a(ChronoField.B, 4, 10, SignStyle.EXCEEDS_PAD).c('-').d(ChronoField.y, 2).n();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.YearMonth$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            b = iArr;
            try {
                iArr[ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ChronoUnit.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ChronoUnit.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ChronoUnit.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            a = iArr2;
            try {
                iArr2[ChronoField.y.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ChronoField.z.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ChronoField.A.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ChronoField.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ChronoField.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private YearMonth(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    private YearMonth b(int i, int i2) {
        return (this.d == i && this.e == i2) ? this : new YearMonth(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YearMonth b(DataInput dataInput) {
        return d(dataInput.readInt(), dataInput.readByte());
    }

    private long d() {
        return ((this.d * 12) + this.e) - 1;
    }

    public static YearMonth d(int i, int i2) {
        ChronoField.B.d(i);
        ChronoField.y.d(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth d(doY doy) {
        if (doy instanceof YearMonth) {
            return (YearMonth) doy;
        }
        Objects.requireNonNull(doy, "temporal");
        try {
            if (!IsoChronology.d.equals(InterfaceC8528doy.d(doy))) {
                doy = LocalDate.e(doy);
            }
            return d(doy.b(ChronoField.B), doy.b(ChronoField.y));
        } catch (DateTimeException e) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain YearMonth from TemporalAccessor: " + doy + " of type " + name, e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 12, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        YearMonth d = d(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            long d2 = d.d() - d();
            switch (AnonymousClass5.b[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return d2;
                case 2:
                    return d2 / 12;
                case 3:
                    return d2 / 120;
                case 4:
                    return d2 / 1200;
                case 5:
                    return d2 / 12000;
                case 6:
                    ChronoField chronoField = ChronoField.m;
                    return d.a(chronoField) - a(chronoField);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return interfaceC8540dpj.d(this, d);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        int i;
        if (interfaceC8535dpe instanceof ChronoField) {
            int i2 = AnonymousClass5.a[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i2 == 1) {
                i = this.e;
            } else if (i2 == 2) {
                return d();
            } else {
                if (i2 == 3) {
                    int i3 = this.d;
                    if (i3 < 1) {
                        i3 = 1 - i3;
                    }
                    return i3;
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        return this.d < 1 ? 0 : 1;
                    }
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
                } else {
                    i = this.d;
                }
            }
            return i;
        }
        return interfaceC8535dpe.d(this);
    }

    public YearMonth a(int i) {
        ChronoField.B.d(i);
        return b(i, this.e);
    }

    public int b() {
        return this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(YearMonth yearMonth) {
        int i = this.d - yearMonth.d;
        return i == 0 ? this.e - yearMonth.e : i;
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return d(interfaceC8535dpe).a(a(interfaceC8535dpe), interfaceC8535dpe);
    }

    public YearMonth b(long j) {
        long floorDiv;
        if (j == 0) {
            return this;
        }
        long j2 = (this.d * 12) + (this.e - 1) + j;
        ChronoField chronoField = ChronoField.B;
        floorDiv = Math.floorDiv(j2, 12L);
        return b(chronoField.b(floorDiv), AbstractC8515dol.e(j2, 12) + 1);
    }

    @Override // o.doX
    /* renamed from: b */
    public YearMonth a(doW dow) {
        return (YearMonth) dow.e(this);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return interfaceC8537dpg == AbstractC8538dph.c() ? IsoChronology.d : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.MONTHS : super.b(interfaceC8537dpg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(DataOutput dataOutput) {
        dataOutput.writeInt(this.d);
        dataOutput.writeByte(this.e);
    }

    @Override // o.doX
    /* renamed from: c */
    public YearMonth e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doX
    /* renamed from: c */
    public YearMonth d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            chronoField.d(j);
            int i = AnonymousClass5.a[chronoField.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (this.d < 1) {
                            j = 1 - j;
                        }
                        return a((int) j);
                    } else if (i != 4) {
                        if (i == 5) {
                            return a(ChronoField.m) == j ? this : a(1 - this.d);
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
                    } else {
                        return a((int) j);
                    }
                }
                return b(j - d());
            }
            return d((int) j);
        }
        return (YearMonth) interfaceC8535dpe.d(this, j);
    }

    public YearMonth d(int i) {
        ChronoField.y.d(i);
        return b(this.d, i);
    }

    @Override // o.doX
    /* renamed from: d */
    public YearMonth b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass5.b[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return b(j);
                case 2:
                    return e(j);
                case 3:
                    multiplyExact = Math.multiplyExact(j, 10L);
                    return e(multiplyExact);
                case 4:
                    multiplyExact2 = Math.multiplyExact(j, 100L);
                    return e(multiplyExact2);
                case 5:
                    multiplyExact3 = Math.multiplyExact(j, 1000L);
                    return e(multiplyExact3);
                case 6:
                    ChronoField chronoField = ChronoField.m;
                    return d(chronoField, Math.addExact(a(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return (YearMonth) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.A) {
            return ValueRange.b(1L, b() <= 0 ? 1000000000L : 999999999L);
        }
        return super.d(interfaceC8535dpe);
    }

    public YearMonth e(long j) {
        return j == 0 ? this : b(ChronoField.B.b(this.d + j), this.e);
    }

    @Override // o.doW
    public doX e(doX dox) {
        if (InterfaceC8528doy.d(dox).equals(IsoChronology.d)) {
            return dox.d(ChronoField.z, d());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.B || interfaceC8535dpe == ChronoField.y || interfaceC8535dpe == ChronoField.z || interfaceC8535dpe == ChronoField.A || interfaceC8535dpe == ChronoField.m : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            return this.d == yearMonth.d && this.e == yearMonth.e;
        }
        return false;
    }

    public int hashCode() {
        return this.d ^ (this.e << 27);
    }

    public String toString() {
        int i;
        int abs = Math.abs(this.d);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i2 = this.d;
            if (i2 < 0) {
                sb.append(i2 - 10000);
                i = 1;
            } else {
                sb.append(i2 + 10000);
                i = 0;
            }
            sb.deleteCharAt(i);
        } else {
            sb.append(this.d);
        }
        sb.append(this.e < 10 ? "-0" : "-");
        sb.append(this.e);
        return sb.toString();
    }
}
