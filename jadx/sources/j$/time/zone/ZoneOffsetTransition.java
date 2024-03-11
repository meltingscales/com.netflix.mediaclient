package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import o.AbstractC8520doq;

/* loaded from: classes5.dex */
public final class ZoneOffsetTransition implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final long b;
    private final ZoneOffset c;
    private final LocalDateTime d;
    private final ZoneOffset e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneOffsetTransition(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.b = j;
        this.d = LocalDateTime.d(j, 0, zoneOffset);
        this.c = zoneOffset;
        this.e = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.b = localDateTime.b(zoneOffset);
        this.d = localDateTime;
        this.c = zoneOffset;
        this.e = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffsetTransition e(DataInput dataInput) {
        long b = Ser.b(dataInput);
        ZoneOffset d = Ser.d(dataInput);
        ZoneOffset d2 = Ser.d(dataInput);
        if (d.equals(d2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new ZoneOffsetTransition(b, d, d2);
    }

    private int i() {
        return e().a() - b().a();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    public LocalDateTime a() {
        return this.d.c(i());
    }

    public ZoneOffset b() {
        return this.c;
    }

    public Duration c() {
        return Duration.b(i());
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        return Long.compare(this.b, zoneOffsetTransition.b);
    }

    public LocalDateTime d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        Ser.e(this.b, dataOutput);
        Ser.a(this.c, dataOutput);
        Ser.a(this.e, dataOutput);
    }

    public ZoneOffset e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZoneOffsetTransition) {
            ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
            return this.b == zoneOffsetTransition.b && this.c.equals(zoneOffsetTransition.c) && this.e.equals(zoneOffsetTransition.e);
        }
        return false;
    }

    public long f() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List h() {
        List a;
        if (j()) {
            return Collections.emptyList();
        }
        a = AbstractC8520doq.a(new Object[]{b(), e()});
        return a;
    }

    public int hashCode() {
        return (this.d.hashCode() ^ this.c.hashCode()) ^ Integer.rotateLeft(this.e.hashCode(), 16);
    }

    public boolean j() {
        return e().a() > b().a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(j() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.d);
        sb.append(this.c);
        sb.append(" to ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }
}
