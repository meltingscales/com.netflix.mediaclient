package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1349Yg;
import o.C2277adH;

/* renamed from: o.aan  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2150aan {
    public static final C2150aan c = new C2150aan();

    /* renamed from: o.aan$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1349Yg.a> {
        private static final List<String> c;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1349Yg.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.a, true)))).b(jsonReader, c9028hp);
            }
            return new C1349Yg.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1349Yg.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.a, true)))).e(interfaceC9069id, c9028hp, aVar.c());
        }
    }

    private C2150aan() {
    }

    /* renamed from: o.aan$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1349Yg.d> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1349Yg.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2279adJ b = C2277adH.c.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1349Yg.d(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1349Yg.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.d());
            C2277adH.c.d.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }
}
