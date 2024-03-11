package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import o.AbstractC8515dol;
import o.InterfaceC8529doz;
import o.InterfaceC8533dpc;
import o.InterfaceC8535dpe;
import o.InterfaceC8540dpj;
import o.doW;
import o.doX;

/* loaded from: classes6.dex */
public final class HijrahDate extends ChronoLocalDateImpl implements Serializable {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient int a;
    private final transient int b;
    private final transient HijrahChronology d;
    private final transient int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.HijrahDate$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static abstract /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ChronoField.values().length];
            c = iArr;
            try {
                iArr[ChronoField.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ChronoField.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ChronoField.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ChronoField.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ChronoField.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ChronoField.a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ChronoField.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[ChronoField.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[ChronoField.y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[ChronoField.z.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[ChronoField.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[ChronoField.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[ChronoField.m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private HijrahDate(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        hijrahChronology.d(i, i2, i3);
        this.d = hijrahChronology;
        this.b = i;
        this.e = i2;
        this.a = i3;
    }

    private HijrahDate(HijrahChronology hijrahChronology, long j) {
        int[] d = hijrahChronology.d((int) j);
        this.d = hijrahChronology;
        this.b = d[0];
        this.e = d[1];
        this.a = d[2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate a(HijrahChronology hijrahChronology, int i, int i2, int i3) {
        return new HijrahDate(hijrahChronology, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate a(ObjectInput objectInput) {
        return ((HijrahChronology) objectInput.readObject()).b(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
    }

    private int b() {
        return AbstractC8515dol.e(l() + 3, 7) + 1;
    }

    private HijrahDate b(int i, int i2, int i3) {
        int e = this.d.e(i, i2);
        if (i3 > e) {
            i3 = e;
        }
        return a(this.d, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HijrahDate d(HijrahChronology hijrahChronology, long j) {
        return new HijrahDate(hijrahChronology, j);
    }

    private int h() {
        return this.d.d(this.b, this.e) + this.a;
    }

    private int i() {
        return this.b > 1 ? 1 : 0;
    }

    private long j() {
        return ((this.b * 12) + this.e) - 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    public /* bridge */ /* synthetic */ long a(doX dox, InterfaceC8540dpj interfaceC8540dpj) {
        return super.a(dox, interfaceC8540dpj);
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        int i;
        int i2;
        int i3;
        int i4;
        if (interfaceC8535dpe instanceof ChronoField) {
            switch (AnonymousClass5.c[((ChronoField) interfaceC8535dpe).ordinal()]) {
                case 1:
                    i = this.a;
                    break;
                case 2:
                    i = h();
                    break;
                case 3:
                    i2 = this.a;
                    i4 = (i2 - 1) / 7;
                    i = i4 + 1;
                    break;
                case 4:
                    i = b();
                    break;
                case 5:
                    i3 = this.a;
                    i4 = (i3 - 1) % 7;
                    i = i4 + 1;
                    break;
                case 6:
                    i3 = h();
                    i4 = (i3 - 1) % 7;
                    i = i4 + 1;
                    break;
                case 7:
                    return l();
                case 8:
                    i2 = h();
                    i4 = (i2 - 1) / 7;
                    i = i4 + 1;
                    break;
                case 9:
                    i = this.e;
                    break;
                case 10:
                    return j();
                case 11:
                case 12:
                    i = this.b;
                    break;
                case 13:
                    i = i();
                    break;
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
            return i;
        }
        return interfaceC8535dpe.d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: a */
    public HijrahDate b(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.e - 1) + j;
        return b(this.d.d(Math.floorDiv(j2, 12L)), ((int) Math.floorMod(j2, 12L)) + 1, this.a);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: a */
    public HijrahDate h(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (HijrahDate) super.b(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: a */
    public HijrahDate d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) interfaceC8535dpe;
            this.d.a(chronoField).c(j, chronoField);
            int i = (int) j;
            switch (AnonymousClass5.c[chronoField.ordinal()]) {
                case 1:
                    return b(this.b, this.e, i);
                case 2:
                    return c(Math.min(i, k()) - h());
                case 3:
                    return c((j - a(ChronoField.e)) * 7);
                case 4:
                    return c(j - b());
                case 5:
                    return c(j - a(ChronoField.c));
                case 6:
                    return c(j - a(ChronoField.a));
                case 7:
                    return new HijrahDate(this.d, j);
                case 8:
                    return c((j - a(ChronoField.d)) * 7);
                case 9:
                    return b(this.b, i, this.a);
                case 10:
                    return b(j - j());
                case 11:
                    if (this.b < 1) {
                        i = 1 - i;
                    }
                    return b(i, this.e, this.a);
                case 12:
                    return b(i, this.e, this.a);
                case 13:
                    return b(1 - this.b, this.e, this.a);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
            }
        }
        return (HijrahDate) super.d(interfaceC8535dpe, j);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: a */
    public HijrahEra g() {
        return HijrahEra.AH;
    }

    @Override // o.InterfaceC8526dow
    public final InterfaceC8529doz a(LocalTime localTime) {
        return super.a(localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: b */
    public HijrahDate d(doW dow) {
        return (HijrahDate) super.a(dow);
    }

    @Override // o.InterfaceC8526dow
    /* renamed from: c */
    public HijrahChronology d() {
        return this.d;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow, o.doX
    /* renamed from: d */
    public HijrahDate e(long j, InterfaceC8540dpj interfaceC8540dpj) {
        return (HijrahDate) super.e(j, interfaceC8540dpj);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    /* renamed from: d */
    public HijrahDate b(InterfaceC8533dpc interfaceC8533dpc) {
        return (HijrahDate) super.b(interfaceC8533dpc);
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe instanceof ChronoField) {
            if (e(interfaceC8535dpe)) {
                ChronoField chronoField = (ChronoField) interfaceC8535dpe;
                int i = AnonymousClass5.c[chronoField.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? d().a(chronoField) : ValueRange.b(1L, 5L) : ValueRange.b(1L, k()) : ValueRange.b(1L, e());
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return interfaceC8535dpe.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ObjectOutput objectOutput) {
        objectOutput.writeObject(d());
        objectOutput.writeInt(b(ChronoField.B));
        objectOutput.writeByte(b(ChronoField.y));
        objectOutput.writeByte(b(ChronoField.h));
    }

    public int e() {
        return this.d.e(this.b, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: e */
    public HijrahDate c(long j) {
        return new HijrahDate(this.d, l() + j);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HijrahDate) {
            HijrahDate hijrahDate = (HijrahDate) obj;
            return this.b == hijrahDate.b && this.e == hijrahDate.e && this.a == hijrahDate.a && d().equals(hijrahDate.d());
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public int hashCode() {
        int i = this.b;
        return ((i & (-2048)) ^ d().b().hashCode()) ^ (((i << 11) + (this.e << 6)) + this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.ChronoLocalDateImpl
    /* renamed from: j */
    public HijrahDate d(long j) {
        return j == 0 ? this : b(Math.addExact(this.b, (int) j), this.e, this.a);
    }

    @Override // o.InterfaceC8526dow
    public int k() {
        return this.d.e(this.b);
    }

    @Override // o.InterfaceC8526dow
    public long l() {
        return this.d.d(this.b, this.e, this.a);
    }

    @Override // o.InterfaceC8526dow
    public boolean n() {
        return this.d.c(this.b);
    }

    @Override // j$.time.chrono.ChronoLocalDateImpl, o.InterfaceC8526dow
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
