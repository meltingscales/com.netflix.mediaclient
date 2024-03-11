package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import j$.time.zone.ZoneRules;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.AbstractC8538dph;
import o.InterfaceC8535dpe;
import o.InterfaceC8537dpg;
import o.doW;
import o.doX;
import o.doY;

/* loaded from: classes.dex */
public final class ZoneOffset extends ZoneId implements doY, doW, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient String h;
    private final int i;
    private static final ConcurrentMap j = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset e = e(0);
    public static final ZoneOffset b = e(-64800);
    public static final ZoneOffset a = e(64800);

    private ZoneOffset(int i) {
        this.i = i;
        this.h = d(i);
    }

    private static int a(int i, int i2, int i3) {
        return (i * 3600) + (i2 * 60) + i3;
    }

    public static ZoneOffset c(int i, int i2, int i3) {
        e(i, i2, i3);
        return e(a(i, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? e(dataInput.readInt()) : e(readByte * 900);
    }

    private static String d(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = abs / 3600;
        int i3 = (abs / 60) % 60;
        sb.append(i < 0 ? "-" : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        sb.append(i3 < 10 ? ":0" : ":");
        sb.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            sb.append(i4 >= 10 ? ":" : ":0");
            sb.append(i4);
        }
        return sb.toString();
    }

    private static int e(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
            throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
        }
        return ((charAt - '0') * 10) + (charAt2 - '0');
    }

    public static ZoneOffset e(int i) {
        if (i < -64800 || i > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap concurrentMap = j;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentMap.get(valueOf);
                d.putIfAbsent(zoneOffset2.d(), zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset e(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.d
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L8a
            r4 = 5
            if (r0 == r4) goto L64
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L5b
            r5 = 7
            if (r0 == r5) goto L4e
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = e(r7, r2, r3)
            int r1 = e(r7, r6, r2)
            int r2 = e(r7, r5, r2)
            goto L90
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            r0.append(r1)
            r0.append(r7)
            j$.time.DateTimeException r7 = new j$.time.DateTimeException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L4e:
            int r0 = e(r7, r2, r3)
            int r1 = e(r7, r1, r3)
            int r2 = e(r7, r4, r3)
            goto L90
        L5b:
            int r0 = e(r7, r2, r3)
            int r1 = e(r7, r6, r2)
            goto L6c
        L64:
            int r0 = e(r7, r2, r3)
            int r1 = e(r7, r1, r3)
        L6c:
            r2 = r3
            goto L90
        L6e:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L8a:
            int r0 = e(r7, r2, r3)
            r1 = r3
            r2 = r1
        L90:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto Lb4
            if (r3 != r5) goto L9d
            goto Lb4
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r0.append(r1)
            r0.append(r7)
            j$.time.DateTimeException r7 = new j$.time.DateTimeException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        Lb4:
            if (r3 != r5) goto Lbe
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = c(r7, r0, r1)
            return r7
        Lbe:
            j$.time.ZoneOffset r7 = c(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.e(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset e(doY doy) {
        Objects.requireNonNull(doy, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) doy.b(AbstractC8538dph.b());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        String name = doy.getClass().getName();
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + doy + " of type " + name);
    }

    private static void e(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        } else if (i3 >= -59 && i3 <= 59) {
            if (Math.abs(i) == 18 && (i2 | i3) != 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        } else {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    public int a() {
        return this.i;
    }

    @Override // o.doY
    public long a(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.u) {
            return this.i;
        }
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return interfaceC8535dpe.d(this);
    }

    @Override // o.doY
    public int b(InterfaceC8535dpe interfaceC8535dpe) {
        if (interfaceC8535dpe == ChronoField.u) {
            return this.i;
        }
        if (interfaceC8535dpe instanceof ChronoField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + interfaceC8535dpe);
        }
        return d(interfaceC8535dpe).a(a(interfaceC8535dpe), interfaceC8535dpe);
    }

    @Override // o.doY
    public Object b(InterfaceC8537dpg interfaceC8537dpg) {
        return (interfaceC8537dpg == AbstractC8538dph.b() || interfaceC8537dpg == AbstractC8538dph.g()) ? this : super.b(interfaceC8537dpg);
    }

    @Override // j$.time.ZoneId
    public ZoneRules c() {
        return ZoneRules.d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        int i = this.i;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    @Override // o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        return super.d(interfaceC8535dpe);
    }

    @Override // j$.time.ZoneId
    public String d() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public void d(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        c(dataOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.i - this.i;
    }

    @Override // o.doW
    public doX e(doX dox) {
        return dox.d(ChronoField.u, this.i);
    }

    @Override // o.doY
    public boolean e(InterfaceC8535dpe interfaceC8535dpe) {
        return interfaceC8535dpe instanceof ChronoField ? interfaceC8535dpe == ChronoField.u : interfaceC8535dpe != null && interfaceC8535dpe.a(this);
    }

    @Override // j$.time.ZoneId
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.i == ((ZoneOffset) obj).i;
    }

    @Override // j$.time.ZoneId
    public int hashCode() {
        return this.i;
    }

    @Override // j$.time.ZoneId
    public String toString() {
        return this.h;
    }
}
