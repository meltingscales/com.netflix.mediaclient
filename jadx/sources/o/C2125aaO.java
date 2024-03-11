package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2341aeS;
import o.YA;

/* renamed from: o.aaO  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2125aaO {
    public static final C2125aaO d = new C2125aaO();

    /* renamed from: o.aaO$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YA.c> {
        private static final List<String> b;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("games");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YA.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.d, true)))).b(jsonReader, c9028hp);
            }
            return new YA.c(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YA.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("games");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.d, true)))).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    private C2125aaO() {
    }

    /* renamed from: o.aaO$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YA.a> {
        private static final List<String> b;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YA.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2339aeQ b2 = C2341aeS.b.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new YA.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YA.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            C2341aeS.b.e.e(interfaceC9069id, c9028hp, aVar.c());
        }
    }
}
