package o;

import j$.time.ZoneId;
import j$.time.chrono.IsoChronology;
import j$.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final class doG {
    private ArrayList a;
    private doE b;
    private final ArrayList c;
    private boolean d = true;
    private boolean e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public doG(doE doe) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = null;
        this.b = doe;
        arrayList.add(new doN());
    }

    public static boolean d(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private doN f() {
        ArrayList arrayList = this.c;
        return (doN) arrayList.get(arrayList.size() - 1);
    }

    public InterfaceC8528doy a() {
        InterfaceC8528doy interfaceC8528doy = f().a;
        if (interfaceC8528doy == null) {
            InterfaceC8528doy b = this.b.b();
            return b == null ? IsoChronology.d : b;
        }
        return interfaceC8528doy;
    }

    public void a(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        f().d = zoneId;
    }

    public void a(Consumer consumer) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(consumer);
    }

    public Long b(InterfaceC8535dpe interfaceC8535dpe) {
        return (Long) f().b.get(interfaceC8535dpe);
    }

    public doG b() {
        doG dog = new doG(this.b);
        dog.d = this.d;
        dog.e = this.e;
        return dog;
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean b(char c, char c2) {
        return d() ? c == c2 : d(c, c2);
    }

    public doO c() {
        return this.b.c();
    }

    public void c(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.d;
    }

    public boolean d(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (d()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public int e(InterfaceC8535dpe interfaceC8535dpe, long j, int i, int i2) {
        Objects.requireNonNull(interfaceC8535dpe, "field");
        Long l = (Long) f().b.put(interfaceC8535dpe, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    public Locale e() {
        return this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public doY e(ResolverStyle resolverStyle, Set set) {
        doN f = f();
        f.a = a();
        ZoneId zoneId = f.d;
        if (zoneId == null) {
            zoneId = this.b.d();
        }
        f.d = zoneId;
        return f.a(resolverStyle, set);
    }

    public void e(boolean z) {
        ArrayList arrayList;
        int size;
        if (z) {
            arrayList = this.c;
            size = arrayList.size() - 2;
        } else {
            arrayList = this.c;
            size = arrayList.size() - 1;
        }
        arrayList.remove(size);
    }

    public void g() {
        f().c = true;
    }

    public void h() {
        this.c.add(f().c());
    }

    public boolean i() {
        return this.e;
    }

    public String toString() {
        return f().toString();
    }
}
