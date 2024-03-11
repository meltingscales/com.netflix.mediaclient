package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1344Yb;

/* loaded from: classes3.dex */
public final class ZW {
    public static final ZW e = new ZW();

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1344Yb.c> {
        private static final List<String> c;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("addToRemindMe");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1344Yb.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1344Yb.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (C1344Yb.b) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1344Yb.c(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1344Yb.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("addToRemindMe");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    private ZW() {
    }

    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1344Yb.b> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isInPlaylist", "isInRemindMeList");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C1344Yb.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a2 = jsonReader.a(c);
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
                return new C1344Yb.b(str, num.intValue(), bool, bool2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1344Yb.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.e()));
            interfaceC9069id.e("isInPlaylist");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.b());
        }
    }
}
