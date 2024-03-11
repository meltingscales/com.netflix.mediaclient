package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SearchResultsSimilarityAlgorithm extends C$AutoValue_SearchResultsSimilarityAlgorithm {
    AutoValue_SearchResultsSimilarityAlgorithm(final double d, final int i) {
        new SearchResultsSimilarityAlgorithm(d, i) { // from class: com.netflix.mediaclient.service.webclient.model.leafs.$AutoValue_SearchResultsSimilarityAlgorithm
            private final int jaroWinklerPrefixLengthLimit;
            private final double jaroWinklerSimilarityThreshold;

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm
            @SerializedName("jaroWinklerPrefixLengthLimit")
            public int jaroWinklerPrefixLengthLimit() {
                return this.jaroWinklerPrefixLengthLimit;
            }

            @Override // com.netflix.mediaclient.service.webclient.model.leafs.SearchResultsSimilarityAlgorithm
            @SerializedName("jaroWinklerSimilarityThreshold")
            public double jaroWinklerSimilarityThreshold() {
                return this.jaroWinklerSimilarityThreshold;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.jaroWinklerSimilarityThreshold = d;
                this.jaroWinklerPrefixLengthLimit = i;
            }

            public String toString() {
                return "SearchResultsSimilarityAlgorithm{jaroWinklerSimilarityThreshold=" + this.jaroWinklerSimilarityThreshold + ", jaroWinklerPrefixLengthLimit=" + this.jaroWinklerPrefixLengthLimit + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof SearchResultsSimilarityAlgorithm) {
                    SearchResultsSimilarityAlgorithm searchResultsSimilarityAlgorithm = (SearchResultsSimilarityAlgorithm) obj;
                    return Double.doubleToLongBits(this.jaroWinklerSimilarityThreshold) == Double.doubleToLongBits(searchResultsSimilarityAlgorithm.jaroWinklerSimilarityThreshold()) && this.jaroWinklerPrefixLengthLimit == searchResultsSimilarityAlgorithm.jaroWinklerPrefixLengthLimit();
                }
                return false;
            }

            public int hashCode() {
                return ((((int) ((Double.doubleToLongBits(this.jaroWinklerSimilarityThreshold) >>> 32) ^ Double.doubleToLongBits(this.jaroWinklerSimilarityThreshold))) ^ 1000003) * 1000003) ^ this.jaroWinklerPrefixLengthLimit;
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<SearchResultsSimilarityAlgorithm> {
        private final TypeAdapter<Integer> jaroWinklerPrefixLengthLimitAdapter;
        private final TypeAdapter<Double> jaroWinklerSimilarityThresholdAdapter;
        private double defaultJaroWinklerSimilarityThreshold = 0.0d;
        private int defaultJaroWinklerPrefixLengthLimit = 0;

        public GsonTypeAdapter setDefaultJaroWinklerPrefixLengthLimit(int i) {
            this.defaultJaroWinklerPrefixLengthLimit = i;
            return this;
        }

        public GsonTypeAdapter setDefaultJaroWinklerSimilarityThreshold(double d) {
            this.defaultJaroWinklerSimilarityThreshold = d;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.jaroWinklerSimilarityThresholdAdapter = gson.getAdapter(Double.class);
            this.jaroWinklerPrefixLengthLimitAdapter = gson.getAdapter(Integer.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, SearchResultsSimilarityAlgorithm searchResultsSimilarityAlgorithm) {
            if (searchResultsSimilarityAlgorithm == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("jaroWinklerSimilarityThreshold");
            this.jaroWinklerSimilarityThresholdAdapter.write(jsonWriter, Double.valueOf(searchResultsSimilarityAlgorithm.jaroWinklerSimilarityThreshold()));
            jsonWriter.name("jaroWinklerPrefixLengthLimit");
            this.jaroWinklerPrefixLengthLimitAdapter.write(jsonWriter, Integer.valueOf(searchResultsSimilarityAlgorithm.jaroWinklerPrefixLengthLimit()));
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public SearchResultsSimilarityAlgorithm read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            double d = this.defaultJaroWinklerSimilarityThreshold;
            int i = this.defaultJaroWinklerPrefixLengthLimit;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("jaroWinklerSimilarityThreshold")) {
                        d = this.jaroWinklerSimilarityThresholdAdapter.read(jsonReader).doubleValue();
                    } else if (nextName.equals("jaroWinklerPrefixLengthLimit")) {
                        i = this.jaroWinklerPrefixLengthLimitAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_SearchResultsSimilarityAlgorithm(d, i);
        }
    }
}
