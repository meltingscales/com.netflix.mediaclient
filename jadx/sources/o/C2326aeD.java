package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C2624ajb;
import o.C2629ajg;
import o.C2636ajn;

/* renamed from: o.aeD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2326aeD {
    public static final C2326aeD a = new C2326aeD();

    /* renamed from: o.aeD$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC8949gP<C2324aeB> {
        public static final d c = new d();
        private static final List<String> d;

        private d() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_TITLE, SignupConstants.Field.VIDEO_ID, "isPlayable", "hasOriginalTreatment", "unifiedEntityId", "isInRemindMeList");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public C2324aeB b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            Integer num = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            Boolean bool3 = null;
            while (true) {
                switch (jsonReader.a(d)) {
                    case 0:
                        str = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 1:
                        str2 = C8953gT.t.b(jsonReader, c9028hp);
                        break;
                    case 2:
                        num = C8953gT.j.b(jsonReader, c9028hp);
                        break;
                    case 3:
                        bool = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 4:
                        bool2 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    case 5:
                        str3 = C8953gT.p.b(jsonReader, c9028hp);
                        break;
                    case 6:
                        bool3 = C8953gT.l.b(jsonReader, c9028hp);
                        break;
                    default:
                        jsonReader.q();
                        C2627aje b = C2629ajg.b.a.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2628ajf b2 = C2624ajb.d.b.b(jsonReader, c9028hp);
                        jsonReader.q();
                        C2635ajm b3 = C2636ajn.c.c.b(jsonReader, c9028hp);
                        if (str == null) {
                            C8956gW.a(jsonReader, "__typename");
                            throw new KotlinNothingValueException();
                        } else if (num != null) {
                            int intValue = num.intValue();
                            if (str3 != null) {
                                return new C2324aeB(str, str2, intValue, bool, bool2, str3, bool3, b, b2, b3);
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
        /* renamed from: b */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C2324aeB c2324aeB) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) c2324aeB, "");
            interfaceC9069id.e("__typename");
            InterfaceC8949gP<String> interfaceC8949gP = C8953gT.p;
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2324aeB.f());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_TITLE);
            C8953gT.t.e(interfaceC9069id, c9028hp, c2324aeB.a());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c2324aeB.b()));
            interfaceC9069id.e("isPlayable");
            C8994hH<Boolean> c8994hH = C8953gT.l;
            c8994hH.e(interfaceC9069id, c9028hp, c2324aeB.i());
            interfaceC9069id.e("hasOriginalTreatment");
            c8994hH.e(interfaceC9069id, c9028hp, c2324aeB.e());
            interfaceC9069id.e("unifiedEntityId");
            interfaceC8949gP.e(interfaceC9069id, c9028hp, c2324aeB.c());
            interfaceC9069id.e("isInRemindMeList");
            c8994hH.e(interfaceC9069id, c9028hp, c2324aeB.g());
            C2629ajg.b.a.e(interfaceC9069id, c9028hp, c2324aeB.h());
            C2624ajb.d.b.e(interfaceC9069id, c9028hp, c2324aeB.d());
            C2636ajn.c.c.e(interfaceC9069id, c9028hp, c2324aeB.j());
        }
    }

    private C2326aeD() {
    }
}
