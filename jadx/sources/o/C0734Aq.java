package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0727Aj;

/* renamed from: o.Aq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0734Aq {
    public static final C0734Aq d = new C0734Aq();

    /* renamed from: o.Aq$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0727Aj.d> {
        private static final List<String> c;
        public static final int d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsHook");
            c = e2;
            d = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0727Aj.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0727Aj.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (C0727Aj.a) C8953gT.d(C8953gT.a(c.b, true)).b(jsonReader, c9028hp);
            }
            return new C0727Aj.d(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0727Aj.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("clcsHook");
            C8953gT.d(C8953gT.a(c.b, true)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    private C0734Aq() {
    }

    /* renamed from: o.Aq$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8949gP<C0727Aj.a> {
        public static final int a;
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C0727Aj.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b2 = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0727Aj.a(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0727Aj.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            BP.j.e.e(interfaceC9069id, c9028hp, aVar.d());
        }
    }
}
