package o;

import com.netflix.model.leafs.RecommendedTrailer;
import o.C2595aiz;
import o.aEX;

/* renamed from: o.aEo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1526aEo {
    public static final RecommendedTrailer d(C2595aiz c2595aiz) {
        C2595aiz.c d = c2595aiz != null ? c2595aiz.d() : null;
        if (c2595aiz == null || d == null) {
            return null;
        }
        return new e(d);
    }

    /* renamed from: o.aEo$e */
    /* loaded from: classes3.dex */
    public static final class e implements RecommendedTrailer {
        final /* synthetic */ C2595aiz.c a;
        private final String d;
        private final String e;

        @Override // com.netflix.model.leafs.RecommendedTrailer
        public String getSupplementalVideoInterestingUrl() {
            return this.e;
        }

        @Override // com.netflix.model.leafs.RecommendedTrailer
        public String getSupplementalVideoMerchComputeId() {
            return this.d;
        }

        e(C2595aiz.c cVar) {
            this.a = cVar;
        }

        @Override // com.netflix.model.leafs.RecommendedTrailer
        public String getSupplementalVideoId() {
            C2595aiz.d b = this.a.b();
            return String.valueOf(b != null ? Integer.valueOf(b.e()) : null);
        }

        @Override // com.netflix.model.leafs.RecommendedTrailer
        public String getSupplementalVideoType() {
            aEX.e eVar = aEX.a;
            C2595aiz.d b = this.a.b();
            return eVar.c((b == null || (r1 = b.c()) == null) ? "" : "").name();
        }

        @Override // com.netflix.model.leafs.RecommendedTrailer
        public int getSupplementalVideoRuntime() {
            C2595aiz.e d;
            Integer b;
            C2595aiz.d b2 = this.a.b();
            if (b2 == null || (d = b2.d()) == null || (b = d.b()) == null) {
                return 0;
            }
            return b.intValue();
        }
    }
}
