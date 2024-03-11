package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2436afz;

/* renamed from: o.afB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2377afB {
    public static final C2377afB b = new C2377afB();

    /* renamed from: o.afB$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2436afz> {
        private static final List<String> b;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "availabilityStartTime", "timeWindow");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2436afz b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Instant instant = null;
            C2436afz.e eVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    eVar = (C2436afz.e) C8953gT.d(C8953gT.c(b.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2436afz(str, instant, eVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2436afz c2436afz) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2436afz, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2436afz.a());
            interfaceC9069id.e("availabilityStartTime");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, c2436afz.c());
            interfaceC9069id.e("timeWindow");
            C8953gT.d(C8953gT.c(b.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2436afz.b());
        }
    }

    private C2377afB() {
    }

    /* renamed from: o.afB$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2436afz.e> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "endTime");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2436afz.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Instant instant = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2436afz.e(str, instant);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2436afz.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("endTime");
            C8953gT.d(C8950gQ.c).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
