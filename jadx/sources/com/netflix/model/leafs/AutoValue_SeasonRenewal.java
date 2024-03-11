package com.netflix.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SeasonRenewal extends C$AutoValue_SeasonRenewal {
    public static final Parcelable.Creator<AutoValue_SeasonRenewal> CREATOR = new Parcelable.Creator<AutoValue_SeasonRenewal>() { // from class: com.netflix.model.leafs.AutoValue_SeasonRenewal.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SeasonRenewal createFromParcel(Parcel parcel) {
            return new AutoValue_SeasonRenewal(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt(), parcel.readInt(), parcel.readHashMap(SeasonRenewal.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SeasonRenewal[] newArray(int i) {
            return new AutoValue_SeasonRenewal[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SeasonRenewal(String str, boolean z, int i, int i2, Map<String, SeasonRenewalAsset> map) {
        new C$$AutoValue_SeasonRenewal(str, z, i, i2, map) { // from class: com.netflix.model.leafs.$AutoValue_SeasonRenewal

            /* renamed from: com.netflix.model.leafs.$AutoValue_SeasonRenewal$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SeasonRenewal> {
                private final TypeAdapter<Map<String, SeasonRenewalAsset>> assetsAdapter;
                private final TypeAdapter<Integer> autoPlaySecondsAdapter;
                private final TypeAdapter<Boolean> displayUpNextAdapter;
                private final TypeAdapter<String> messageAdapter;
                private final TypeAdapter<Integer> watchedTopNodeidAdapter;
                private String defaultMessage = null;
                private boolean defaultDisplayUpNext = false;
                private int defaultAutoPlaySeconds = 0;
                private int defaultWatchedTopNodeid = 0;
                private Map<String, SeasonRenewalAsset> defaultAssets = null;

                public GsonTypeAdapter setDefaultAssets(Map<String, SeasonRenewalAsset> map) {
                    this.defaultAssets = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultAutoPlaySeconds(int i) {
                    this.defaultAutoPlaySeconds = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultDisplayUpNext(boolean z) {
                    this.defaultDisplayUpNext = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultMessage(String str) {
                    this.defaultMessage = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultWatchedTopNodeid(int i) {
                    this.defaultWatchedTopNodeid = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.messageAdapter = gson.getAdapter(String.class);
                    this.displayUpNextAdapter = gson.getAdapter(Boolean.class);
                    this.autoPlaySecondsAdapter = gson.getAdapter(Integer.class);
                    this.watchedTopNodeidAdapter = gson.getAdapter(Integer.class);
                    this.assetsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, SeasonRenewalAsset.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SeasonRenewal seasonRenewal) {
                    if (seasonRenewal == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("message");
                    this.messageAdapter.write(jsonWriter, seasonRenewal.message());
                    jsonWriter.name("displayUpNext");
                    this.displayUpNextAdapter.write(jsonWriter, Boolean.valueOf(seasonRenewal.displayUpNext()));
                    jsonWriter.name("autoPlaySeconds");
                    this.autoPlaySecondsAdapter.write(jsonWriter, Integer.valueOf(seasonRenewal.autoPlaySeconds()));
                    jsonWriter.name("watchedTopNodeid");
                    this.watchedTopNodeidAdapter.write(jsonWriter, Integer.valueOf(seasonRenewal.watchedTopNodeid()));
                    jsonWriter.name("assets");
                    this.assetsAdapter.write(jsonWriter, seasonRenewal.assets());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public SeasonRenewal read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultMessage;
                    boolean z = this.defaultDisplayUpNext;
                    String str2 = str;
                    boolean z2 = z;
                    int i = this.defaultAutoPlaySeconds;
                    int i2 = this.defaultWatchedTopNodeid;
                    Map<String, SeasonRenewalAsset> map = this.defaultAssets;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1756941424:
                                    if (nextName.equals("displayUpNext")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1408207997:
                                    if (nextName.equals("assets")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 677914180:
                                    if (nextName.equals("watchedTopNodeid")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 954925063:
                                    if (nextName.equals("message")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1717291900:
                                    if (nextName.equals("autoPlaySeconds")) {
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
                                z2 = this.displayUpNextAdapter.read(jsonReader).booleanValue();
                            } else if (c == 1) {
                                map = this.assetsAdapter.read(jsonReader);
                            } else if (c == 2) {
                                i2 = this.watchedTopNodeidAdapter.read(jsonReader).intValue();
                            } else if (c == 3) {
                                str2 = this.messageAdapter.read(jsonReader);
                            } else if (c == 4) {
                                i = this.autoPlaySecondsAdapter.read(jsonReader).intValue();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_SeasonRenewal(str2, z2, i, i2, map);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (message() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(message());
        }
        parcel.writeInt(displayUpNext() ? 1 : 0);
        parcel.writeInt(autoPlaySeconds());
        parcel.writeInt(watchedTopNodeid());
        parcel.writeMap(assets());
    }
}
