package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes3.dex */
public interface TS {
    public static final c c = c.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface e {
        TS p();
    }

    boolean d();

    /* loaded from: classes3.dex */
    public static final class c {
        static final /* synthetic */ c c = new c();

        private c() {
        }

        public final TS b(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).p();
        }
    }
}
