package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2379afD;
import o.C2380afE;
import o.YG;

/* renamed from: o.abi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2198abi {
    public static final C2198abi c = new C2198abi();

    /* renamed from: o.abi$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YG.a> {
        public static final e b = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YG.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).b(jsonReader, c9028hp);
            }
            return new YG.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YG.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.b, true)))).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    private C2198abi() {
    }

    /* renamed from: o.abi$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YG.d> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YG.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(d) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2383afH b2 = C2379afD.c.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2382afG b3 = C2380afE.c.a.b(jsonReader, c9028hp);
            if (str != null) {
                return new YG.d(str, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YG.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            C2379afD.c.a.e(interfaceC9069id, c9028hp, dVar.b());
            C2380afE.c.a.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }
}
