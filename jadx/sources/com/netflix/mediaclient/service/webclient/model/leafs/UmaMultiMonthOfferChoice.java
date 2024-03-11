package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaMultiMonthOfferChoice;

/* loaded from: classes.dex */
public abstract class UmaMultiMonthOfferChoice {
    public abstract String currency();

    public abstract int discountDuration();

    public abstract String discountDurationType();

    public abstract int discountPercentage();

    public abstract double fullPrice();

    public abstract String fullPriceFormatted();

    public abstract boolean isBestOffer();

    public abstract boolean isSelected();

    public abstract long offerId();

    public abstract double offerPrice();

    public abstract String offerPriceFormatted();

    public abstract int planId();

    public abstract String priceTier();

    public static TypeAdapter<UmaMultiMonthOfferChoice> typeAdapter(Gson gson) {
        return new AutoValue_UmaMultiMonthOfferChoice.GsonTypeAdapter(gson);
    }
}
