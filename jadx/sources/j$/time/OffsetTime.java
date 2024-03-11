package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
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
public final class OffsetTime implements doX, doW, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final LocalTime b;
    private final ZoneOffset d;
    public static final OffsetTime e = LocalTime.e.b(ZoneOffset.a);
    public static final OffsetTime a = LocalTime.c.b(ZoneOffset.b);

    /* renamed from: j$.time.OffsetTime$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            e = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.b = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.d = zoneOffset;
    }

    public static OffsetTime a(LocalTime localTime, ZoneOffset zoneOffset) {
        return new OffsetTime(localTime, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetTime a(ObjectInput objectInput) {
        return a(LocalTime.d(objectInput), ZoneOffset.d(objectInput));
    }

    public static OffsetTime a(doY doy) {
        if (doy instanceof OffsetTime) {
            return (OffsetTime) doy;
        }
        try {
            return new OffsetTime(LocalTime.a(doy), ZoneOffset.e(doy));
        } catch (DateTimeException e2) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain OffsetTime from TemporalAccessor: " + doy + " of type " + name, e2);
        }
    }

    private OffsetTime b(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.b == localTime && this.d.equals(zoneOffset)) ? this : new OffsetTime(localTime, zoneOffset);
    }

    private long d() {
        return this.b.b() - (this.d.a() * 1000000000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 9, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        long j;
        OffsetTime a2 = a(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            long d = a2.d() - d();
            switch (AnonymousClass4.e[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return d;
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
            return d / j;
        }
        return interfaceC8540dpj.d(this, a2);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.u ? this.d.a() : this.b.a(interfaceC8535dpe) : interfaceC8535dpe.d(this);
    }

    @Override // o.doX
    /* renamed from: a */
    public OffsetTime d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.u ? b(this.b, ZoneOffset.e(((ChronoField) interfaceC8535dpe).b(j))) : b(this.b.d(interfaceC8535dpe, j), this.d) : (OffsetTime) interfaceC8535dpe.d(this, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ObjectOutput objectOutput) {
        this.b.c(objectOutput);
        this.d.c(objectOutput);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return super.b(interfaceC8535dpe);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.b() || interfaceC8537dpg == AbstractC8538dph.g()) {
            return this.d;
        }
        if (((interfaceC8537dpg == AbstractC8538dph.h()) || (interfaceC8537dpg == AbstractC8538dph.c())) || interfaceC8537dpg == AbstractC8538dph.a()) {
            return null;
        }
        return interfaceC8537dpg == AbstractC8538dph.e() ? this.b : interfaceC8537dpg == AbstractC8538dph.d() ? ChronoUnit.NANOS : interfaceC8537dpg.e(this);
    }

    @Override // o.doX
    /* renamed from: c */
    public OffsetTime b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return interfaceC8540dpj instanceof ChronoUnit ? b(this.b.b(j, interfaceC8540dpj), this.d) : (OffsetTime) interfaceC8540dpj.e(this, j);
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(OffsetTime offsetTime) {
        int compare;
        return (this.d.equals(offsetTime.d) || (compare = Long.compare(d(), offsetTime.d())) == 0) ? this.b.compareTo(offsetTime.b) : compare;
    }

    @Override // o.doX
    /* renamed from: d */
    public OffsetTime e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doX
    /* renamed from: d */
    public OffsetTime a(doW dow) {
        return dow instanceof LocalTime ? b((LocalTime) dow, this.d) : dow instanceof ZoneOffset ? b(this.b, (ZoneOffset) dow) : dow instanceof OffsetTime ? (OffsetTime) dow : (OffsetTime) dow.e(this);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.u ? interfaceC8535dpe.a() : this.b.d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.x, this.b.b()).d(ChronoField.u, this.d.a());
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe.b() || interfaceC8535dpe == ChronoField.u : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetTime) {
            OffsetTime offsetTime = (OffsetTime) obj;
            return this.b.equals(offsetTime.b) && this.d.equals(offsetTime.d);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ this.d.hashCode();
    }

    public String toString() {
        String localTime = this.b.toString();
        String zoneOffset = this.d.toString();
        return localTime + zoneOffset;
    }
}
