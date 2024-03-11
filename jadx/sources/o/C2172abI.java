package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2496ahF;
import o.C2497ahG;
import o.YV;

/* renamed from: o.abI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2172abI {
    public static final C2172abI d = new C2172abI();

    /* renamed from: o.abI$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC8949gP<YV.d> {
        public static final e a = new e();
        private static final List<String> c;

        private e() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotSectionByCursor");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: c */
        public YV.d b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YV.b bVar = null;
            while (jsonReader.a(c) == 0) {
                bVar = (YV.b) C8953gT.d(C8953gT.a(a.b, true)).b(jsonReader, c9028hp);
            }
            return new YV.d(bVar);
        }

        @Override // o.InterfaceC8949gP
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YV.d dVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) dVar, "");
            interfaceC9069id.e("pinotSectionByCursor");
            C8953gT.d(C8953gT.a(a.b, true)).e(interfaceC9069id, c9028hp, dVar.b());
        }
    }

    private C2172abI() {
    }

    /* renamed from: o.abI$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YV.b> {
        public static final a b = new a();
        private static final List<String> e;

        private a() {
        }

        static {
            List<String> e2;
            e2 = C8566dqi.e("__typename");
            e = e2;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YV.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C2499ahI c2499ahI;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2498ahH c2498ahH = null;
            String str = null;
            while (jsonReader.a(e) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2499ahI = C2497ahG.e.b.b(jsonReader, c9028hp);
            } else {
                c2499ahI = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2498ahH = C2496ahF.a.e.b(jsonReader, c9028hp);
            }
            return new YV.b(str, c2499ahI, c2498ahH);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YV.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, bVar.d());
            if (bVar.c() != null) {
                C2497ahG.e.b.e(interfaceC9069id, c9028hp, bVar.c());
            }
            if (bVar.e() != null) {
                C2496ahF.a.e.e(interfaceC9069id, c9028hp, bVar.e());
            }
        }
    }
}
