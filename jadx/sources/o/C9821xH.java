package o;

import java.util.Map;
import o.InterfaceC9854xo;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

/* renamed from: o.xH  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9821xH {
    public static InterfaceC9854xo.d d(C9858xs c9858xs) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = c9858xs.d;
        String str = map.get("Date");
        long j2 = 0;
        long e = str != null ? e(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",");
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    j = 0;
                }
                i++;
            }
            i = 1;
        } else {
            j = 0;
        }
        String str3 = map.get("Expires");
        long e2 = str3 != null ? e(str3) : 0L;
        String str4 = map.get("ETag");
        if (i != 0) {
            j2 = currentTimeMillis + (j * 1000);
        } else if (e > 0 && e2 >= e) {
            j2 = currentTimeMillis + (e2 - e);
        }
        InterfaceC9854xo.d dVar = new InterfaceC9854xo.d();
        dVar.c = c9858xs.c;
        dVar.a = str4;
        dVar.b = j2;
        dVar.g = j2;
        dVar.e = e;
        dVar.d = map;
        return dVar;
    }

    public static long e(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException unused) {
            return 0L;
        }
    }

    public static String c(Map<String, String> map) {
        String str = map.get("Content-Type");
        if (str != null) {
            String[] split = str.split(";");
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
            if (split.length >= 1 && "application/json".equalsIgnoreCase(split[0])) {
                return "UTF-8";
            }
        }
        return "ISO-8859-1";
    }
}
