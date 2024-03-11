package com.netflix.model.leafs.social;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_FriendProfile extends C$AutoValue_FriendProfile {
    public static final Parcelable.Creator<AutoValue_FriendProfile> CREATOR = new Parcelable.Creator<AutoValue_FriendProfile>() { // from class: com.netflix.model.leafs.social.AutoValue_FriendProfile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FriendProfile createFromParcel(Parcel parcel) {
            return new AutoValue_FriendProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FriendProfile[] newArray(int i) {
            return new AutoValue_FriendProfile[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_FriendProfile(final String str, final String str2, final String str3, final String str4, final String str5) {
        new C$$AutoValue_FriendProfile(str, str2, str3, str4, str5) { // from class: com.netflix.model.leafs.social.$AutoValue_FriendProfile

            /* renamed from: com.netflix.model.leafs.social.$AutoValue_FriendProfile$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<FriendProfile> {
                private final TypeAdapter<String> bigImageUrlAdapter;
                private final TypeAdapter<String> firstNameAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<String> imageUrlAdapter;
                private final TypeAdapter<String> lastNameAdapter;
                private String defaultId = null;
                private String defaultFirstName = null;
                private String defaultLastName = null;
                private String defaultImageUrl = null;
                private String defaultBigImageUrl = null;

                public GsonTypeAdapter setDefaultBigImageUrl(String str) {
                    this.defaultBigImageUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultFirstName(String str) {
                    this.defaultFirstName = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImageUrl(String str) {
                    this.defaultImageUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultLastName(String str) {
                    this.defaultLastName = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.firstNameAdapter = gson.getAdapter(String.class);
                    this.lastNameAdapter = gson.getAdapter(String.class);
                    this.imageUrlAdapter = gson.getAdapter(String.class);
                    this.bigImageUrlAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, FriendProfile friendProfile) {
                    if (friendProfile == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, friendProfile.id());
                    jsonWriter.name(SignupConstants.Field.FIRST_NAME);
                    this.firstNameAdapter.write(jsonWriter, friendProfile.firstName());
                    jsonWriter.name(SignupConstants.Field.LAST_NAME);
                    this.lastNameAdapter.write(jsonWriter, friendProfile.lastName());
                    jsonWriter.name("imageUrl");
                    this.imageUrlAdapter.write(jsonWriter, friendProfile.imageUrl());
                    jsonWriter.name("bigImageUrl");
                    this.bigImageUrlAdapter.write(jsonWriter, friendProfile.bigImageUrl());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public FriendProfile read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultFirstName;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.defaultLastName;
                    String str6 = this.defaultImageUrl;
                    String str7 = this.defaultBigImageUrl;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1459599807:
                                    if (nextName.equals(SignupConstants.Field.LAST_NAME)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1445838028:
                                    if (nextName.equals("bigImageUrl")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -859610604:
                                    if (nextName.equals("imageUrl")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 132835675:
                                    if (nextName.equals(SignupConstants.Field.FIRST_NAME)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                str5 = this.lastNameAdapter.read(jsonReader);
                            } else if (c == 1) {
                                str7 = this.bigImageUrlAdapter.read(jsonReader);
                            } else if (c == 2) {
                                str6 = this.imageUrlAdapter.read(jsonReader);
                            } else if (c == 3) {
                                str3 = this.idAdapter.read(jsonReader);
                            } else if (c == 4) {
                                str4 = this.firstNameAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_FriendProfile(str3, str4, str5, str6, str7);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id());
        parcel.writeString(firstName());
        parcel.writeString(lastName());
        parcel.writeString(imageUrl());
        parcel.writeString(bigImageUrl());
    }
}
