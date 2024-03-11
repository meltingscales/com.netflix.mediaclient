package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_StoryLines_StoryLine extends C$AutoValue_PlayerControls_StoryLines_StoryLine {
    public static final Parcelable.Creator<AutoValue_PlayerControls_StoryLines_StoryLine> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_StoryLines_StoryLine>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_StoryLines_StoryLine.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_StoryLines_StoryLine createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_StoryLines_StoryLine(parcel.readString(), parcel.readArrayList(PlayerControls.StoryLines.StoryLine.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_StoryLines_StoryLine[] newArray(int i) {
            return new AutoValue_PlayerControls_StoryLines_StoryLine[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_StoryLines_StoryLine(String str, List<String> list) {
        new C$$AutoValue_PlayerControls_StoryLines_StoryLine(str, list) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_StoryLines_StoryLine

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_StoryLines_StoryLine$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.StoryLines.StoryLine> {
                private final TypeAdapter<List<String>> choicePointsAdapter;
                private final TypeAdapter<String> idAdapter;
                private String defaultId = null;
                private List<String> defaultChoicePoints = null;

                public GsonTypeAdapter setDefaultChoicePoints(List<String> list) {
                    this.defaultChoicePoints = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.choicePointsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.StoryLines.StoryLine storyLine) {
                    if (storyLine == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, storyLine.id());
                    jsonWriter.name("choicePoints");
                    this.choicePointsAdapter.write(jsonWriter, storyLine.choicePoints());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public PlayerControls.StoryLines.StoryLine read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    List<String> list = this.defaultChoicePoints;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("choicePoints")) {
                                list = this.choicePointsAdapter.read(jsonReader);
                            } else if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                str = this.idAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_PlayerControls_StoryLines_StoryLine(str, list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeList(choicePoints());
    }
}
