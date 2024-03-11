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
public final class MinguoDate extends ChronoLocalDateImpl implements Serializable {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient LocalDate e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.MinguoDate$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass3 {
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
    public MinguoDate(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.e = localDate;
    }

    private int a() {
        return this.e.j() - 1911;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MinguoDate b(DataInput dataInput) {
        return MinguoChronology.b.b(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private long c() {
        return ((a() * 12) + this.e.h()) - 1;
    }

    private MinguoDate e(LocalDate localDate) {
        return localDate.equals(this.e) ? this : new MinguoDate(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    public /* bridge */ /* synthetic */ long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        return super.a(dox, interfaceC8540dpj);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            int i = AnonymousClass3.d[((ChronoField) interfaceC8535dpe).ordinal()];
            if (i == 4) {
                int a = a();
                if (a < 1) {
                    a = 1 - a;
                }
                return a;
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 7) {
                        return this.e.a(interfaceC8535dpe);
                    }
                    return a() < 1 ? 0 : 1;
                }
                return a();
            } else {
                return c();
            }
        }
        return interfaceC8535dpe.d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: a */
    public MinguoDate c(long j) {
        return e(this.e.d(j));
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public MinguoDate e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (MinguoDate) super.e(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: a */
    public MinguoDate b(InterfaceC8533dpc interfaceC8533dpc) {
        return (MinguoDate) super.b(interfaceC8533dpc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j$.time.chrono.MinguoDate d(o.InterfaceC8535dpe r8, long r9) {
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
            int[] r1 = j$.time.chrono.MinguoDate.AnonymousClass3.d
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
            j$.time.chrono.MinguoChronology r8 = r7.d()
            j$.time.temporal.ValueRange r8 = r8.a(r0)
            r8.c(r9, r0)
            long r0 = r7.c()
            long r9 = r9 - r0
            j$.time.chrono.MinguoDate r8 = r7.b(r9)
            return r8
        L3a:
            j$.time.chrono.MinguoChronology r2 = r7.d()
            j$.time.temporal.ValueRange r2 = r2.a(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L7b
            if (r0 == r4) goto L6e
            if (r0 == r3) goto L5d
        L52:
            j$.time.LocalDate r0 = r7.e
            j$.time.LocalDate r8 = r0.d(r8, r9)
            j$.time.chrono.MinguoDate r8 = r7.e(r8)
            return r8
        L5d:
            j$.time.LocalDate r8 = r7.e
            int r9 = r7.a()
            int r9 = 1912 - r9
            j$.time.LocalDate r8 = r8.b(r9)
            j$.time.chrono.MinguoDate r8 = r7.e(r8)
            return r8
        L6e:
            j$.time.LocalDate r8 = r7.e
            int r2 = r2 + 1911
            j$.time.LocalDate r8 = r8.b(r2)
            j$.time.chrono.MinguoDate r8 = r7.e(r8)
            return r8
        L7b:
            j$.time.LocalDate r8 = r7.e
            int r9 = r7.a()
            r10 = 1
            if (r9 < r10) goto L87
            int r2 = r2 + 1911
            goto L89
        L87:
            int r2 = 1912 - r2
        L89:
            j$.time.LocalDate r8 = r8.b(r2)
            j$.time.chrono.MinguoDate r8 = r7.e(r8)
            return r8
        L92:
            o.dow r8 = super.d(r8, r9)
            j$.time.chrono.MinguoDate r8 = (j$.time.chrono.MinguoDate) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.MinguoDate.d(o.dpe, long):j$.time.chrono.MinguoDate");
    }

    @Override // o.InterfaceC8526dow
    public final InterfaceC8529doz a(LocalTime localTime) {
        return super.a(localTime);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: b */
    public MinguoChronology d() {
        return MinguoChronology.b;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: c */
    public MinguoDate d(doW dow) {
        return (MinguoDate) super.a(dow);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: d */
    public MinguoDate h(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (MinguoDate) super.b(j, interfaceC8540dpj);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            if (!e(interfaceC8535dpe)) {
                throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            int i = AnonymousClass3.d[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.e.d(interfaceC8535dpe);
            }
            if (i != 4) {
                return d().a(chronoField);
            }
            ValueRange a = ChronoField.B.a();
            return ValueRange.b(1L, a() <= 0 ? (-a.d()) + 1912 : a.e() - 1911);
        }
        return interfaceC8535dpe.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        dataOutput.writeInt(b(ChronoField.B));
        dataOutput.writeByte(b(ChronoField.y));
        dataOutput.writeByte(b(ChronoField.h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: e */
    public MinguoDate b(long j) {
        return e(this.e.c(j));
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: e */
    public MinguoEra g() {
        return a() >= 1 ? MinguoEra.ROC : MinguoEra.BEFORE_ROC;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MinguoDate) {
            return this.e.equals(((MinguoDate) obj).e);
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
    public MinguoDate d(long j) {
        return e(this.e.h(j));
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
