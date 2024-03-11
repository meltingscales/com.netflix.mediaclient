package com.netflix.model.leafs.originals.interactive.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.template.LayoutTimer;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_LayoutTimer_SpriteSheetTimer extends C$AutoValue_LayoutTimer_SpriteSheetTimer {
    public static final Parcelable.Creator<AutoValue_LayoutTimer_SpriteSheetTimer> CREATOR = new Parcelable.Creator<AutoValue_LayoutTimer_SpriteSheetTimer>() { // from class: com.netflix.model.leafs.originals.interactive.template.AutoValue_LayoutTimer_SpriteSheetTimer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_SpriteSheetTimer createFromParcel(Parcel parcel) {
            return new AutoValue_LayoutTimer_SpriteSheetTimer(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(LayoutTimer.SpriteSheetTimer.class.getClassLoader()), parcel.readHashMap(LayoutTimer.SpriteSheetTimer.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(LayoutTimer.SpriteSheetTimer.class.getClassLoader()), parcel.readArrayList(LayoutTimer.SpriteSheetTimer.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(LayoutTimer.SpriteSheetTimer.class.getClassLoader()), (ImageAssetId) parcel.readParcelable(LayoutTimer.SpriteSheetTimer.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LayoutTimer_SpriteSheetTimer[] newArray(int i) {
            return new AutoValue_LayoutTimer_SpriteSheetTimer[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LayoutTimer_SpriteSheetTimer(final String str, final String str2, final String str3, final Map<String, AnimationTemplateId> map, final Map<String, VisualStateDefinition> map2, final ImageAssetId imageAssetId, final List<Integer> list, final ImageAssetId imageAssetId2, final ImageAssetId imageAssetId3) {
        new C$$AutoValue_LayoutTimer_SpriteSheetTimer(str, str2, str3, map, map2, imageAssetId, list, imageAssetId2, imageAssetId3) { // from class: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_SpriteSheetTimer

            /* renamed from: com.netflix.model.leafs.originals.interactive.template.$AutoValue_LayoutTimer_SpriteSheetTimer$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<LayoutTimer.SpriteSheetTimer> {
                private final TypeAdapter<ImageAssetId> failAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<ImageAssetId> imageAdapter;
                private final TypeAdapter<ImageAssetId> passAdapter;
                private final TypeAdapter<String> styleIdAdapter;
                private final TypeAdapter<String> typeAdapter;
                private final TypeAdapter<Map<String, AnimationTemplateId>> visualStateTransitionsAdapter;
                private final TypeAdapter<Map<String, VisualStateDefinition>> visualStatesAdapter;
                private final TypeAdapter<List<Integer>> yOffsetsAdapter;
                private String defaultId = null;
                private String defaultType = null;
                private String defaultStyleId = null;
                private Map<String, AnimationTemplateId> defaultVisualStateTransitions = null;
                private Map<String, VisualStateDefinition> defaultVisualStates = null;
                private ImageAssetId defaultImage = null;
                private List<Integer> defaultYOffsets = null;
                private ImageAssetId defaultPass = null;
                private ImageAssetId defaultFail = null;

                public GsonTypeAdapter setDefaultFail(ImageAssetId imageAssetId) {
                    this.defaultFail = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultImage(ImageAssetId imageAssetId) {
                    this.defaultImage = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultPass(ImageAssetId imageAssetId) {
                    this.defaultPass = imageAssetId;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyleId(String str) {
                    this.defaultStyleId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultType(String str) {
                    this.defaultType = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStateTransitions(Map<String, AnimationTemplateId> map) {
                    this.defaultVisualStateTransitions = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultVisualStates(Map<String, VisualStateDefinition> map) {
                    this.defaultVisualStates = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultYOffsets(List<Integer> list) {
                    this.defaultYOffsets = list;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.typeAdapter = gson.getAdapter(String.class);
                    this.styleIdAdapter = gson.getAdapter(String.class);
                    this.visualStateTransitionsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, AnimationTemplateId.class));
                    this.visualStatesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, VisualStateDefinition.class));
                    this.imageAdapter = gson.getAdapter(ImageAssetId.class);
                    this.yOffsetsAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, Integer.class));
                    this.passAdapter = gson.getAdapter(ImageAssetId.class);
                    this.failAdapter = gson.getAdapter(ImageAssetId.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, LayoutTimer.SpriteSheetTimer spriteSheetTimer) {
                    if (spriteSheetTimer == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, spriteSheetTimer.id());
                    jsonWriter.name("type");
                    this.typeAdapter.write(jsonWriter, spriteSheetTimer.type());
                    jsonWriter.name("styleId");
                    this.styleIdAdapter.write(jsonWriter, spriteSheetTimer.styleId());
                    jsonWriter.name("visualStateTransitions");
                    this.visualStateTransitionsAdapter.write(jsonWriter, spriteSheetTimer.visualStateTransitions());
                    jsonWriter.name("visualStates");
                    this.visualStatesAdapter.write(jsonWriter, spriteSheetTimer.visualStates());
                    jsonWriter.name("image");
                    this.imageAdapter.write(jsonWriter, spriteSheetTimer.image());
                    jsonWriter.name("yOffsets");
                    this.yOffsetsAdapter.write(jsonWriter, spriteSheetTimer.yOffsets());
                    jsonWriter.name("pass");
                    this.passAdapter.write(jsonWriter, spriteSheetTimer.pass());
                    jsonWriter.name("fail");
                    this.failAdapter.write(jsonWriter, spriteSheetTimer.fail());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public LayoutTimer.SpriteSheetTimer read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    String str = this.defaultId;
                    String str2 = this.defaultType;
                    String str3 = this.defaultStyleId;
                    Map<String, AnimationTemplateId> map = this.defaultVisualStateTransitions;
                    Map<String, VisualStateDefinition> map2 = this.defaultVisualStates;
                    ImageAssetId imageAssetId = this.defaultImage;
                    List<Integer> list = this.defaultYOffsets;
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Map<String, AnimationTemplateId> map3 = map;
                    Map<String, VisualStateDefinition> map4 = map2;
                    ImageAssetId imageAssetId2 = imageAssetId;
                    List<Integer> list2 = list;
                    ImageAssetId imageAssetId3 = this.defaultPass;
                    ImageAssetId imageAssetId4 = this.defaultFail;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1875214676:
                                    if (nextName.equals("styleId")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3355:
                                    if (nextName.equals(SignupConstants.Field.LANG_ID)) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3135262:
                                    if (nextName.equals("fail")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3433489:
                                    if (nextName.equals("pass")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3575610:
                                    if (nextName.equals("type")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 100313435:
                                    if (nextName.equals("image")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 542899079:
                                    if (nextName.equals("yOffsets")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 951359437:
                                    if (nextName.equals("visualStateTransitions")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1603916130:
                                    if (nextName.equals("visualStates")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    str6 = this.styleIdAdapter.read(jsonReader);
                                    continue;
                                case 1:
                                    str4 = this.idAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    imageAssetId4 = this.failAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    imageAssetId3 = this.passAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    str5 = this.typeAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    imageAssetId2 = this.imageAdapter.read(jsonReader);
                                    continue;
                                case 6:
                                    list2 = this.yOffsetsAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    map3 = this.visualStateTransitionsAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    map4 = this.visualStatesAdapter.read(jsonReader);
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_LayoutTimer_SpriteSheetTimer(str4, str5, str6, map3, map4, imageAssetId2, list2, imageAssetId3, imageAssetId4);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (id() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(id());
        }
        if (type() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(type());
        }
        if (styleId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(styleId());
        }
        parcel.writeMap(visualStateTransitions());
        parcel.writeMap(visualStates());
        parcel.writeParcelable(image(), i);
        parcel.writeList(yOffsets());
        parcel.writeParcelable(pass(), i);
        parcel.writeParcelable(fail(), i);
    }
}
