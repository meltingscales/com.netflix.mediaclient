package o;

import java.util.Collections;
import java.util.List;

/* renamed from: o.deU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8124deU {
    public static <T> List<T> c(List<T> list, int i, int i2) {
        int size = list.size();
        if (i >= size || i2 <= 0 || i >= i2) {
            return Collections.emptyList();
        }
        return list.subList(Math.max(0, i), Math.min(size, i2));
    }

    public static String a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (int i = 0; i < list.size(); i++) {
            if (z) {
                z = false;
            } else {
                sb.append(";");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
