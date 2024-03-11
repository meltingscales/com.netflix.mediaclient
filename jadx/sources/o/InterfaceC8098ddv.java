package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.ddv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8098ddv {
    public static final a a = a.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.ddv$d */
    /* loaded from: classes5.dex */
    public interface d {
        InterfaceC8098ddv aK();
    }

    static InterfaceC8098ddv c(Context context) {
        return a.e(context);
    }

    View a(Activity activity, ViewGroup viewGroup);

    InterfaceC1905aSp a(Context context, Runnable runnable);

    InterfaceC5074brr a(Context context);

    boolean a(Activity activity);

    Intent d(Context context);

    boolean d(Activity activity);

    int e(Context context);

    /* renamed from: o.ddv$a */
    /* loaded from: classes5.dex */
    public static final class a {
        static final /* synthetic */ a d = new a();

        private a() {
        }

        public final InterfaceC8098ddv e(Context context) {
            C8632dsu.c((Object) context, "");
            return ((d) EntryPointAccessors.fromApplication(context, d.class)).aK();
        }
    }
}
