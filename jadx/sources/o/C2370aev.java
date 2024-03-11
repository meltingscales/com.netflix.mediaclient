package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2323aeA;
import o.C2365aeq;
import o.C2374aez;

/* renamed from: o.aev  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2370aev {
    public static final C2370aev a = new C2370aev();

    /* renamed from: o.aev$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2365aeq> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "node");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2365aeq b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2365aeq.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    aVar = (C2365aeq.a) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2367aes b2 = C2374aez.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2365aeq(str, aVar, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2365aeq c2365aeq) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2365aeq, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2365aeq.c());
            interfaceC9069id.e("node");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, c2365aeq.e());
            C2374aez.b.b.e(interfaceC9069id, c9028hp, c2365aeq.b());
        }
    }

    private C2370aev() {
    }

    /* renamed from: o.aev$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2365aeq.a> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2365aeq.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2325aeC b2 = C2323aeA.b.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2365aeq.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2365aeq.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            C2323aeA.b.b.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
