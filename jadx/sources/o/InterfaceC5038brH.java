package o;

import android.content.Context;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.brH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5038brH {
    public static final c c = c.a;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.brH$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC5038brH ae();
    }

    String c();

    void d(String str);

    void e(ConnectivityUtils.NetType netType);

    /* renamed from: o.brH$c */
    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c a = new c();

        private c() {
        }

        public final InterfaceC5038brH b(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).ae();
        }
    }
}
