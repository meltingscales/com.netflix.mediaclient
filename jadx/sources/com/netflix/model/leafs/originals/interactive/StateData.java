package com.netflix.model.leafs.originals.interactive;

import android.os.Parcelable;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.C$AutoValue_StateData;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class StateData implements Parcelable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Condition> global();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Condition> passthrough();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Condition> persistent();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<String, Condition> session();

    public Iterator<Pair<String, JsonElement>> persistentIterator(InteractiveMoments interactiveMoments) {
        return getIterator(interactiveMoments, persistent());
    }

    public Iterator<Pair<String, JsonElement>> sessionIterator(InteractiveMoments interactiveMoments) {
        return getIterator(interactiveMoments, session());
    }

    public Iterator<Pair<String, JsonElement>> globalIterator(InteractiveMoments interactiveMoments) {
        return getIterator(interactiveMoments, global());
    }

    public Iterator<Pair<String, JsonElement>> passThroughIterator(InteractiveMoments interactiveMoments) {
        return getIterator(interactiveMoments, passthrough());
    }

    private Iterator<Pair<String, JsonElement>> getIterator(InteractiveMoments interactiveMoments, Map<String, Condition> map) {
        return new Iterator<Pair<String, JsonElement>>(map, interactiveMoments) { // from class: com.netflix.model.leafs.originals.interactive.StateData.1
            final Iterator<Map.Entry<String, Condition>> iterator;
            final /* synthetic */ Map val$data;
            final /* synthetic */ InteractiveMoments val$moments;

            {
                this.val$data = map;
                this.val$moments = interactiveMoments;
                this.iterator = map == null ? null : map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Iterator<Map.Entry<String, Condition>> it = this.iterator;
                return it != null && it.hasNext();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Pair<String, JsonElement> next() {
                Condition value;
                Map.Entry<String, Condition> next = this.iterator.next();
                if (next == null || (value = next.getValue()) == null) {
                    return null;
                }
                return new Pair<>(next.getKey(), value.getValue(this.val$moments));
            }
        };
    }

    public static TypeAdapter<StateData> typeAdapter(Gson gson) {
        return new C$AutoValue_StateData.GsonTypeAdapter(gson);
    }
}
