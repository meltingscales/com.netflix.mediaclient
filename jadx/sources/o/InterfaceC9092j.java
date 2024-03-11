package o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9092j extends InterfaceC8880f {
    <R> R a(boolean z, drM<? super InterfaceC9251m<R>, ? extends R> drm);

    /* renamed from: o.j$d */
    /* loaded from: classes2.dex */
    public static final class d {
        public static /* synthetic */ Object e(InterfaceC9092j interfaceC9092j, boolean z, drM drm, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return interfaceC9092j.a(z, drm);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transactionWithResult");
        }
    }

    /* renamed from: o.j$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private boolean f;
        private InterfaceC8880f j;
        private final long e = B.b();
        private final List<drO<dpR>> d = new ArrayList();
        private final List<drO<dpR>> c = new ArrayList();
        private final Set<Integer> h = new LinkedHashSet();
        private final Set<String> b = new LinkedHashSet();
        private boolean a = true;

        protected abstract b a();

        public final void a(InterfaceC8880f interfaceC8880f) {
            this.j = interfaceC8880f;
        }

        public final void b(boolean z) {
            this.a = z;
        }

        public final void d(boolean z) {
            this.f = z;
        }

        protected abstract InterfaceC9357o<dpR> e(boolean z);

        public final boolean e() {
            return this.a;
        }

        public final List<drO<dpR>> f() {
            return this.d;
        }

        public final Set<String> g() {
            return this.b;
        }

        public final Set<Integer> h() {
            return this.h;
        }

        public final boolean i() {
            return this.f;
        }

        public final List<drO<dpR>> j() {
            return this.c;
        }

        public final b d() {
            return a();
        }

        public final InterfaceC9357o<dpR> c() {
            b();
            return e(this.f && this.a);
        }

        public final void b() {
            if (this.e != B.b()) {
                throw new IllegalStateException("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.".toString());
            }
        }
    }
}
