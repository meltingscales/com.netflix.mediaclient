package com.netflix.model.leafs.originals.interactive.condition;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class Snapshots extends ArrayList<State> {
    public Snapshots() {
    }

    public Snapshots(int i) {
        super(i);
    }

    public JsonArray toJson() {
        JsonArray jsonArray;
        synchronized (this) {
            jsonArray = new JsonArray();
            Iterator<State> it = iterator();
            while (it.hasNext()) {
                JsonObject jsonObject = new JsonObject();
                for (Map.Entry<String, JsonElement> entry : it.next().values.entrySet()) {
                    jsonObject.add(entry.getKey(), entry.getValue());
                }
                jsonArray.add(jsonObject);
            }
        }
        return jsonArray;
    }

    public Set<String> getSegmentIds() {
        HashSet hashSet = new HashSet();
        Iterator<State> it = iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().values.get(State.SEGMENT_ID).getAsString());
        }
        return hashSet;
    }
}
