package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0719Ab;

/* renamed from: o.An  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0731An {
    public static final C0731An e = new C0731An();

    /* renamed from: o.An$d */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC8949gP<C0719Ab.e> {
        public static final d a = new d();
        private static final List<String> c;
        public static final int e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("clcsDemo");
            c = e2;
            e = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0719Ab.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0719Ab.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (C0719Ab.b) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
            }
            return new C0719Ab.e(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0719Ab.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("clcsDemo");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    private C0731An() {
    }

    /* renamed from: o.An$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0719Ab.b> {
        public static final int a;
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            a = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C0719Ab.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b2 = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0719Ab.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0719Ab.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            BP.j.e.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
