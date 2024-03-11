package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2633ajk;
import o.ZI;

/* renamed from: o.adm  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2308adm {
    public static final C2308adm c = new C2308adm();

    /* renamed from: o.adm$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<ZI.d> {
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
        /* renamed from: a */
        public ZI.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(c) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.e, true)))).b(jsonReader, c9028hp);
            }
            return new ZI.d(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZI.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.e, true)))).e(interfaceC9069id, c9028hp, dVar.e());
        }
    }

    private C2308adm() {
    }

    /* renamed from: o.adm$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZI.b> {
        private static final List<String> c;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public ZI.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2631aji b = C2633ajk.e.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new ZI.b(str, b);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZI.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            C2633ajk.e.d.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
