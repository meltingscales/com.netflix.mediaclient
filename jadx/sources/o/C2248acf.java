package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1383Zh;
import o.C2516ahZ;
import o.C2582aim;

/* renamed from: o.acf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2248acf {
    public static final C2248acf a = new C2248acf();

    /* renamed from: o.acf$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1383Zh.b> {
        private static final List<String> d;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e(SignupConstants.Field.VIDEOS);
            d = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C1383Zh.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).b(jsonReader, c9028hp);
            }
            return new C1383Zh.b(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1383Zh.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(d.a, true)))).e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    private C2248acf() {
    }

    /* renamed from: o.acf$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C1383Zh.c> {
        public static final d a = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1383Zh.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1383Zh.a aVar = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                aVar = a.a.b(jsonReader, c9028hp);
            }
            return new C1383Zh.c(str, aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1383Zh.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            if (cVar.a() != null) {
                a.a.e(interfaceC9069id, c9028hp, cVar.a());
            }
        }
    }

    /* renamed from: o.acf$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1383Zh.a> {
        public static final a a = new a();
        private static final List<String> b;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "nextEpisode");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1383Zh.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C1383Zh.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(b);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    eVar = (C1383Zh.e) C8953gT.d(C8953gT.a(c.e, true)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C1383Zh.a(str, num.intValue(), eVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1383Zh.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(aVar.c()));
            interfaceC9069id.e("nextEpisode");
            C8953gT.d(C8953gT.a(c.e, true)).e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.acf$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1383Zh.e> {
        private static final List<String> b;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1383Zh.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2579aij b2 = C2582aim.d.a.b(jsonReader, c9028hp);
            jsonReader.q();
            C2572aic b3 = C2516ahZ.d.e.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1383Zh.e(str, b2, b3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1383Zh.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.e());
            C2582aim.d.a.e(interfaceC9069id, c9028hp, eVar.b());
            C2516ahZ.d.e.e(interfaceC9069id, c9028hp, eVar.d());
        }
    }
}
