package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.pushnotification.Payload;
import j$.time.Instant;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2461agX;

/* renamed from: o.agV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2459agV {
    public static final C2459agV b = new C2459agV();

    /* renamed from: o.agV$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<C2461agX> {
        private static final List<String> a;
        public static final b c = new b();

        private b() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "listId", Payload.PARAM_RENO_REFRESH_LIST_CONTEXT, SignupConstants.Field.VIDEO_TITLE, "trackId", "expires", "refreshInterval", "createTime", "sectionUid", "entitiesConnection", "titleIconId");
            a = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2461agX b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            Instant instant = null;
            Integer num2 = null;
            Instant instant2 = null;
            String str5 = null;
            C2461agX.d dVar = null;
            String str6 = null;
            while (true) {
                switch (jsonReader.a(a)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        str4 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        num = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        instant = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        break;
                    case 6:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 7:
                        instant2 = (Instant) C8953gT.d(C8950gQ.c).b(jsonReader, c9028hp);
                        break;
                    case 8:
                        str5 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 9:
                        dVar = (C2461agX.d) C8953gT.d(C8953gT.c(e.d, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    case 10:
                        str6 = (String) C8953gT.d(C8953gT.p).b(jsonReader, c9028hp);
                        break;
                    default:
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (str2 == null) {
                            C8956gW.a(jsonReader, "listId");
                            throw new KotlinNothingValueException();
                        } else if (str3 != null) {
                            return new C2461agX(str, str2, str3, str4, num, instant, num2, instant2, str5, dVar, str6);
                        } else {
                            C8956gW.a(jsonReader, Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2461agX c2461agX) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2461agX, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2461agX.m());
            interfaceC9069id.e("listId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2461agX.a());
            interfaceC9069id.e(Payload.PARAM_RENO_REFRESH_LIST_CONTEXT);
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2461agX.e());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8994hH<String> c8994hH = C8953gT.t;
            c8994hH.e(interfaceC9069id, c9028hp, c2461agX.i());
            interfaceC9069id.e("trackId");
            C8994hH<Integer> c8994hH2 = C8953gT.n;
            c8994hH2.e(interfaceC9069id, c9028hp, c2461agX.g());
            interfaceC9069id.e("expires");
            C8950gQ c8950gQ = C8950gQ.c;
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, c2461agX.c());
            interfaceC9069id.e("refreshInterval");
            c8994hH2.e(interfaceC9069id, c9028hp, c2461agX.f());
            interfaceC9069id.e("createTime");
            C8953gT.d(c8950gQ).e(interfaceC9069id, c9028hp, c2461agX.d());
            interfaceC9069id.e("sectionUid");
            c8994hH.e(interfaceC9069id, c9028hp, c2461agX.h());
            interfaceC9069id.e("entitiesConnection");
            C8953gT.d(C8953gT.c(e.d, false, 1, null)).e(interfaceC9069id, c9028hp, c2461agX.b());
            interfaceC9069id.e("titleIconId");
            C8953gT.d(interfaceC8949gP).e(interfaceC9069id, c9028hp, c2461agX.j());
        }
    }

    private C2459agV() {
    }

    /* renamed from: o.agV$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2461agX.d> {
        public static final e d = new e();
        private static final List<String> e;

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", "totalCount");
            e = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public C2461agX.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            while (true) {
                int a = jsonReader.a(e);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    num = C8953gT.n.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2461agX.d(str, num);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2461agX.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, dVar.a());
            interfaceC9069id.e("totalCount");
            C8953gT.n.e(interfaceC9069id, c9028hp, dVar.b());
        }
    }
}
