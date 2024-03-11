package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2288adS;
import o.C2363aeo;
import o.C2582aim;

/* renamed from: o.aen  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2362aen {
    public static final C2362aen e = new C2362aen();

    /* renamed from: o.aen$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<C2363aeo> {
        private static final List<String> b;
        public static final e d = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "number", "hasTitleBehavior", "displayNewBadge", "availabilityDateMessaging", "interestingArtworkSmall");
            b = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2363aeo b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            C2363aeo.e eVar = null;
            while (true) {
                switch (jsonReader.a(b)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num2 = C8953gT.n.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        eVar = (C2363aeo.e) C8953gT.d(C8953gT.c(a.e, false, 1, null)).b(jsonReader, c9028hp);
                        break;
                    default:
                        jsonReader.q();
                        C2287adR b2 = C2288adS.a.c.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2579aij b3 = C2582aim.d.a.b(jsonReader, c9028hp);
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            return new C2363aeo(str, num.intValue(), num2, bool, bool2, str2, eVar, b2, b3);
                        } else {
                            C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                            throw new KotlinNothingValueException();
                        }
                }
            }
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2363aeo c2363aeo) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2363aeo, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, c2363aeo.i());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2363aeo.j()));
            interfaceC9069id.e("number");
            C8953gT.n.e(interfaceC9069id, c9028hp, c2363aeo.f());
            interfaceC9069id.e("hasTitleBehavior");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2363aeo.c());
            interfaceC9069id.e("displayNewBadge");
            c8994hH.e(interfaceC9069id, c9028hp, c2363aeo.e());
            interfaceC9069id.e("availabilityDateMessaging");
            C8953gT.t.e(interfaceC9069id, c9028hp, c2363aeo.b());
            interfaceC9069id.e("interestingArtworkSmall");
            C8953gT.d(C8953gT.c(a.e, false, 1, null)).e(interfaceC9069id, c9028hp, c2363aeo.a());
            C2288adS.a.c.e(interfaceC9069id, c9028hp, c2363aeo.d());
            C2582aim.d.a.e(interfaceC9069id, c9028hp, c2363aeo.h());
        }
    }

    private C2362aen() {
    }

    /* renamed from: o.aen$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<C2363aeo.e> {
        private static final List<String> d;
        public static final a e = new a();

        private a() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.URL);
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public C2363aeo.e b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            String str2 = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a != 1) {
                    break;
                } else {
                    str2 = C8953gT.t.b(jsonReader, c9028hp);
                }
            }
            if (str != null) {
                return new C2363aeo.e(str, str2);
            }
            C8956gW.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2363aeo.e eVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) eVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, eVar.b());
            interfaceC9069id.e(SignupConstants.Field.URL);
            C8953gT.t.e(interfaceC9069id, c9028hp, eVar.c());
        }
    }
}
