package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1372Yw;
import o.C2588ais;

/* renamed from: o.aaF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2110aaF {
    public static final C2110aaF a = new C2110aaF();

    /* renamed from: o.aaF$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1372Yw.e> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("currentProfile");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1372Yw.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1372Yw.d dVar = null;
            while (jsonReader.a(b) == 0) {
                dVar = (C1372Yw.d) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
            }
            return new C1372Yw.e(dVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1372Yw.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("currentProfile");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    private C2110aaF() {
    }

    /* renamed from: o.aaF$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1372Yw.d> {
        public static final a a = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1372Yw.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2589ait b = C2588ais.h.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1372Yw.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1372Yw.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            C2588ais.h.d.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
