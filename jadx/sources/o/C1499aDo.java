package o;

import com.apollographql.apollo3.api.http.HttpMethod;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import o.C1500aDp;
import o.C9008hV;
import o.InterfaceC8991hE;
import okio.ByteString;

/* renamed from: o.aDo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1499aDo implements InterfaceC9007hU {
    public static final b d = new b(null);
    private final String b;

    /* renamed from: o.aDo$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

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
            b = iArr;
        }
    }

    public C1499aDo(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    @Override // o.InterfaceC9007hU
    public <D extends InterfaceC8991hE.b> C9008hV c(C8951gR<D> c8951gR) {
        List j;
        List<C9006hT> g;
        C8632dsu.c((Object) c8951gR, "");
        InterfaceC8991hE<D> h = c8951gR.h();
        C9028hp c9028hp = (C9028hp) c8951gR.b().d(C9028hp.b);
        if (c9028hp == null) {
            c9028hp = C9028hp.c;
        }
        C9028hp c9028hp2 = c9028hp;
        j = C8569dql.j(new C9006hT("X-APOLLO-OPERATION-ID", h.a()), new C9006hT("X-APOLLO-OPERATION-NAME", h.f()), new C9006hT("x-netflix.context.operation-name", h.f()), new C9006hT("Accept", "multipart/mixed; deferSpec=20220824, application/json"));
        List<C9006hT> c = c8951gR.c();
        if (c == null) {
            c = C8569dql.i();
        }
        g = C8576dqs.g((Collection) j, (Iterable) c);
        Boolean f = c8951gR.f();
        boolean booleanValue = f != null ? f.booleanValue() : false;
        C1500aDp.e eVar = (C1500aDp.e) c8951gR.b().d(C1500aDp.e.a);
        boolean e2 = eVar != null ? eVar.e() : false;
        Boolean g2 = c8951gR.g();
        boolean booleanValue2 = g2 != null ? g2.booleanValue() : true;
        HttpMethod d2 = c8951gR.d();
        if (d2 == null) {
            d2 = HttpMethod.a;
        }
        int i = e.b[d2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new C9008hV.b(HttpMethod.a, this.b).e(g).c(d.c(h, c9028hp2, booleanValue, e2, booleanValue2 ? h.d() : null)).a();
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C9008hV.b(HttpMethod.e, d.e(this.b, h, c9028hp2, booleanValue, e2, booleanValue2)).e(g).a();
    }

    /* renamed from: o.aDo$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC8991hE.b> String e(String str, InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2, boolean z3) {
            return e(str, c(interfaceC8991hE, c9028hp, z, z2, z3));
        }

        private final <D extends InterfaceC8991hE.b> Map<String, String> c(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2, boolean z3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", interfaceC8991hE.f());
            C7872dIo c7872dIo = new C7872dIo();
            C1501aDq c1501aDq = new C1501aDq(new C9072ig(c7872dIo, null));
            c1501aDq.e();
            interfaceC8991hE.d(c1501aDq, c9028hp, false);
            c1501aDq.d();
            if (!c1501aDq.f().isEmpty()) {
                throw new IllegalStateException("FileUpload and Http GET are not supported at the same time".toString());
            }
            linkedHashMap.put("variables", c7872dIo.v());
            if (z3) {
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
            } else if (z2) {
                C7872dIo c7872dIo3 = new C7872dIo();
                C9072ig c9072ig2 = new C9072ig(c7872dIo3, null);
                c9072ig2.e();
                c9072ig2.e("persistedQuery");
                c9072ig2.e();
                c9072ig2.e("version").e(102);
                c9072ig2.e("queryId").d(interfaceC8991hE.a());
                c9072ig2.d();
                c9072ig2.d();
                linkedHashMap.put("extensions", c7872dIo3.v());
            }
            return linkedHashMap;
        }

        public final String e(String str, Map<String, String> map) {
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
                sb.append(C1506aDv.e((String) entry.getKey()));
                sb.append('=');
                sb.append(C1506aDv.e((String) entry.getValue()));
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            return sb2;
        }

        /* renamed from: o.aDo$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC9002hP {
            final /* synthetic */ ByteString c;
            private final long d;
            private final String e = "application/json";

            @Override // o.InterfaceC9002hP
            public String a() {
                return this.e;
            }

            @Override // o.InterfaceC9002hP
            public long e() {
                return this.d;
            }

            a(ByteString byteString) {
                this.c = byteString;
                this.d = byteString.k();
            }

            @Override // o.InterfaceC9002hP
            public void d(dIq diq) {
                C8632dsu.c((Object) diq, "");
                diq.b(this.c);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <D extends InterfaceC8991hE.b> Map<String, InterfaceC9001hO> b(InterfaceC9069id interfaceC9069id, InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2, String str) {
            interfaceC9069id.e();
            interfaceC9069id.e("operationName");
            interfaceC9069id.d(interfaceC8991hE.f());
            interfaceC9069id.e("variables");
            C1501aDq c1501aDq = new C1501aDq(interfaceC9069id);
            c1501aDq.e();
            interfaceC8991hE.d(c1501aDq, c9028hp, false);
            c1501aDq.d();
            Map<String, InterfaceC9001hO> f = c1501aDq.f();
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
            } else if (z2) {
                interfaceC9069id.e("extensions");
                interfaceC9069id.e();
                interfaceC9069id.e("persistedQuery");
                interfaceC9069id.e();
                interfaceC9069id.e("version").e(102);
                interfaceC9069id.e(SignupConstants.Field.LANG_ID).d(interfaceC8991hE.a());
                interfaceC9069id.d();
                interfaceC9069id.d();
            }
            interfaceC9069id.d();
            return f;
        }

        public final <D extends InterfaceC8991hE.b> InterfaceC9002hP c(InterfaceC8991hE<D> interfaceC8991hE, C9028hp c9028hp, boolean z, boolean z2, String str) {
            C8632dsu.c((Object) interfaceC8991hE, "");
            C8632dsu.c((Object) c9028hp, "");
            C7872dIo c7872dIo = new C7872dIo();
            Map b = C1499aDo.d.b(new C9072ig(c7872dIo, null), interfaceC8991hE, c9028hp, z, z2, str);
            ByteString r = c7872dIo.r();
            if (b.isEmpty()) {
                return new a(r);
            }
            return new C1503aDs(b, r);
        }
    }
}
