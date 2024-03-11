package j$.time.chrono;

import com.netflix.model.leafs.originals.interactive.Prefetch;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import o.InterfaceC8526dow;
import o.InterfaceC8535dpe;
import o.doC;

/* loaded from: classes6.dex */
public final class JapaneseEra implements doC, Serializable {
    public static final JapaneseEra a;
    public static final JapaneseEra b;
    public static final JapaneseEra c;
    public static final JapaneseEra d;
    public static final JapaneseEra e;
    private static final JapaneseEra[] f;
    private static final int g;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient String h;
    private final transient int i;
    private final transient String j;

    /* renamed from: o  reason: collision with root package name */
    private final transient LocalDate f13341o;

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.a(1868, 1, 1), "Meiji", "M");
        a = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.a(1912, 7, 30), "Taisho", "T");
        b = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.a(1926, 12, 25), "Showa", "S");
        c = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.a(1989, 1, 8), "Heisei", "H");
        e = japaneseEra4;
        JapaneseEra japaneseEra5 = new JapaneseEra(3, LocalDate.a(2019, 5, 1), "Reiwa", "R");
        d = japaneseEra5;
        int b2 = japaneseEra5.b() + 2;
        g = b2;
        JapaneseEra[] japaneseEraArr = new JapaneseEra[b2];
        f = japaneseEraArr;
        japaneseEraArr[0] = japaneseEra;
        japaneseEraArr[1] = japaneseEra2;
        japaneseEraArr[2] = japaneseEra3;
        japaneseEraArr[3] = japaneseEra4;
        japaneseEraArr[4] = japaneseEra5;
    }

    private JapaneseEra(int i, LocalDate localDate, String str, String str2) {
        this.i = i;
        this.f13341o = localDate;
        this.h = str;
        this.j = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra a(DataInput dataInput) {
        return d(dataInput.readByte());
    }

    public static JapaneseEra[] a() {
        JapaneseEra[] japaneseEraArr = f;
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c() {
        int j = Prefetch.NANOSECONDS_PER_SECOND - d().f13341o.j();
        int j2 = f[0].f13341o.j();
        int i = 1;
        while (true) {
            JapaneseEra[] japaneseEraArr = f;
            if (i >= japaneseEraArr.length) {
                return j;
            }
            JapaneseEra japaneseEra = japaneseEraArr[i];
            j = Math.min(j, (japaneseEra.f13341o.j() - j2) + 1);
            j2 = japaneseEra.f13341o.j();
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra c(LocalDate localDate) {
        if (localDate.a((InterfaceC8526dow) JapaneseDate.c)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f.length - 1; length >= 0; length--) {
            JapaneseEra japaneseEra = f[length];
            if (localDate.compareTo((InterfaceC8526dow) japaneseEra.f13341o) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JapaneseEra d() {
        JapaneseEra[] japaneseEraArr = f;
        return japaneseEraArr[japaneseEraArr.length - 1];
    }

    public static JapaneseEra d(int i) {
        int e2 = e(i);
        if (e2 >= 0) {
            JapaneseEra[] japaneseEraArr = f;
            if (e2 < japaneseEraArr.length) {
                return japaneseEraArr[e2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    private static int e(int i) {
        return i + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e() {
        JapaneseEra[] japaneseEraArr;
        long a2 = ChronoField.f.a().a();
        for (JapaneseEra japaneseEra : f) {
            a2 = Math.min(a2, (japaneseEra.f13341o.k() - japaneseEra.f13341o.e()) + 1);
            if (japaneseEra.i() != null) {
                a2 = Math.min(a2, japaneseEra.i().f13341o.e() - 1);
            }
        }
        return a2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    @Override // o.doC
    public int b() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        dataOutput.writeByte(b());
    }

    @Override // o.doC, o.doY
    public ValueRange d(InterfaceC8535dpe interfaceC8535dpe) {
        ChronoField chronoField = ChronoField.m;
        return interfaceC8535dpe == chronoField ? JapaneseChronology.b.a(chronoField) : super.d(interfaceC8535dpe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocalDate f() {
        return this.f13341o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JapaneseEra i() {
        if (this == d()) {
            return null;
        }
        return d(this.i + 1);
    }

    String j() {
        return this.h;
    }

    public String toString() {
        return j();
    }
}
