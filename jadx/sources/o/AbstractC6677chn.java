package o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.chn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6677chn implements bJF<dpR> {
    public static final int d = 0;
    public static final d j = new d(null);
    private static final Map<String, a> e = new LinkedHashMap();

    /* renamed from: o.chn$a */
    /* loaded from: classes4.dex */
    public interface a {
        AbstractC6677chn d(Fragment fragment);
    }

    public boolean b(Context context) {
        C8632dsu.c((Object) context, "");
        return true;
    }

    public abstract String c();

    public boolean e() {
        return true;
    }

    public void f() {
    }

    public boolean h() {
        return false;
    }

    public boolean o() {
        return false;
    }

    /* renamed from: o.chn$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }

        public final void d(String str, a aVar) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) aVar, "");
            a aVar2 = (a) AbstractC6677chn.e.get(str);
            if (aVar2 == null || C8632dsu.c(aVar2.getClass(), aVar.getClass())) {
                if (aVar2 == null) {
                    AbstractC6677chn.e.put(str, aVar);
                    return;
                }
                return;
            }
            Class<?> cls = aVar.getClass();
            Class<?> cls2 = aVar2.getClass();
            throw new IllegalStateException("Unable to register " + cls + ", " + cls2 + " is already registered with same key: " + str + ".");
        }

        public final a d(String str) {
            C8632dsu.c((Object) str, "");
            Object obj = AbstractC6677chn.e.get(str);
            if (obj != null) {
                return (a) obj;
            }
            throw new IllegalArgumentException("Screen's factory not registered".toString());
        }
    }

    public String g() {
        return c();
    }
}
