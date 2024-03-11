package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1393Zr;
import o.C2623aja;

/* renamed from: o.acz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2268acz {
    public static final C2268acz d = new C2268acz();

    /* renamed from: o.acz$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1393Zr.b> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("removeProfileAccessPin");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1393Zr.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1393Zr.d dVar = null;
            while (jsonReader.a(e) == 0) {
                dVar = (C1393Zr.d) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1393Zr.b(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1393Zr.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("removeProfileAccessPin");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    private C2268acz() {
    }

    /* renamed from: o.acz$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1393Zr.d> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "profile");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1393Zr.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C1393Zr.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C1393Zr.c) C8953gT.d(C8953gT.a(e.c, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1393Zr.d(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1393Zr.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("profile");
            C8953gT.d(C8953gT.a(e.c, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    /* renamed from: o.acz$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1393Zr.c> {
        public static final e c = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1393Zr.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2567aiX b = C2623aja.j.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1393Zr.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1393Zr.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            C2623aja.j.a.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }
}
