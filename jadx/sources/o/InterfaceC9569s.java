package o;

import java.io.Closeable;
import o.InterfaceC9092j;

/* renamed from: o.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9569s extends Closeable {
    InterfaceC9357o<InterfaceC9092j.b> a();

    InterfaceC9357o<Long> b(Integer num, String str, int i, drM<? super InterfaceC9463q, dpR> drm);

    <R> InterfaceC9357o<R> b(Integer num, String str, drM<? super InterfaceC9145k, ? extends InterfaceC9357o<R>> drm, int i, drM<? super InterfaceC9463q, dpR> drm2);

    InterfaceC9092j.b d();

    void d(String... strArr);

    /* renamed from: o.s$e */
    /* loaded from: classes2.dex */
    public static final class e {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC9357o a(InterfaceC9569s interfaceC9569s, Integer num, String str, drM drm, int i, drM drm2, int i2, Object obj) {
            if (obj == null) {
                drM<? super InterfaceC9463q, dpR> drm3 = drm2;
                if ((i2 & 16) != 0) {
                    drm3 = null;
                }
                return interfaceC9569s.b(num, str, drm, i, drm3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC9357o a(InterfaceC9569s interfaceC9569s, Integer num, String str, int i, drM drm, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    drm = null;
                }
                return interfaceC9569s.b(num, str, i, drm);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }
}
