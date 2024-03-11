package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaMultiMonthOfferChoice extends C$AutoValue_UmaMultiMonthOfferChoice {
    AutoValue_UmaMultiMonthOfferChoice(final int i, final int i2, final int i3, final long j, final double d, final double d2, final boolean z, final boolean z2, final String str, final String str2, final String str3, final String str4, final String str5) {
        new UmaMultiMonthOfferChoice(i, i2, i3, j, d, d2, z, z2, str, str2, str3, str4, str5) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaMultiMonthOfferChoice
            private final String currency;
            private final int discountDuration;
            private final String discountDurationType;
            private final int discountPercentage;
            private final double fullPrice;
            private final String fullPriceFormatted;
            private final boolean isBestOffer;
            private final boolean isSelected;
            private final long offerId;
            private final double offerPrice;
            private final String offerPriceFormatted;
            private final int planId;
            private final String priceTier;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public String currency() {
                return this.currency;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public int discountDuration() {
                return this.discountDuration;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public String discountDurationType() {
                return this.discountDurationType;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public int discountPercentage() {
                return this.discountPercentage;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public double fullPrice() {
                return this.fullPrice;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public String fullPriceFormatted() {
                return this.fullPriceFormatted;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public boolean isBestOffer() {
                return this.isBestOffer;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public boolean isSelected() {
                return this.isSelected;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public long offerId() {
                return this.offerId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public double offerPrice() {
                return this.offerPrice;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public String offerPriceFormatted() {
                return this.offerPriceFormatted;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public int planId() {
                return this.planId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferChoice
            public String priceTier() {
                return this.priceTier;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.planId = i;
                this.discountPercentage = i2;
                this.discountDuration = i3;
                this.offerId = j;
                this.fullPrice = d;
                this.offerPrice = d2;
                this.isBestOffer = z;
                this.isSelected = z2;
                this.currency = str;
                this.priceTier = str2;
                this.discountDurationType = str3;
                this.fullPriceFormatted = str4;
                this.offerPriceFormatted = str5;
            }

            public String toString() {
                return "UmaMultiMonthOfferChoice{planId=" + this.planId + ", discountPercentage=" + this.discountPercentage + ", discountDuration=" + this.discountDuration + ", offerId=" + this.offerId + ", fullPrice=" + this.fullPrice + ", offerPrice=" + this.offerPrice + ", isBestOffer=" + this.isBestOffer + ", isSelected=" + this.isSelected + ", currency=" + this.currency + ", priceTier=" + this.priceTier + ", discountDurationType=" + this.discountDurationType + ", fullPriceFormatted=" + this.fullPriceFormatted + ", offerPriceFormatted=" + this.offerPriceFormatted + "}";
            }

            public boolean equals(Object obj) {
                String str6;
                String str7;
                String str8;
                String str9;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaMultiMonthOfferChoice) {
                    UmaMultiMonthOfferChoice umaMultiMonthOfferChoice = (UmaMultiMonthOfferChoice) obj;
                    if (this.planId == umaMultiMonthOfferChoice.planId() && this.discountPercentage == umaMultiMonthOfferChoice.discountPercentage() && this.discountDuration == umaMultiMonthOfferChoice.discountDuration() && this.offerId == umaMultiMonthOfferChoice.offerId() && Double.doubleToLongBits(this.fullPrice) == Double.doubleToLongBits(umaMultiMonthOfferChoice.fullPrice()) && Double.doubleToLongBits(this.offerPrice) == Double.doubleToLongBits(umaMultiMonthOfferChoice.offerPrice()) && this.isBestOffer == umaMultiMonthOfferChoice.isBestOffer() && this.isSelected == umaMultiMonthOfferChoice.isSelected() && ((str6 = this.currency) != null ? str6.equals(umaMultiMonthOfferChoice.currency()) : umaMultiMonthOfferChoice.currency() == null) && ((str7 = this.priceTier) != null ? str7.equals(umaMultiMonthOfferChoice.priceTier()) : umaMultiMonthOfferChoice.priceTier() == null) && ((str8 = this.discountDurationType) != null ? str8.equals(umaMultiMonthOfferChoice.discountDurationType()) : umaMultiMonthOfferChoice.discountDurationType() == null) && ((str9 = this.fullPriceFormatted) != null ? str9.equals(umaMultiMonthOfferChoice.fullPriceFormatted()) : umaMultiMonthOfferChoice.fullPriceFormatted() == null)) {
                        String str10 = this.offerPriceFormatted;
                        if (str10 == null) {
                            if (umaMultiMonthOfferChoice.offerPriceFormatted() == null) {
                                return true;
                            }
                        } else if (str10.equals(umaMultiMonthOfferChoice.offerPriceFormatted())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i4 = this.planId;
                int i5 = this.discountPercentage;
                int i6 = this.discountDuration;
                long j2 = this.offerId;
                int i7 = (int) (j2 ^ (j2 >>> 32));
                int doubleToLongBits = (int) ((Double.doubleToLongBits(this.fullPrice) >>> 32) ^ Double.doubleToLongBits(this.fullPrice));
                int doubleToLongBits2 = (int) ((Double.doubleToLongBits(this.offerPrice) >>> 32) ^ Double.doubleToLongBits(this.offerPrice));
                int i8 = this.isBestOffer ? 1231 : 1237;
                int i9 = this.isSelected ? 1231 : 1237;
                String str6 = this.currency;
                int hashCode = str6 == null ? 0 : str6.hashCode();
                String str7 = this.priceTier;
                int hashCode2 = str7 == null ? 0 : str7.hashCode();
                String str8 = this.discountDurationType;
                int hashCode3 = str8 == null ? 0 : str8.hashCode();
                String str9 = this.fullPriceFormatted;
                int hashCode4 = str9 == null ? 0 : str9.hashCode();
                String str10 = this.offerPriceFormatted;
                return ((((((((((((((((((((((((i4 ^ 1000003) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ i7) * 1000003) ^ doubleToLongBits) * 1000003) ^ doubleToLongBits2) * 1000003) ^ i8) * 1000003) ^ i9) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str10 != null ? str10.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaMultiMonthOfferChoice> {
        private final TypeAdapter<String> currencyAdapter;
        private final TypeAdapter<Integer> discountDurationAdapter;
        private final TypeAdapter<String> discountDurationTypeAdapter;
        private final TypeAdapter<Integer> discountPercentageAdapter;
        private final TypeAdapter<Double> fullPriceAdapter;
        private final TypeAdapter<String> fullPriceFormattedAdapter;
        private final TypeAdapter<Boolean> isBestOfferAdapter;
        private final TypeAdapter<Boolean> isSelectedAdapter;
        private final TypeAdapter<Long> offerIdAdapter;
        private final TypeAdapter<Double> offerPriceAdapter;
        private final TypeAdapter<String> offerPriceFormattedAdapter;
        private final TypeAdapter<Integer> planIdAdapter;
        private final TypeAdapter<String> priceTierAdapter;
        private int defaultPlanId = 0;
        private int defaultDiscountPercentage = 0;
        private int defaultDiscountDuration = 0;
        private long defaultOfferId = 0;
        private double defaultFullPrice = 0.0d;
        private double defaultOfferPrice = 0.0d;
        private boolean defaultIsBestOffer = false;
        private boolean defaultIsSelected = false;
        private String defaultCurrency = null;
        private String defaultPriceTier = null;
        private String defaultDiscountDurationType = null;
        private String defaultFullPriceFormatted = null;
        private String defaultOfferPriceFormatted = null;

        public GsonTypeAdapter setDefaultCurrency(String str) {
            this.defaultCurrency = str;
            return this;
        }

        public GsonTypeAdapter setDefaultDiscountDuration(int i) {
            this.defaultDiscountDuration = i;
            return this;
        }

        public GsonTypeAdapter setDefaultDiscountDurationType(String str) {
            this.defaultDiscountDurationType = str;
            return this;
        }

        public GsonTypeAdapter setDefaultDiscountPercentage(int i) {
            this.defaultDiscountPercentage = i;
            return this;
        }

        public GsonTypeAdapter setDefaultFullPrice(double d) {
            this.defaultFullPrice = d;
            return this;
        }

        public GsonTypeAdapter setDefaultFullPriceFormatted(String str) {
            this.defaultFullPriceFormatted = str;
            return this;
        }

        public GsonTypeAdapter setDefaultIsBestOffer(boolean z) {
            this.defaultIsBestOffer = z;
            return this;
        }

        public GsonTypeAdapter setDefaultIsSelected(boolean z) {
            this.defaultIsSelected = z;
            return this;
        }

        public GsonTypeAdapter setDefaultOfferId(long j) {
            this.defaultOfferId = j;
            return this;
        }

        public GsonTypeAdapter setDefaultOfferPrice(double d) {
            this.defaultOfferPrice = d;
            return this;
        }

        public GsonTypeAdapter setDefaultOfferPriceFormatted(String str) {
            this.defaultOfferPriceFormatted = str;
            return this;
        }

        public GsonTypeAdapter setDefaultPlanId(int i) {
            this.defaultPlanId = i;
            return this;
        }

        public GsonTypeAdapter setDefaultPriceTier(String str) {
            this.defaultPriceTier = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.planIdAdapter = gson.getAdapter(Integer.class);
            this.discountPercentageAdapter = gson.getAdapter(Integer.class);
            this.discountDurationAdapter = gson.getAdapter(Integer.class);
            this.offerIdAdapter = gson.getAdapter(Long.class);
            this.fullPriceAdapter = gson.getAdapter(Double.class);
            this.offerPriceAdapter = gson.getAdapter(Double.class);
            this.isBestOfferAdapter = gson.getAdapter(Boolean.class);
            this.isSelectedAdapter = gson.getAdapter(Boolean.class);
            this.currencyAdapter = gson.getAdapter(String.class);
            this.priceTierAdapter = gson.getAdapter(String.class);
            this.discountDurationTypeAdapter = gson.getAdapter(String.class);
            this.fullPriceFormattedAdapter = gson.getAdapter(String.class);
            this.offerPriceFormattedAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaMultiMonthOfferChoice umaMultiMonthOfferChoice) {
            if (umaMultiMonthOfferChoice == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(SignupConstants.Field.PLAN_ID);
            this.planIdAdapter.write(jsonWriter, Integer.valueOf(umaMultiMonthOfferChoice.planId()));
            jsonWriter.name("discountPercentage");
            this.discountPercentageAdapter.write(jsonWriter, Integer.valueOf(umaMultiMonthOfferChoice.discountPercentage()));
            jsonWriter.name("discountDuration");
            this.discountDurationAdapter.write(jsonWriter, Integer.valueOf(umaMultiMonthOfferChoice.discountDuration()));
            jsonWriter.name(SignupConstants.Field.OFFER_ID);
            this.offerIdAdapter.write(jsonWriter, Long.valueOf(umaMultiMonthOfferChoice.offerId()));
            jsonWriter.name("fullPrice");
            this.fullPriceAdapter.write(jsonWriter, Double.valueOf(umaMultiMonthOfferChoice.fullPrice()));
            jsonWriter.name(SignupConstants.Field.OFFER_PRICE);
            this.offerPriceAdapter.write(jsonWriter, Double.valueOf(umaMultiMonthOfferChoice.offerPrice()));
            jsonWriter.name("isBestOffer");
            this.isBestOfferAdapter.write(jsonWriter, Boolean.valueOf(umaMultiMonthOfferChoice.isBestOffer()));
            jsonWriter.name("isSelected");
            this.isSelectedAdapter.write(jsonWriter, Boolean.valueOf(umaMultiMonthOfferChoice.isSelected()));
            jsonWriter.name("currency");
            this.currencyAdapter.write(jsonWriter, umaMultiMonthOfferChoice.currency());
            jsonWriter.name("priceTier");
            this.priceTierAdapter.write(jsonWriter, umaMultiMonthOfferChoice.priceTier());
            jsonWriter.name("discountDurationType");
            this.discountDurationTypeAdapter.write(jsonWriter, umaMultiMonthOfferChoice.discountDurationType());
            jsonWriter.name("fullPriceFormatted");
            this.fullPriceFormattedAdapter.write(jsonWriter, umaMultiMonthOfferChoice.fullPriceFormatted());
            jsonWriter.name("offerPriceFormatted");
            this.offerPriceFormattedAdapter.write(jsonWriter, umaMultiMonthOfferChoice.offerPriceFormatted());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaMultiMonthOfferChoice read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultPlanId;
            int i2 = this.defaultDiscountPercentage;
            int i3 = this.defaultDiscountDuration;
            long j = this.defaultOfferId;
            double d = this.defaultFullPrice;
            double d2 = this.defaultOfferPrice;
            boolean z = this.defaultIsBestOffer;
            boolean z2 = this.defaultIsSelected;
            String str = this.defaultCurrency;
            String str2 = this.defaultPriceTier;
            String str3 = this.defaultDiscountDurationType;
            String str4 = this.defaultFullPriceFormatted;
            String str5 = this.defaultOfferPriceFormatted;
            int i4 = i2;
            int i5 = i3;
            long j2 = j;
            double d3 = d;
            double d4 = d2;
            boolean z3 = z;
            boolean z4 = z2;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            int i6 = i;
            String str9 = str4;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -2125747509:
                            if (nextName.equals("priceTier")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1842453298:
                            if (nextName.equals("isBestOffer")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1690902534:
                            if (nextName.equals("fullPrice")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1548813161:
                            if (nextName.equals(SignupConstants.Field.OFFER_ID)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1048422923:
                            if (nextName.equals("discountDuration")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -985764316:
                            if (nextName.equals(SignupConstants.Field.PLAN_ID)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -370448709:
                            if (nextName.equals("discountPercentage")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -336308529:
                            if (nextName.equals("discountDurationType")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 147767373:
                            if (nextName.equals(SignupConstants.Field.OFFER_PRICE)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 238635490:
                            if (nextName.equals("fullPriceFormatted")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 398301669:
                            if (nextName.equals("isSelected")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 575402001:
                            if (nextName.equals("currency")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1900877551:
                            if (nextName.equals("offerPriceFormatted")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            str7 = this.priceTierAdapter.read(jsonReader);
                            continue;
                        case 1:
                            z3 = this.isBestOfferAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 2:
                            d3 = this.fullPriceAdapter.read(jsonReader).doubleValue();
                            continue;
                        case 3:
                            j2 = this.offerIdAdapter.read(jsonReader).longValue();
                            continue;
                        case 4:
                            i5 = this.discountDurationAdapter.read(jsonReader).intValue();
                            continue;
                        case 5:
                            i6 = this.planIdAdapter.read(jsonReader).intValue();
                            continue;
                        case 6:
                            i4 = this.discountPercentageAdapter.read(jsonReader).intValue();
                            continue;
                        case 7:
                            str8 = this.discountDurationTypeAdapter.read(jsonReader);
                            continue;
                        case '\b':
                            d4 = this.offerPriceAdapter.read(jsonReader).doubleValue();
                            continue;
                        case '\t':
                            str9 = this.fullPriceFormattedAdapter.read(jsonReader);
                            continue;
                        case '\n':
                            z4 = this.isSelectedAdapter.read(jsonReader).booleanValue();
                            continue;
                        case 11:
                            str6 = this.currencyAdapter.read(jsonReader);
                            continue;
                        case '\f':
                            str5 = this.offerPriceFormattedAdapter.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaMultiMonthOfferChoice(i6, i4, i5, j2, d3, d4, z3, z4, str6, str7, str8, str9, str5);
        }
    }
}
