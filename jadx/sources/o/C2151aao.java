package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1355Ym;

/* renamed from: o.aao  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2151aao {
    public static final C2151aao b = new C2151aao();

    /* renamed from: o.aao$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1355Ym.b> {
        private static final List<String> c;
        public static final b d = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("currentCountry");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1355Ym.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1355Ym.e eVar = null;
            while (jsonReader.a(c) == 0) {
                eVar = (C1355Ym.e) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1355Ym.b(eVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1355Ym.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("currentCountry");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    private C2151aao() {
    }

    /* renamed from: o.aao$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1355Ym.e> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "code");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1355Ym.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 != null) {
                return new C1355Ym.e(str, str2);
            } else {
                C8956gW.a(jsonReader, "code");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1355Ym.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e("code");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
