package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8529doz;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doA;
import o.doW;
import o.doX;

/* loaded from: classes.dex */
public final class ChronoLocalDateTimeImpl implements InterfaceC8529doz, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC8526dow b;
    private final transient LocalTime e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoLocalDateTimeImpl$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            d = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ChronoLocalDateTimeImpl(InterfaceC8526dow interfaceC8526dow, LocalTime localTime) {
        Objects.requireNonNull(interfaceC8526dow, "date");
        Objects.requireNonNull(localTime, "time");
        this.b = interfaceC8526dow;
        this.e = localTime;
    }

    private ChronoLocalDateTimeImpl a(long j) {
        return d(this.b, 0L, 0L, 0L, j);
    }

    private ChronoLocalDateTimeImpl a(doX dox, LocalTime localTime) {
        InterfaceC8526dow interfaceC8526dow = this.b;
        return (interfaceC8526dow == dox && this.e == localTime) ? this : new ChronoLocalDateTimeImpl(ChronoLocalDateImpl.d(interfaceC8526dow.d(), dox), localTime);
    }

    public static ChronoLocalDateTimeImpl a(InterfaceC8528doy interfaceC8528doy, doX dox) {
        ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) dox;
        if (interfaceC8528doy.equals(chronoLocalDateTimeImpl.i())) {
            return chronoLocalDateTimeImpl;
        }
        String b = interfaceC8528doy.b();
        String b2 = chronoLocalDateTimeImpl.i().b();
        throw new ClassCastException("Chronology mismatch, required: " + b + ", actual: " + b2);
    }

    private ChronoLocalDateTimeImpl b(long j) {
        return d(this.b, 0L, j, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl c(long j) {
        return a(this.b.b(j, ChronoUnit.DAYS), this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC8529doz c(ObjectInput objectInput) {
        return ((InterfaceC8526dow) objectInput.readObject()).a((LocalTime) objectInput.readObject());
    }

    private ChronoLocalDateTimeImpl d(long j) {
        return d(this.b, j, 0L, 0L, 0L);
    }

    private ChronoLocalDateTimeImpl d(InterfaceC8526dow interfaceC8526dow, long j, long j2, long j3, long j4) {
        LocalTime b;
        InterfaceC8526dow b2;
        if ((j | j2 | j3 | j4) == 0) {
            b = this.e;
            b2 = interfaceC8526dow;
        } else {
            long j5 = j4 / 86400000000000L;
            long j6 = j3 / 86400;
            long j7 = j2 / 1440;
            long j8 = j / 24;
            long b3 = this.e.b();
            long j9 = (j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L) + b3;
            long floorDiv = Math.floorDiv(j9, 86400000000000L);
            long floorMod = Math.floorMod(j9, 86400000000000L);
            b = floorMod == b3 ? this.e : LocalTime.b(floorMod);
            b2 = interfaceC8526dow.b(j5 + j6 + j7 + j8 + floorDiv, ChronoUnit.DAYS);
        }
        return a(b2, b);
    }

    public static ChronoLocalDateTimeImpl e(InterfaceC8526dow interfaceC8526dow, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl(interfaceC8526dow, localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    @Override // o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        long j;
        int i;
        Objects.requireNonNull(dox, "endExclusive");
        InterfaceC8529doz e = i().e(dox);
        if (!(interfaceC8540dpj instanceof ChronoUnit)) {
            Objects.requireNonNull(interfaceC8540dpj, "unit");
            return interfaceC8540dpj.d(this, e);
        } else if (!interfaceC8540dpj.a()) {
            InterfaceC8526dow a = e.a();
            if (e.f().e(this.e)) {
                a = a.e(1L, ChronoUnit.DAYS);
            }
            return this.b.a(a, interfaceC8540dpj);
        } else {
            ChronoField chronoField = ChronoField.k;
            long a2 = e.a(chronoField) - this.b.a(chronoField);
            switch (AnonymousClass3.d[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    j = 86400000000000L;
                    a2 = Math.multiplyExact(a2, j);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 2:
                    j = 86400000000L;
                    a2 = Math.multiplyExact(a2, j);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 3:
                    j = 86400000;
                    a2 = Math.multiplyExact(a2, j);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 4:
                    i = 86400;
                    a2 = Math.multiplyExact(a2, (long) i);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 5:
                    i = 1440;
                    a2 = Math.multiplyExact(a2, (long) i);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 6:
                    i = 24;
                    a2 = Math.multiplyExact(a2, (long) i);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                case 7:
                    i = 2;
                    a2 = Math.multiplyExact(a2, (long) i);
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
                default:
                    return Math.addExact(a2, this.e.a(e.f(), interfaceC8540dpj));
            }
        }
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.e.a(interfaceC8535dpe) : this.b.a(interfaceC8535dpe) : interfaceC8535dpe.d(this);
    }

    @Override // o.InterfaceC8529doz, o.doX
    /* renamed from: a */
    public ChronoLocalDateTimeImpl d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? a(this.b, this.e.d(interfaceC8535dpe, j)) : a(this.b.d(interfaceC8535dpe, j), this.e) : a(this.b.d(), interfaceC8535dpe.d(this, j));
    }

    @Override // o.InterfaceC8529doz
    public InterfaceC8526dow a() {
        return this.b;
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.e.b(interfaceC8535dpe) : this.b.b(interfaceC8535dpe) : d(interfaceC8535dpe).a(a(interfaceC8535dpe), interfaceC8535dpe);
    }

    @Override // o.InterfaceC8529doz
    public doA b(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.c(this, zoneId, null);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: c */
    public ChronoLocalDateTimeImpl f(long j, InterfaceC8540dpj interfaceC8540dpj) {
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass3.d[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return a(j);
                case 2:
                    return c(j / 86400000000L).a((j % 86400000000L) * 1000);
                case 3:
                    return c(j / 86400000).a((j % 86400000) * 1000000);
                case 4:
                    return e(j);
                case 5:
                    return b(j);
                case 6:
                    return d(j);
                case 7:
                    return c(j / 256).d((j % 256) * 12);
                default:
                    return a(this.b.b(j, interfaceC8540dpj), this.e);
            }
        }
        return a(this.b.d(), interfaceC8540dpj.e(this, j));
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? ((ChronoField) interfaceC8535dpe).b() ? this.e.d(interfaceC8535dpe) : this.b.d(interfaceC8535dpe) : interfaceC8535dpe.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChronoLocalDateTimeImpl e(long j) {
        return d(this.b, 0L, 0L, j, 0L);
    }

    @Override // o.InterfaceC8529doz
    /* renamed from: e */
    public ChronoLocalDateTimeImpl c(doW dow) {
        return dow instanceof InterfaceC8526dow ? a((InterfaceC8526dow) dow, this.e) : dow instanceof LocalTime ? a(this.b, (LocalTime) dow) : dow instanceof ChronoLocalDateTimeImpl ? a(this.b.d(), (ChronoLocalDateTimeImpl) dow) : a(this.b.d(), (ChronoLocalDateTimeImpl) dow.e(this));
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        if (!(interfaceC8535dpe instanceof ChronoField)) {
            return interfaceC8535dpe != null && interfaceC8535dpe.a(this);
        }
        ChronoField chronoField = (ChronoField) interfaceC8535dpe;
        return chronoField.d() || chronoField.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC8529doz) && compareTo((InterfaceC8529doz) obj) == 0;
    }

    @Override // o.InterfaceC8529doz
    public LocalTime f() {
        return this.e;
    }

    @Override // o.InterfaceC8529doz
    public int hashCode() {
        return a().hashCode() ^ f().hashCode();
    }

    @Override // o.InterfaceC8529doz
    public String toString() {
        String interfaceC8526dow = a().toString();
        String localTime = f().toString();
        return interfaceC8526dow + "T" + localTime;
    }
}
