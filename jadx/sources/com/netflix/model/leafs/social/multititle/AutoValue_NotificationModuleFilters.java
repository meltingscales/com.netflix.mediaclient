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
public final class AutoValue_NotificationModuleFilters extends C$AutoValue_NotificationModuleFilters {
    public static final Parcelable.Creator<AutoValue_NotificationModuleFilters> CREATOR = new Parcelable.Creator<AutoValue_NotificationModuleFilters>() { // from class: com.netflix.model.leafs.social.multititle.AutoValue_NotificationModuleFilters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationModuleFilters createFromParcel(Parcel parcel) {
            return new AutoValue_NotificationModuleFilters(parcel.readArrayList(NotificationModuleFilters.class.getClassLoader()), parcel.readArrayList(NotificationModuleFilters.class.getClassLoader()), parcel.readArrayList(NotificationModuleFilters.class.getClassLoader()), parcel.readArrayList(NotificationModuleFilters.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_NotificationModuleFilters[] newArray(int i) {
            return new AutoValue_NotificationModuleFilters[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NotificationModuleFilters(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        new C$$AutoValue_NotificationModuleFilters(list, list2, list3, list4) { // from class: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationModuleFilters

            /* renamed from: com.netflix.model.leafs.social.multititle.$AutoValue_NotificationModuleFilters$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<NotificationModuleFilters> {
                private final TypeAdapter<List<String>> ratingInputActionFilteredModulesAdapter;
                private final TypeAdapter<List<String>> thumbsDownActionFilteredModulesAdapter;
                private final TypeAdapter<List<String>> thumbsUpActionFilteredModulesAdapter;
                private final TypeAdapter<List<String>> thumbsUpDoubleActionFilteredModulesAdapter;
                private List<String> defaultThumbsUpActionFilteredModules = null;
                private List<String> defaultThumbsUpDoubleActionFilteredModules = null;
                private List<String> defaultThumbsDownActionFilteredModules = null;
                private List<String> defaultRatingInputActionFilteredModules = null;

                public GsonTypeAdapter setDefaultRatingInputActionFilteredModules(List<String> list) {
                    this.defaultRatingInputActionFilteredModules = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultThumbsDownActionFilteredModules(List<String> list) {
                    this.defaultThumbsDownActionFilteredModules = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultThumbsUpActionFilteredModules(List<String> list) {
                    this.defaultThumbsUpActionFilteredModules = list;
                    return this;
                }

                public GsonTypeAdapter setDefaultThumbsUpDoubleActionFilteredModules(List<String> list) {
                    this.defaultThumbsUpDoubleActionFilteredModules = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.thumbsUpActionFilteredModulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.thumbsUpDoubleActionFilteredModulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.thumbsDownActionFilteredModulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                    this.ratingInputActionFilteredModulesAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, NotificationModuleFilters notificationModuleFilters) {
                    if (notificationModuleFilters == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("thumbsUp");
                    this.thumbsUpActionFilteredModulesAdapter.write(jsonWriter, notificationModuleFilters.thumbsUpActionFilteredModules());
                    jsonWriter.name("thumbsUpDouble");
                    this.thumbsUpDoubleActionFilteredModulesAdapter.write(jsonWriter, notificationModuleFilters.thumbsUpDoubleActionFilteredModules());
                    jsonWriter.name("thumbsDown");
                    this.thumbsDownActionFilteredModulesAdapter.write(jsonWriter, notificationModuleFilters.thumbsDownActionFilteredModules());
                    jsonWriter.name("ratingInput");
                    this.ratingInputActionFilteredModulesAdapter.write(jsonWriter, notificationModuleFilters.ratingInputActionFilteredModules());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public NotificationModuleFilters read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    List<String> list = this.defaultThumbsUpActionFilteredModules;
                    List<String> list2 = this.defaultThumbsUpDoubleActionFilteredModules;
                    List<String> list3 = this.defaultThumbsDownActionFilteredModules;
                    List<String> list4 = this.defaultRatingInputActionFilteredModules;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1699402849:
                                    if (nextName.equals("thumbsDown")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 384970797:
                                    if (nextName.equals("ratingInput")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1566945496:
                                    if (nextName.equals("thumbsUp")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1660950217:
                                    if (nextName.equals("thumbsUpDouble")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                list3 = this.thumbsDownActionFilteredModulesAdapter.read(jsonReader);
                            } else if (c == 1) {
                                list4 = this.ratingInputActionFilteredModulesAdapter.read(jsonReader);
                            } else if (c == 2) {
                                list = this.thumbsUpActionFilteredModulesAdapter.read(jsonReader);
                            } else if (c == 3) {
                                list2 = this.thumbsUpDoubleActionFilteredModulesAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_NotificationModuleFilters(list, list2, list3, list4);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(thumbsUpActionFilteredModules());
        parcel.writeList(thumbsUpDoubleActionFilteredModules());
        parcel.writeList(thumbsDownActionFilteredModules());
        parcel.writeList(ratingInputActionFilteredModules());
    }
}
