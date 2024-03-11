package j$.time.chrono;

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
import o.InterfaceC8529doz;
import o.InterfaceC8533dpc;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;

/* loaded from: classes6.dex */
public final class ThaiBuddhistDate extends ChronoLocalDateImpl implements Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient LocalDate b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ThaiBuddhistDate$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ChronoField.values().length];
            d = iArr;
            try {
                iArr[ChronoField.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ChronoField.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ChronoField.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[ChronoField.A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[ChronoField.z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[ChronoField.B.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[ChronoField.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThaiBuddhistDate(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.b = localDate;
    }

    private int b() {
        return this.b.j() + 543;
    }

    private long c() {
        return ((b() * 12) + this.b.h()) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThaiBuddhistDate c(DataInput dataInput) {
        return ThaiBuddhistChronology.d.b(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private ThaiBuddhistDate d(LocalDate localDate) {
        return localDate.equals(this.b) ? this : new ThaiBuddhistDate(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    public /* bridge */ /* synthetic */ long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        return super.a(dox, interfaceC8540dpj);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass4.d[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i == 4) {
                int b = b();
                if (b < 1) {
                    b = 1 - b;
                }
                return b;
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        return this.b.a(interfaceC8535dpe);
                    }
                    return b() < 1 ? 0 : 1;
                }
                return b();
            } else {
                return c();
            }
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: a */
    public ThaiBuddhistChronology d() {
        return ThaiBuddhistChronology.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: a */
    public ThaiBuddhistDate b(long j) {
        return d(this.b.c(j));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: a */
    public ThaiBuddhistDate h(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (ThaiBuddhistDate) super.b(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: a */
    public ThaiBuddhistDate b(InterfaceC8533dpc interfaceC8533dpc) {
        return (ThaiBuddhistDate) super.b(interfaceC8533dpc);
    }

    @Override // o.InterfaceC8526dow
    public final InterfaceC8529doz a(LocalTime localTime) {
        return super.a(localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: b */
    public ThaiBuddhistDate d(doW dow) {
        return (ThaiBuddhistDate) super.a(dow);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(DataOutput dataOutput) {
        dataOutput.writeInt(b(ChronoField.B));
        dataOutput.writeByte(b(ChronoField.y));
        dataOutput.writeByte(b(ChronoField.h));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: d */
    public ThaiBuddhistDate e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (ThaiBuddhistDate) super.e(j, interfaceC8540dpj);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            if (!e(interfaceC8535dpe)) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass4.d[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.b.d(interfaceC8535dpe);
            }
            if (i != 4) {
                return d().a(chronoField);
            }
            ValueRange a = ChronoField.B.a();
            return ValueRange.b(1L, b() <= 0 ? (-(a.d() + 543)) + 1 : 543 + a.e());
        }
        return interfaceC8535dpe.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: e */
    public ThaiBuddhistDate c(long j) {
        return d(this.b.d(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j$.time.chrono.ThaiBuddhistDate d(o.InterfaceC8535dpe r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L92
            r0 = r8
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r7.a(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r7
        L10:
            int[] r1 = j$.time.chrono.ThaiBuddhistDate.AnonymousClass4.d
            int r2 = r0.ordinal()
            r2 = r1[r2]
            r3 = 7
            r4 = 6
            r5 = 4
            if (r2 == r5) goto L3a
            r6 = 5
            if (r2 == r6) goto L25
            if (r2 == r4) goto L3a
            if (r2 == r3) goto L3a
            goto L52
        L25:
            j$.time.chrono.ThaiBuddhistChronology r8 = r7.d()
            j$.time.temporal.ValueRange r8 = r8.a(r0)
            r8.c(r9, r0)
            long r0 = r7.c()
            long r9 = r9 - r0
            j$.time.chrono.ThaiBuddhistDate r8 = r7.b(r9)
            return r8
        L3a:
            j$.time.chrono.ThaiBuddhistChronology r2 = r7.d()
            j$.time.temporal.ValueRange r2 = r2.a(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L7b
            if (r0 == r4) goto L6e
            if (r0 == r3) goto L5d
        L52:
            j$.time.LocalDate r0 = r7.b
            j$.time.LocalDate r8 = r0.d(r8, r9)
            j$.time.chrono.ThaiBuddhistDate r8 = r7.d(r8)
            return r8
        L5d:
            j$.time.LocalDate r8 = r7.b
            int r9 = r7.b()
            int r9 = (-542) - r9
            j$.time.LocalDate r8 = r8.b(r9)
            j$.time.chrono.ThaiBuddhistDate r8 = r7.d(r8)
            return r8
        L6e:
            j$.time.LocalDate r8 = r7.b
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.b(r2)
            j$.time.chrono.ThaiBuddhistDate r8 = r7.d(r8)
            return r8
        L7b:
            j$.time.LocalDate r8 = r7.b
            int r9 = r7.b()
            r10 = 1
            if (r9 < r10) goto L85
            goto L87
        L85:
            int r2 = 1 - r2
        L87:
            int r2 = r2 + (-543)
            j$.time.LocalDate r8 = r8.b(r2)
            j$.time.chrono.ThaiBuddhistDate r8 = r7.d(r8)
            return r8
        L92:
            o.dow r8 = super.d(r8, r9)
            j$.time.chrono.ThaiBuddhistDate r8 = (j$.time.chrono.ThaiBuddhistDate) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.ThaiBuddhistDate.d(o.dpe, long):j$.time.chrono.ThaiBuddhistDate");
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: e */
    public ThaiBuddhistEra g() {
        return b() >= 1 ? ThaiBuddhistEra.BE : ThaiBuddhistEra.BEFORE_BE;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThaiBuddhistDate) {
            return this.b.equals(((ThaiBuddhistDate) obj).b);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: g */
    public ThaiBuddhistDate d(long j) {
        return d(this.b.h(j));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public int hashCode() {
        return d().b().hashCode() ^ this.b.hashCode();
    }

    @Override // o.InterfaceC8526dow
    public long l() {
        return this.b.l();
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
