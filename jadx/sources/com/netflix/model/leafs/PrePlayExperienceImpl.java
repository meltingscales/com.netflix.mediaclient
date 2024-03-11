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
public final class PrePlayExperienceImpl extends AbstractC0941Im implements InterfaceC0952Ix, PrePlayExperience {
    public static final Companion Companion = new Companion(null);
    private boolean autoPlayInternal;
    private String impressionDataInternal;
    private String prePlayVideoIdInternal;
    private int trackIdInternal = -1;
    private String typeInternal;
    private String uiLabelInternal;

    public static final PrePlayExperience fromJson(JsonElement jsonElement) {
        return Companion.fromJson(jsonElement);
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public boolean getAutoPlay() {
        return this.autoPlayInternal;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getImpressionData() {
        return this.impressionDataInternal;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getPrePlayVideoId() {
        return this.prePlayVideoIdInternal;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public int getTrackId() {
        return this.trackIdInternal;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getType() {
        return this.typeInternal;
    }

    @Override // com.netflix.model.leafs.PrePlayExperience
    public String getUiLabel() {
        return this.uiLabelInternal;
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("PrePlayExperienceImpl");
        }

        public final PrePlayExperience fromJson(JsonElement jsonElement) {
            C8632dsu.c((Object) jsonElement, "");
            PrePlayExperienceImpl prePlayExperienceImpl = new PrePlayExperienceImpl();
            prePlayExperienceImpl.populate(jsonElement);
            return prePlayExperienceImpl;
        }
    }

    @Override // o.InterfaceC0952Ix
    public void populate(JsonElement jsonElement) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) jsonElement, "");
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = asJsonObject.get("type");
            this.typeInternal = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = asJsonObject.get("autoplay");
            this.autoPlayInternal = jsonElement3 != null ? jsonElement3.getAsBoolean() : false;
            JsonElement jsonElement4 = asJsonObject.get("uiLabel");
            this.uiLabelInternal = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = asJsonObject.get("prePlayVideoId");
            this.prePlayVideoIdInternal = jsonElement5 != null ? jsonElement5.getAsString() : null;
            JsonElement jsonElement6 = asJsonObject.get("impressionData");
            this.impressionDataInternal = jsonElement6 != null ? jsonElement6.getAsString() : null;
            JsonElement jsonElement7 = asJsonObject.get("trackId");
            this.trackIdInternal = jsonElement7 != null ? jsonElement7.getAsInt() : -590;
        } catch (IllegalStateException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            ErrorType errorType = ErrorType.m;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("PlayExperience response is malformed. Error Parsing it. ", e, errorType, true, k, false, false, 96, null);
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
