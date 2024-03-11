package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1380Ze;
import o.C2317adv;
import o.C2571aib;

/* renamed from: o.abY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2188abY {
    public static final C2188abY d = new C2188abY();

    /* renamed from: o.abY$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1380Ze.e> {
        private static final List<String> b;
        public static final d d = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1380Ze.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(b) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.e, true)))).b(jsonReader, c9028hp);
            }
            return new C1380Ze.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1380Ze.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(c.e, true)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2188abY() {
    }

    /* renamed from: o.abY$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1380Ze.b> {
        private static final List<String> c;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1380Ze.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2512ahV b = C2571aib.b.e.b(jsonReader, c9028hp);
            jsonReader.q();
            C2315adt b2 = C2317adv.d.e.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1380Ze.b(str, num.intValue(), b, b2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1380Ze.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.c()));
            C2571aib.b.e.e(interfaceC9069id, c9028hp, bVar.b());
            C2317adv.d.e.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
