package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cOs  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5958cOs {
    public static final e b = e.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cOs$a */
    /* loaded from: classes.dex */
    public interface a {
        InterfaceC5958cOs ah();
    }

    void a();

    void b();

    /* renamed from: o.cOs$e */
    /* loaded from: classes.dex */
    public static final class e {
        static final /* synthetic */ e d = new e();

        private e() {
        }

        public final InterfaceC5958cOs d() {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((a) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), a.class)).ah();
        }
    }
}
