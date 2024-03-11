package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.YJ;

/* renamed from: o.abl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2201abl {
    public static final C2201abl d = new C2201abl();

    /* renamed from: o.abl$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<YJ.e> {
        public static final c b = new c();
        private static final List<String> e;

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public YJ.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(e) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.e, true)))).b(jsonReader, c9028hp);
            }
            return new YJ.e(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YJ.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(a.e, true)))).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    private C2201abl() {
    }

    /* renamed from: o.abl$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YJ.c> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YJ.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YJ.a aVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = e.b.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new YJ.c(str, num.intValue(), aVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YJ.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.e()));
            if (cVar.a() != null) {
                e.b.e(interfaceC9069id, c9028hp, cVar.a());
            }
        }
    }

    /* renamed from: o.abl$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YJ.a> {
        public static final e b = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("liveEvent");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public YJ.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YJ.b bVar = null;
            while (jsonReader.a(e) == 0) {
                bVar = (YJ.b) C8953gT.d(C8953gT.c(b.c, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new YJ.a(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YJ.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("liveEvent");
            C8953gT.d(C8953gT.c(b.c, false, 1, null)).e(interfaceC9069id, c9028hp, aVar.a());
        }
    }

    /* renamed from: o.abl$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YJ.b> {
        private static final List<String> b;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "waitingRoomMessage");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YJ.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new YJ.b(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YJ.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("waitingRoomMessage");
            C8953gT.t.e(interfaceC9069id, c9028hp, bVar.d());
        }
    }
}
