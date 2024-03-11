package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1370Yu;

/* renamed from: o.aaN  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2124aaN {
    public static final C2124aaN d = new C2124aaN();

    /* renamed from: o.aaN$b */
    /* loaded from: classes6.dex */
    public static final class b implements InterfaceC8949gP<C1370Yu.d> {
        public static final b b = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("games");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1370Yu.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).b(jsonReader, c9028hp);
            }
            return new C1370Yu.d(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1370Yu.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("games");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.c, false, 1, null)))).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C2124aaN() {
    }

    /* renamed from: o.aaN$a */
    /* loaded from: classes6.dex */
    public static final class a implements InterfaceC8949gP<C1370Yu.a> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId", "artwork");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1370Yu.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C1370Yu.b bVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    bVar = (C1370Yu.b) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1370Yu.a(str, num.intValue(), bVar);
            } else {
                C8956gW.a(jsonReader, "gameId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1370Yu.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.d()));
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.aaN$e */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC8949gP<C1370Yu.b> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "available", SignupConstants.Field.URL);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1370Yu.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C1370Yu.b(str, bool, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1370Yu.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
