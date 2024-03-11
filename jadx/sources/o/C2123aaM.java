package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C1361Ys;
import o.C2332aeJ;

/* renamed from: o.aaM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2123aaM {
    public static final C2123aaM b = new C2123aaM();

    /* renamed from: o.aaM$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C1361Ys.a> {
        public static final a c = new a();
        private static final List<String> d;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e(SignupConstants.Field.VIDEOS);
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1361Ys.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            List list = null;
            while (jsonReader.a(d) == 0) {
                list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).b(jsonReader, c9028hp);
            }
            return new C1361Ys.a(list);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1361Ys.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e(SignupConstants.Field.VIDEOS);
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.a(e.d, true)))).e(interfaceC9069id, c9028hp, aVar.d());
        }
    }

    private C2123aaM() {
    }

    /* renamed from: o.aaM$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C1361Ys.d> {
        private static final List<String> c;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C1361Ys.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1361Ys.e eVar = null;
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
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Season"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = c.a.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new C1361Ys.d(str, num.intValue(), eVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1361Ys.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.e()));
            if (dVar.a() != null) {
                c.a.e(interfaceC9069id, c9028hp, dVar.a());
            }
        }
    }

    /* renamed from: o.aaM$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C1361Ys.e> {
        public static final c a = new c();
        private static final List<String> b;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("episodes");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1361Ys.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C1361Ys.c cVar = null;
            while (jsonReader.a(b) == 0) {
                cVar = (C1361Ys.c) C8953gT.d(C8953gT.a(b.e, true)).b(jsonReader, c9028hp);
            }
            return new C1361Ys.e(cVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1361Ys.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("episodes");
            C8953gT.d(C8953gT.a(b.e, true)).e(interfaceC9069id, c9028hp, eVar.b());
        }
    }

    /* renamed from: o.aaM$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C1361Ys.c> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            b = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C1361Ys.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            jsonReader.q();
            C2328aeF b2 = C2332aeJ.b.d.b(jsonReader, c9028hp);
            if (str != null) {
                return new C1361Ys.c(str, b2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C1361Ys.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            C2332aeJ.b.d.e(interfaceC9069id, c9028hp, cVar.a());
        }
    }
}
