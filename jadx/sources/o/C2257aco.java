package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1385Zj;
import o.C2623aja;

/* renamed from: o.aco  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2257aco {
    public static final C2257aco e = new C2257aco();

    /* renamed from: o.aco$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1385Zj.e> {
        public static final b a = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("profile");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1385Zj.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1385Zj.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (C1385Zj.a) C8953gT.d(C8953gT.a(e.a, true)).b(jsonReader, c9028hp);
            }
            return new C1385Zj.e(aVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1385Zj.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("profile");
            C8953gT.d(C8953gT.a(e.a, true)).e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    private C2257aco() {
    }

    /* renamed from: o.aco$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1385Zj.a> {
        public static final e a = new e();
        private static final List<String> b;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1385Zj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b2 = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1385Zj.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1385Zj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
