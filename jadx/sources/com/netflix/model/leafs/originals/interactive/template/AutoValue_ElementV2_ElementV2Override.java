package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ElementV2_ElementV2Override extends C$AutoValue_ElementV2_ElementV2Override {
    public static final Parcelable.Creator<AutoValue_ElementV2_ElementV2Override> CREATOR = new Parcelable.Creator<AutoValue_ElementV2_ElementV2Override>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_ElementV2_ElementV2Override.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ElementV2_ElementV2Override createFromParcel(Parcel parcel) {
            return new AutoValue_ElementV2_ElementV2Override(parcel.readInt() == 0 ? parcel.readString() : null, (ElementV2) parcel.readParcelable(ElementV2.ElementV2Override.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ElementV2_ElementV2Override[] newArray(int i) {
            return new AutoValue_ElementV2_ElementV2Override[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ElementV2_ElementV2Override(String str, ElementV2 elementV2) {
        new C$$AutoValue_ElementV2_ElementV2Override(str, elementV2) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ElementV2_ElementV2Override

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_ElementV2_ElementV2Override$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ElementV2.ElementV2Override> {
                private final TypeAdapter<ElementV2> dataAdapter;
                private final TypeAdapter<String> preconditionIdAdapter;
                private String defaultPreconditionId = null;
                private ElementV2 defaultData = null;

                public GsonTypeAdapter setDefaultData(ElementV2 elementV2) {
                    this.defaultData = elementV2;
                    return this;
                }

                public GsonTypeAdapter setDefaultPreconditionId(String str) {
                    this.defaultPreconditionId = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.preconditionIdAdapter = gson.getAdapter(String.class);
                    this.dataAdapter = gson.getAdapter(ElementV2.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ElementV2.ElementV2Override elementV2Override) {
                    if (elementV2Override == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("preconditionId");
                    this.preconditionIdAdapter.write(jsonWriter, elementV2Override.preconditionId());
                    jsonWriter.name(NotificationFactory.DATA);
                    this.dataAdapter.write(jsonWriter, elementV2Override.data());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public ElementV2.ElementV2Override read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultPreconditionId;
                    ElementV2 elementV2 = this.defaultData;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals(NotificationFactory.DATA)) {
                                elementV2 = this.dataAdapter.read(jsonReader);
                            } else if (nextName.equals("preconditionId")) {
                                str = this.preconditionIdAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_ElementV2_ElementV2Override(str, elementV2);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (preconditionId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(preconditionId());
        }
        parcel.writeParcelable(data(), i);
    }
}
