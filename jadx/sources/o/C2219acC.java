package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1394Zs;

/* renamed from: o.acC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2219acC {
    public static final C2219acC a = new C2219acC();

    /* renamed from: o.acC$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1394Zs.b> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("removeFromRemindMe");
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1394Zs.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1394Zs.d dVar = null;
            while (jsonReader.a(d) == 0) {
                dVar = (C1394Zs.d) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new C1394Zs.b(dVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1394Zs.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("removeFromRemindMe");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    private C2219acC() {
    }

    /* renamed from: o.acC$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1394Zs.d> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "isInRemindMeList");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1394Zs.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Boolean bool = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    bool = C8953gT.l.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1394Zs.d(str, num.intValue(), bool);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1394Zs.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
            interfaceC9069id.e("isInRemindMeList");
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.a());
        }
    }
}
