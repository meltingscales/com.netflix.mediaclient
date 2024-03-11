package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1397Zv;
import o.C2623aja;

/* renamed from: o.acR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2234acR {
    public static final C2234acR a = new C2234acR();

    /* renamed from: o.acR$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1397Zv.c> {
        public static final d b = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("setProfileAccessPin");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1397Zv.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1397Zv.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (C1397Zv.a) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1397Zv.c(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1397Zv.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("setProfileAccessPin");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    private C2234acR() {
    }

    /* renamed from: o.acR$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1397Zv.a> {
        private static final List<String> a;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "profile");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1397Zv.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1397Zv.b bVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bVar = (C1397Zv.b) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1397Zv.a(str, bVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1397Zv.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e("profile");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.acR$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1397Zv.b> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1397Zv.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b2 = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1397Zv.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1397Zv.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
