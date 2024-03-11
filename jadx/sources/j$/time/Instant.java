package j$.time;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import j$.time.Instant;
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
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.InterfaceC8540dpj;
import o.doE;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes.dex */
public final class Instant implements doX, doW, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    private final int a;
    private final long d;
    public static final Instant e = new Instant(0, 0);
    public static final Instant b = e(-31557014167219200L, 0);
    public static final Instant c = e(31556889864403199L, 999999999);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Instant$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;
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
            try {
                e[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            b = iArr2;
            try {
                iArr2[ChronoField.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[ChronoField.p.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[ChronoField.r.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[ChronoField.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private Instant(long j, int i) {
        this.d = j;
        this.a = i;
    }

    private long a(Instant instant) {
        long subtractExact = Math.subtractExact(instant.d, this.d);
        long j = instant.a - this.a;
        int i = (subtractExact > 0L ? 1 : (subtractExact == 0L ? 0 : -1));
        return (i <= 0 || j >= 0) ? (i >= 0 || j <= 0) ? subtractExact : subtractExact + 1 : subtractExact - 1;
    }

    public static Instant a() {
        return Clock.e().b();
    }

    public static Instant a(long j) {
        long floorDiv;
        floorDiv = Math.floorDiv(j, 1000L);
        return a(floorDiv, AbstractC8515dol.e(j, 1000) * Prefetch.NANOSECONDS_PER_MILLISECOND);
    }

    private static Instant a(long j, int i) {
        if ((i | j) == 0) {
            return e;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private long b(Instant instant) {
        return Math.addExact(Math.multiplyExact(Math.subtractExact(instant.d, this.d), 1000000000L), instant.a - this.a);
    }

    public static Instant b(CharSequence charSequence) {
        return (Instant) doE.b.a(charSequence, new InterfaceC8537dpg() { // from class: o.don
            @Override // o.InterfaceC8537dpg
            public final Object e(doY doy) {
                return Instant.c(doy);
            }
        });
    }

    private Instant c(long j, long j2) {
        return (j | j2) == 0 ? this : e(Math.addExact(Math.addExact(this.d, j), j2 / 1000000000), this.a + (j2 % 1000000000));
    }

    public static Instant c(doY doy) {
        if (doy instanceof Instant) {
            return (Instant) doy;
        }
        Objects.requireNonNull(doy, "temporal");
        try {
            return e(doy.a(ChronoField.l), doy.b(ChronoField.w));
        } catch (DateTimeException e2) {
            String name = doy.getClass().getName();
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + doy + " of type " + name, e2);
        }
    }

    public static Instant d(long j) {
        return a(j, 0);
    }

    public static Instant e(long j, long j2) {
        return a(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Instant e(DataInput dataInput) {
        return e(dataInput.readLong(), dataInput.readInt());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        Instant c2 = c(dox);
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass5.e[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return b(c2);
                case 2:
                    return b(c2) / 1000;
                case 3:
                    return Math.subtractExact(c2.b(), b());
                case 4:
                    return a(c2);
                case 5:
                    return a(c2) / 60;
                case 6:
                    return a(c2) / 3600;
                case 7:
                    return a(c2) / 43200;
                case 8:
                    return a(c2) / 86400;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return interfaceC8540dpj.d(this, c2);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        int i;
        if (interfaceC8535dpe instanceof ChronoField) {
            int i2 = AnonymousClass5.b[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i2 == 1) {
                i = this.a;
            } else if (i2 == 2) {
                i = this.a / 1000;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return this.d;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            } else {
                i = this.a / Prefetch.NANOSECONDS_PER_MILLISECOND;
            }
            return i;
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doX
    /* renamed from: a */
    public Instant b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        long multiplyExact4;
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass5.e[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return c(j);
                case 2:
                    return c(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return b(j);
                case 4:
                    return e(j);
                case 5:
                    multiplyExact = Math.multiplyExact(j, 60L);
                    return e(multiplyExact);
                case 6:
                    multiplyExact2 = Math.multiplyExact(j, 3600L);
                    return e(multiplyExact2);
                case 7:
                    multiplyExact3 = Math.multiplyExact(j, 43200L);
                    return e(multiplyExact3);
                case 8:
                    multiplyExact4 = Math.multiplyExact(j, 86400L);
                    return e(multiplyExact4);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return (Instant) interfaceC8540dpj.e(this, j);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass5.b[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ChronoField.l.b(this.d);
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
                    }
                    return this.a / Prefetch.NANOSECONDS_PER_MILLISECOND;
                }
                return this.a / 1000;
            }
            return this.a;
        }
        return d(interfaceC8535dpe).a(interfaceC8535dpe.d(this), interfaceC8535dpe);
    }

    public long b() {
        long multiplyExact;
        int i;
        long j = this.d;
        if (j >= 0 || this.a <= 0) {
            multiplyExact = Math.multiplyExact(j, 1000L);
            i = this.a / Prefetch.NANOSECONDS_PER_MILLISECOND;
        } else {
            multiplyExact = Math.multiplyExact(j + 1, 1000L);
            i = (this.a / Prefetch.NANOSECONDS_PER_MILLISECOND) - 1000;
        }
        return Math.addExact(multiplyExact, i);
    }

    public Instant b(long j) {
        return c(j / 1000, (j % 1000) * 1000000);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        if (interfaceC8537dpg == AbstractC8538dph.d()) {
            return ChronoUnit.NANOS;
        }
        if (interfaceC8537dpg == AbstractC8538dph.c() || interfaceC8537dpg == AbstractC8538dph.h() || interfaceC8537dpg == AbstractC8538dph.g() || interfaceC8537dpg == AbstractC8538dph.b() || interfaceC8537dpg == AbstractC8538dph.a() || interfaceC8537dpg == AbstractC8538dph.e()) {
            return null;
        }
        return interfaceC8537dpg.e(this);
    }

    public int c() {
        return this.a;
    }

    public Instant c(long j) {
        return c(0L, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        dataOutput.writeLong(this.d);
        dataOutput.writeInt(this.a);
    }

    public boolean c(Instant instant) {
        return compareTo(instant) > 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.d, instant.d);
        return compare != 0 ? compare : this.a - instant.a;
    }

    public long d() {
        return this.d;
    }

    @Override // o.doX
    /* renamed from: d */
    public Instant e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return j == Long.MIN_VALUE ? b(Long.MAX_VALUE, interfaceC8540dpj).b(1L, interfaceC8540dpj) : b(-j, interfaceC8540dpj);
    }

    @Override // o.doX
    /* renamed from: d */
    public Instant a(doW dow) {
        return (Instant) dow.e(this);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return super.d(interfaceC8535dpe);
    }

    public Instant e(long j) {
        return c(j, 0L);
    }

    @Override // o.doX
    /* renamed from: e */
    public Instant d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            chronoField.d(j);
            int i = AnonymousClass5.b[chronoField.ordinal()];
            if (i == 1) {
                return j != ((long) this.a) ? a(this.d, (int) j) : this;
            } else if (i == 2) {
                int i2 = ((int) j) * 1000;
                return i2 != this.a ? a(this.d, i2) : this;
            } else if (i == 3) {
                int i3 = ((int) j) * Prefetch.NANOSECONDS_PER_MILLISECOND;
                return i3 != this.a ? a(this.d, i3) : this;
            } else if (i == 4) {
                return j != this.d ? a(j, this.a) : this;
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
        }
        return (Instant) interfaceC8535dpe.d(this, j);
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.l, this.d).d(ChronoField.w, this.a);
    }

    public boolean e(Instant instant) {
        return compareTo(instant) < 0;
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.l || interfaceC8535dpe == ChronoField.w || interfaceC8535dpe == ChronoField.p || interfaceC8535dpe == ChronoField.r : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.d == instant.d && this.a == instant.a;
        }
        return false;
    }

    public int hashCode() {
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) + (this.a * 51);
    }

    public String toString() {
        return doE.b.b(this);
    }
}
