package j$.time.zone;

import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.InterfaceC8529doz;

/* loaded from: classes.dex */
public final class ZoneRules implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;
    private final ZoneOffsetTransitionRule[] b;
    private final long[] f;
    private final transient ConcurrentMap g = new ConcurrentHashMap();
    private final ZoneOffset[] h;
    private final LocalDateTime[] i;
    private final long[] j;
    private final TimeZone m;

    /* renamed from: o  reason: collision with root package name */
    private final ZoneOffset[] f13344o;
    private static final long[] e = new long[0];
    private static final ZoneOffsetTransitionRule[] d = new ZoneOffsetTransitionRule[0];
    private static final LocalDateTime[] c = new LocalDateTime[0];
    private static final ZoneOffsetTransition[] a = new ZoneOffsetTransition[0];

    private ZoneRules(ZoneOffset zoneOffset) {
        this.h = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = e;
        this.f = jArr;
        this.j = jArr;
        this.i = c;
        this.f13344o = zoneOffsetArr;
        this.b = d;
        this.m = null;
    }

    public ZoneRules(TimeZone timeZone) {
        this.h = r0;
        ZoneOffset[] zoneOffsetArr = {d(timeZone.getRawOffset())};
        long[] jArr = e;
        this.f = jArr;
        this.j = jArr;
        this.i = c;
        this.f13344o = zoneOffsetArr;
        this.b = d;
        this.m = timeZone;
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        LocalDateTime d2;
        this.f = jArr;
        this.h = zoneOffsetArr;
        this.j = jArr2;
        this.f13344o = zoneOffsetArr2;
        this.b = zoneOffsetTransitionRuleArr;
        if (jArr2.length == 0) {
            this.i = c;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jArr2.length) {
                int i2 = i + 1;
                ZoneOffsetTransition zoneOffsetTransition = new ZoneOffsetTransition(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
                if (zoneOffsetTransition.j()) {
                    arrayList.add(zoneOffsetTransition.d());
                    d2 = zoneOffsetTransition.a();
                } else {
                    arrayList.add(zoneOffsetTransition.a());
                    d2 = zoneOffsetTransition.d();
                }
                arrayList.add(d2);
                i = i2;
            }
            this.i = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.m = null;
    }

    private int b(long j, ZoneOffset zoneOffset) {
        long floorDiv;
        floorDiv = Math.floorDiv(j + zoneOffset.a(), 86400L);
        return LocalDate.b(floorDiv).j();
    }

    private ZoneOffsetTransition[] b(int i) {
        long j;
        long j2;
        Integer valueOf = Integer.valueOf(i);
        ZoneOffsetTransition[] zoneOffsetTransitionArr = (ZoneOffsetTransition[]) this.g.get(valueOf);
        if (zoneOffsetTransitionArr != null) {
            return zoneOffsetTransitionArr;
        }
        if (this.m == null) {
            ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.b;
            ZoneOffsetTransition[] zoneOffsetTransitionArr2 = new ZoneOffsetTransition[zoneOffsetTransitionRuleArr.length];
            for (int i2 = 0; i2 < zoneOffsetTransitionRuleArr.length; i2++) {
                zoneOffsetTransitionArr2[i2] = zoneOffsetTransitionRuleArr[i2].a(i);
            }
            if (i < 2100) {
                this.g.putIfAbsent(valueOf, zoneOffsetTransitionArr2);
            }
            return zoneOffsetTransitionArr2;
        } else if (i < 1800) {
            return a;
        } else {
            long b = LocalDateTime.c(i - 1, 12, 31, 0, 0).b(this.h[0]);
            long j3 = 1000;
            int offset = this.m.getOffset(b * 1000);
            long j4 = 31968000 + b;
            ZoneOffsetTransition[] zoneOffsetTransitionArr3 = a;
            while (b < j4) {
                long j5 = 7776000 + b;
                long j6 = b;
                if (offset != this.m.getOffset(j5 * j3)) {
                    b = j6;
                    while (j5 - b > 1) {
                        long j7 = j4;
                        long floorDiv = Math.floorDiv(j5 + b, 2L);
                        long j8 = j5;
                        if (this.m.getOffset(floorDiv * 1000) == offset) {
                            b = floorDiv;
                            j5 = j8;
                        } else {
                            j5 = floorDiv;
                        }
                        j3 = 1000;
                        j4 = j7;
                    }
                    j = j4;
                    long j9 = j5;
                    j2 = j3;
                    if (this.m.getOffset(b * j2) == offset) {
                        b = j9;
                    }
                    ZoneOffset d2 = d(offset);
                    int offset2 = this.m.getOffset(b * j2);
                    ZoneOffset d3 = d(offset2);
                    if (b(b, d3) == i) {
                        ZoneOffsetTransition[] zoneOffsetTransitionArr4 = (ZoneOffsetTransition[]) Arrays.copyOf(zoneOffsetTransitionArr3, zoneOffsetTransitionArr3.length + 1);
                        zoneOffsetTransitionArr4[zoneOffsetTransitionArr4.length - 1] = new ZoneOffsetTransition(b, d2, d3);
                        offset = offset2;
                        zoneOffsetTransitionArr3 = zoneOffsetTransitionArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    j = j4;
                    j2 = j3;
                    b = j5;
                }
                j3 = j2;
                j4 = j;
            }
            if (1916 <= i && i < 2100) {
                this.g.putIfAbsent(valueOf, zoneOffsetTransitionArr3);
            }
            return zoneOffsetTransitionArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRules c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = readInt == 0 ? e : new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = Ser.b(dataInput);
        }
        int i2 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            zoneOffsetArr[i3] = Ser.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = readInt2 == 0 ? e : new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = Ser.b(dataInput);
        }
        int i5 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            zoneOffsetArr2[i6] = Ser.d(dataInput);
        }
        int readByte = dataInput.readByte();
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = readByte == 0 ? d : new ZoneOffsetTransitionRule[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            zoneOffsetTransitionRuleArr[i7] = ZoneOffsetTransitionRule.d(dataInput);
        }
        return new ZoneRules(jArr, zoneOffsetArr, jArr2, zoneOffsetArr2, zoneOffsetTransitionRuleArr);
    }

    private static ZoneOffset d(int i) {
        return ZoneOffset.e(i / 1000);
    }

    public static ZoneRules d(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneRules d(DataInput dataInput) {
        return new ZoneRules(TimeZone.getTimeZone(dataInput.readUTF()));
    }

    private Object d(LocalDateTime localDateTime, ZoneOffsetTransition zoneOffsetTransition) {
        LocalDateTime d2 = zoneOffsetTransition.d();
        boolean j = zoneOffsetTransition.j();
        boolean c2 = localDateTime.c((InterfaceC8529doz) d2);
        return j ? c2 ? zoneOffsetTransition.b() : localDateTime.c((InterfaceC8529doz) zoneOffsetTransition.a()) ? zoneOffsetTransition : zoneOffsetTransition.e() : !c2 ? zoneOffsetTransition.e() : localDateTime.c((InterfaceC8529doz) zoneOffsetTransition.a()) ? zoneOffsetTransition.b() : zoneOffsetTransition;
    }

    private Object e(LocalDateTime localDateTime) {
        LocalDateTime[] localDateTimeArr;
        Object obj = null;
        int i = 0;
        if (this.m != null) {
            ZoneOffsetTransition[] b = b(localDateTime.e());
            if (b.length == 0) {
                return d(this.m.getOffset(localDateTime.b(this.h[0]) * 1000));
            }
            int length = b.length;
            while (i < length) {
                ZoneOffsetTransition zoneOffsetTransition = b[i];
                Object d2 = d(localDateTime, zoneOffsetTransition);
                if ((d2 instanceof ZoneOffsetTransition) || d2.equals(zoneOffsetTransition.b())) {
                    return d2;
                }
                i++;
                obj = d2;
            }
            return obj;
        } else if (this.j.length == 0) {
            return this.h[0];
        } else {
            if (this.b.length > 0) {
                if (localDateTime.e((InterfaceC8529doz) this.i[localDateTimeArr.length - 1])) {
                    ZoneOffsetTransition[] b2 = b(localDateTime.e());
                    int length2 = b2.length;
                    while (i < length2) {
                        ZoneOffsetTransition zoneOffsetTransition2 = b2[i];
                        Object d3 = d(localDateTime, zoneOffsetTransition2);
                        if ((d3 instanceof ZoneOffsetTransition) || d3.equals(zoneOffsetTransition2.b())) {
                            return d3;
                        }
                        i++;
                        obj = d3;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.i, localDateTime);
            if (binarySearch == -1) {
                return this.f13344o[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.i;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i2])) {
                        binarySearch = i2;
                    }
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime[] localDateTimeArr3 = this.i;
                LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
                ZoneOffset[] zoneOffsetArr = this.f13344o;
                int i3 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr[i3];
                ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
                return zoneOffset2.a() > zoneOffset.a() ? new ZoneOffsetTransition(localDateTime2, zoneOffset, zoneOffset2) : new ZoneOffsetTransition(localDateTime3, zoneOffset, zoneOffset2);
            }
            return this.f13344o[(binarySearch / 2) + 1];
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser(this.m != null ? (byte) 100 : (byte) 1, this);
    }

    public ZoneOffset a(Instant instant) {
        long[] jArr;
        ZoneOffset[] zoneOffsetArr;
        TimeZone timeZone = this.m;
        if (timeZone != null) {
            return d(timeZone.getOffset(instant.b()));
        }
        if (this.j.length == 0) {
            return this.h[0];
        }
        long d2 = instant.d();
        if (this.b.length > 0) {
            if (d2 > this.j[jArr.length - 1]) {
                ZoneOffsetTransition[] b = b(b(d2, this.f13344o[zoneOffsetArr.length - 1]));
                ZoneOffsetTransition zoneOffsetTransition = null;
                for (int i = 0; i < b.length; i++) {
                    zoneOffsetTransition = b[i];
                    if (d2 < zoneOffsetTransition.f()) {
                        return zoneOffsetTransition.b();
                    }
                }
                return zoneOffsetTransition.e();
            }
        }
        int binarySearch = Arrays.binarySearch(this.j, d2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f13344o[binarySearch + 1];
    }

    public ZoneOffsetTransition b(Instant instant) {
        if (this.m == null) {
            if (this.j.length == 0) {
                return null;
            }
            long d2 = instant.d();
            if (instant.c() > 0 && d2 < Long.MAX_VALUE) {
                d2++;
            }
            long[] jArr = this.j;
            long j = jArr[jArr.length - 1];
            if (this.b.length > 0 && d2 > j) {
                ZoneOffset[] zoneOffsetArr = this.f13344o;
                ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                int b = b(d2, zoneOffset);
                ZoneOffsetTransition[] b2 = b(b);
                for (int length = b2.length - 1; length >= 0; length--) {
                    if (d2 > b2[length].f()) {
                        return b2[length];
                    }
                }
                int i = b - 1;
                if (i > b(j, zoneOffset)) {
                    ZoneOffsetTransition[] b3 = b(i);
                    return b3[b3.length - 1];
                }
            }
            int binarySearch = Arrays.binarySearch(this.j, d2);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            if (binarySearch <= 0) {
                return null;
            }
            int i2 = binarySearch - 1;
            long j2 = this.j[i2];
            ZoneOffset[] zoneOffsetArr2 = this.f13344o;
            return new ZoneOffsetTransition(j2, zoneOffsetArr2[i2], zoneOffsetArr2[binarySearch]);
        }
        long d3 = instant.d();
        if (instant.c() > 0 && d3 < Long.MAX_VALUE) {
            d3++;
        }
        int b4 = b(d3, a(instant));
        ZoneOffsetTransition[] b5 = b(b4);
        for (int length2 = b5.length - 1; length2 >= 0; length2--) {
            if (d3 > b5[length2].f()) {
                return b5[length2];
            }
        }
        if (b4 > 1800) {
            ZoneOffsetTransition[] b6 = b(b4 - 1);
            for (int length3 = b6.length - 1; length3 >= 0; length3--) {
                if (d3 > b6[length3].f()) {
                    return b6[length3];
                }
            }
            int offset = this.m.getOffset((d3 - 1) * 1000);
            long l = LocalDate.a(1800, 1, 1).l();
            for (long min = Math.min(d3 - 31104000, (Clock.e().a() / 1000) + 31968000); 86400 * l <= min; min -= 7776000) {
                int offset2 = this.m.getOffset(min * 1000);
                if (offset != offset2) {
                    int b7 = b(min, d(offset2));
                    ZoneOffsetTransition[] b8 = b(b7 + 1);
                    for (int length4 = b8.length - 1; length4 >= 0; length4--) {
                        if (d3 > b8[length4].f()) {
                            return b8[length4];
                        }
                    }
                    ZoneOffsetTransition[] b9 = b(b7);
                    return b9[b9.length - 1];
                }
            }
        }
        return null;
    }

    public List b(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        return e2 instanceof ZoneOffsetTransition ? ((ZoneOffsetTransition) e2).h() : Collections.singletonList((ZoneOffset) e2);
    }

    public ZoneOffset c(Instant instant) {
        TimeZone timeZone = this.m;
        if (timeZone != null) {
            return d(timeZone.getRawOffset());
        }
        if (this.j.length == 0) {
            return this.h[0];
        }
        int binarySearch = Arrays.binarySearch(this.f, instant.d());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.h[binarySearch + 1];
    }

    public ZoneOffsetTransition d(LocalDateTime localDateTime) {
        Object e2 = e(localDateTime);
        if (e2 instanceof ZoneOffsetTransition) {
            return (ZoneOffsetTransition) e2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        dataOutput.writeUTF(this.m.getID());
    }

    public boolean d() {
        TimeZone timeZone = this.m;
        return timeZone != null ? !timeZone.useDaylightTime() && this.m.getDSTSavings() == 0 && b(Instant.a()) == null : this.j.length == 0;
    }

    public boolean d(Instant instant) {
        return !c(instant).equals(a(instant));
    }

    public boolean d(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return b(localDateTime).contains(zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(DataOutput dataOutput) {
        dataOutput.writeInt(this.f.length);
        for (long j : this.f) {
            Ser.e(j, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.h) {
            Ser.a(zoneOffset, dataOutput);
        }
        dataOutput.writeInt(this.j.length);
        for (long j2 : this.j) {
            Ser.e(j2, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f13344o) {
            Ser.a(zoneOffset2, dataOutput);
        }
        dataOutput.writeByte(this.b.length);
        for (ZoneOffsetTransitionRule zoneOffsetTransitionRule : this.b) {
            zoneOffsetTransitionRule.a(dataOutput);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            return Objects.equals(this.m, zoneRules.m) && Arrays.equals(this.f, zoneRules.f) && Arrays.equals(this.h, zoneRules.h) && Arrays.equals(this.j, zoneRules.j) && Arrays.equals(this.f13344o, zoneRules.f13344o) && Arrays.equals(this.b, zoneRules.b);
        }
        return false;
    }

    public int hashCode() {
        return ((((Objects.hashCode(this.m) ^ Arrays.hashCode(this.f)) ^ Arrays.hashCode(this.h)) ^ Arrays.hashCode(this.j)) ^ Arrays.hashCode(this.f13344o)) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder sb;
        TimeZone timeZone = this.m;
        if (timeZone != null) {
            String id = timeZone.getID();
            sb = new StringBuilder();
            sb.append("ZoneRules[timeZone=");
            sb.append(id);
        } else {
            ZoneOffset[] zoneOffsetArr = this.h;
            ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
            sb = new StringBuilder();
            sb.append("ZoneRules[currentStandardOffset=");
            sb.append(zoneOffset);
        }
        sb.append("]");
        return sb.toString();
    }
}
