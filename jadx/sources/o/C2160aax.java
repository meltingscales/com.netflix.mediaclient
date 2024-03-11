package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1353Yk;
import o.C2355aeg;

/* renamed from: o.aax  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2160aax {
    public static final C2160aax b = new C2160aax();

    /* renamed from: o.aax$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1353Yk.a> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1353Yk.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.c, true)))).b(jsonReader, c9028hp);
            }
            return new C1353Yk.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1353Yk.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.c, true)))).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C2160aax() {
    }

    /* renamed from: o.aax$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1353Yk.e> {
        public static final e c = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1353Yk.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2357aei b = C2355aeg.c.b.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1353Yk.e(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1353Yk.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            C2355aeg.c.b.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
