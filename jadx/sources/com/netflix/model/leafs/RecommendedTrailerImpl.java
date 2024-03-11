package com.netflix.model.leafs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import o.AbstractC0941Im;
import o.C1045Mp;
import o.C1596aHd;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC0952Ix;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dqE;

/* loaded from: classes5.dex */
public final class RecommendedTrailerImpl extends AbstractC0941Im implements InterfaceC0952Ix, RecommendedTrailer {
    public static final Companion Companion = new Companion(null);
    private int runtime;
    private String id = "";
    private String type = "";
    private String computeId = "";
    private String interestingUrl = "";

    public static final RecommendedTrailer fromJson(JsonElement jsonElement) {
        return Companion.fromJson(jsonElement);
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoId() {
        return this.id;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoInterestingUrl() {
        return this.interestingUrl;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoMerchComputeId() {
        return this.computeId;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public int getSupplementalVideoRuntime() {
        return this.runtime;
    }

    @Override // com.netflix.model.leafs.RecommendedTrailer
    public String getSupplementalVideoType() {
        return this.type;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("RecommendedTrailerImpl");
        }

        public final RecommendedTrailer fromJson(JsonElement jsonElement) {
            C8632dsu.c((Object) jsonElement, "");
            RecommendedTrailerImpl recommendedTrailerImpl = new RecommendedTrailerImpl();
            recommendedTrailerImpl.populate(jsonElement);
            return recommendedTrailerImpl;
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Map d;
        Map k;
        Throwable th;
        String str = "";
        C8632dsu.c((Object) jsonElement, "");
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = asJsonObject.get("supplementalVideoId");
            String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            if (asString == null) {
                asString = "";
            }
            this.id = asString;
            JsonElement jsonElement3 = asJsonObject.get("supplementalVideoType");
            String asString2 = jsonElement3 != null ? jsonElement3.getAsString() : null;
            if (asString2 != null) {
                str = asString2;
            }
            this.type = str;
            JsonElement jsonElement4 = asJsonObject.get("supplementalVideoMerchComputeId");
            this.computeId = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = asJsonObject.get("supplementalVideoRuntime");
            this.runtime = jsonElement5 != null ? jsonElement5.getAsInt() : 0;
            JsonElement jsonElement6 = asJsonObject.get("supplementalVideoInterestingUrl");
            this.interestingUrl = jsonElement6 != null ? jsonElement6.getAsString() : null;
        } catch (IllegalStateException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.m;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("RecommendedTrailer response is malformed. Error Parsing it. ", e, errorType, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd.a;
            if (errorType2 != null) {
                c1596aHd.e.put("errorType", errorType2.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType2.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }
}
