package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import o.InterfaceC8535dpe;

/* loaded from: classes.dex */
public final class ValueRange implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long a;
    private final long c;
    private final long d;
    private final long e;

    private ValueRange(long j, long j2, long j3, long j4) {
        this.d = j;
        this.c = j2;
        this.e = j3;
        this.a = j4;
    }

    public static ValueRange a(long j, long j2, long j3) {
        return b(j, j, j2, j3);
    }

    public static ValueRange b(long j, long j2) {
        if (j <= j2) {
            return new ValueRange(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static ValueRange b(long j, long j2, long j3, long j4) {
        if (j <= j2) {
            if (j3 <= j4) {
                if (j2 <= j4) {
                    return new ValueRange(j, j2, j3, j4);
                }
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
    }

    private String d(InterfaceC8535dpe interfaceC8535dpe, long j) {
        if (interfaceC8535dpe == null) {
            return "Invalid value (valid values " + this + "): " + j;
        }
        return "Invalid value for " + interfaceC8535dpe + " (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j = this.d;
        long j2 = this.c;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.e;
        long j4 = this.a;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public int a(long j, InterfaceC8535dpe interfaceC8535dpe) {
        if (c(j)) {
            return (int) j;
        }
        throw new DateTimeException(d(interfaceC8535dpe, j));
    }

    public long a() {
        return this.e;
    }

    public boolean b() {
        return this.d == this.c && this.e == this.a;
    }

    public long c(long j, InterfaceC8535dpe interfaceC8535dpe) {
        if (d(j)) {
            return j;
        }
        throw new DateTimeException(d(interfaceC8535dpe, j));
    }

    public boolean c() {
        return d() >= -2147483648L && e() <= 2147483647L;
    }

    public boolean c(long j) {
        return c() && d(j);
    }

    public long d() {
        return this.d;
    }

    public boolean d(long j) {
        return j >= d() && j <= e();
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueRange) {
            ValueRange valueRange = (ValueRange) obj;
            return this.d == valueRange.d && this.c == valueRange.c && this.e == valueRange.e && this.a == valueRange.a;
        }
        return false;
    }

    public int hashCode() {
        long j = this.d;
        long j2 = this.c;
        long j3 = this.e;
        long j4 = this.a;
        long j5 = j + (j2 << 16) + (j2 >> 48) + (j3 << 32) + (j3 >> 32) + (j4 << 48) + (j4 >> 16);
        return (int) (j5 ^ (j5 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        if (this.d != this.c) {
            sb.append('/');
            sb.append(this.c);
        }
        sb.append(" - ");
        sb.append(this.e);
        if (this.e != this.a) {
            sb.append('/');
            sb.append(this.a);
        }
        return sb.toString();
    }
}
