package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.Choice;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Choice_ChoiceOverride extends C$AutoValue_Choice_ChoiceOverride {
    public static final Parcelable.Creator<AutoValue_Choice_ChoiceOverride> CREATOR = new Parcelable.Creator<AutoValue_Choice_ChoiceOverride>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Choice_ChoiceOverride.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice_ChoiceOverride createFromParcel(Parcel parcel) {
            return new AutoValue_Choice_ChoiceOverride((Choice) parcel.readParcelable(Choice.ChoiceOverride.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Choice_ChoiceOverride[] newArray(int i) {
            return new AutoValue_Choice_ChoiceOverride[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Choice_ChoiceOverride(Choice choice, String str) {
        new C$$AutoValue_Choice_ChoiceOverride(choice, str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice_ChoiceOverride

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Choice_ChoiceOverride$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Choice.ChoiceOverride> {
                private final TypeAdapter<Choice> dataAdapter;
                private Choice defaultData = null;
                private String defaultPreconditionId = null;
                private final TypeAdapter<String> preconditionIdAdapter;

                public GsonTypeAdapter setDefaultData(Choice choice) {
                    this.defaultData = choice;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.dataAdapter = gson.getAdapter(Choice.class);
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Choice.ChoiceOverride choiceOverride) {
                    if (choiceOverride == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, choiceOverride.data());
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, choiceOverride.preconditionId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public Choice.ChoiceOverride read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Choice choice = this.defaultData;
                    String str = this.defaultPreconditionId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                choice = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_Choice_ChoiceOverride(choice, str);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(data(), i);
        if (preconditionId() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(preconditionId());
    }
}
