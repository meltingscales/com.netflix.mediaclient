package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2317adv;
import o.C2571aib;
import o.C2574aie;
import o.C2634ajl;

/* renamed from: o.aif  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2575aif {
    public static final C2575aif c = new C2575aif();

    /* renamed from: o.aif$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC8949gP<C2574aie> {
        public static final i a = new i();
        private static final List<String> b;

        private i() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            b = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2574aie b(JsonReader jsonReader, C9028hp c9028hp) {
            C2574aie.b bVar;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2637ajo c2637ajo = null;
            String str = null;
            while (jsonReader.a(b) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("Episode"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                bVar = a.d.b(jsonReader, c9028hp);
            } else {
                bVar = null;
            }
            if (C9014hb.d(C9014hb.c("Episode", "Movie", "Supplemental"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2637ajo = C2634ajl.a.a.b(jsonReader, c9028hp);
            }
            C2637ajo c2637ajo2 = c2637ajo;
            jsonReader.q();
            C2512ahV b2 = C2571aib.b.e.b(jsonReader, c9028hp);
            jsonReader.q();
            return new C2574aie(str, bVar, c2637ajo2, b2, C2317adv.d.e.b(jsonReader, c9028hp));
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie c2574aie) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2574aie, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2574aie.e());
            if (c2574aie.c() != null) {
                a.d.e(interfaceC9069id, c9028hp, c2574aie.c());
            }
            if (c2574aie.d() != null) {
                C2634ajl.a.a.e(interfaceC9069id, c9028hp, c2574aie.d());
            }
            C2571aib.b.e.e(interfaceC9069id, c9028hp, c2574aie.a());
            C2317adv.d.e.e(interfaceC9069id, c9028hp, c2574aie.b());
        }
    }

    private C2575aif() {
    }

    /* renamed from: o.aif$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2574aie.b> {
        private static final List<String> a;
        public static final a d = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("supportsInteractiveExperiences", "isPlayable", "mdxBoxart", SignupConstants.Field.VIDEO_ID, "__typename", "parentShow", "nextEpisode");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2574aie.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            C2574aie.a aVar = null;
            String str = null;
            C2574aie.c cVar = null;
            C2574aie.d dVar = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        aVar = (C2574aie.a) C8953gT.d(C8953gT.c(c.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        cVar = (C2574aie.c) C8953gT.d(C8953gT.c(d.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        dVar = (C2574aie.d) C8953gT.d(C8953gT.c(b.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (num != null) {
                            int intValue = num.intValue();
                            if (str != null) {
                                return new C2574aie.b(bool, bool2, aVar, intValue, str, cVar, dVar);
                            }
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        }
                        C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("supportsInteractiveExperiences");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, bVar.a());
            interfaceC9069id.e("isPlayable");
            c8994hH.e(interfaceC9069id, c9028hp, bVar.g());
            interfaceC9069id.e("mdxBoxart");
            C8953gT.d(C8953gT.c(c.d, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.c()));
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.j());
            interfaceC9069id.e("parentShow");
            C8953gT.d(C8953gT.c(d.e, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e("nextEpisode");
            C8953gT.d(C8953gT.c(b.e, false, 1, null)).e(interfaceC9069id, c9028hp, bVar.d());
        }
    }

    /* renamed from: o.aif$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2574aie.a> {
        private static final List<String> c;
        public static final c d = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL, SignupConstants.Error.DEBUG_FIELD_KEY);
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2574aie.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int a = jsonReader.a(c);
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
                return new C2574aie.a(str, str2, str3);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.c());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, aVar.e());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            c8994hH.e(interfaceC9069id, c9028hp, aVar.b());
        }
    }

    /* renamed from: o.aif$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2574aie.c> {
        private static final List<String> a;
        public static final d e = new d();

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "currentEpisode");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2574aie.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            C2574aie.e eVar = null;
            while (true) {
                int a2 = jsonReader.a(a);
                if (a2 == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a2 == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a2 != 2) {
                    break;
                } else {
                    eVar = (C2574aie.e) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2574aie.c(str, num.intValue(), eVar);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(cVar.c()));
            interfaceC9069id.e("currentEpisode");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, cVar.a());
        }
    }

    /* renamed from: o.aif$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2574aie.e> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2574aie.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2574aie.e(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(eVar.c()));
        }
    }

    /* renamed from: o.aif$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2574aie.d> {
        private static final List<String> b;
        public static final b e = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID);
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public C2574aie.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(b);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new C2574aie.d(str, num.intValue());
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2574aie.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(dVar.d()));
        }
    }
}
