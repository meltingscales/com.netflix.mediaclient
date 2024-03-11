package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import o.InterfaceC1107Oy.c;

/* renamed from: o.Oy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1107Oy<T extends c> {
    public static final a a = a.d;

    /* renamed from: o.Oy$c */
    /* loaded from: classes3.dex */
    public interface c {
        Drawable b(Context context);

        Integer e();
    }

    T a();

    boolean a(int i);

    InterfaceC1107Oy<T> b();

    T c();

    boolean d();

    T e();

    InterfaceC1107Oy<T> f();

    boolean h();

    /* renamed from: o.Oy$d */
    /* loaded from: classes3.dex */
    public static final class d {
        public static <T extends c> InterfaceC1107Oy<T> e(InterfaceC1107Oy<T> interfaceC1107Oy) {
            return a.e(InterfaceC1107Oy.a, interfaceC1107Oy.e(), interfaceC1107Oy.a(), false, null, false, 28, null);
        }

        public static <T extends c> T d(InterfaceC1107Oy<T> interfaceC1107Oy) {
            T e = interfaceC1107Oy.e();
            InterfaceC1107Oy<T> f = interfaceC1107Oy.f();
            while (true) {
                if ((f != null ? f.f() : null) == null) {
                    break;
                }
                f = f.f();
            }
            return f != null ? f.e() : e;
        }
    }

    /* renamed from: o.Oy$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a d = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC1107Oy e(a aVar, c cVar, c cVar2, boolean z, InterfaceC1107Oy interfaceC1107Oy, boolean z2, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z3 = z;
            InterfaceC1107Oy<T> interfaceC1107Oy2 = interfaceC1107Oy;
            if ((i & 8) != 0) {
                interfaceC1107Oy2 = null;
            }
            InterfaceC1107Oy<T> interfaceC1107Oy3 = interfaceC1107Oy2;
            if ((i & 16) != 0) {
                z2 = true;
            }
            return aVar.d(cVar, cVar2, z3, interfaceC1107Oy3, z2);
        }

        public final <T extends c> InterfaceC1107Oy<T> d(T t, T t2, boolean z, InterfaceC1107Oy<T> interfaceC1107Oy, boolean z2) {
            C8632dsu.c((Object) t, "");
            C8632dsu.c((Object) t2, "");
            return new OA(t, t2, z, interfaceC1107Oy, z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC1107Oy d(a aVar, c cVar, InterfaceC1107Oy interfaceC1107Oy, int i, Object obj) {
            if ((i & 2) != 0) {
                interfaceC1107Oy = null;
            }
            return aVar.b(cVar, interfaceC1107Oy);
        }

        public final <T extends c> InterfaceC1107Oy<T> b(T t, InterfaceC1107Oy<T> interfaceC1107Oy) {
            C8632dsu.c((Object) t, "");
            return new C1108Oz(t, interfaceC1107Oy);
        }
    }
}
