package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2629ajg;
import o.ZH;

/* renamed from: o.ade  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2300ade {
    public static final C2300ade a = new C2300ade();

    /* renamed from: o.ade$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<ZH.e> {
        public static final a d = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public ZH.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(e) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).b(jsonReader, c9028hp);
            }
            return new ZH.e(list);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZH.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2300ade() {
    }

    /* renamed from: o.ade$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZH.b> {
        public static final c b = new c();
        private static final List<String> c;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZH.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2627aje b2 = C2629ajg.b.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZH.b(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZH.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            C2629ajg.b.a.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
