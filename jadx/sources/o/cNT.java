package o;

import android.content.Context;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* loaded from: classes.dex */
public interface cNT {
    public static final c a = c.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes4.dex */
    public interface b {
        cNT ax();
    }

    static cNT a(Context context) {
        return a.d(context);
    }

    Intent b(NetflixActivityBase netflixActivityBase, AppView appView);

    Intent c(NetflixActivityBase netflixActivityBase, AppView appView);

    Intent c(NetflixActivityBase netflixActivityBase, AppView appView, AppView appView2);

    Intent c(NetflixActivityBase netflixActivityBase, AppView appView, boolean z);

    void c(Context context, InterfaceC5282bvn interfaceC5282bvn);

    boolean c(Intent intent, NetflixActivityBase netflixActivityBase, AppView appView);

    Intent d(NetflixActivityBase netflixActivityBase, AppView appView);

    void d(Intent intent);

    Intent e(NetflixActivityBase netflixActivityBase, AppView appView, boolean z, String str);

    void e(Context context, InterfaceC5282bvn interfaceC5282bvn);

    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c c = new c();

        private c() {
        }

        public final cNT d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).ax();
        }
    }
}
