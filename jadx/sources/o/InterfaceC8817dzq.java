package o;

import kotlinx.coroutines.flow.SharingCommand;

/* renamed from: o.dzq */
/* loaded from: classes5.dex */
public interface InterfaceC8817dzq {
    public static final a d = a.a;

    dyS<SharingCommand> e(InterfaceC8822dzv<Integer> interfaceC8822dzv);

    /* renamed from: o.dzq$a */
    /* loaded from: classes5.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final InterfaceC8817dzq d = new C8825dzy();
        private static final InterfaceC8817dzq e = new C8823dzw();

        public final InterfaceC8817dzq c() {
            return e;
        }

        public final InterfaceC8817dzq d() {
            return d;
        }

        private a() {
        }

        public static /* synthetic */ InterfaceC8817dzq e(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.e(j, j2);
        }

        public final InterfaceC8817dzq e(long j, long j2) {
            return new C8824dzx(j, j2);
        }
    }
}
