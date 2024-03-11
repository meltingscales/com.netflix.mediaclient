package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AB;
import o.BH;

/* loaded from: classes2.dex */
public final class AC {
    public static final AC c = new AC();

    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<AB> {
        public static final a b = new a();
        private static final List<String> c;
        public static final int e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "label");
            c = j;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public AB b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            AB.c cVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (AB.c) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new AB(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AB ab) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) ab, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, ab.c());
            interfaceC9069id.e("label");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, ab.e());
        }
    }

    private AC() {
    }

    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<AB.c> {
        public static final int a;
        public static final e c = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public AB.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BG b = BH.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new AB.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AB.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            BH.b.d.e(interfaceC9069id, c9028hp, cVar.c());
        }
    }
}
