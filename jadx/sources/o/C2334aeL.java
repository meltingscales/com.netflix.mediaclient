package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2335aeM;

/* renamed from: o.aeL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2334aeL {
    public static final C2334aeL d = new C2334aeL();

    /* renamed from: o.aeL$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2335aeM> {
        public static final e a = new e();
        private static final List<String> d;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId", "promoVideo", "heroImageAsset");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2335aeM b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2335aeM.b bVar = null;
            C2335aeM.d dVar = null;
            while (true) {
                int a2 = jsonReader.a(d);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 == 2) {
                    bVar = (C2335aeM.b) C8953gT.d(C8953gT.c(a.a, false, 1, null)).b(jsonReader, c9028hp);
                } else if (a2 != 3) {
                    break;
                } else {
                    dVar = (C2335aeM.d) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2335aeM(str, num.intValue(), bVar, dVar);
            } else {
                C8956gW.a(jsonReader, "gameId");
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2335aeM c2335aeM) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2335aeM, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2335aeM.e());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2335aeM.b()));
            interfaceC9069id.e("promoVideo");
            C8953gT.d(C8953gT.c(a.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2335aeM.c());
            interfaceC9069id.e("heroImageAsset");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2335aeM.d());
        }
    }

    private C2334aeL() {
    }

    /* renamed from: o.aeL$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2335aeM.b> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "video");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2335aeM.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            C2335aeM.c cVar = null;
            while (true) {
                int a2 = jsonReader.a(c);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 != 1) {
                    break;
                } else {
                    cVar = (C2335aeM.c) C8953gT.d(C8953gT.c(c.c, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2335aeM.b(str, cVar);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2335aeM.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("video");
            C8953gT.d(C8953gT.c(c.c, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
        }
    }

    /* renamed from: o.aeL$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2335aeM.c> {
        private static final List<String> a;
        public static final c c = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2335aeM.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
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
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2335aeM.c(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2335aeM.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.d()));
        }
    }

    /* renamed from: o.aeL$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2335aeM.d> {
        private static final List<String> d;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2335aeM.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str3 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2335aeM.d(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2335aeM.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
