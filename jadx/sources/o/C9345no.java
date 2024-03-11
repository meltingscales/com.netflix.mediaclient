package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.no  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9345no {
    private static volatile Integer c;

    public static int e(Context context) {
        if (c == null) {
            synchronized (C9345no.class) {
                if (c == null) {
                    c = Integer.valueOf(c(context));
                }
            }
        }
        return c.intValue();
    }

    private static void c(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    private static int c(Context context) {
        C1044Mm.b("YearClass", "getClockSpeedYear(): " + a());
        C1044Mm.b("YearClass", "getNumCoresYear(): " + e());
        C1044Mm.b("YearClass", "getRamYear(): " + b(context));
        ArrayList arrayList = new ArrayList();
        c(arrayList, a());
        c(arrayList, b(context));
        if (arrayList.isEmpty()) {
            c(arrayList, e());
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() > -1) {
                i += num.intValue();
            }
        }
        if (i > 0) {
            return i / arrayList.size();
        }
        return -1;
    }

    private static int e() {
        int c2 = C9343nm.c();
        if (c2 < 1) {
            return -1;
        }
        if (c2 == 1) {
            return 2008;
        }
        if (c2 <= 3) {
            return 2011;
        }
        return c2 <= 4 ? 2014 : 2015;
    }

    private static int a() {
        long e = C9343nm.e();
        if (e == -1) {
            return -1;
        }
        if (C9343nm.c() >= 8) {
            return e <= 1520000 ? 2014 : 2015;
        } else if (e <= 528000) {
            return 2008;
        } else {
            if (e <= 620000) {
                return 2009;
            }
            if (e <= 1020000) {
                return 2010;
            }
            if (e <= 1220000) {
                return 2011;
            }
            if (e <= 1520000) {
                return 2012;
            }
            if (e <= 2020000) {
                return 2013;
            }
            return e <= 2200000 ? 2014 : 2015;
        }
    }

    private static int b(Context context) {
        long c2 = C9343nm.c(context);
        if (c2 <= 0) {
            return -1;
        }
        if (c2 <= 201326592) {
            return 2008;
        }
        if (c2 <= 304087040) {
            return 2009;
        }
        if (c2 <= 536870912) {
            return 2010;
        }
        if (c2 <= 1073741824) {
            return 2011;
        }
        if (c2 <= 1610612736) {
            return 2012;
        }
        return c2 <= 2147483648L ? 2013 : 2015;
    }
}
