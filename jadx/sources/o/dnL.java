package o;

import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class dnL extends dnK {
    Object[] b = new Object[32];
    private String m;

    dnL() {
        d(6);
    }

    @Override // o.dnK
    public dnK d() {
        if (this.i) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + f());
        }
        int i = this.h;
        int i2 = this.a;
        if (i == i2 && this.f[i - 1] == 1) {
            this.a = ~i2;
            return this;
        }
        g();
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        Object[] objArr = this.b;
        int i3 = this.h;
        objArr[i3] = arrayList;
        this.d[i3] = 0;
        d(1);
        return this;
    }

    @Override // o.dnK
    public dnK c() {
        if (i() == 1) {
            int i = this.h;
            int i2 = ~this.a;
            if (i == i2) {
                this.a = i2;
                return this;
            }
            int i3 = i - 1;
            this.h = i3;
            this.b[i3] = null;
            int[] iArr = this.d;
            int i4 = i - 2;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // o.dnK
    public dnK e() {
        if (this.i) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + f());
        }
        int i = this.h;
        int i2 = this.a;
        if (i == i2 && this.f[i - 1] == 3) {
            this.a = ~i2;
            return this;
        }
        g();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        c(linkedHashTreeMap);
        this.b[this.h] = linkedHashTreeMap;
        d(3);
        return this;
    }

    @Override // o.dnK
    public dnK a() {
        if (i() == 3) {
            if (this.m != null) {
                throw new IllegalStateException("Dangling name: " + this.m);
            }
            int i = this.h;
            int i2 = ~this.a;
            if (i == i2) {
                this.a = i2;
                return this;
            }
            this.i = false;
            int i3 = i - 1;
            this.h = i3;
            this.b[i3] = null;
            this.j[i3] = null;
            int[] iArr = this.d;
            int i4 = i - 2;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // o.dnK
    public dnK d(String str) {
        if (str != null) {
            if (this.h == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            if (i() != 3 || this.m != null || this.i) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.m = str;
            this.j[this.h - 1] = str;
            return this;
        }
        throw new NullPointerException("name == null");
    }

    @Override // o.dnK
    public dnK b(String str) {
        if (this.i) {
            this.i = false;
            return d(str);
        }
        c(str);
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK b() {
        if (this.i) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + f());
        }
        c(null);
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK a(boolean z) {
        if (this.i) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + f());
        }
        c(Boolean.valueOf(z));
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK a(double d) {
        if (!this.c && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.i) {
            this.i = false;
            return d(Double.toString(d));
        } else {
            c(Double.valueOf(d));
            int[] iArr = this.d;
            int i = this.h - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    @Override // o.dnK
    public dnK e(long j) {
        if (this.i) {
            this.i = false;
            return d(Long.toString(j));
        }
        c(Long.valueOf(j));
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // o.dnK
    public dnK e(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return e(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return a(number.doubleValue());
        }
        if (number == null) {
            return b();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.i) {
            this.i = false;
            return d(bigDecimal.toString());
        }
        c(bigDecimal);
        int[] iArr = this.d;
        int i = this.h - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.h;
        if (i > 1 || (i == 1 && this.f[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.h = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.h == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    private dnL c(Object obj) {
        String str;
        Object put;
        int i = i();
        int i2 = this.h;
        if (i2 == 1) {
            if (i != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            int i3 = i2 - 1;
            this.f[i3] = 7;
            this.b[i3] = obj;
        } else if (i != 3 || (str = this.m) == null) {
            if (i != 1) {
                if (i == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.b[i2 - 1]).add(obj);
        } else if ((obj != null || this.g) && (put = ((Map) this.b[i2 - 1]).put(str, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.m + "' has multiple values at path " + f() + ": " + put + " and " + obj);
        } else {
            this.m = null;
        }
        return this;
    }
}
