package o;

import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashSet;

/* renamed from: o.fN */
/* loaded from: classes2.dex */
public interface InterfaceC8894fN extends LifecycleOwner {
    LifecycleOwner X_();

    <S extends InterfaceC8888fH> dxD c(AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx);

    void e();

    void i_();

    /* renamed from: o.fN$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static LifecycleOwner d(InterfaceC8894fN interfaceC8894fN) {
            LifecycleOwner lifecycleOwner;
            try {
                Fragment fragment = interfaceC8894fN instanceof Fragment ? (Fragment) interfaceC8894fN : null;
                if (fragment == null || (lifecycleOwner = fragment.getViewLifecycleOwner()) == null) {
                    lifecycleOwner = interfaceC8894fN;
                }
                C8632dsu.a(lifecycleOwner, "");
                return lifecycleOwner;
            } catch (IllegalStateException unused) {
                return interfaceC8894fN;
            }
        }

        public static void e(InterfaceC8894fN interfaceC8894fN) {
            HashSet hashSet;
            Handler handler;
            Handler handler2;
            hashSet = C8902fV.d;
            if (hashSet.add(Integer.valueOf(System.identityHashCode(interfaceC8894fN)))) {
                handler = C8902fV.a;
                handler2 = C8902fV.a;
                handler.sendMessage(Message.obtain(handler2, System.identityHashCode(interfaceC8894fN), interfaceC8894fN));
            }
        }

        public static /* synthetic */ dxD e(InterfaceC8894fN interfaceC8894fN, AbstractC8899fS abstractC8899fS, AbstractC8928fv abstractC8928fv, drX drx, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    abstractC8928fv = C8973gn.b;
                }
                return interfaceC8894fN.c(abstractC8899fS, abstractC8928fv, drx);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEach");
        }

        public static <S extends InterfaceC8888fH> dxD e(InterfaceC8894fN interfaceC8894fN, AbstractC8899fS<S> abstractC8899fS, AbstractC8928fv abstractC8928fv, drX<? super S, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx) {
            C8632dsu.c((Object) abstractC8899fS, "");
            C8632dsu.c((Object) abstractC8928fv, "");
            C8632dsu.c((Object) drx, "");
            return C8960ga.b(abstractC8899fS, interfaceC8894fN.X_(), abstractC8928fv, drx);
        }
    }
}
