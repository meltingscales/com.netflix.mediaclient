package com.netflix.model.leafs.originals.interactive.condition;

import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.condition.C$AutoValue_StateHistory;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class StateHistory implements Parcelable {
    public HashMap<String, JsonElement> sessionState = new HashMap<>();

    public abstract State global();

    public abstract State persistent();

    public static StateHistory create(State state, State state2) {
        return new AutoValue_StateHistory(state, state2);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        State persistent = persistent();
        if (!persistent.values.isEmpty()) {
            jsonObject.add("persistent", persistent.toJson());
        }
        State global = global();
        if (!global.values.isEmpty()) {
            jsonObject.add("global", global.toJson());
        }
        return jsonObject;
    }

    public static TypeAdapter<StateHistory> typeAdapter(Gson gson) {
        return new C$AutoValue_StateHistory.GsonTypeAdapter(gson).setDefaultGlobal(new State()).setDefaultPersistent(new State());
    }

    public boolean isNotEmpty() {
        return (global().values.isEmpty() && persistent().values.isEmpty()) ? false : true;
    }

    public Builder builder() {
        return new Builder();
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public State global;
        public State persistent;
        public HashMap<String, JsonElement> sessionState;

        public Builder global(State state) {
            this.global = state;
            return this;
        }

        public Builder persistent(State state) {
            this.persistent = state;
            return this;
        }

        public Builder sessionState(HashMap<String, JsonElement> hashMap) {
            this.sessionState = hashMap;
            return this;
        }

        private Builder(StateHistory stateHistory) {
            this.sessionState = stateHistory.sessionState;
            this.persistent = stateHistory.persistent();
            this.global = stateHistory.global();
        }

        public StateHistory build() {
            AutoValue_StateHistory autoValue_StateHistory = new AutoValue_StateHistory(this.persistent, this.global);
            autoValue_StateHistory.sessionState = this.sessionState;
            return autoValue_StateHistory;
        }
    }
}
