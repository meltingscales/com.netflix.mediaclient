package com.netflix.model.leafs.originals.interactive;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import o.C8168dfL;

/* loaded from: classes.dex */
public class InteractiveStringsAdapter extends TypeAdapter<StringsObject> {
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, StringsObject stringsObject) {
        jsonWriter.beginObject();
        jsonWriter.name("preconditionTokens");
        for (Map.Entry<String, String> entry : stringsObject.preconditionTokens.entrySet()) {
            jsonWriter.name(entry.getKey());
            jsonWriter.value(entry.getValue());
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public StringsObject read(JsonReader jsonReader) {
        StringsObject stringsObject = new StringsObject();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            if (jsonReader.peek() == JsonToken.NAME) {
                String nextName = jsonReader.nextName();
                if (C8168dfL.d(nextName, "preconditionTokens")) {
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        stringsObject.preconditionTokens.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                } else if (C8168dfL.d(nextName, "mappings")) {
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        stringsObject.mappings.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    stringsObject.values.put(nextName, jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return stringsObject;
    }
}
