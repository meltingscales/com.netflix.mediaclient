package o;

import android.app.Activity;
import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cYx  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6236cYx {
    public static final a e = a.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cYx$e */
    /* loaded from: classes5.dex */
    public interface e {
        InterfaceC6236cYx aH();
    }

    static InterfaceC6236cYx c(Context context) {
        return e.e(context);
    }

    boolean c(Activity activity);

    /* renamed from: o.cYx$a */
    /* loaded from: classes5.dex */
    public static final class a {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        public final InterfaceC6236cYx e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((e) EntryPointAccessors.fromApplication(context, e.class)).aH();
        }
    }
}
