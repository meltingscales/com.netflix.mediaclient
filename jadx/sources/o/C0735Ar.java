package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0728Ak;

/* renamed from: o.Ar  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0735Ar {
    public static final C0735Ar d = new C0735Ar();

    /* renamed from: o.Ar$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0728Ak.e> {
        public static final int a;
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsRestoreScreen");
            c = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0728Ak.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0728Ak.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (C0728Ak.a) C8953gT.d(C8953gT.a(e.d, true)).b(jsonReader, c9028hp);
            }
            return new C0728Ak.e(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0728Ak.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("clcsRestoreScreen");
            C8953gT.d(C8953gT.a(e.d, true)).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    private C0735Ar() {
    }

    /* renamed from: o.Ar$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC8949gP<C0728Ak.a> {
        public static final int b;
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0728Ak.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b2 = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0728Ak.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0728Ak.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            BP.j.e.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
