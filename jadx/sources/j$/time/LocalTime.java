package j$.time;

import com.netflix.model.leafs.originals.interactive.Prefetch;
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
import o.AbstractC8538dph;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes.dex */
public final class LocalTime implements doX, doW, Comparable<LocalTime>, Serializable {
    public static final LocalTime a;
    public static final LocalTime b;
    public static final LocalTime c;
    private static final LocalTime[] d = new LocalTime[24];
    public static final LocalTime e;
    private static final long serialVersionUID = 6414437269572265201L;
    private final int f;
    private final byte g;
    private final byte i;
    private final byte j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.LocalTime$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            c = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            d = iArr2;
            try {
                iArr2[ChronoField.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[ChronoField.x.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[ChronoField.p.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[ChronoField.q.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[ChronoField.r.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[ChronoField.t.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[ChronoField.D.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[ChronoField.C.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                d[ChronoField.v.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                d[ChronoField.s.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                d[ChronoField.f13342o.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                d[ChronoField.g.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                d[ChronoField.n.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                d[ChronoField.i.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                d[ChronoField.b.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = d;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                b = localTime;
                a = localTimeArr[12];
                e = localTime;
                c = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.i = (byte) i;
        this.g = (byte) i2;
        this.j = (byte) i3;
        this.f = i4;
    }

    public static LocalTime a(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        LocalTime localTime = (LocalTime) doy.b(AbstractC8538dph.e());
        if (localTime != null) {
            return localTime;
        }
        String name = doy.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + doy + " of type " + name);
    }

    private static LocalTime b(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? d[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime b(long j) {
        ChronoField.x.d(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return b(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    private int c(InterfaceC8535dpe interfaceC8535dpe) {
        switch (AnonymousClass4.d[((ChronoField) interfaceC8535dpe).ordinal()]) {
            case 1:
                return this.f;
            case 2:
                throw new UnsupportedTemporalTypeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f / 1000;
            case 4:
                throw new UnsupportedTemporalTypeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f / Prefetch.NANOSECONDS_PER_MILLISECOND;
            case 6:
                return (int) (b() / 1000000);
            case 7:
                return this.j;
            case 8:
                return e();
            case 9:
                return this.g;
            case 10:
                return (this.i * 60) + this.g;
            case 11:
                return this.i % 12;
            case 12:
                int i = this.i % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.i;
            case 14:
                byte b2 = this.i;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return this.i / 12;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
    }

    public static LocalTime c(int i, int i2) {
        ChronoField.n.d(i);
        if (i2 == 0) {
            return d[i];
        }
        ChronoField.v.d(i2);
        return new LocalTime(i, i2, 0, 0);
    }

    public static LocalTime c(int i, int i2, int i3, int i4) {
        ChronoField.n.d(i);
        ChronoField.v.d(i2);
        ChronoField.D.d(i3);
        ChronoField.w.d(i4);
        return b(i, i2, i3, i4);
    }

    public static LocalTime c(long j) {
        ChronoField.C.d(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        int i2 = (int) (j2 / 60);
        return b(i, i2, (int) (j2 - (i2 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocalTime d(DataInput dataInput) {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        int i3 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            i2 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i4 = ~readByte2;
                i2 = 0;
                i3 = i4;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                } else {
                    i3 = dataInput.readInt();
                    i = readByte3;
                }
                i2 = i3;
                i3 = readByte2;
            }
        }
        return c(readByte, i3, i, i2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 4, this);
    }

    public int a() {
        return this.i;
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        long j;
        LocalTime a2 = a(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            long b2 = a2.b() - b();
            switch (AnonymousClass4.c[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return b2;
                case 2:
                    j = 1000;
                    break;
                case 3:
                    j = 1000000;
                    break;
                case 4:
                    j = 1000000000;
                    break;
                case 5:
                    j = 60000000000L;
                    break;
                case 6:
                    j = 3600000000000L;
                    break;
                case 7:
                    j = 43200000000000L;
                    break;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
            return b2 / j;
        }
        return interfaceC8540dpj.d(this, a2);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.x ? b() : interfaceC8535dpe == ChronoField.q ? b() / 1000 : c(interfaceC8535dpe) : interfaceC8535dpe.d(this);
    }

    public LocalTime a(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.i * 60) + this.g;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : b(i2 / 60, i2 % 60, this.j, this.f);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.i, localTime.i);
        if (compare == 0) {
            int compare2 = Integer.compare(this.g, localTime.g);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.j, localTime.j);
                return compare3 == 0 ? Integer.compare(this.f, localTime.f) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? c(interfaceC8535dpe) : super.b(interfaceC8535dpe);
    }

    public long b() {
        return (this.i * 3600000000000L) + (this.g * 60000000000L) + (this.j * 1000000000) + this.f;
    }

    public LocalTime b(int i) {
        if (this.g == i) {
            return this;
        }
        ChronoField.v.d(i);
        return b(this.i, i, this.j, this.f);
    }

    public OffsetTime b(ZoneOffset zoneOffset) {
        return OffsetTime.a(this, zoneOffset);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.c() || interfaceC8537dpg == AbstractC8538dph.h() || interfaceC8537dpg == AbstractC8538dph.g() || interfaceC8537dpg == AbstractC8538dph.b()) {
            return null;
        }
        if (interfaceC8537dpg == AbstractC8538dph.e()) {
            return this;
        }
        if (interfaceC8537dpg == AbstractC8538dph.a()) {
            return null;
        }
        return interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.NANOS : interfaceC8537dpg.e(this);
    }

    public int c() {
        return this.j;
    }

    public LocalTime c(int i) {
        if (this.f == i) {
            return this;
        }
        ChronoField.w.d(i);
        return b(this.i, this.g, this.j, i);
    }

    @Override // o.doX
    /* renamed from: c */
    public LocalTime b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass4.c[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return d(j);
                case 2:
                    return d((j % 86400000000L) * 1000);
                case 3:
                    return d((j % 86400000) * 1000000);
                case 4:
                    return i(j);
                case 5:
                    return a(j);
                case 6:
                    return e(j);
                case 7:
                    return e((j % 2) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return (LocalTime) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doX
    /* renamed from: c */
    public LocalTime a(doW dow) {
        return dow instanceof LocalTime ? (LocalTime) dow : (LocalTime) dow.e(this);
    }

    @Override // o.doX
    /* renamed from: c */
    public LocalTime d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            chronoField.d(j);
            switch (AnonymousClass4.d[chronoField.ordinal()]) {
                case 1:
                    return c((int) j);
                case 2:
                    return b(j);
                case 3:
                    return c(((int) j) * 1000);
                case 4:
                    return b(j * 1000);
                case 5:
                    return c(((int) j) * Prefetch.NANOSECONDS_PER_MILLISECOND);
                case 6:
                    return b(j * 1000000);
                case 7:
                    return d((int) j);
                case 8:
                    return i(j - e());
                case 9:
                    return b((int) j);
                case 10:
                    return a(j - ((this.i * 60) + this.g));
                case 11:
                    return e(j - (this.i % 12));
                case 12:
                    if (j == 12) {
                        j = 0;
                    }
                    return e(j - (this.i % 12));
                case 13:
                    return e((int) j);
                case 14:
                    if (j == 24) {
                        j = 0;
                    }
                    return e((int) j);
                case 15:
                    return e((j - (this.i / 12)) * 12);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
        }
        return (LocalTime) interfaceC8535dpe.d(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        byte b2;
        if (this.f != 0) {
            dataOutput.writeByte(this.i);
            dataOutput.writeByte(this.g);
            dataOutput.writeByte(this.j);
            dataOutput.writeInt(this.f);
            return;
        }
        if (this.j != 0) {
            dataOutput.writeByte(this.i);
            dataOutput.writeByte(this.g);
            b2 = this.j;
        } else if (this.g == 0) {
            b2 = this.i;
        } else {
            dataOutput.writeByte(this.i);
            b2 = this.g;
        }
        dataOutput.writeByte(~b2);
    }

    public int d() {
        return this.f;
    }

    public LocalTime d(int i) {
        if (this.j == i) {
            return this;
        }
        ChronoField.D.d(i);
        return b(this.i, this.g, i, this.f);
    }

    public LocalTime d(long j) {
        if (j == 0) {
            return this;
        }
        long b2 = b();
        long j2 = (((j % 86400000000000L) + b2) + 86400000000000L) % 86400000000000L;
        return b2 == j2 ? this : b((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    @Override // o.doX
    /* renamed from: d */
    public LocalTime e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return super.d(interfaceC8535dpe);
    }

    public boolean d(LocalTime localTime) {
        return compareTo(localTime) > 0;
    }

    public int e() {
        return (this.i * 3600) + (this.g * 60) + this.j;
    }

    public LocalTime e(int i) {
        if (this.i == i) {
            return this;
        }
        ChronoField.n.d(i);
        return b(i, this.g, this.j, this.f);
    }

    public LocalTime e(long j) {
        return j == 0 ? this : b(((((int) (j % 24)) + this.i) + 24) % 24, this.g, this.j, this.f);
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.x, b());
    }

    public boolean e(LocalTime localTime) {
        return compareTo(localTime) < 0;
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe.b() : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            return this.i == localTime.i && this.g == localTime.g && this.j == localTime.j && this.f == localTime.f;
        }
        return false;
    }

    public int hashCode() {
        long b2 = b();
        return (int) (b2 ^ (b2 >>> 32));
    }

    public LocalTime i(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.i * 3600) + (this.g * 60) + this.j;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : b(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.f);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.i;
        byte b3 = this.g;
        byte b4 = this.j;
        int i2 = this.f;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        if (b4 > 0 || i2 > 0) {
            sb.append(b4 >= 10 ? ":" : ":0");
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append('.');
                int i3 = Prefetch.NANOSECONDS_PER_MILLISECOND;
                if (i2 % Prefetch.NANOSECONDS_PER_MILLISECOND == 0) {
                    i = (i2 / Prefetch.NANOSECONDS_PER_MILLISECOND) + 1000;
                } else {
                    if (i2 % 1000 == 0) {
                        i2 /= 1000;
                    } else {
                        i3 = Prefetch.NANOSECONDS_PER_SECOND;
                    }
                    i = i2 + i3;
                }
                sb.append(Integer.toString(i).substring(1));
            }
        }
        return sb.toString();
    }
}
