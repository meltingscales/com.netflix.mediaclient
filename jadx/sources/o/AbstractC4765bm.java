package o;

import android.view.View;
import java.util.List;
import o.AbstractC3073as;
import o.InterfaceC5136bt;
import o.InterfaceC5295bw;

/* renamed from: o.bm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4765bm<T extends AbstractC3073as<?>, U extends InterfaceC5295bw, P extends InterfaceC5136bt> {
    public static final b a = new b(null);
    private final Class<T> b;
    private final List<Integer> d;

    public Object a(T t) {
        C8632dsu.c((Object) t, "");
        return null;
    }

    public final List<Integer> a() {
        return this.d;
    }

    public abstract void a(T t, P p, C5454bz<? extends U> c5454bz);

    public abstract U c(View view);

    public final Class<T> e() {
        return this.b;
    }

    /* renamed from: o.bm$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }
}
