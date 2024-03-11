package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2547aiD;

/* renamed from: o.aiE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2548aiE {
    public static final C2548aiE e = new C2548aiE();

    /* renamed from: o.aiE$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2547aiD> {
        public static final b b = new b();
        private static final List<String> c;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, SignupConstants.Field.VIDEO_TITLE, "unifiedEntityId", "number", "seasonSeq", "releaseYear", "parentShow", "episodesToGetCount");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2547aiD b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            String str4 = null;
            Integer num3 = null;
            C2547aiD.b bVar = null;
            C2547aiD.e eVar = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        bVar = (C2547aiD.b) C8953gT.d(C8953gT.c(c.a, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        eVar = (C2547aiD.e) C8953gT.d(C8953gT.c(e.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str3 != null) {
                                return new C2547aiD(str, intValue, str2, str3, num2, str4, num3, bVar, eVar);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        } else {
                            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2547aiD c2547aiD) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2547aiD, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2547aiD.i());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2547aiD.j()));
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2547aiD.g());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2547aiD.h());
            interfaceC9069id.e("number");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, c2547aiD.c());
            interfaceC9069id.e("seasonSeq");
            c8994hH.e(interfaceC9069id, c9028hp, c2547aiD.d());
            interfaceC9069id.e("releaseYear");
            c8994hH2.e(interfaceC9069id, c9028hp, c2547aiD.a());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(c.a, false, 1, null)).e(interfaceC9069id, c9028hp, c2547aiD.e());
            interfaceC9069id.e("episodesToGetCount");
            C8953gT.d(C8953gT.c(e.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2547aiD.b());
        }
    }

    private C2548aiE() {
    }

    /* renamed from: o.aiE$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2547aiD.b> {
        public static final c a = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2547aiD.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a2 = jsonReader.a(d);
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
                return new C2547aiD.b(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2547aiD.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.d()));
        }
    }

    /* renamed from: o.aiE$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2547aiD.e> {
        private static final List<String> a;
        public static final e c = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2547aiD.e b(JsonReader jsonReader, C9028hp c9028hp) {
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
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2547aiD.e(str, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2547aiD.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
