package com.netflix.mediaclient.media.manifest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Location extends C$AutoValue_Location {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Location(final int i, final int i2, final int i3, final String str) {
        new Location(i, i2, i3, str) { // from class: com.netflix.mediaclient.media.manifest.$AutoValue_Location
            private final String key;
            private final int level;
            private final int rank;
            private final int weight;

            @Override // com.netflix.mediaclient.media.manifest.Location
            @SerializedName(SignupConstants.Error.DEBUG_FIELD_KEY)
            public String key() {
                return this.key;
            }

            @Override // com.netflix.mediaclient.media.manifest.Location
            @SerializedName("level")
            public int level() {
                return this.level;
            }

            @Override // com.netflix.mediaclient.media.manifest.Location
            @SerializedName("rank")
            public int rank() {
                return this.rank;
            }

            @Override // com.netflix.mediaclient.media.manifest.Location
            @SerializedName("weight")
            public int weight() {
                return this.weight;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.level = i;
                this.rank = i2;
                this.weight = i3;
                this.key = str;
            }

            public String toString() {
                return "Location{level=" + this.level + ", rank=" + this.rank + ", weight=" + this.weight + ", key=" + this.key + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Location) {
                    Location location = (Location) obj;
                    if (this.level == location.level() && this.rank == location.rank() && this.weight == location.weight()) {
                        String str2 = this.key;
                        if (str2 == null) {
                            if (location.key() == null) {
                                return true;
                            }
                        } else if (str2.equals(location.key())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                int i4 = this.level;
                int i5 = this.rank;
                int i6 = this.weight;
                String str2 = this.key;
                return ((((((i4 ^ 1000003) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ (str2 == null ? 0 : str2.hashCode());
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<Location> {
        private final TypeAdapter<String> keyAdapter;
        private final TypeAdapter<Integer> levelAdapter;
        private final TypeAdapter<Integer> rankAdapter;
        private final TypeAdapter<Integer> weightAdapter;
        private int defaultLevel = 0;
        private int defaultRank = 0;
        private int defaultWeight = 0;
        private String defaultKey = null;

        public GsonTypeAdapter setDefaultKey(String str) {
            this.defaultKey = str;
            return this;
        }

        public GsonTypeAdapter setDefaultLevel(int i) {
            this.defaultLevel = i;
            return this;
        }

        public GsonTypeAdapter setDefaultRank(int i) {
            this.defaultRank = i;
            return this;
        }

        public GsonTypeAdapter setDefaultWeight(int i) {
            this.defaultWeight = i;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.levelAdapter = gson.getAdapter(Integer.class);
            this.rankAdapter = gson.getAdapter(Integer.class);
            this.weightAdapter = gson.getAdapter(Integer.class);
            this.keyAdapter = gson.getAdapter(String.class);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Location location) {
            if (location == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("level");
            this.levelAdapter.write(jsonWriter, Integer.valueOf(location.level()));
            jsonWriter.name("rank");
            this.rankAdapter.write(jsonWriter, Integer.valueOf(location.rank()));
            jsonWriter.name("weight");
            this.weightAdapter.write(jsonWriter, Integer.valueOf(location.weight()));
            jsonWriter.name(SignupConstants.Error.DEBUG_FIELD_KEY);
            this.keyAdapter.write(jsonWriter, location.key());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public Location read(JsonReader jsonReader) {
            char c;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = this.defaultLevel;
            int i2 = this.defaultRank;
            int i3 = this.defaultWeight;
            String str = this.defaultKey;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -791592328:
                            if (nextName.equals("weight")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106079:
                            if (nextName.equals(SignupConstants.Error.DEBUG_FIELD_KEY)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3492908:
                            if (nextName.equals("rank")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102865796:
                            if (nextName.equals("level")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        i3 = this.weightAdapter.read(jsonReader).intValue();
                    } else if (c == 1) {
                        str = this.keyAdapter.read(jsonReader);
                    } else if (c == 2) {
                        i2 = this.rankAdapter.read(jsonReader).intValue();
                    } else if (c == 3) {
                        i = this.levelAdapter.read(jsonReader).intValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_Location(i, i2, i3, str);
        }
    }
}
