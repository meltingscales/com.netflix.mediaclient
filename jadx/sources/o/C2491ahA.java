package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2542ahz;

/* renamed from: o.ahA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2491ahA {
    public static final C2491ahA e = new C2491ahA();

    /* renamed from: o.ahA$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2542ahz> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "creatorCollection");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2542ahz b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2542ahz.d dVar = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    dVar = (C2542ahz.d) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2542ahz(str, dVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2542ahz c2542ahz) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2542ahz, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2542ahz.a());
            interfaceC9069id.e("creatorCollection");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2542ahz.e());
        }
    }

    private C2491ahA() {
    }

    /* renamed from: o.ahA$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2542ahz.d> {
        private static final List<String> b;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, SignupConstants.Field.VIDEO_TITLE, "unifiedEntityId", "artwork");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2542ahz.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            C2542ahz.a aVar = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 3) {
                    str4 = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 4) {
                    break;
                } else {
                    aVar = (C2542ahz.a) C8953gT.d(C8953gT.c(c.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (str2 == null) {
                C8956gW.a(jsonReader, SignupConstants.Field.LANG_ID);
                throw new KotlinNothingValueException();
            } else if (str4 != null) {
                return new C2542ahz.d(str, str2, str3, str4, aVar);
            } else {
                C8956gW.a(jsonReader, "unifiedEntityId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2542ahz.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(c.e, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    /* renamed from: o.ahA$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2542ahz.a> {
        private static final List<String> c;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL, "type");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2542ahz.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a == 2) {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 3) {
                    break;
                } else {
                    str4 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2542ahz.a(str, str2, str3, str4);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2542ahz.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.b());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, aVar.e());
        }
    }
}
