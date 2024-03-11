package o;

import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: o.dHq  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC7849dHq {
    public static final b e = new b(null);
    public static final InterfaceC7849dHq b = new b.a();

    boolean a(int i, List<C7845dHm> list);

    boolean b(int i, InterfaceC7871dIn interfaceC7871dIn, int i2, boolean z);

    void c(int i, ErrorCode errorCode);

    boolean d(int i, List<C7845dHm> list, boolean z);

    /* renamed from: o.dHq$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.dHq$b$a */
        /* loaded from: classes5.dex */
        static final class a implements InterfaceC7849dHq {
            @Override // o.InterfaceC7849dHq
            public boolean a(int i, List<C7845dHm> list) {
                C8632dsu.d(list, "");
                return true;
            }

            @Override // o.InterfaceC7849dHq
            public void c(int i, ErrorCode errorCode) {
                C8632dsu.d(errorCode, "");
            }

            @Override // o.InterfaceC7849dHq
            public boolean d(int i, List<C7845dHm> list, boolean z) {
                C8632dsu.d(list, "");
                return true;
            }

            @Override // o.InterfaceC7849dHq
            public boolean b(int i, InterfaceC7871dIn interfaceC7871dIn, int i2, boolean z) {
                C8632dsu.d(interfaceC7871dIn, "");
                interfaceC7871dIn.h(i2);
                return true;
            }
        }
    }
}
