package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1399Zx;

/* renamed from: o.acL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2228acL {
    public static final C2228acL e = new C2228acL();

    /* renamed from: o.acL$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1399Zx.e> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("removeFromPlaylist");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1399Zx.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1399Zx.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (C1399Zx.b) C8953gT.d(C8953gT.c(c.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1399Zx.e(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1399Zx.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("removeFromPlaylist");
            C8953gT.d(C8953gT.c(c.e, false, 1, null)).e(interfaceC9069id, c9028hp, eVar.d());
        }
    }

    private C2228acL() {
    }

    /* renamed from: o.acL$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1399Zx.b> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isInPlaylist", "isInRemindMeList");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1399Zx.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    bool2 = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1399Zx.b(str, num.intValue(), bool, bool2);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1399Zx.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.a()));
            interfaceC9069id.e("isInPlaylist");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.c());
        }
    }
}
