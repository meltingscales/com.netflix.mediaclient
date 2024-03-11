package o;

import com.apollographql.apollo3.api.json.JsonReader;
import java.util.List;
import o.C2414afm;
import o.C2429afs;
import o.YB;

/* renamed from: o.aaX  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2134aaX {
    public static final C2134aaX d = new C2134aaX();

    /* renamed from: o.aaX$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC8949gP<YB.b> {
        public static final b a = new b();
        private static final List<String> d;

        private b() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("pinotSectionByCursor");
            d = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YB.b b(JsonReader jsonReader, C9028hp c9028hp) {
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            YB.a aVar = null;
            while (jsonReader.a(d) == 0) {
                aVar = (YB.a) C8953gT.d(C8953gT.a(a.a, true)).b(jsonReader, c9028hp);
            }
            return new YB.b(aVar);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YB.b bVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) bVar, "");
            interfaceC9069id.e("pinotSectionByCursor");
            C8953gT.d(C8953gT.a(a.a, true)).e(interfaceC9069id, c9028hp, bVar.b());
        }
    }

    private C2134aaX() {
    }

    /* renamed from: o.aaX$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC8949gP<YB.a> {
        public static final a a = new a();
        private static final List<String> c;

        private a() {
        }

        static {
            List<String> e;
            e = C8566dqi.e("__typename");
            c = e;
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: a */
        public YB.a b(JsonReader jsonReader, C9028hp c9028hp) {
            C2415afn c2415afn;
            C8632dsu.c((Object) jsonReader, "");
            C8632dsu.c((Object) c9028hp, "");
            C2411afj c2411afj = null;
            String str = null;
            while (jsonReader.a(c) == 0) {
                str = C8953gT.p.b(jsonReader, c9028hp);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found".toString());
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotCreatorHomeSection", "PinotEntityNameListSection", "PinotGallerySection", "PinotListSection", "PinotPopularSearchesListSection", "PinotSearchHintsSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2415afn = C2429afs.b.e.b(jsonReader, c9028hp);
            } else {
                c2415afn = null;
            }
            if (C9014hb.d(C9014hb.c("PinotCarouselSection", "PinotGallerySection", "PinotListSection", "PinotSingleItemSection"), c9028hp.f, str, c9028hp.d, null)) {
                jsonReader.q();
                c2411afj = C2414afm.d.a.b(jsonReader, c9028hp);
            }
            return new YB.a(str, c2415afn, c2411afj);
        }

        @Override // o.InterfaceC8949gP
        /* renamed from: d */
        public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, YB.a aVar) {
            C8632dsu.c((Object) interfaceC9069id, "");
            C8632dsu.c((Object) c9028hp, "");
            C8632dsu.c((Object) aVar, "");
            interfaceC9069id.e("__typename");
            C8953gT.p.e(interfaceC9069id, c9028hp, aVar.e());
            if (aVar.b() != null) {
                C2429afs.b.e.e(interfaceC9069id, c9028hp, aVar.b());
            }
            if (aVar.d() != null) {
                C2414afm.d.a.e(interfaceC9069id, c9028hp, aVar.d());
            }
        }
    }
}
