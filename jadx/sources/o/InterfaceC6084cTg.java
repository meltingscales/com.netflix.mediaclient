package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cTg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6084cTg {
    public static final b b = b.a;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cTg$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC6084cTg aB();
    }

    static InterfaceC6084cTg e(Context context) {
        return b.a(context);
    }

    Class<? extends Activity> b();

    Intent d(Context context, String str);

    /* renamed from: o.cTg$b */
    /* loaded from: classes4.dex */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        public final InterfaceC6084cTg a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).aB();
        }
    }
}
