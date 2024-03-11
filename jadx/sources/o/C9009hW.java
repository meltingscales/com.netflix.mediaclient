package o;

import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* renamed from: o.hW  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9009hW {
    private final List<C9006hT> a;
    private final int b;
    private final InterfaceC7871dIn c;
    private final ByteString e;

    public /* synthetic */ C9009hW(int i, List list, InterfaceC7871dIn interfaceC7871dIn, ByteString byteString, C8627dsp c8627dsp) {
        this(i, list, interfaceC7871dIn, byteString);
    }

    public final List<C9006hT> c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    private C9009hW(int i, List<C9006hT> list, InterfaceC7871dIn interfaceC7871dIn, ByteString byteString) {
        this.b = i;
        this.a = list;
        this.c = interfaceC7871dIn;
        this.e = byteString;
    }

    public final InterfaceC7871dIn a() {
        InterfaceC7871dIn interfaceC7871dIn = this.c;
        if (interfaceC7871dIn == null) {
            ByteString byteString = this.e;
            if (byteString != null) {
                return new C7872dIo().b(byteString);
            }
            return null;
        }
        return interfaceC7871dIn;
    }

    /* renamed from: o.hW$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private InterfaceC7871dIn b;
        private final List<C9006hT> c = new ArrayList();
        private ByteString d;
        private final int e;

        private final boolean c() {
            return (this.b == null && this.d == null) ? false : true;
        }

        public a(int i) {
            this.e = i;
        }

        public final a c(InterfaceC7871dIn interfaceC7871dIn) {
            C8632dsu.c((Object) interfaceC7871dIn, "");
            if (!c()) {
                this.b = interfaceC7871dIn;
                return this;
            }
            throw new IllegalStateException("body() can only be called once".toString());
        }

        public final a a(List<C9006hT> list) {
            C8632dsu.c((Object) list, "");
            this.c.addAll(list);
            return this;
        }

        public final a b(List<C9006hT> list) {
            C8632dsu.c((Object) list, "");
            this.c.clear();
            this.c.addAll(list);
            return this;
        }

        public final C9009hW a() {
            return new C9009hW(this.e, this.c, this.b, this.d, null);
        }
    }
}
