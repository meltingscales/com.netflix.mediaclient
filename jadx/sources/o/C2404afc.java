package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2403afb;
import o.C2593aix;

/* renamed from: o.afc  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2404afc {
    public static final C2404afc a = new C2404afc();

    /* renamed from: o.afc$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2403afb> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "unifiedEntityId", SignupConstants.Field.VIDEO_TITLE, "shortSynopsis", "taglineMessage");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2403afb b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            C2403afb.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    str3 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 3) {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 == 4) {
                    str5 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 5) {
                    break;
                } else {
                    dVar = (C2403afb.d) C8953gT.d(C8953gT.c(e.a, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            jsonReader.q();
            C2595aiz b = C2593aix.c.c.b(jsonReader, c9028hp);
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 == null) {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            } else if (str3 != null) {
                return new C2403afb(str, str2, str3, str4, str5, dVar, b);
            } else {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2403afb c2403afb) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2403afb, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2403afb.j());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2403afb.e());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2403afb.g());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2403afb.c());
            interfaceC9069id.e("shortSynopsis");
            c8994hH.e(interfaceC9069id, c9028hp, c2403afb.b());
            interfaceC9069id.e("taglineMessage");
            C8953gT.d(C8953gT.c(e.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2403afb.d());
            C2593aix.c.c.e(interfaceC9069id, c9028hp, c2403afb.a());
        }
    }

    private C2404afc() {
    }

    /* renamed from: o.afc$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2403afb.d> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "tagline", "classification");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2403afb.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2403afb.d(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2403afb.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.b());
            interfaceC9069id.e("tagline");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("classification");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.c());
        }
    }
}
