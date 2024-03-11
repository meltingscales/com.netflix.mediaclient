package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2408afg;
import o.C2511ahU;
import o.C2541ahy;
import o.C2582aim;
import o.YI;

/* renamed from: o.abs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2208abs {
    public static final C2208abs a = new C2208abs();

    /* renamed from: o.abs$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YI.a> {
        private static final List<String> a;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            a = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YI.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(a) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.a, true)))).b(jsonReader, c9028hp);
            }
            return new YI.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YI.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.a, true)))).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    private C2208abs() {
    }

    /* renamed from: o.abs$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YI.b> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YI.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2579aij b = C2582aim.d.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2410afi b2 = C2408afg.e.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2539ahw b3 = C2541ahy.a.d.b(jsonReader, c9028hp);
            jsonReader.q();
            C2514ahX b4 = C2511ahU.e.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new YI.b(str, b, b2, b3, b4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YI.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            C2582aim.d.a.e(interfaceC9069id, c9028hp, bVar.e());
            C2408afg.e.a.e(interfaceC9069id, c9028hp, bVar.d());
            C2541ahy.a.d.e(interfaceC9069id, c9028hp, bVar.c());
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
