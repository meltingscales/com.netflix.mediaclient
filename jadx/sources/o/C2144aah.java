package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1346Yd;
import o.C2273adD;

/* renamed from: o.aah  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2144aah {
    public static final C2144aah b = new C2144aah();

    /* renamed from: o.aah$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1346Yd.b> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            a = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1346Yd.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.c, true)))).b(jsonReader, c9028hp);
            }
            return new C1346Yd.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1346Yd.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(b.c, true)))).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    private C2144aah() {
    }

    /* renamed from: o.aah$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1346Yd.e> {
        public static final b c = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1346Yd.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2272adC b = C2273adD.c.c.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1346Yd.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1346Yd.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C2273adD.c.c.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
