package j$.time;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.InterfaceC8533dpc;
import o.doX;

/* loaded from: classes.dex */
public final class Duration implements InterfaceC8533dpc, Comparable<Duration>, Serializable {
    private static final long serialVersionUID = 3078945930695997490L;
    private final int a;
    private final long e;
    public static final Duration d = new Duration(0, 0);
    private static final BigInteger b = BigInteger.valueOf(1000000000);

    private Duration(long j, int i) {
        this.e = j;
        this.a = i;
    }

    public static Duration a(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return e(j2, i * Prefetch.NANOSECONDS_PER_MILLISECOND);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Duration a(DataInput dataInput) {
        return b(dataInput.readLong(), dataInput.readInt());
    }

    public static Duration a(doX dox, doX dox2) {
        try {
            return e(dox.a(dox2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long a = dox.a(dox2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.w;
                long a2 = dox2.a(chronoField) - dox.a(chronoField);
                int i = (a > 0L ? 1 : (a == 0L ? 0 : -1));
                if (i > 0 && a2 < 0) {
                    a++;
                } else if (i < 0 && a2 > 0) {
                    a--;
                }
                j = a2;
            } catch (DateTimeException unused2) {
            }
            return b(a, j);
        }
    }

    public static Duration b(long j) {
        return e(j, 0);
    }

    public static Duration b(long j, long j2) {
        return e(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    private static Duration c(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(b);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return b(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    public static Duration e(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return e(j2, i);
    }

    private static Duration e(long j, int i) {
        return (((long) i) | j) == 0 ? d : new Duration(j, i);
    }

    private BigDecimal f() {
        return BigDecimal.valueOf(this.e).add(BigDecimal.valueOf(this.a, 9));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    public boolean a() {
        return this.e < 0;
    }

    public long b() {
        return this.e;
    }

    @Override // o.InterfaceC8533dpc
    public doX b(doX dox) {
        long j = this.e;
        if (j != 0) {
            dox = dox.b(j, ChronoUnit.SECONDS);
        }
        int i = this.a;
        return i != 0 ? dox.b(i, ChronoUnit.NANOS) : dox;
    }

    public int c() {
        return this.a;
    }

    public Duration d() {
        return a() ? e() : this;
    }

    public Duration d(long j) {
        return j == 0 ? d : j == 1 ? this : c(f().multiply(BigDecimal.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(DataOutput dataOutput) {
        dataOutput.writeLong(this.e);
        dataOutput.writeInt(this.a);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.e, duration.e);
        return compare != 0 ? compare : this.a - duration.a;
    }

    public Duration e() {
        return d(-1L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.e == duration.e && this.a == duration.a;
        }
        return false;
    }

    public long g() {
        long j = this.e;
        long j2 = this.a;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j, 1000000000L), j2);
    }

    public int hashCode() {
        long j = this.e;
        return ((int) (j ^ (j >>> 32))) + (this.a * 51);
    }

    public long i() {
        long multiplyExact;
        long j = this.e;
        long j2 = this.a;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        multiplyExact = Math.multiplyExact(j, 1000L);
        return Math.addExact(multiplyExact, j2 / 1000000);
    }

    public String toString() {
        if (this == d) {
            return "PT0S";
        }
        long j = this.e;
        if (j < 0 && this.a > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.a == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.e >= 0 || this.a <= 0 || i2 != 0) {
            sb.append(i2);
        } else {
            sb.append("-0");
        }
        if (this.a > 0) {
            int length = sb.length();
            if (this.e < 0) {
                sb.append(2000000000 - this.a);
            } else {
                sb.append(this.a + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
