package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.Button;
import com.netflix.model.leafs.originals.interactive.template.VisualStateDefinition;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Button_States extends C$AutoValue_Button_States {
    public static final Parcelable.Creator<AutoValue_Button_States> CREATOR = new Parcelable.Creator<AutoValue_Button_States>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Button_States.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button_States createFromParcel(Parcel parcel) {
            return new AutoValue_Button_States((SpriteImage) parcel.readParcelable(Button.States.class.getClassLoader()), (SpriteImage) parcel.readParcelable(Button.States.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Button_States[] newArray(int i) {
            return new AutoValue_Button_States[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Button_States(SpriteImage spriteImage, SpriteImage spriteImage2) {
        new C$$AutoValue_Button_States(spriteImage, spriteImage2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Button_States

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Button_States$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Button.States> {
                private SpriteImage defaultDefaultState = null;
                private SpriteImage defaultSelectedState = null;
                private final TypeAdapter<SpriteImage> defaultStateAdapter;
                private final TypeAdapter<SpriteImage> selectedStateAdapter;

                public GsonTypeAdapter setDefaultDefaultState(SpriteImage spriteImage) {
                    this.defaultDefaultState = spriteImage;
                    return this;
                }

                public GsonTypeAdapter setDefaultSelectedState(SpriteImage spriteImage) {
                    this.defaultSelectedState = spriteImage;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.defaultStateAdapter = gson.getAdapter(SpriteImage.class);
                    this.selectedStateAdapter = gson.getAdapter(SpriteImage.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Button.States states) {
                    if (states == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("default");
                    this.defaultStateAdapter.write(jsonWriter, states.defaultState());
                    jsonWriter.name(VisualStateDefinition.ELEMENT_STATE.SELECTED);
                    this.selectedStateAdapter.write(jsonWriter, states.selectedState());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Button.States read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    SpriteImage spriteImage = this.defaultDefaultState;
                    SpriteImage spriteImage2 = this.defaultSelectedState;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(VisualStateDefinition.ELEMENT_STATE.SELECTED)) {
                                spriteImage2 = this.selectedStateAdapter.read(jsonReader);
                            } else if (nextName.equals("default")) {
                                spriteImage = this.defaultStateAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Button_States(spriteImage, spriteImage2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(defaultState(), i);
        parcel.writeParcelable(selectedState(), i);
    }
}
