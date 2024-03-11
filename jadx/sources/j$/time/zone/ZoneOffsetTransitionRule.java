package j$.time.zone;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import o.doV;
import o.doW;

/* loaded from: classes5.dex */
public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final ZoneOffset a;
    private final Month b;
    private final DayOfWeek c;
    private final byte d;
    private final ZoneOffset e;
    private final LocalTime f;
    private final boolean h;
    private final ZoneOffset i;
    private final TimeDefinition j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.zone.ZoneOffsetTransitionRule$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeDefinition.values().length];
            a = iArr;
            try {
                iArr[TimeDefinition.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeDefinition.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD;

        public LocalDateTime b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
            long a2;
            int i = AnonymousClass1.a[ordinal()];
            if (i == 1) {
                a2 = zoneOffset2.a() - ZoneOffset.e.a();
            } else if (i != 2) {
                return localDateTime;
            } else {
                a2 = zoneOffset2.a() - zoneOffset.a();
            }
            return localDateTime.c(a2);
        }
    }

    ZoneOffsetTransitionRule(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.b = month;
        this.d = (byte) i;
        this.c = dayOfWeek;
        this.f = localTime;
        this.h = z;
        this.j = timeDefinition;
        this.i = zoneOffset;
        this.e = zoneOffset2;
        this.a = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffsetTransitionRule d(DataInput dataInput) {
        int readInt = dataInput.readInt();
        Month c = Month.c(readInt >>> 28);
        int i = (3670016 & readInt) >>> 19;
        DayOfWeek a = i == 0 ? null : DayOfWeek.a(i);
        int i2 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i3 = (readInt & 4080) >>> 4;
        int i4 = (readInt & 12) >>> 2;
        int i5 = readInt & 3;
        LocalTime c2 = i2 == 31 ? LocalTime.c(dataInput.readInt()) : LocalTime.c(i2 % 24, 0);
        ZoneOffset e = ZoneOffset.e(i3 == 255 ? dataInput.readInt() : (i3 - 128) * 900);
        return e(c, ((readInt & 264241152) >>> 22) - 32, a, c2, i2 == 24, timeDefinition, e, ZoneOffset.e(i4 == 3 ? dataInput.readInt() : (i4 * 1800) + e.a()), ZoneOffset.e(i5 == 3 ? dataInput.readInt() : e.a() + (i5 * 1800)));
    }

    public static ZoneOffsetTransitionRule e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, TimeDefinition timeDefinition, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        Objects.requireNonNull(month, SignupConstants.Field.DEMO_COLLECT_BIRTH_MONTH);
        Objects.requireNonNull(localTime, "time");
        Objects.requireNonNull(timeDefinition, "timeDefnition");
        Objects.requireNonNull(zoneOffset, "standardOffset");
        Objects.requireNonNull(zoneOffset2, "offsetBefore");
        Objects.requireNonNull(zoneOffset3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z || localTime.equals(LocalTime.b)) {
            if (localTime.d() == 0) {
                return new ZoneOffsetTransitionRule(month, i, dayOfWeek, localTime, z, timeDefinition, zoneOffset, zoneOffset2, zoneOffset3);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    public ZoneOffsetTransition a(int i) {
        LocalDate c;
        doW c2;
        byte b = this.d;
        if (b < 0) {
            Month month = this.b;
            c = LocalDate.c(i, month, month.d(IsoChronology.d.c(i)) + 1 + this.d);
            DayOfWeek dayOfWeek = this.c;
            if (dayOfWeek != null) {
                c2 = doV.b(dayOfWeek);
                c = c.d(c2);
            }
        } else {
            c = LocalDate.c(i, this.b, b);
            DayOfWeek dayOfWeek2 = this.c;
            if (dayOfWeek2 != null) {
                c2 = doV.c(dayOfWeek2);
                c = c.d(c2);
            }
        }
        if (this.h) {
            c = c.d(1L);
        }
        return new ZoneOffsetTransition(this.j.b(LocalDateTime.e(c, this.f), this.i, this.e), this.e, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DataOutput dataOutput) {
        int e = this.h ? 86400 : this.f.e();
        int a = this.i.a();
        int a2 = this.e.a() - a;
        int a3 = this.a.a() - a;
        int a4 = e % 3600 == 0 ? this.h ? 24 : this.f.a() : 31;
        int i = a % 900 == 0 ? (a / 900) + 128 : 255;
        int i2 = (a2 == 0 || a2 == 1800 || a2 == 3600) ? a2 / 1800 : 3;
        int i3 = (a3 == 0 || a3 == 1800 || a3 == 3600) ? a3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.b.c() << 28) + ((this.d + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.a()) << 19) + (a4 << 14) + (this.j.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (a4 == 31) {
            dataOutput.writeInt(e);
        }
        if (i == 255) {
            dataOutput.writeInt(a);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.e.a());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.a.a());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZoneOffsetTransitionRule) {
            ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
            return this.b == zoneOffsetTransitionRule.b && this.d == zoneOffsetTransitionRule.d && this.c == zoneOffsetTransitionRule.c && this.j == zoneOffsetTransitionRule.j && this.f.equals(zoneOffsetTransitionRule.f) && this.h == zoneOffsetTransitionRule.h && this.i.equals(zoneOffsetTransitionRule.i) && this.e.equals(zoneOffsetTransitionRule.e) && this.a.equals(zoneOffsetTransitionRule.a);
        }
        return false;
    }

    public int hashCode() {
        int e = this.f.e();
        boolean z = this.h;
        int ordinal = this.b.ordinal();
        byte b = this.d;
        DayOfWeek dayOfWeek = this.c;
        return ((((((((e + (z ? 1 : 0)) << 15) + (ordinal << 11)) + ((b + 32) << 5)) + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)) + this.j.ordinal()) ^ this.i.hashCode()) ^ this.e.hashCode()) ^ this.a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionRule["
            r0.append(r1)
            j$.time.ZoneOffset r1 = r3.e
            j$.time.ZoneOffset r2 = r3.a
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L17
            java.lang.String r1 = "Gap "
            goto L19
        L17:
            java.lang.String r1 = "Overlap "
        L19:
            r0.append(r1)
            j$.time.ZoneOffset r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            j$.time.DayOfWeek r1 = r3.c
            if (r1 == 0) goto L66
            byte r2 = r3.d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r1 = -1
            if (r2 != r1) goto L43
            java.lang.String r1 = " on or before last day of "
            goto L54
        L43:
            if (r2 >= 0) goto L61
            java.lang.String r1 = " on or before last day minus "
            r0.append(r1)
            byte r1 = r3.d
            int r1 = -r1
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r1 = " of "
        L54:
            r0.append(r1)
            j$.time.Month r1 = r3.b
            java.lang.String r1 = r1.name()
            r0.append(r1)
            goto L79
        L61:
            java.lang.String r1 = " on or after "
            r0.append(r1)
        L66:
            j$.time.Month r1 = r3.b
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            byte r1 = r3.d
            r0.append(r1)
        L79:
            java.lang.String r1 = " at "
            r0.append(r1)
            boolean r1 = r3.h
            if (r1 == 0) goto L85
            java.lang.String r1 = "24:00"
            goto L8b
        L85:
            j$.time.LocalTime r1 = r3.f
            java.lang.String r1 = r1.toString()
        L8b:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            j$.time.zone.ZoneOffsetTransitionRule$TimeDefinition r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", standard offset "
            r0.append(r1)
            j$.time.ZoneOffset r1 = r3.i
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.ZoneOffsetTransitionRule.toString():java.lang.String");
    }
}
