package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C9008hV;
import o.InterfaceC8991hE;
import okio.ByteString;

/* renamed from: o.hQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9003hQ implements InterfaceC9007hU {
    private final String g;
    public static final e a = new e(null);
    private static final String e = "X-APOLLO-OPERATION-ID";
    private static final String h = "X-APOLLO-OPERATION-NAME";
    private static final String d = "Accept";
    private static final String b = "multipart/mixed; deferSpec=20220824, application/json";
    private static final String c = "multipart/mixed; boundary=\"graphql\"; subscriptionSpec=1.0, application/json";

    /* renamed from: o.hQ$b */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    public C9003hQ(String str) {
        C8632dsu.c((Object) str, "");
        this.g = str;
    }

    @Override // o.InterfaceC9007hU
    public <D extends InterfaceC8991hE.b> C9008hV c(C8951gR<D> c8951gR) {
        C9008hV.b bVar;
        C8632dsu.c((Object) c8951gR, "");
        InterfaceC8991hE<D> h2 = c8951gR.h();
        C9028hp c9028hp = (C9028hp) c8951gR.b().d(C9028hp.b);
        if (c9028hp == null) {
            c9028hp = C9028hp.c;
        }
        C9028hp c9028hp2 = c9028hp;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9006hT(e, h2.a()));
        arrayList.add(new C9006hT(h, h2.f()));
        if (c8951gR.h() instanceof InterfaceC8995hI) {
            arrayList.add(new C9006hT(d, c));
        } else {
            arrayList.add(new C9006hT(d, b));
        }
        if (c8951gR.c() != null) {
            arrayList.addAll(c8951gR.c());
        }
        Boolean f = c8951gR.f();
        boolean booleanValue = f != null ? f.booleanValue() : false;
        Boolean g = c8951gR.g();
        boolean booleanValue2 = g != null ? g.booleanValue() : true;
        HttpMethod d2 = c8951gR.d();
        if (d2 == null) {
            d2 = HttpMethod.a;
        }
        int i = b.e[d2.ordinal()];
        if (i == 1) {
            bVar = new C9008hV.b(HttpMethod.e, a.d(this.g, h2, c9028hp2, booleanValue, booleanValue2));
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            bVar = new C9008hV.b(HttpMethod.a, this.g).c(a.e(h2, c9028hp2, booleanValue, booleanValue2 ? h2.d() : null));
        }
        return bVar.e(arrayList).e(c8951gR.b()).a();
    }

    /* renamed from: o.hQ$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final String c() {
            return C9003hQ.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC8991hE.b> String d(String str, InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2) {
            return a(str, c(interfaceC8991hE, c9028hp, z, z2));
        }

        private final <D extends InterfaceC8991hE.b> Map<String, String> c(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", interfaceC8991hE.f());
            C7872dIo c7872dIo = new C7872dIo();
            C9077il c9077il = new C9077il(new C9072ig(c7872dIo, null));
            c9077il.e();
            interfaceC8991hE.d(c9077il, c9028hp, false);
            c9077il.d();
            if (!c9077il.f().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time".toString());
            }
            linkedHashMap.put("variables", c7872dIo.v());
            if (z2) {
                linkedHashMap.put("query", interfaceC8991hE.d());
            }
            if (z) {
                C7872dIo c7872dIo2 = new C7872dIo();
                C9072ig c9072ig = new C9072ig(c7872dIo2, null);
                c9072ig.e();
                c9072ig.e("persistedQuery");
                c9072ig.e();
                c9072ig.e("version").e(1);
                c9072ig.e("sha256Hash").d(interfaceC8991hE.a());
                c9072ig.d();
                c9072ig.d();
                linkedHashMap.put("extensions", c7872dIo2.v());
            }
            return linkedHashMap;
        }

        public final String a(String str, Map<String, String> map) {
            boolean d;
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) map, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            d = duD.d((CharSequence) str, (CharSequence) "?", false, 2, (Object) null);
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (d) {
                    sb.append('&');
                } else {
                    sb.append('?');
                    d = true;
                }
                sb.append(C9067ib.b((String) entry.getKey()));
                sb.append('=');
                sb.append(C9067ib.b((String) entry.getValue()));
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }

        /* renamed from: o.hQ$e$a */
        /* loaded from: classes2.dex */
        public static final class a implements InterfaceC9002hP {
            private final long a;
            final /* synthetic */ ByteString b;
            private final String c = "application/json";

            @Override // o.InterfaceC9002hP
            public String a() {
                return this.c;
            }

            @Override // o.InterfaceC9002hP
            public long e() {
                return this.a;
            }

            a(ByteString byteString) {
                this.b = byteString;
                this.a = byteString.k();
            }

            @Override // o.InterfaceC9002hP
            public void d(dIq diq) {
                C8632dsu.c((Object) diq, "");
                diq.b(this.b);
            }
        }

        public final <D extends InterfaceC8991hE.b> Map<String, Object> d(C8951gR<D> c8951gR) {
            C8632dsu.c((Object) c8951gR, "");
            InterfaceC8991hE<D> h = c8951gR.h();
            Boolean f = c8951gR.f();
            boolean booleanValue = f != null ? f.booleanValue() : false;
            Boolean g = c8951gR.g();
            boolean booleanValue2 = g != null ? g.booleanValue() : true;
            C9028hp c9028hp = (C9028hp) c8951gR.b().d(C9028hp.b);
            if (c9028hp == null) {
                throw new IllegalStateException("Cannot find a ResponseAdapterCache".toString());
            }
            String d = booleanValue2 ? h.d() : null;
            C9073ih c9073ih = new C9073ih();
            C9003hQ.a.c(c9073ih, h, c9028hp, booleanValue, d);
            Object f2 = c9073ih.f();
            C8632dsu.d(f2);
            return (Map) f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC8991hE.b> Map<String, InterfaceC9001hO> c(InterfaceC9069id interfaceC9069id, InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, String str) {
            interfaceC9069id.e();
            interfaceC9069id.e("operationName");
            interfaceC9069id.d(interfaceC8991hE.f());
            interfaceC9069id.e("variables");
            C9077il c9077il = new C9077il(interfaceC9069id);
            c9077il.e();
            interfaceC8991hE.d(c9077il, c9028hp, false);
            c9077il.d();
            Map<String, InterfaceC9001hO> f = c9077il.f();
            if (str != null) {
                interfaceC9069id.e("query");
                interfaceC9069id.d(str);
            }
            if (z) {
                interfaceC9069id.e("extensions");
                interfaceC9069id.e();
                interfaceC9069id.e("persistedQuery");
                interfaceC9069id.e();
                interfaceC9069id.e("version").e(1);
                interfaceC9069id.e("sha256Hash").d(interfaceC8991hE.a());
                interfaceC9069id.d();
                interfaceC9069id.d();
            }
            interfaceC9069id.d();
            return f;
        }

        public final <D extends InterfaceC8991hE.b> InterfaceC9002hP e(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, String str) {
            C8632dsu.c((Object) interfaceC8991hE, "");
            C8632dsu.c((Object) c9028hp, "");
            C7872dIo c7872dIo = new C7872dIo();
            Map c = C9003hQ.a.c(new C9072ig(c7872dIo, null), interfaceC8991hE, c9028hp, z, str);
            ByteString r = c7872dIo.r();
            if (c.isEmpty()) {
                return new a(r);
            }
            return new C9010hX(c, r);
        }
    }
}
