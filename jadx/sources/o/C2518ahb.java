package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2462agY;
import o.C2463agZ;

/* renamed from: o.ahb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2518ahb {
    public static final C2518ahb a = new C2518ahb();

    /* renamed from: o.ahb$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2463agZ> {
        public static final a a = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount", "edges", "pageInfo");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2463agZ b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            List list = null;
            C2463agZ.a aVar = null;
            while (true) {
                int a2 = jsonReader.a(e);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.d, true)))).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    aVar = (C2463agZ.a) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2463agZ(str, num, list, aVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2463agZ c2463agZ) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2463agZ, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2463agZ.c());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2463agZ.d());
            interfaceC9069id.e("edges");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.d, true)))).e(interfaceC9069id, c9028hp, c2463agZ.e());
            interfaceC9069id.e("pageInfo");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2463agZ.a());
        }
    }

    private C2518ahb() {
    }

    /* renamed from: o.ahb$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2463agZ.d> {
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
        /* renamed from: d */
        public C2463agZ.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2458agU b = C2462agY.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C2463agZ.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2463agZ.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            C2462agY.a.d.e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    /* renamed from: o.ahb$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2463agZ.a> {
        private static final List<String> a;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "hasNextPage");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2463agZ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    bool = C8953gT.i.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (bool != null) {
                return new C2463agZ.a(str, bool.booleanValue());
            } else {
                C8956gW.a(jsonReader, "hasNextPage");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2463agZ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("hasNextPage");
            C8953gT.i.e(interfaceC9069id, c9028hp, Boolean.valueOf(aVar.b()));
        }
    }
}
