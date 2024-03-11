package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaMultiMonthOfferData;
import java.util.List;

/* loaded from: classes.dex */
public abstract class UmaMultiMonthOfferData {
    public abstract String buyCtaAction();

    public abstract String buyCtaId();

    public abstract int cell();

    public abstract String dismissCtaId();

    public abstract String labelVariantId();

    public abstract List<UmaMultiMonthOfferChoice> offerChoices();

    public abstract String viewType();

    public abstract String vlvURL();

    public static TypeAdapter<UmaMultiMonthOfferData> typeAdapter(Gson gson) {
        return new AutoValue_UmaMultiMonthOfferData.GsonTypeAdapter(gson);
    }
}
