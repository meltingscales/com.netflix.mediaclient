package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.ZE;

/* renamed from: o.acT  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2236acT {
    public static final C2236acT a = new C2236acT();

    /* renamed from: o.acT$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC8949gP<ZE.d> {
        public static final c b = new c();
        private static final List<String> d;

        private c() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("setThumbRating");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZE.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            ZE.b bVar = null;
            while (jsonReader.a(d) == 0) {
                bVar = (ZE.b) C8953gT.d(C8953gT.c(e.e, false, 1, null)).b(jsonReader, c9028hp);
            }
            return new ZE.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZE.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("setThumbRating");
            C8953gT.d(C8953gT.c(e.e, false, 1, null)).e(interfaceC9069id, c9028hp, dVar.d());
        }
    }

    private C2236acT() {
    }

    /* renamed from: o.acT$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<ZE.b> {
        private static final List<String> d;
        public static final e e = new e();

        private e() {
        }

        static {
            List<String> j;
            j = C8569dql.j("__typename", SignupConstants.Field.VIDEO_ID, "thumbRatingV2");
            d = j;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: e */
        public ZE.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            String str = null;
            Integer num = null;
            ThumbRating thumbRating = null;
            while (true) {
                int a = jsonReader.a(d);
                if (a == 0) {
                    str = C8953gT.p.b(jsonReader, c9028hp);
                } else if (a == 1) {
                    num = C8953gT.j.b(jsonReader, c9028hp);
                } else if (a != 2) {
                    break;
                } else {
                    thumbRating = (ThumbRating) C8953gT.d(C3456azN.d).b(jsonReader, c9028hp);
                }
            }
            if (str == null) {
                C8956gW.a(jsonReader, "__typename");
                throw new KotlinNothingValueException();
            } else if (num != null) {
                return new ZE.b(str, num.intValue(), thumbRating);
            } else {
                C8956gW.a(jsonReader, SignupConstants.Field.VIDEO_ID);
                throw new KotlinNothingValueException();
            }
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ZE.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.b());
            interfaceC9069id.e(SignupConstants.Field.VIDEO_ID);
            C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(bVar.c()));
            interfaceC9069id.e("thumbRatingV2");
            C8953gT.d(C3456azN.d).e(interfaceC9069id, c9028hp, bVar.a());
        }
    }
}
