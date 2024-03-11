package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.aMc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1730aMc {
    public static final b c = b.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aMc$d */
    /* loaded from: classes3.dex */
    public interface d {
        InterfaceC1730aMc aE();
    }

    boolean a(int i);

    /* renamed from: o.aMc$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b d = new b();

        private b() {
        }

        public final boolean e(int i) {
            C1332Xp c1332Xp = C1332Xp.b;
            return ((d) EntryPointAccessors.fromApplication((Context) C1332Xp.b(Context.class), d.class)).aE().a(i);
        }
    }
}
