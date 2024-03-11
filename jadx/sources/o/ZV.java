package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.XT;

/* loaded from: classes3.dex */
public final class ZV {
    public static final ZV c = new ZV();

    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<XT.c> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("addToPlaylist");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XT.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            XT.a aVar = null;
            while (jsonReader.a(b) == 0) {
                aVar = (XT.a) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new XT.c(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XT.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("addToPlaylist");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    private ZV() {
    }

    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<XT.a> {
        private static final List<String> a;
        public static final c b = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isInPlaylist", "isInRemindMeList");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public XT.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new XT.a(str, num.intValue(), bool, bool2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, XT.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.e()));
            interfaceC9069id.e("isInPlaylist");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.d());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }
}
