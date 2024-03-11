package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.BP;
import o.C0725Ah;

/* renamed from: o.As  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0736As {
    public static final C0736As b = new C0736As();

    /* renamed from: o.As$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC8949gP<C0725Ah.a> {
        private static final List<String> a;
        public static final int b;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("clcsInterstitialUnspecifiedLocation");
            a = e;
            b = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0725Ah.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C0725Ah.c cVar = null;
            while (jsonReader.a(a) == 0) {
                cVar = (C0725Ah.c) C8953gT.d(C8953gT.a(b.d, true)).b(jsonReader, c9028hp);
            }
            return new C0725Ah.a(cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0725Ah.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("clcsInterstitialUnspecifiedLocation");
            C8953gT.d(C8953gT.a(b.d, true)).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C0736As() {
    }

    /* renamed from: o.As$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC8949gP<C0725Ah.c> {
        public static final int c;
        public static final b d = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
            c = 8;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C0725Ah.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            BR b = BP.j.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C0725Ah.c(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C0725Ah.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            BP.j.e.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
