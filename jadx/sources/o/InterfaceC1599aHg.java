package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.aHg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1599aHg {
    public static final b d = b.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.aHg$e */
    /* loaded from: classes3.dex */
    public interface e {
        InterfaceC1599aHg an();
    }

    static void d(Context context, OutOfMemoryError outOfMemoryError) {
        d.a(context, outOfMemoryError);
    }

    void e(OutOfMemoryError outOfMemoryError);

    /* renamed from: o.aHg$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b c = new b();

        private b() {
        }

        public final void a(Context context, OutOfMemoryError outOfMemoryError) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) outOfMemoryError, "");
            ((e) EntryPointAccessors.fromApplication(context, e.class)).an().e(outOfMemoryError);
        }
    }
}
