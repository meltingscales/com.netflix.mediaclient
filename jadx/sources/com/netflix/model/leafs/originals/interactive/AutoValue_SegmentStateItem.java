package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SegmentStateItem extends C$AutoValue_SegmentStateItem {
    public static final Parcelable.Creator<AutoValue_SegmentStateItem> CREATOR = new Parcelable.Creator<AutoValue_SegmentStateItem>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_SegmentStateItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SegmentStateItem createFromParcel(Parcel parcel) {
            return new AutoValue_SegmentStateItem((StateData) parcel.readParcelable(SegmentStateItem.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SegmentStateItem[] newArray(int i) {
            return new AutoValue_SegmentStateItem[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SegmentStateItem(StateData stateData, String str) {
        new C$$AutoValue_SegmentStateItem(stateData, str) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_SegmentStateItem

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_SegmentStateItem$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SegmentStateItem> {
                private final TypeAdapter<StateData> dataAdapter;
                private StateData defaultData = null;
                private String defaultPreconditionId = null;
                private final TypeAdapter<String> preconditionIdAdapter;

                public GsonTypeAdapter setDefaultData(StateData stateData) {
                    this.defaultData = stateData;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.dataAdapter = gson.getAdapter(StateData.class);
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SegmentStateItem segmentStateItem) {
                    if (segmentStateItem == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, segmentStateItem.data());
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, segmentStateItem.preconditionId());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public SegmentStateItem read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    StateData stateData = this.defaultData;
                    String str = this.defaultPreconditionId;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                stateData = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_SegmentStateItem(stateData, str);
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
