package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2315adt;

/* renamed from: o.adv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2317adv {
    public static final C2317adv d = new C2317adv();

    /* renamed from: o.adv$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2315adt> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "broadcastInfo");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2315adt b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2315adt.e eVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    eVar = (C2315adt.e) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2315adt(str, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2315adt c2315adt) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2315adt, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2315adt.c());
            interfaceC9069id.e("broadcastInfo");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2315adt.b());
        }
    }

    private C2317adv() {
    }

    /* renamed from: o.adv$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2315adt.e> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "distributorName", "releaseDate");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2315adt.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            Instant instant = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2315adt.e(str, str2, instant);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2315adt.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("distributorName");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("releaseDate");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }
}
