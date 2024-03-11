package o;

import android.app.Activity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.cgx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6634cgx {
    public static final a a = a.e;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.cgx$d */
    /* loaded from: classes4.dex */
    public interface d {
        InterfaceC6634cgx i();
    }

    void a(String str, String str2);

    InterfaceC6636cgz d();

    void d(String str, String str2, InterfaceC6629cgs interfaceC6629cgs);

    /* renamed from: o.cgx$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a e = new a();

        private a() {
        }

        public final InterfaceC6634cgx c(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((d) EntryPointAccessors.fromActivity(activity, d.class)).i();
        }
    }
}
