package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2534ahr;

/* renamed from: o.ahs  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2535ahs {
    public static final C2535ahs d = new C2535ahs();

    /* renamed from: o.ahs$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<C2534ahr> {
        private static final List<String> c;
        public static final c e = new c();

        private c() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "gameId", "unifiedEntityId", "urlScheme", SignupConstants.Field.VIDEO_TITLE, "tags", "androidInstallation", "artwork");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2534ahr b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            List list = null;
            C2534ahr.e eVar = null;
            C2534ahr.d dVar = null;
            while (true) {
                switch (jsonReader.a(c)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        list = (List) C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.b, false, 1, null)))).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (C2534ahr.e) C8953gT.d(C8953gT.c(d.c, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 7:
                        dVar = (C2534ahr.d) C8953gT.d(C8953gT.c(b.b, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str2 != null) {
                                return new C2534ahr(str, intValue, str2, str3, str4, list, eVar, dVar);
                            }
                            C8956gW.a(jsonReader, "unifiedEntityId");
                            throw new KotlinNothingValueException();
                        } else {
                            C8956gW.a(jsonReader, "gameId");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2534ahr c2534ahr) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2534ahr, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2534ahr.f());
            interfaceC9069id.e("gameId");
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2534ahr.a()));
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2534ahr.i());
            interfaceC9069id.e("urlScheme");
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2534ahr.g());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            c8994hH.e(interfaceC9069id, c9028hp, c2534ahr.b());
            interfaceC9069id.e("tags");
            C8953gT.d(C8953gT.a(C8953gT.d(C8953gT.c(a.b, false, 1, null)))).e(interfaceC9069id, c9028hp, c2534ahr.d());
            interfaceC9069id.e("androidInstallation");
            C8953gT.d(C8953gT.c(d.c, false, 1, null)).e(interfaceC9069id, c9028hp, c2534ahr.e());
            interfaceC9069id.e("artwork");
            C8953gT.d(C8953gT.c(b.b, false, 1, null)).e(interfaceC9069id, c9028hp, c2534ahr.c());
        }
    }

    private C2535ahs() {
    }

    /* renamed from: o.ahs$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2534ahr.c> {
        public static final a b = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.LANG_ID, "displayName");
            c = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2534ahr.c b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(c);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2534ahr.c(str, num, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2534ahr.c cVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) cVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, cVar.b());
            interfaceC9069id.e(SignupConstants.Field.LANG_ID);
            C8953gT.n.e(interfaceC9069id, c9028hp, cVar.d());
            interfaceC9069id.e("displayName");
            C8953gT.t.e(interfaceC9069id, c9028hp, cVar.e());
        }
    }

    /* renamed from: o.ahs$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2534ahr.e> {
        public static final d c = new d();
        private static final List<String> e;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "minMemoryGb", "minSdkVersion", "packageSizeInMb", "numProcessors", "packageName", "appStoreUrl");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2534ahr.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num3 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num4 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str2 != null) {
                            return new C2534ahr.e(str, num, num2, num3, num4, str2, str3);
                        } else {
                            C8956gW.a(jsonReader, "packageName");
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2534ahr.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.g());
            interfaceC9069id.e("minMemoryGb");
            C8994hH<Integer> c8994hH = C8953gT.n;
            c8994hH.e(interfaceC9069id, c9028hp, eVar.c());
            interfaceC9069id.e("minSdkVersion");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e("packageSizeInMb");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.h());
            interfaceC9069id.e("numProcessors");
            c8994hH.e(interfaceC9069id, c9028hp, eVar.d());
            interfaceC9069id.e("packageName");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, eVar.e());
            interfaceC9069id.e("appStoreUrl");
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.a());
        }
    }

    /* renamed from: o.ahs$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2534ahr.d> {
        public static final b b = new b();
        private static final List<String> e;

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Error.DEBUG_FIELD_KEY, SignupConstants.Field.URL, InteractiveAnimation.ANIMATION_TYPE.WIDTH, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, "type", "available", InteractiveAnimation.ANIMATION_TYPE.SCALE);
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2534ahr.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            String str4 = null;
            Boolean bool = null;
            Double d = null;
            while (true) {
                switch (jsonReader.a(e)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        d = C8953gT.k.b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str != null) {
                            return new C2534ahr.d(str, str2, str3, num, num2, str4, bool, d);
                        }
                        C8956gW.a(jsonReader, "__typename");
                        throw new KotlinNothingValueException();
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2534ahr.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.j());
            interfaceC9069id.e(SignupConstants.Error.DEBUG_FIELD_KEY);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e(SignupConstants.Field.URL);
            c8994hH.e(interfaceC9069id, c9028hp, dVar.h());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.g());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            c8994hH2.e(interfaceC9069id, c9028hp, dVar.c());
            interfaceC9069id.e("type");
            c8994hH.e(interfaceC9069id, c9028hp, dVar.e());
            interfaceC9069id.e("available");
            C8953gT.l.e(interfaceC9069id, c9028hp, dVar.d());
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.SCALE);
            C8953gT.k.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
