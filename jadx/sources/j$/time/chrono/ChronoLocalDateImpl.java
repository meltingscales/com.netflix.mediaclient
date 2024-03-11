package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.io.Serializable;
import java.util.Objects;
import o.InterfaceC8526dow;
import o.InterfaceC8528doy;
import o.InterfaceC8533dpc;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;

/* loaded from: classes.dex */
public abstract class ChronoLocalDateImpl implements InterfaceC8526dow, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoLocalDateImpl$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            e = iArr;
            try {
                iArr[ChronoUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[ChronoUnit.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[ChronoUnit.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[ChronoUnit.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private long b(InterfaceC8526dow interfaceC8526dow) {
        if (d().a(ChronoField.y).e() == 12) {
            ChronoField chronoField = ChronoField.z;
            long a = a(chronoField);
            ChronoField chronoField2 = ChronoField.h;
            return (((interfaceC8526dow.a(chronoField) * 32) + interfaceC8526dow.b(chronoField2)) - ((a * 32) + b(chronoField2))) / 32;
        }
        throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
    }

    public static InterfaceC8526dow d(InterfaceC8528doy interfaceC8528doy, doX dox) {
        InterfaceC8526dow interfaceC8526dow = (InterfaceC8526dow) dox;
        if (interfaceC8528doy.equals(interfaceC8526dow.d())) {
            return interfaceC8526dow;
        }
        String b = interfaceC8528doy.b();
        String b2 = interfaceC8526dow.d().b();
        throw new ClassCastException("Chronology mismatch, expected: " + b + ", actual: " + b2);
    }

    private long e(InterfaceC8526dow interfaceC8526dow) {
        return interfaceC8526dow.l() - l();
    }

    @Override // o.InterfaceC8526dow, o.doX
    public long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        Objects.requireNonNull(dox, "endExclusive");
        InterfaceC8526dow b = d().b(dox);
        if (!(interfaceC8540dpj instanceof ChronoUnit)) {
            Objects.requireNonNull(interfaceC8540dpj, "unit");
            return interfaceC8540dpj.d(this, b);
        }
        switch (AnonymousClass4.e[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
            case 1:
                return e(b);
            case 2:
                return e(b) / 7;
            case 3:
                return b(b);
            case 4:
                return b(b) / 12;
            case 5:
                return b(b) / 120;
            case 6:
                return b(b) / 1200;
            case 7:
                return b(b) / 12000;
            case 8:
                ChronoField chronoField = ChronoField.m;
                return b.a(chronoField) - a(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
        }
    }

    abstract InterfaceC8526dow b(long j);

    @Override // o.InterfaceC8526dow
    public InterfaceC8526dow b(InterfaceC8533dpc interfaceC8533dpc) {
        return super.b(interfaceC8533dpc);
    }

    abstract InterfaceC8526dow c(long j);

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: c */
    public InterfaceC8526dow e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return super.e(j, interfaceC8540dpj);
    }

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: c */
    public InterfaceC8526dow d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        return super.d(interfaceC8535dpe, j);
    }

    abstract InterfaceC8526dow d(long j);

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: d */
    public InterfaceC8526dow a(doW dow) {
        return super.a(dow);
    }

    @Override // o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC8526dow) && compareTo((InterfaceC8526dow) obj) == 0;
    }

    @Override // o.InterfaceC8526dow, o.doX
    /* renamed from: h */
    public InterfaceC8526dow b(long j, InterfaceC8540dpj interfaceC8540dpj) {
        long multiplyExact;
        long multiplyExact2;
        long multiplyExact3;
        long multiplyExact4;
        if (interfaceC8540dpj instanceof ChronoUnit) {
            switch (AnonymousClass4.e[((ChronoUnit) interfaceC8540dpj).ordinal()]) {
                case 1:
                    return c(j);
                case 2:
                    multiplyExact = Math.multiplyExact(j, 7L);
                    return c(multiplyExact);
                case 3:
                    return b(j);
                case 4:
                    return d(j);
                case 5:
                    multiplyExact2 = Math.multiplyExact(j, 10L);
                    return d(multiplyExact2);
                case 6:
                    multiplyExact3 = Math.multiplyExact(j, 100L);
                    return d(multiplyExact3);
                case 7:
                    multiplyExact4 = Math.multiplyExact(j, 1000L);
                    return d(multiplyExact4);
                case 8:
                    ChronoField chronoField = ChronoField.m;
                    return d(chronoField, Math.addExact(a(chronoField), j));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC8540dpj);
            }
        }
        return super.b(j, interfaceC8540dpj);
    }

    @Override // o.InterfaceC8526dow
    public int hashCode() {
        long l = l();
        return ((int) (l ^ (l >>> 32))) ^ d().hashCode();
    }

    @Override // o.InterfaceC8526dow
    public String toString() {
        long a = a(ChronoField.A);
        long a2 = a(ChronoField.y);
        long a3 = a(ChronoField.h);
        StringBuilder sb = new StringBuilder(30);
        sb.append(d().toString());
        sb.append(" ");
        sb.append(g());
        sb.append(" ");
        sb.append(a);
        sb.append(a2 < 10 ? "-0" : "-");
        sb.append(a2);
        sb.append(a3 >= 10 ? "-" : "-0");
        sb.append(a3);
        return sb.toString();
    }
}
