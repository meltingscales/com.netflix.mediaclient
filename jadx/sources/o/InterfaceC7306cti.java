package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cti  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7306cti {
    public static final e c = e.b;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cti$a */
    /* loaded from: classes4.dex */
    public interface a {
        InterfaceC7306cti ai();
    }

    static InterfaceC7306cti d(Context context) {
        return c.e(context);
    }

    boolean a(Activity activity);

    Intent b(Context context);

    Intent d(Activity activity);

    /* renamed from: o.cti$e */
    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e b = new e();

        private e() {
        }

        public final InterfaceC7306cti e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((a) EntryPointAccessors.fromApplication(context, a.class)).ai();
        }
    }
}
