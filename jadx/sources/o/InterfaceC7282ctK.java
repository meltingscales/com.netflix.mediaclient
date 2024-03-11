package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;

/* renamed from: o.ctK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7282ctK {
    public static final a d = a.d;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.ctK$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC7282ctK ak();
    }

    void a(String str);

    boolean a(String str, C7460cwd c7460cwd);

    C7460cwd b(String str);

    int c(String str);

    C7460cwd d(String str);

    boolean e(String str);

    /* renamed from: o.ctK$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a d = new a();

        private a() {
        }

        public final InterfaceC7282ctK d(Context context) {
            C8632dsu.c((Object) context, "");
            return ((b) EntryPointAccessors.fromApplication(context, b.class)).ak();
        }
    }
}
