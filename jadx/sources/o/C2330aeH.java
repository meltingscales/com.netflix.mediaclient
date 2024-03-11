package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2329aeG;
import o.C2377afB;

/* renamed from: o.aeH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2330aeH {
    public static final C2330aeH e = new C2330aeH();

    /* renamed from: o.aeH$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2329aeG> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "liveEvent");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2329aeG b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2329aeG.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C2329aeG.b) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2329aeG(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2329aeG c2329aeG) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2329aeG, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2329aeG.e());
            interfaceC9069id.e("liveEvent");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, c2329aeG.d());
        }
    }

    private C2330aeH() {
    }

    /* renamed from: o.aeH$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2329aeG.b> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2329aeG.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2436afz b2 = C2377afB.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2329aeG.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2329aeG.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            C2377afB.d.e.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
