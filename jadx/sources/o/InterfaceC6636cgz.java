package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.cgz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6636cgz {
    public static final d b = d.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cgz$c */
    /* loaded from: classes4.dex */
    public interface c {
        InterfaceC6636cgz af();
    }

    static InterfaceC6636cgz a(Context context) {
        return b.a(context);
    }

    void b();

    boolean d();

    void e(String str, String str2);

    boolean e();

    boolean e(Context context);

    /* renamed from: o.cgz$d */
    /* loaded from: classes4.dex */
    public static final class d {
        static final /* synthetic */ d c = new d();

        private d() {
        }

        public final InterfaceC6636cgz a(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).af();
        }
    }
}
