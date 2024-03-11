package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2595aiz;

/* renamed from: o.aix  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2593aix {
    public static final C2593aix d = new C2593aix();

    /* renamed from: o.aix$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2595aiz> {
        private static final List<String> b;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "promoVideo");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2595aiz b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2595aiz.c cVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    cVar = (C2595aiz.c) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2595aiz(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2595aiz c2595aiz) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2595aiz, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2595aiz.c());
            interfaceC9069id.e("promoVideo");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2595aiz.d());
        }
    }

    private C2593aix() {
    }

    /* renamed from: o.aix$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2595aiz.c> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "video");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2595aiz.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2595aiz.d dVar = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2595aiz.d) C8953gT.d(C8953gT.a(b.b, true)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2595aiz.c(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2595aiz.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.a());
            interfaceC9069id.e("video");
            C8953gT.d(C8953gT.a(b.b, true)).e(interfaceC9069id, c9028hp, cVar.b());
        }
    }

    /* renamed from: o.aix$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2595aiz.d> {
        private static final List<String> a;
        public static final b b = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2595aiz.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2595aiz.e eVar = null;
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = d.e.b(jsonReader, c9028hp);
            }
            if (num != null) {
                return new C2595aiz.d(str, num.intValue(), eVar);
            }
            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2595aiz.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.e()));
            if (dVar.d() != null) {
                d.e.e(interfaceC9069id, c9028hp, dVar.d());
            }
        }
    }

    /* renamed from: o.aix$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2595aiz.e> {
        private static final List<String> c;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("runtimeSec");
            c = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2595aiz.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            while (jsonReader.a(c) == 0) {
                num = C8953gT.n.b(jsonReader, c9028hp);
            }
            return new C2595aiz.e(num);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2595aiz.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("runtimeSec");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.b());
        }
    }
}
