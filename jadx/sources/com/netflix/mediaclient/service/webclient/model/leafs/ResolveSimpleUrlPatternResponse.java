package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_ResolveSimpleUrlPatternResponse;
import com.netflix.mediaclient.service.webclient.model.leafs.C$AutoValue_ResolveSimpleUrlPatternResponse;

/* loaded from: classes.dex */
public abstract class ResolveSimpleUrlPatternResponse {

    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract ResolveSimpleUrlPatternResponse build();

        public abstract Builder error(String str);

        public abstract Builder url(String str);
    }

    public abstract String error();

    public abstract Builder toBuilder();

    public abstract String url();

    public static TypeAdapter<ResolveSimpleUrlPatternResponse> typeAdapter(Gson gson) {
        return new AutoValue_ResolveSimpleUrlPatternResponse.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new C$AutoValue_ResolveSimpleUrlPatternResponse.Builder().url(null).error(null);
    }
}
