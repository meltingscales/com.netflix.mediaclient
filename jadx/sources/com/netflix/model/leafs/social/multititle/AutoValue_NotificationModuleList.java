package com.netflix.model.leafs.social.multititle;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_NotificationModuleList extends C$AutoValue_NotificationModuleList {
    public static final Parcelable.Creator<AutoValue_NotificationModuleList> CREATOR = new Parcelable.Creator<AutoValue_NotificationModuleList>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationModuleList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationModuleList createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationModuleList(parcel.readArrayList(NotificationModuleList.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationModuleList[] newArray(int i) {
            return new AutoValue_NotificationModuleList[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationModuleList(final List<NotificationModule> list) {
        new C$$AutoValue_NotificationModuleList(list) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationModuleList

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationModuleList$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationModuleList> {
                private List<NotificationModule> defaultModules = null;
                private final TypeAdapter<List<NotificationModule>> modulesAdapter;

                public GsonTypeAdapter setDefaultModules(List<NotificationModule> list) {
                    this.defaultModules = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.modulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, NotificationModule.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationModuleList notificationModuleList) {
                    if (notificationModuleList == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("modules");
                    this.modulesAdapter.write(jsonWriter, notificationModuleList.modules());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationModuleList read(JsonReader jsonReader) {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<NotificationModule> list = this.defaultModules;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            if (nextName.equals("modules")) {
                                list = this.modulesAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationModuleList(list);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(modules());
    }
}
