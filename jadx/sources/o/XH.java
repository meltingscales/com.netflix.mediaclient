package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes.dex */
public interface XH {
    public static final a c = a.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes3.dex */
    public interface b {
        XH R();
    }

    /* loaded from: classes3.dex */
    public interface d {
        void d();
    }

    XI a();

    void a(d dVar);

    XI b();

    XI c();

    void c(d dVar);

    XI d();

    void e();

    void e(String str);

    XI f();

    XI i();

    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a e = new a();

        private a() {
        }

        public final XH d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).R();
        }
    }
}
