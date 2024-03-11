package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C0730Am;
import o.C0758Bn;

/* loaded from: classes2.dex */
public final class AD {
    public static final AD b = new AD();

    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0730Am.c> {
        public static final int a;
        public static final d b = new d();
        private static final List<String> c;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("clcsFlowSubmitAction");
            c = e;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0730Am.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0730Am.e eVar = null;
            while (jsonReader.a(c) == 0) {
                eVar = (C0730Am.e) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
            }
            return new C0730Am.c(eVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0730Am.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("clcsFlowSubmitAction");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    private AD() {
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0730Am.e> {
        public static final b b = new b();
        public static final int c;
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0730Am.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C0755Bk b2 = C0758Bn.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0730Am.e(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0730Am.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            C0758Bn.c.c.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
