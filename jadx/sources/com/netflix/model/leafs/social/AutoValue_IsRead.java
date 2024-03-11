package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_IsRead extends C$AutoValue_IsRead {
    public static final Parcelable.Creator<AutoValue_IsRead> CREATOR = new Parcelable.Creator<AutoValue_IsRead>() { // from class: com.netflix.model.leafs.social.AutoValue_IsRead.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_IsRead createFromParcel(Parcel parcel) {
            return new AutoValue_IsRead(parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_IsRead[] newArray(int i) {
            return new AutoValue_IsRead[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_IsRead(final boolean z) {
        new C$$AutoValue_IsRead(z) { // from class: com.netflix.model.leafs.social.$AutoValue_IsRead

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_IsRead$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<IsRead> {
                private boolean defaultRead = false;
                private final TypeAdapter<Boolean> readAdapter;

                public GsonTypeAdapter setDefaultRead(boolean z) {
                    this.defaultRead = z;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.readAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, IsRead isRead) {
                    if (isRead == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("isRead");
                    this.readAdapter.write(jsonWriter, Boolean.valueOf(isRead.read()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public IsRead read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    boolean z = this.defaultRead;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("isRead")) {
                                z = this.readAdapter.read(jsonReader).booleanValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_IsRead(z);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(read() ? 1 : 0);
    }
}
