package o;

import android.app.Activity;
import android.content.Intent;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.cYw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6235cYw {
    public static final a c = a.a;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.cYw$b */
    /* loaded from: classes5.dex */
    public interface b {
        InterfaceC6235cYw B();
    }

    static InterfaceC6235cYw a(Activity activity) {
        return c.d(activity);
    }

    Intent a();

    Intent c();

    Intent d();

    /* renamed from: o.cYw$a */
    /* loaded from: classes5.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final InterfaceC6235cYw d(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((b) EntryPointAccessors.fromActivity(activity, b.class)).B();
        }
    }
}
