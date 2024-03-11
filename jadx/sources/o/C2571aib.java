package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2317adv;
import o.C2512ahV;
import o.C2515ahY;

/* renamed from: o.aib  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2571aib {
    public static final C2571aib b = new C2571aib();

    /* renamed from: o.aib$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2512ahV> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "advisories");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2512ahV b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            List list = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.a(c.d, true))).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2315adt b = C2317adv.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2512ahV(str, list, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2512ahV c2512ahV) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2512ahV, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2512ahV.d());
            interfaceC9069id.e("advisories");
            C8953gT.d(C8953gT.a(C8953gT.a(c.d, true))).e(interfaceC9069id, c9028hp, c2512ahV.a());
            C2317adv.d.e.e(interfaceC9069id, c9028hp, c2512ahV.b());
        }
    }

    private C2571aib() {
    }

    /* renamed from: o.aib$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2512ahV.a> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2512ahV.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2570aia b = C2515ahY.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2512ahV.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2512ahV.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            C2515ahY.e.e.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
