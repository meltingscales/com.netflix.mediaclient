package o;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class dHL {
    private static final Map<String, String> b;
    public static final dHL c = new dHL();
    private static final CopyOnWriteArraySet<Logger> d = new CopyOnWriteArraySet<>();

    static {
        Map<String, String> l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = C7823dGr.class.getPackage();
        C8632dsu.b(r1, "");
        String name = r1.getName();
        C8632dsu.b(name, "");
        linkedHashMap.put(name, "OkHttp");
        String name2 = C7823dGr.class.getName();
        C8632dsu.b(name2, "");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7846dHn.class.getName();
        C8632dsu.b(name3, "");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = dGL.class.getName();
        C8632dsu.b(name4, "");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        l = dqE.l(linkedHashMap);
        b = l;
    }

    private dHL() {
    }

    public final void c(String str, int i, String str2, Throwable th) {
        int b2;
        int min;
        C8632dsu.d((Object) str, "");
        C8632dsu.d((Object) str2, "");
        String d2 = d(str);
        if (Log.isLoggable(d2, i)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                b2 = duD.b((CharSequence) str2, '\n', i2, false, 4, (Object) null);
                if (b2 == -1) {
                    b2 = length;
                }
                while (true) {
                    min = Math.min(b2, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    C8632dsu.b(substring, "");
                    Log.println(i, d2, substring);
                    if (min >= b2) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    private final String d(String str) {
        String str2 = b.get(str);
        return str2 != null ? str2 : str;
    }

    public final void d() {
        for (Map.Entry<String, String> entry : b.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
    }

    private final void e(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (d.add(logger)) {
            C8632dsu.b(logger, "");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(dHI.e);
        }
    }
}
