package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.jh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9126jh {
    List<C9053iN> a(Collection<String> collection);

    void a(String str);

    void a(C9053iN c9053iN);

    void b(String str);

    void c();

    void c(C9053iN c9053iN);

    <T> T d(boolean z, drO<? extends T> dro);

    C9053iN d(String str);

    long e();

    static /* synthetic */ Object b(InterfaceC9126jh interfaceC9126jh, boolean z, drO dro, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9126jh.d(z, dro);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transaction");
    }
}
