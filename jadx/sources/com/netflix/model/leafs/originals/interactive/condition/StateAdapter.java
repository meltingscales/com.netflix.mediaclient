package com.netflix.model.leafs.originals.interactive.condition;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* loaded from: classes.dex */
public class StateAdapter extends TypeAdapter<State> {
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, State state) {
        jsonWriter.beginObject();
        for (String str : state.values.keySet()) {
            JsonElement jsonElement = state.values.get(str);
            if (jsonElement != null) {
                if (jsonElement.isJsonPrimitive()) {
                    jsonWriter.name(str);
                    writePrimitive(jsonWriter, jsonElement);
                } else if (jsonElement.isJsonArray()) {
                    jsonWriter.name(str);
                    jsonWriter.beginArray();
                    JsonArray asJsonArray = jsonElement.getAsJsonArray();
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        writePrimitive(jsonWriter, asJsonArray.get(i).getAsJsonPrimitive());
                    }
                    jsonWriter.endArray();
                }
            }
        }
        jsonWriter.endObject();
    }

    private void writePrimitive(JsonWriter jsonWriter, JsonElement jsonElement) {
        JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
        if (asJsonPrimitive.isBoolean()) {
            jsonWriter.value(Boolean.valueOf(jsonElement.getAsBoolean()));
        } else if (asJsonPrimitive.isString()) {
            jsonWriter.value(jsonElement.getAsString());
        } else if (asJsonPrimitive.isNumber()) {
            jsonWriter.value(jsonElement.getAsInt());
        }
    }

    private JsonElement readNext(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BOOLEAN) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (peek == JsonToken.STRING) {
            return new JsonPrimitive(jsonReader.nextString());
        }
        if (peek == JsonToken.NUMBER) {
            return new JsonPrimitive(Integer.valueOf(jsonReader.nextInt()));
        }
        if (peek == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            JsonArray jsonArray = new JsonArray();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                jsonArray.add(readNext(jsonReader));
            }
            jsonReader.endArray();
            return jsonArray;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public State read(JsonReader jsonReader) {
        JsonArray jsonArray;
        State state = new State();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return state;
        }
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                JsonArray jsonArray2 = new JsonArray();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    jsonArray2.add(readNext(jsonReader));
                }
                jsonReader.endArray();
                jsonArray = jsonArray2;
            } else {
                jsonArray = readNext(jsonReader);
            }
            if (jsonArray != null) {
                state.values.put(nextName, jsonArray);
            }
        }
        jsonReader.endObject();
        return state;
    }
}
