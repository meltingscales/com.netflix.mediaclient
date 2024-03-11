package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_StoryLines extends C$AutoValue_PlayerControls_StoryLines {
    public static final Parcelable.Creator<AutoValue_PlayerControls_StoryLines> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_StoryLines>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_StoryLines.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_StoryLines createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_StoryLines(parcel.readArrayList(PlayerControls.StoryLines.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_StoryLines[] newArray(int i) {
            return new AutoValue_PlayerControls_StoryLines[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_StoryLines(List<PlayerControls.StoryLines.StoryLine> list) {
        new C$$AutoValue_PlayerControls_StoryLines(list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_StoryLines

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_StoryLines$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.StoryLines> {
                private List<PlayerControls.StoryLines.StoryLine> defaultList = null;
                private final TypeAdapter<List<PlayerControls.StoryLines.StoryLine>> listAdapter;

                public GsonTypeAdapter setDefaultList(List<PlayerControls.StoryLines.StoryLine> list) {
                    this.defaultList = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.listAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, PlayerControls.StoryLines.StoryLine.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.StoryLines storyLines) {
                    if (storyLines == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("list");
                    this.listAdapter.write(jsonWriter, storyLines.list());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.StoryLines read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<PlayerControls.StoryLines.StoryLine> list = this.defaultList;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("list")) {
                                list = this.listAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_StoryLines(list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(list());
    }
}
