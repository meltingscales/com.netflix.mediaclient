package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SSOTokenNotRenewedReason;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1401Zz;

/* renamed from: o.acM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2229acM {
    public static final C2229acM d = new C2229acM();

    /* renamed from: o.acM$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1401Zz.e> {
        private static final List<String> a;
        public static final d b = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("renewSSOToken");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1401Zz.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1401Zz.b bVar = null;
            while (jsonReader.a(a) == 0) {
                bVar = (C1401Zz.b) C8953gT.d(C8953gT.a(e.b, true)).b(jsonReader, c9028hp);
            }
            return new C1401Zz.e(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1401Zz.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("renewSSOToken");
            C8953gT.d(C8953gT.a(e.b, true)).e(interfaceC9069id, c9028hp, eVar.c());
        }
    }

    private C2229acM() {
    }

    /* renamed from: o.acM$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1401Zz.b> {
        private static final List<String> a;
        public static final e b = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1401Zz.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C1401Zz.c cVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1401Zz.d dVar = null;
            String str = null;
            while (jsonReader.a(a) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("SSOTokenRenewed"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                cVar = c.c.b(jsonReader, c9028hp);
            } else {
                cVar = null;
            }
            if (C9014hb.d(C9014hb.c("SSOTokenNotRenewed"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                dVar = a.d.b(jsonReader, c9028hp);
            }
            return new C1401Zz.b(str, cVar, dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1401Zz.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            if (bVar.c() != null) {
                c.c.e(interfaceC9069id, c9028hp, bVar.c());
            }
            if (bVar.d() != null) {
                a.d.e(interfaceC9069id, c9028hp, bVar.d());
            }
        }
    }

    /* renamed from: o.acM$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1401Zz.c> {
        public static final c c = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("ssoToken");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1401Zz.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str != null) {
                return new C1401Zz.c(str);
            }
            C8956gW.a(jsonReader, "ssoToken");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1401Zz.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("ssoToken");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }

    /* renamed from: o.acM$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1401Zz.d> {
        private static final List<String> b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("reason");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1401Zz.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            SSOTokenNotRenewedReason sSOTokenNotRenewedReason = null;
            while (jsonReader.a(b) == 0) {
                sSOTokenNotRenewedReason = (SSOTokenNotRenewedReason) C8953gT.d(C3494azz.b).b(jsonReader, c9028hp);
            }
            return new C1401Zz.d(sSOTokenNotRenewedReason);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1401Zz.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("reason");
            C8953gT.d(C3494azz.b).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
