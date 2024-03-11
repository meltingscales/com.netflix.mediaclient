package o;

import com.netflix.android.volley.VolleyError;
import o.InterfaceC9854xo;

/* renamed from: o.xy  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9864xy<T> {
    public final InterfaceC9854xo.d a;
    public boolean b;
    public final T c;
    public final VolleyError d;

    /* renamed from: o.xy$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void b(T t);
    }

    /* renamed from: o.xy$b */
    /* loaded from: classes2.dex */
    public interface b {
        void b(VolleyError volleyError);
    }

    public boolean c() {
        return this.d == null;
    }

    public static <T> C9864xy<T> c(T t, InterfaceC9854xo.d dVar) {
        return new C9864xy<>(t, dVar);
    }

    public static <T> C9864xy<T> a(VolleyError volleyError) {
        return new C9864xy<>(volleyError);
    }

    private C9864xy(T t, InterfaceC9854xo.d dVar) {
        this.b = false;
        this.c = t;
        this.a = dVar;
        this.d = null;
    }

    private C9864xy(VolleyError volleyError) {
        this.b = false;
        this.c = null;
        this.a = null;
        this.d = volleyError;
    }
}
