package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2462agY;
import o.YL;

/* renamed from: o.abk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2200abk {
    public static final C2200abk c = new C2200abk();

    /* renamed from: o.abk$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YL.b> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("lolomoRowByIndex");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YL.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YL.a aVar = null;
            while (jsonReader.a(c) == 0) {
                aVar = (YL.a) C8953gT.d(C8953gT.a(d.a, true)).b(jsonReader, c9028hp);
            }
            return new YL.b(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YL.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("lolomoRowByIndex");
            C8953gT.d(C8953gT.a(d.a, true)).e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    private C2200abk() {
    }

    /* renamed from: o.abk$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<YL.a> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YL.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2458agU b = C2462agY.a.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new YL.a(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YL.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            C2462agY.a.d.e(interfaceC9069id, c9028hp, aVar.a());
        }
    }
}
