package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.Xz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1342Xz {
    public static final b c = b.b;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.Xz$d */
    /* loaded from: classes3.dex */
    public interface d {
        InterfaceC1342Xz H();
    }

    static InterfaceC1342Xz b(Context context) {
        return c.a(context);
    }

    boolean b();

    boolean b(String str);

    boolean d();

    /* renamed from: o.Xz$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b b = new b();

        private b() {
        }

        public final InterfaceC1342Xz a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((d) EntryPointAccessors.fromApplication(context, d.class)).H();
        }
    }
}
