package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.biv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4674biv {
    public static List<C4656bid> a(List<C4656bid> list, long j, long j2) {
        int i = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
        if (i == 0 && j2 == -9223372036854775807L) {
            return list;
        }
        if (i == 0) {
            j = 0;
        }
        long j3 = (j2 == -9223372036854775807L || j2 > 2147483647L) ? Long.MAX_VALUE : j + j2;
        int b = b(list, j, -1);
        int b2 = j2 == 0 ? b : b(list, j3, b);
        if (b < 0 || b2 < 0) {
            C1044Mm.e("nf_cache", "unable to find chunk for startPtsUs = %s", Long.valueOf(j));
            return Collections.emptyList();
        }
        return list.subList(b, b2 + 1);
    }

    public static List<C4656bid> c(List<C4656bid> list, long j, long j2) {
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i == 0 && j2 == -1) {
            return list;
        }
        if (i == 0) {
            j = 0;
        }
        if (j2 == -9223372036854775807L) {
            j2 = Long.MAX_VALUE;
        }
        int c = c(list, j, -1);
        int c2 = c(list, j2, c);
        if (c < 0 || c2 < 0) {
            C1044Mm.e("nf_cache", "unable to find chunk for startByte = %s", Long.valueOf(j));
            return Collections.emptyList();
        }
        if (list.get(c).c() > j) {
            C1044Mm.d("nf_cache", "incomplete chunk -- chunk=[%s, %s] , cached=[%s,%s]", Long.valueOf(list.get(c).c()), Long.valueOf(list.get(c).e()), Long.valueOf(j), Long.valueOf(j2));
            c++;
        }
        if (list.get(c2).e() > j2) {
            C1044Mm.d("nf_cache", "incomplete chunk -- chunk=[%s, %s] , cached=[%s,%s]", Long.valueOf(list.get(c2).c()), Long.valueOf(list.get(c2).e()), Long.valueOf(j), Long.valueOf(j2));
            c2--;
        }
        if (c >= list.size() || c > c2 || c2 < 0) {
            C1044Mm.d("nf_cache", "incomplete chunk -- empty list", Long.valueOf(j));
            return Collections.emptyList();
        }
        return list.subList(c, c2 + 1);
    }

    private static int b(List<C4656bid> list, long j, int i) {
        if (i < 0) {
            i = 0;
        }
        int size = list.size() - 1;
        if (j > list.get(size).g()) {
            return size;
        }
        if (j < list.get(i).g()) {
            return i;
        }
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C4656bid c4656bid = list.get(i2);
            if (c4656bid.f() > j) {
                size = i2 - 1;
            } else if (c4656bid.g() >= j) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    private static int c(List<C4656bid> list, long j, int i) {
        if (i < 0) {
            i = 0;
        }
        int size = list.size() - 1;
        if (j > list.get(size).e()) {
            return size;
        }
        if (j < list.get(i).c()) {
            return i;
        }
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C4656bid c4656bid = list.get(i2);
            if (c4656bid.c() > j) {
                size = i2 - 1;
            } else if (c4656bid.e() >= j) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }
}
