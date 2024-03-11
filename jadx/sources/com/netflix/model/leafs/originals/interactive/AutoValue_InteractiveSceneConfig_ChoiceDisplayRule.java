package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveSceneConfig_ChoiceDisplayRule extends C$AutoValue_InteractiveSceneConfig_ChoiceDisplayRule {
    AutoValue_InteractiveSceneConfig_ChoiceDisplayRule(final String str, final List<Choice> list) {
        new InteractiveSceneConfig.ChoiceDisplayRule(str, list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_InteractiveSceneConfig_ChoiceDisplayRule
            private final List<Choice> choices;
            private final String preconditionId;

            @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.ChoiceDisplayRule
            public List<Choice> choices() {
                return this.choices;
            }

            @Override // com.netflix.model.leafs.originals.interactive.InteractiveSceneConfig.ChoiceDisplayRule
            public String preconditionId() {
                return this.preconditionId;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.preconditionId = str;
                if (list == null) {
                    throw new NullPointerException("Null choices");
                }
                this.choices = list;
            }

            public String toString() {
                return "ChoiceDisplayRule{preconditionId=" + this.preconditionId + ", choices=" + this.choices + "}";
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof InteractiveSceneConfig.ChoiceDisplayRule) {
                    InteractiveSceneConfig.ChoiceDisplayRule choiceDisplayRule = (InteractiveSceneConfig.ChoiceDisplayRule) obj;
                    String str2 = this.preconditionId;
                    if (str2 != null ? str2.equals(choiceDisplayRule.preconditionId()) : choiceDisplayRule.preconditionId() == null) {
                        if (this.choices.equals(choiceDisplayRule.choices())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                String str2 = this.preconditionId;
                return (((str2 == null ? 0 : str2.hashCode()) ^ 1000003) * 1000003) ^ this.choices.hashCode();
            }
        };
    }

    /* loaded from: classes.dex */
    public static final class GsonTypeAdapter extends TypeAdapter<InteractiveSceneConfig.ChoiceDisplayRule> {
        private final TypeAdapter<List<Choice>> choicesAdapter;
        private final TypeAdapter<String> preconditionIdAdapter;
        private String defaultPreconditionId = null;
        private List<Choice> defaultChoices = null;

        public GsonTypeAdapter setDefaultChoices(List<Choice> list) {
            this.defaultChoices = list;
            return this;
        }

        public GsonTypeAdapter setDefaultPreconditionId(String str) {
            this.defaultPreconditionId = str;
            return this;
        }

        public GsonTypeAdapter(Gson gson) {
            this.preconditionIdAdapter = gson.getAdapter(String.class);
            this.choicesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Choice.class));
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, InteractiveSceneConfig.ChoiceDisplayRule choiceDisplayRule) {
            if (choiceDisplayRule == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("preconditionId");
            this.preconditionIdAdapter.write(jsonWriter, choiceDisplayRule.preconditionId());
            jsonWriter.name("choices");
            this.choicesAdapter.write(jsonWriter, choiceDisplayRule.choices());
            jsonWriter.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        public InteractiveSceneConfig.ChoiceDisplayRule read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = this.defaultPreconditionId;
            List<Choice> list = this.defaultChoices;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if (nextName.equals("choices")) {
                        list = this.choicesAdapter.read(jsonReader);
                    } else if (nextName.equals("preconditionId")) {
                        str = this.preconditionIdAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new AutoValue_InteractiveSceneConfig_ChoiceDisplayRule(str, list);
        }
    }
}
