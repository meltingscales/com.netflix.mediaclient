package o;

import com.google.gson.JsonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HP {
    private static final HH b;
    private static final HI e;
    private static final HN c = new HN(true);
    private static final HN a = new HN(false);

    public static final HN b() {
        return a;
    }

    public static final HN d() {
        return c;
    }

    static {
        Map d;
        d = dqE.d();
        e = new HI(d);
        JsonNull jsonNull = JsonNull.INSTANCE;
        C8632dsu.a(jsonNull, "");
        b = new HH(jsonNull, null, null, null, null, false, 62, null);
    }

    public static final HL d(Map<String, ? extends HZ> map) {
        C8632dsu.c((Object) map, "");
        return new HI(map);
    }

    public static final HL e(Map<String, HZ> map) {
        C8632dsu.c((Object) map, "");
        return new C0930Ib(map);
    }

    public static final HJ d(List<? extends HZ> list) {
        C8632dsu.c((Object) list, "");
        return new HK(list);
    }

    public static final HJ e(List<HZ> list) {
        C8632dsu.c((Object) list, "");
        return new C0933Ie(list);
    }

    public static final HT c(int i) {
        return new HR(i);
    }

    public static final HT b(long j) {
        return new HS(j);
    }

    public static final HT c(double d) {
        return new HU(d);
    }

    public static final HT a(Number number) {
        C8632dsu.c((Object) number, "");
        if (number instanceof Integer) {
            return new HR(number.intValue());
        }
        if (number instanceof Long) {
            return new HS(number.longValue());
        }
        if (!(number instanceof Float) && !(number instanceof Double)) {
            if (!(number instanceof Short) && !(number instanceof Byte)) {
                return new HU(number.doubleValue());
            }
            return new HR(number.intValue());
        }
        return new HU(number.doubleValue());
    }
}
