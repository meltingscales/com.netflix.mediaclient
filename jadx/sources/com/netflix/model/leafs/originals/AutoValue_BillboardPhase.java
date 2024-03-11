package com.netflix.model.leafs.originals;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_BillboardPhase extends C$AutoValue_BillboardPhase {
    AutoValue_BillboardPhase(final String str, final List<BillboardCTA> list) {
        new BillboardPhase(str, list) { // from class: com.netflix.model.leafs.originals.$AutoValue_BillboardPhase
            private final List<BillboardCTA> actions;
            private final String supplementalMessage;

            @Override // com.netflix.model.leafs.originals.BillboardPhase
            @SerializedName("actions")
            public List<BillboardCTA> actions() {
                return this.actions;
            }

            @Override // com.netflix.model.leafs.originals.BillboardPhase
            @SerializedName("supplementalMessage")
            public String supplementalMessage() {
                return this.supplementalMessage;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.supplementalMessage = str;
                this.actions = list;
            }

            public String toString() {
                return "BillboardPhase{supplementalMessage=" + this.supplementalMessage + ", actions=" + this.actions + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof BillboardPhase) {
                    BillboardPhase billboardPhase = (BillboardPhase) obj;
                    String str2 = this.supplementalMessage;
                    if (str2 != null ? str2.equals(billboardPhase.supplementalMessage()) : billboardPhase.supplementalMessage() == null) {
                        List<BillboardCTA> list2 = this.actions;
                        if (list2 == null) {
                            if (billboardPhase.actions() == null) {
                                return true;
                            }
                        } else if (list2.equals(billboardPhase.actions())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.supplementalMessage;
                int hashCode = str2 == null ? 0 : str2.hashCode();
                List<BillboardCTA> list2 = this.actions;
                return ((hashCode ^ 1000003) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<BillboardPhase> {
        private final TypeAdapter<List<BillboardCTA>> actionsAdapter;
        private final TypeAdapter<String> supplementalMessageAdapter;
        private String defaultSupplementalMessage = null;
        private List<BillboardCTA> defaultActions = null;

        public GsonTypeAdapter setDefaultActions(List<BillboardCTA> list) {
            this.defaultActions = list;
            return this;
        }

        public GsonTypeAdapter setDefaultSupplementalMessage(String str) {
            this.defaultSupplementalMessage = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.supplementalMessageAdapter = gson.getAdapter(String.class);
            this.actionsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, BillboardCTA.class));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, BillboardPhase billboardPhase) {
            if (billboardPhase == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("supplementalMessage");
            this.supplementalMessageAdapter.write(jsonWriter, billboardPhase.supplementalMessage());
            jsonWriter.name("actions");
            this.actionsAdapter.write(jsonWriter, billboardPhase.actions());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public BillboardPhase read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultSupplementalMessage;
            List<BillboardCTA> list = this.defaultActions;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("actions")) {
                        list = this.actionsAdapter.read(jsonReader);
                    } else if (nextName.equals("supplementalMessage")) {
                        str = this.supplementalMessageAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_BillboardPhase(str, list);
        }
    }
}
