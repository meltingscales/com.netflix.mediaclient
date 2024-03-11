package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UmaMultiMonthOffer extends C$AutoValue_UmaMultiMonthOffer {
    AutoValue_UmaMultiMonthOffer(final String str, final UmaMultiMonthOfferData umaMultiMonthOfferData) {
        new UmaMultiMonthOffer(str, umaMultiMonthOfferData) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_UmaMultiMonthOffer
            private final UmaMultiMonthOfferData viewData;
            private final String viewName;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer
            public UmaMultiMonthOfferData viewData() {
                return this.viewData;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.UmaMultiMonthOffer
            public String viewName() {
                return this.viewName;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.viewName = str;
                this.viewData = umaMultiMonthOfferData;
            }

            public String toString() {
                return "UmaMultiMonthOffer{viewName=" + this.viewName + ", viewData=" + this.viewData + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof UmaMultiMonthOffer) {
                    UmaMultiMonthOffer umaMultiMonthOffer = (UmaMultiMonthOffer) obj;
                    String str2 = this.viewName;
                    if (str2 != null ? str2.equals(umaMultiMonthOffer.viewName()) : umaMultiMonthOffer.viewName() == null) {
                        UmaMultiMonthOfferData umaMultiMonthOfferData2 = this.viewData;
                        if (umaMultiMonthOfferData2 == null) {
                            if (umaMultiMonthOffer.viewData() == null) {
                                return true;
                            }
                        } else if (umaMultiMonthOfferData2.equals(umaMultiMonthOffer.viewData())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.viewName;
                int hashCode = str2 == null ? 0 : str2.hashCode();
                UmaMultiMonthOfferData umaMultiMonthOfferData2 = this.viewData;
                return ((hashCode ^ 1000003) * 1000003) ^ (umaMultiMonthOfferData2 != null ? umaMultiMonthOfferData2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<UmaMultiMonthOffer> {
        private final TypeAdapter<UmaMultiMonthOfferData> viewDataAdapter;
        private final TypeAdapter<String> viewNameAdapter;
        private String defaultViewName = null;
        private UmaMultiMonthOfferData defaultViewData = null;

        public GsonTypeAdapter setDefaultViewData(UmaMultiMonthOfferData umaMultiMonthOfferData) {
            this.defaultViewData = umaMultiMonthOfferData;
            return this;
        }

        public GsonTypeAdapter setDefaultViewName(String str) {
            this.defaultViewName = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.viewNameAdapter = gson.getAdapter(String.class);
            this.viewDataAdapter = gson.getAdapter(UmaMultiMonthOfferData.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, UmaMultiMonthOffer umaMultiMonthOffer) {
            if (umaMultiMonthOffer == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("viewName");
            this.viewNameAdapter.write(jsonWriter, umaMultiMonthOffer.viewName());
            jsonWriter.name("viewData");
            this.viewDataAdapter.write(jsonWriter, umaMultiMonthOffer.viewData());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public UmaMultiMonthOffer read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultViewName;
            UmaMultiMonthOfferData umaMultiMonthOfferData = this.defaultViewData;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("viewData")) {
                        umaMultiMonthOfferData = this.viewDataAdapter.read(jsonReader);
                    } else if (nextName.equals("viewName")) {
                        str = this.viewNameAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_UmaMultiMonthOffer(str, umaMultiMonthOfferData);
        }
    }
}
