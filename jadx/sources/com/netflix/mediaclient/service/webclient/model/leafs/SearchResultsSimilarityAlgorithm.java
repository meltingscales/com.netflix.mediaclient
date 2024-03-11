package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_SearchResultsSimilarityAlgorithm;
import o.C8118deO;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes.dex */
public abstract class SearchResultsSimilarityAlgorithm {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<SearchResultsSimilarityAlgorithm> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    @SerializedName("jaroWinklerPrefixLengthLimit")
    public abstract int jaroWinklerPrefixLengthLimit();

    @SerializedName("jaroWinklerSimilarityThreshold")
    public abstract double jaroWinklerSimilarityThreshold();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SearchResultsSimilarityAlgorithm getDefault() {
            Object fromJson = C8118deO.a().fromJson((JsonElement) new JsonObject(), (Class<Object>) SearchResultsSimilarityAlgorithm.class);
            C8632dsu.a(fromJson, "");
            return (SearchResultsSimilarityAlgorithm) fromJson;
        }

        public final TypeAdapter<SearchResultsSimilarityAlgorithm> typeAdapter(Gson gson) {
            C8632dsu.c((Object) gson, "");
            AutoValue_SearchResultsSimilarityAlgorithm.GsonTypeAdapter defaultJaroWinklerPrefixLengthLimit = new AutoValue_SearchResultsSimilarityAlgorithm.GsonTypeAdapter(gson).setDefaultJaroWinklerSimilarityThreshold(0.87d).setDefaultJaroWinklerPrefixLengthLimit(0);
            C8632dsu.a(defaultJaroWinklerPrefixLengthLimit, "");
            return defaultJaroWinklerPrefixLengthLimit;
        }
    }
}
