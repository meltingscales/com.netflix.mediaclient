package com.netflix.model.leafs.originals.interactive;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;
import o.C1332Xp;
import o.C8168dfL;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AssetManifestAdapter extends TypeAdapter<AssetManifest> {
    private final TypeAdapter<Audio> audioAdapter;
    private final TypeAdapter<Image> imageAdapter;

    public AssetManifestAdapter() {
        Gson gson = (Gson) C1332Xp.b(Gson.class);
        this.imageAdapter = Image.typeAdapter(gson);
        this.audioAdapter = Audio.typeAdapter(gson);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, AssetManifest assetManifest) {
        jsonWriter.name("image");
        jsonWriter.beginArray();
        for (Image image : assetManifest.imageMap.values()) {
            this.imageAdapter.write(jsonWriter, image);
        }
        jsonWriter.endArray();
        jsonWriter.name("audio");
        jsonWriter.beginArray();
        for (Audio audio : assetManifest.audioMap.values()) {
            this.audioAdapter.write(jsonWriter, audio);
        }
        jsonWriter.endArray();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public AssetManifest read(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            if (jsonReader.peek() == JsonToken.NAME) {
                String nextName = jsonReader.nextName();
                if (C8168dfL.d(nextName, "image")) {
                    jsonReader.beginArray();
                    while (jsonReader.peek() != JsonToken.END_ARRAY) {
                        Image read = this.imageAdapter.read(jsonReader);
                        if (read != null) {
                            hashMap.put(read.id(), read);
                        }
                    }
                    jsonReader.endArray();
                } else if (C8168dfL.d(nextName, "audio")) {
                    jsonReader.beginArray();
                    while (jsonReader.peek() != JsonToken.END_ARRAY) {
                        Audio read2 = this.audioAdapter.read(jsonReader);
                        if (read2 != null) {
                            hashMap2.put(read2.id(), read2);
                        }
                    }
                    jsonReader.endArray();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new AssetManifest(hashMap, hashMap2);
    }
}
