package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes3.dex */
public interface TU {
    public static final c e = c.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface b {
        TU l();
    }

    static TU d(Context context) {
        return e.d(context);
    }

    boolean b();

    int e();

    /* loaded from: classes3.dex */
    public static final class c {
        static final /* synthetic */ c c = new c();

        private c() {
        }

        public final TU d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).l();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        public static boolean e(TU tu) {
            return tu.e() >= 31;
        }
    }
}
