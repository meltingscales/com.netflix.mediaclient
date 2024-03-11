package o;

import java.util.List;

/* loaded from: classes4.dex */
public final class bDX {
    public static final e d = new e(null);

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final boolean b(List<? extends InterfaceC5227bul> list) {
            C8632dsu.c((Object) list, "");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC5227bul interfaceC5227bul = list.get(i);
                if (interfaceC5227bul != null && !interfaceC5227bul.isAvailableToPlay()) {
                    return true;
                }
            }
            return false;
        }
    }
}
