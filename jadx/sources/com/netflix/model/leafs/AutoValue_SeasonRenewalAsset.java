package com.netflix.model.leafs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_SeasonRenewalAsset extends C$AutoValue_SeasonRenewalAsset {
    public static final Parcelable.Creator<AutoValue_SeasonRenewalAsset> CREATOR = new Parcelable.Creator<AutoValue_SeasonRenewalAsset>() { // from class: com.netflix.model.leafs.AutoValue_SeasonRenewalAsset.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SeasonRenewalAsset createFromParcel(Parcel parcel) {
            return new AutoValue_SeasonRenewalAsset(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SeasonRenewalAsset[] newArray(int i) {
            return new AutoValue_SeasonRenewalAsset[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SeasonRenewalAsset(final String str, final int i, final int i2, final boolean z, final int i3, final String str2) {
        new C$$AutoValue_SeasonRenewalAsset(str, i, i2, z, i3, str2) { // from class: com.netflix.model.leafs.$AutoValue_SeasonRenewalAsset

            /* renamed from: com.netflix.model.leafs.$AutoValue_SeasonRenewalAsset$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<SeasonRenewalAsset> {
                private final TypeAdapter<String> assetTypeAdapter;
                private final TypeAdapter<Integer> heightAdapter;
                private final TypeAdapter<Boolean> isBadgedAdapter;
                private final TypeAdapter<Integer> scaleAdapter;
                private final TypeAdapter<String> urlAdapter;
                private final TypeAdapter<Integer> widthAdapter;
                private String defaultUrl = null;
                private int defaultWidth = 0;
                private int defaultHeight = 0;
                private boolean defaultIsBadged = false;
                private int defaultScale = 0;
                private String defaultAssetType = null;

                public GsonTypeAdapter setDefaultAssetType(String str) {
                    this.defaultAssetType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultHeight(int i) {
                    this.defaultHeight = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultIsBadged(boolean z) {
                    this.defaultIsBadged = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultScale(int i) {
                    this.defaultScale = i;
                    return this;
                }

                public GsonTypeAdapter setDefaultUrl(String str) {
                    this.defaultUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultWidth(int i) {
                    this.defaultWidth = i;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.urlAdapter = gson.getAdapter(String.class);
                    this.widthAdapter = gson.getAdapter(Integer.class);
                    this.heightAdapter = gson.getAdapter(Integer.class);
                    this.isBadgedAdapter = gson.getAdapter(Boolean.class);
                    this.scaleAdapter = gson.getAdapter(Integer.class);
                    this.assetTypeAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, SeasonRenewalAsset seasonRenewalAsset) {
                    if (seasonRenewalAsset == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.URL);
                    this.urlAdapter.write(jsonWriter, seasonRenewalAsset.url());
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
                    this.widthAdapter.write(jsonWriter, Integer.valueOf(seasonRenewalAsset.width()));
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
                    this.heightAdapter.write(jsonWriter, Integer.valueOf(seasonRenewalAsset.height()));
                    jsonWriter.name("isBadged");
                    this.isBadgedAdapter.write(jsonWriter, Boolean.valueOf(seasonRenewalAsset.isBadged()));
                    jsonWriter.name(InteractiveAnimation.ANIMATION_TYPE.SCALE);
                    this.scaleAdapter.write(jsonWriter, Integer.valueOf(seasonRenewalAsset.scale()));
                    jsonWriter.name("assetType");
                    this.assetTypeAdapter.write(jsonWriter, seasonRenewalAsset.assetType());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public SeasonRenewalAsset read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultUrl;
                    int i = this.defaultWidth;
                    int i2 = this.defaultHeight;
                    String str2 = str;
                    int i3 = i;
                    int i4 = i2;
                    boolean z = this.defaultIsBadged;
                    int i5 = this.defaultScale;
                    String str3 = this.defaultAssetType;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1221029593:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.HEIGHT)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -722613525:
                                    if (nextName.equals("isBadged")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 116079:
                                    if (nextName.equals(SignupConstants.Field.URL)) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 109250890:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.SCALE)) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 113126854:
                                    if (nextName.equals(InteractiveAnimation.ANIMATION_TYPE.WIDTH)) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1315305034:
                                    if (nextName.equals("assetType")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i4 = this.heightAdapter.read(jsonReader).intValue();
                            } else if (c == 1) {
                                z = this.isBadgedAdapter.read(jsonReader).booleanValue();
                            } else if (c == 2) {
                                str2 = this.urlAdapter.read(jsonReader);
                            } else if (c == 3) {
                                i5 = this.scaleAdapter.read(jsonReader).intValue();
                            } else if (c == 4) {
                                i3 = this.widthAdapter.read(jsonReader).intValue();
                            } else if (c == 5) {
                                str3 = this.assetTypeAdapter.read(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_SeasonRenewalAsset(str2, i3, i4, z, i5, str3);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(url());
        parcel.writeInt(width());
        parcel.writeInt(height());
        parcel.writeInt(isBadged() ? 1 : 0);
        parcel.writeInt(scale());
        parcel.writeString(assetType());
    }
}
