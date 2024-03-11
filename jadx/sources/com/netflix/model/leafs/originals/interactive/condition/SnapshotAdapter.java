package com.netflix.model.leafs.originals.interactive.condition;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public class SnapshotAdapter extends TypeAdapter<Snapshots> {
    private StateAdapter adapter = new StateAdapter();

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Snapshots snapshots) {
        jsonWriter.beginArray();
        Iterator<State> it = snapshots.iterator();
        while (it.hasNext()) {
            this.adapter.write(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Snapshots read(JsonReader jsonReader) {
        Snapshots snapshots = new Snapshots();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                snapshots.add(this.adapter.read(jsonReader));
            }
            jsonReader.endArray();
        }
        return snapshots;
    }
}
