package o;

import android.content.Context;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import j$.time.Instant;

/* renamed from: o.Vf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1270Vf {
    public static final a b = a.c;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.Vf$c */
    /* loaded from: classes3.dex */
    public interface c {
        InterfaceC1270Vf v();
    }

    long b();

    long c();

    long d();

    Instant e();

    /* renamed from: o.Vf$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a c = new a();

        private a() {
        }

        public final InterfaceC1270Vf b(Context context) {
            C8632dsu.c((Object) context, "");
            return ((c) EntryPointAccessors.fromApplication(context, c.class)).v();
        }
    }
}
