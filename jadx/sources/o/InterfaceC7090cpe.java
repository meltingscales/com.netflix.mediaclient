package o;

import android.app.Activity;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.cpe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7090cpe {
    public static final c b = c.e;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.cpe$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC7090cpe p();
    }

    void b();

    void d();

    void d(String str);

    /* renamed from: o.cpe$c */
    /* loaded from: classes4.dex */
    public static final class c {
        static final /* synthetic */ c e = new c();

        private c() {
        }

        public final InterfaceC7090cpe e(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((e) EntryPointAccessors.fromActivity(activity, e.class)).p();
        }
    }
}
