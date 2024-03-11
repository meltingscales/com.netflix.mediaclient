package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaMultiMonthOffer;

/* loaded from: classes.dex */
public abstract class UmaMultiMonthOffer {
    public abstract UmaMultiMonthOfferData viewData();

    public abstract String viewName();

    public static TypeAdapter<UmaMultiMonthOffer> typeAdapter(Gson gson) {
        return new AutoValue_UmaMultiMonthOffer.GsonTypeAdapter(gson);
    }
}
