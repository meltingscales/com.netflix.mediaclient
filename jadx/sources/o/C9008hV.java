package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.hV  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9008hV {
    private final HttpMethod a;
    private final List<C9006hT> b;
    private final InterfaceC9032ht c;
    private final String d;
    private final InterfaceC9002hP e;

    public /* synthetic */ C9008hV(HttpMethod httpMethod, String str, List list, InterfaceC9002hP interfaceC9002hP, InterfaceC9032ht interfaceC9032ht, C8627dsp c8627dsp) {
        this(httpMethod, str, list, interfaceC9002hP, interfaceC9032ht);
    }

    public final List<C9006hT> b() {
        return this.b;
    }

    public final HttpMethod c() {
        return this.a;
    }

    public final InterfaceC9002hP d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    private C9008hV(HttpMethod httpMethod, String str, List<C9006hT> list, InterfaceC9002hP interfaceC9002hP, InterfaceC9032ht interfaceC9032ht) {
        this.a = httpMethod;
        this.d = str;
        this.b = list;
        this.e = interfaceC9002hP;
        this.c = interfaceC9032ht;
    }

    public static /* synthetic */ b e(C9008hV c9008hV, HttpMethod httpMethod, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = c9008hV.a;
        }
        if ((i & 2) != 0) {
            str = c9008hV.d;
        }
        return c9008hV.d(httpMethod, str);
    }

    public final b d(HttpMethod httpMethod, String str) {
        C8632dsu.c((Object) httpMethod, "");
        C8632dsu.c((Object) str, "");
        b bVar = new b(httpMethod, str);
        InterfaceC9002hP interfaceC9002hP = this.e;
        if (interfaceC9002hP != null) {
            bVar.c(interfaceC9002hP);
        }
        bVar.e(this.b);
        return bVar;
    }

    /* renamed from: o.hV$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final HttpMethod a;
        private final List<C9006hT> b;
        private InterfaceC9032ht c;
        private InterfaceC9002hP d;
        private final String e;

        public final b c(InterfaceC9002hP interfaceC9002hP) {
            C8632dsu.c((Object) interfaceC9002hP, "");
            this.d = interfaceC9002hP;
            return this;
        }

        public b(HttpMethod httpMethod, String str) {
            C8632dsu.c((Object) httpMethod, "");
            C8632dsu.c((Object) str, "");
            this.a = httpMethod;
            this.e = str;
            this.b = new ArrayList();
            this.c = InterfaceC9032ht.h;
        }

        public final b e(List<C9006hT> list) {
            C8632dsu.c((Object) list, "");
            this.b.addAll(list);
            return this;
        }

        public final b e(InterfaceC9032ht interfaceC9032ht) {
            C8632dsu.c((Object) interfaceC9032ht, "");
            this.c = this.c.d(interfaceC9032ht);
            return this;
        }

        public final C9008hV a() {
            return new C9008hV(this.a, this.e, this.b, this.d, this.c, null);
        }
    }
}
