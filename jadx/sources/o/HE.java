package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class HE {
    private static final StringBuilder b(StringBuilder sb, int i) {
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                sb.append(' ');
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return sb;
    }

    private static final StringBuilder e(StringBuilder sb, int i, Map<?, ?> map) {
        int i2 = i + 2;
        sb.append("{\n");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            b(sb, i2);
            sb.append(key);
            sb.append(": ");
            if (value instanceof Map) {
                e(sb, i2, (Map) value);
            } else {
                sb.append(value);
            }
            sb.append('\n');
        }
        b(sb, i);
        sb.append("}");
        return sb;
    }

    public static final String b(Map<?, ?> map) {
        C8632dsu.c((Object) map, "");
        StringBuilder sb = new StringBuilder();
        e(sb, 0, map);
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
