package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaMultiMonthOfferData extends C$AutoValue_UmaMultiMonthOfferData {
    AutoValue_UmaMultiMonthOfferData(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final List<UmaMultiMonthOfferChoice> list) {
        new UmaMultiMonthOfferData(i, str, str2, str3, str4, str5, str6, list) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaMultiMonthOfferData
            private final String buyCtaAction;
            private final String buyCtaId;
            private final int cell;
            private final String dismissCtaId;
            private final String labelVariantId;
            private final List<UmaMultiMonthOfferChoice> offerChoices;
            private final String viewType;
            private final String vlvURL;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String buyCtaAction() {
                return this.buyCtaAction;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String buyCtaId() {
                return this.buyCtaId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public int cell() {
                return this.cell;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String dismissCtaId() {
                return this.dismissCtaId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String labelVariantId() {
                return this.labelVariantId;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public List<UmaMultiMonthOfferChoice> offerChoices() {
                return this.offerChoices;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String viewType() {
                return this.viewType;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOfferData
            public String vlvURL() {
                return this.vlvURL;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.cell = i;
                this.viewType = str;
                this.vlvURL = str2;
                this.labelVariantId = str3;
                this.dismissCtaId = str4;
                this.buyCtaId = str5;
                this.buyCtaAction = str6;
                this.offerChoices = list;
            }

            public String toString() {
                return "UmaMultiMonthOfferData{cell=" + this.cell + ", viewType=" + this.viewType + ", vlvURL=" + this.vlvURL + ", labelVariantId=" + this.labelVariantId + ", dismissCtaId=" + this.dismissCtaId + ", buyCtaId=" + this.buyCtaId + ", buyCtaAction=" + this.buyCtaAction + ", offerChoices=" + this.offerChoices + "}";
            }

            public boolean equals(Object obj) {
                String str7;
                String str8;
                String str9;
                String str10;
                String str11;
                String str12;
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaMultiMonthOfferData) {
                    UmaMultiMonthOfferData umaMultiMonthOfferData = (UmaMultiMonthOfferData) obj;
                    if (this.cell == umaMultiMonthOfferData.cell() && ((str7 = this.viewType) != null ? str7.equals(umaMultiMonthOfferData.viewType()) : umaMultiMonthOfferData.viewType() == null) && ((str8 = this.vlvURL) != null ? str8.equals(umaMultiMonthOfferData.vlvURL()) : umaMultiMonthOfferData.vlvURL() == null) && ((str9 = this.labelVariantId) != null ? str9.equals(umaMultiMonthOfferData.labelVariantId()) : umaMultiMonthOfferData.labelVariantId() == null) && ((str10 = this.dismissCtaId) != null ? str10.equals(umaMultiMonthOfferData.dismissCtaId()) : umaMultiMonthOfferData.dismissCtaId() == null) && ((str11 = this.buyCtaId) != null ? str11.equals(umaMultiMonthOfferData.buyCtaId()) : umaMultiMonthOfferData.buyCtaId() == null) && ((str12 = this.buyCtaAction) != null ? str12.equals(umaMultiMonthOfferData.buyCtaAction()) : umaMultiMonthOfferData.buyCtaAction() == null)) {
                        List<UmaMultiMonthOfferChoice> list2 = this.offerChoices;
                        if (list2 == null) {
                            if (umaMultiMonthOfferData.offerChoices() == null) {
                                return true;
                            }
                        } else if (list2.equals(umaMultiMonthOfferData.offerChoices())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i2 = this.cell;
                String str7 = this.viewType;
                int hashCode = str7 == null ? 0 : str7.hashCode();
                String str8 = this.vlvURL;
                int hashCode2 = str8 == null ? 0 : str8.hashCode();
                String str9 = this.labelVariantId;
                int hashCode3 = str9 == null ? 0 : str9.hashCode();
                String str10 = this.dismissCtaId;
                int hashCode4 = str10 == null ? 0 : str10.hashCode();
                String str11 = this.buyCtaId;
                int hashCode5 = str11 == null ? 0 : str11.hashCode();
                String str12 = this.buyCtaAction;
                int hashCode6 = str12 == null ? 0 : str12.hashCode();
                List<UmaMultiMonthOfferChoice> list2 = this.offerChoices;
                return ((((((((((((((i2 ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaMultiMonthOfferData> {
        private final TypeAdapter<String> buyCtaActionAdapter;
        private final TypeAdapter<String> buyCtaIdAdapter;
        private final TypeAdapter<Integer> cellAdapter;
        private final TypeAdapter<String> dismissCtaIdAdapter;
        private final TypeAdapter<String> labelVariantIdAdapter;
        private final TypeAdapter<List<UmaMultiMonthOfferChoice>> offerChoicesAdapter;
        private final TypeAdapter<String> viewTypeAdapter;
        private final TypeAdapter<String> vlvURLAdapter;
        private int defaultCell = 0;
        private String defaultViewType = null;
        private String defaultVlvURL = null;
        private String defaultLabelVariantId = null;
        private String defaultDismissCtaId = null;
        private String defaultBuyCtaId = null;
        private String defaultBuyCtaAction = null;
        private List<UmaMultiMonthOfferChoice> defaultOfferChoices = null;

        public GsonTypeAdapter setDefaultBuyCtaAction(String str) {
            this.defaultBuyCtaAction = str;
            return this;
        }

        public GsonTypeAdapter setDefaultBuyCtaId(String str) {
            this.defaultBuyCtaId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultCell(int i) {
            this.defaultCell = i;
            return this;
        }

        public GsonTypeAdapter setDefaultDismissCtaId(String str) {
            this.defaultDismissCtaId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultLabelVariantId(String str) {
            this.defaultLabelVariantId = str;
            return this;
        }

        public GsonTypeAdapter setDefaultOfferChoices(List<UmaMultiMonthOfferChoice> list) {
            this.defaultOfferChoices = list;
            return this;
        }

        public GsonTypeAdapter setDefaultViewType(String str) {
            this.defaultViewType = str;
            return this;
        }

        public GsonTypeAdapter setDefaultVlvURL(String str) {
            this.defaultVlvURL = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.cellAdapter = gson.getAdapter(Integer.class);
            this.viewTypeAdapter = gson.getAdapter(String.class);
            this.vlvURLAdapter = gson.getAdapter(String.class);
            this.labelVariantIdAdapter = gson.getAdapter(String.class);
            this.dismissCtaIdAdapter = gson.getAdapter(String.class);
            this.buyCtaIdAdapter = gson.getAdapter(String.class);
            this.buyCtaActionAdapter = gson.getAdapter(String.class);
            this.offerChoicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, UmaMultiMonthOfferChoice.class));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaMultiMonthOfferData umaMultiMonthOfferData) {
            if (umaMultiMonthOfferData == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cell");
            this.cellAdapter.write(jsonWriter, Integer.valueOf(umaMultiMonthOfferData.cell()));
            jsonWriter.name("viewType");
            this.viewTypeAdapter.write(jsonWriter, umaMultiMonthOfferData.viewType());
            jsonWriter.name("vlvURL");
            this.vlvURLAdapter.write(jsonWriter, umaMultiMonthOfferData.vlvURL());
            jsonWriter.name("labelVariantId");
            this.labelVariantIdAdapter.write(jsonWriter, umaMultiMonthOfferData.labelVariantId());
            jsonWriter.name("dismissCtaId");
            this.dismissCtaIdAdapter.write(jsonWriter, umaMultiMonthOfferData.dismissCtaId());
            jsonWriter.name("buyCtaId");
            this.buyCtaIdAdapter.write(jsonWriter, umaMultiMonthOfferData.buyCtaId());
            jsonWriter.name("buyCtaAction");
            this.buyCtaActionAdapter.write(jsonWriter, umaMultiMonthOfferData.buyCtaAction());
            jsonWriter.name("offerChoices");
            this.offerChoicesAdapter.write(jsonWriter, umaMultiMonthOfferData.offerChoices());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaMultiMonthOfferData read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultCell;
            String str = this.defaultViewType;
            String str2 = this.defaultVlvURL;
            String str3 = this.defaultLabelVariantId;
            String str4 = this.defaultDismissCtaId;
            String str5 = this.defaultBuyCtaId;
            int i2 = i;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            String str10 = str5;
            String str11 = this.defaultBuyCtaAction;
            List<UmaMultiMonthOfferChoice> list = this.defaultOfferChoices;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -1009976219:
                            if (nextName.equals("buyCtaId")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -813387569:
                            if (nextName.equals("vlvURL")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -721438592:
                            if (nextName.equals("buyCtaAction")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -621068308:
                            if (nextName.equals("labelVariantId")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3049826:
                            if (nextName.equals("cell")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 406760161:
                            if (nextName.equals("dismissCtaId")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1195860863:
                            if (nextName.equals("viewType")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1337308406:
                            if (nextName.equals("offerChoices")) {
                                c = 7;
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
                            str10 = this.buyCtaIdAdapter.read(jsonReader);
                            continue;
                        case 1:
                            str7 = this.vlvURLAdapter.read(jsonReader);
                            continue;
                        case 2:
                            str11 = this.buyCtaActionAdapter.read(jsonReader);
                            continue;
                        case 3:
                            str8 = this.labelVariantIdAdapter.read(jsonReader);
                            continue;
                        case 4:
                            i2 = this.cellAdapter.read(jsonReader).intValue();
                            continue;
                        case 5:
                            str9 = this.dismissCtaIdAdapter.read(jsonReader);
                            continue;
                        case 6:
                            str6 = this.viewTypeAdapter.read(jsonReader);
                            continue;
                        case 7:
                            list = this.offerChoicesAdapter.read(jsonReader);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaMultiMonthOfferData(i2, str6, str7, str8, str9, str10, str11, list);
        }
    }
}
