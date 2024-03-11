package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2431afu;
import o.C2511ahU;

/* renamed from: o.aft  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2430aft {
    public static final C2430aft d = new C2430aft();

    /* renamed from: o.aft$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2431afu> {
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntity", "image", SignupConstants.Field.VIDEO_TITLE);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2431afu b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2431afu.a aVar = null;
            C2431afu.b bVar = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    aVar = (C2431afu.a) C8953gT.d(C8953gT.a(d.c, true)).b(jsonReader, c9028hp);
                } else if (a == 2) {
                    bVar = (C2431afu.b) C8953gT.d(C8953gT.c(c.b, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2431afu(str, aVar, bVar, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2431afu c2431afu) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2431afu, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2431afu.e());
            interfaceC9069id.e("unifiedEntity");
            C8953gT.d(C8953gT.a(d.c, true)).e(interfaceC9069id, c9028hp, c2431afu.c());
            interfaceC9069id.e("image");
            C8953gT.d(C8953gT.c(c.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2431afu.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2431afu.a());
        }
    }

    private C2430aft() {
    }

    /* renamed from: o.aft$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2431afu.a> {
        private static final List<String> b;
        public static final d c = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "unifiedEntityId");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2431afu.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2431afu.e eVar = null;
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Season", "Show", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                eVar = b.a.b(jsonReader, c9028hp);
            }
            if (str2 != null) {
                return new C2431afu.a(str, str2, eVar);
            }
            C8956gW.a(jsonReader, "unifiedEntityId");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2431afu.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, aVar.b());
            if (aVar.a() != null) {
                b.a.e(interfaceC9069id, c9028hp, aVar.a());
            }
        }
    }

    /* renamed from: o.aft$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2431afu.e> {
        public static final b a = new b();

        private b() {
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2431afu.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            jsonReader.q();
            return new C2431afu.e(C2511ahU.e.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2431afu.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            C2511ahU.e.e.e(interfaceC9069id, c9028hp, eVar.e());
        }
    }

    /* renamed from: o.aft$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2431afu.b> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY, InteractiveAnimation.ANIMATION_TYPE.WIDTH, "type");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2431afu.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2431afu.b(str, str2, str3, num, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2431afu.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.d());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, bVar.c());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            C8953gT.n.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.e());
        }
    }
}
