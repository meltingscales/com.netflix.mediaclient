package o;

import android.content.Context;
import androidx.core.os.TraceCompat;
import java.io.File;

/* renamed from: o.bC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3550bC {
    public static boolean a = false;
    private static boolean b = true;
    private static InterfaceC8858ee c = null;
    private static InterfaceC8856ec d = null;
    private static int e = 0;
    private static volatile C8854ea f = null;
    private static long[] g = null;
    private static volatile C8855eb h = null;
    private static String[] i = null;
    private static boolean j = true;
    private static int l = 0;
    private static boolean m = false;

    public static boolean a() {
        return b;
    }

    public static void d(String str) {
        if (m) {
            int i2 = l;
            if (i2 == 20) {
                e++;
                return;
            }
            i[i2] = str;
            g[i2] = System.nanoTime();
            TraceCompat.beginSection(str);
            l++;
        }
    }

    public static float a(String str) {
        int i2 = e;
        if (i2 > 0) {
            e = i2 - 1;
            return 0.0f;
        } else if (m) {
            int i3 = l - 1;
            l = i3;
            if (i3 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            }
            if (!str.equals(i[i3])) {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + i[l] + ".");
            }
            TraceCompat.endSection();
            return ((float) (System.nanoTime() - g[l])) / 1000000.0f;
        } else {
            return 0.0f;
        }
    }

    public static C8854ea c(Context context) {
        C8854ea c8854ea = f;
        if (c8854ea == null) {
            synchronized (C8854ea.class) {
                c8854ea = f;
                if (c8854ea == null) {
                    C8855eb a2 = a(context);
                    InterfaceC8856ec interfaceC8856ec = d;
                    if (interfaceC8856ec == null) {
                        interfaceC8856ec = new C7889dY();
                    }
                    c8854ea = new C8854ea(a2, interfaceC8856ec);
                    f = c8854ea;
                }
            }
        }
        return c8854ea;
    }

    public static C8855eb a(Context context) {
        if (j) {
            final Context applicationContext = context.getApplicationContext();
            C8855eb c8855eb = h;
            if (c8855eb == null) {
                synchronized (C8855eb.class) {
                    c8855eb = h;
                    if (c8855eb == null) {
                        InterfaceC8858ee interfaceC8858ee = c;
                        if (interfaceC8858ee == null) {
                            interfaceC8858ee = new InterfaceC8858ee() { // from class: o.bC.2
                                @Override // o.InterfaceC8858ee
                                public File e() {
                                    return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                                }
                            };
                        }
                        c8855eb = new C8855eb(interfaceC8858ee);
                        h = c8855eb;
                    }
                }
            }
            return c8855eb;
        }
        return null;
    }
}
