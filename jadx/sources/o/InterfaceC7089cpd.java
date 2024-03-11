package o;

import android.content.Context;
import com.netflix.cl.model.AppView;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cpd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7089cpd {
    public static final c c = c.e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cpd$a */
    /* loaded from: classes4.dex */
    public interface a {
        InterfaceC7089cpd al();
    }

    static InterfaceC7089cpd a(Context context) {
        return c.e(context);
    }

    void a();

    void a(AppView appView);

    boolean b();

    void c(AppView appView);

    boolean c();

    void e();

    /* renamed from: o.cpd$c */
    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c e = new c();

        private c() {
        }

        public final InterfaceC7089cpd e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).al();
        }
    }
}
