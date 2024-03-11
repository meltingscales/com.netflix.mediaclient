package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_InteractiveAnimation extends C$AutoValue_InteractiveAnimation {
    public static final Parcelable.Creator<AutoValue_InteractiveAnimation> CREATOR = new Parcelable.Creator<AutoValue_InteractiveAnimation>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_InteractiveAnimation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveAnimation createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Float valueOf = parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null;
            Float valueOf2 = parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null;
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            Float valueOf3 = parcel.readInt() == 0 ? Float.valueOf(parcel.readFloat()) : null;
            boolean z = parcel.readInt() == 1;
            HashMap readHashMap = parcel.readHashMap(InteractiveAnimation.class.getClassLoader());
            Ease ease = (Ease) parcel.readParcelable(InteractiveAnimation.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer valueOf5 = parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            }
            return new AutoValue_InteractiveAnimation(valueOf, valueOf2, readLong, readLong2, valueOf3, z, readHashMap, ease, valueOf4, valueOf5, bool, parcel.readInt() == 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_InteractiveAnimation[] newArray(int i) {
            return new AutoValue_InteractiveAnimation[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_InteractiveAnimation(Float f, Float f2, long j, long j2, Float f3, boolean z, Map<String, Float> map, Ease ease, Integer num, Integer num2, Boolean bool, boolean z2) {
        new C$$AutoValue_InteractiveAnimation(f, f2, j, j2, f3, z, map, ease, num, num2, bool, z2) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_InteractiveAnimation

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_InteractiveAnimation$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<InteractiveAnimation> {
                private final TypeAdapter<Long> delayAdapter;
                private final TypeAdapter<Float> deltaAdapter;
                private final TypeAdapter<Long> durationAdapter;
                private final TypeAdapter<Ease> easeAdapter;
                private final TypeAdapter<Boolean> fromOriginAdapter;
                private final TypeAdapter<Float> fromValueAdapter;
                private final TypeAdapter<Map<String, Float>> pivotAdapter;
                private final TypeAdapter<Integer> repeatCountAdapter;
                private final TypeAdapter<Integer> repeatSequenceCountAdapter;
                private final TypeAdapter<Boolean> reverseAdapter;
                private final TypeAdapter<Boolean> shouldBeRelativeToLastValueAdapter;
                private final TypeAdapter<Float> toValueAdapter;
                private Float defaultFromValue = null;
                private Float defaultToValue = null;
                private long defaultDelay = 0;
                private long defaultDuration = 0;
                private Float defaultDelta = null;
                private boolean defaultFromOrigin = false;
                private Map<String, Float> defaultPivot = null;
                private Ease defaultEase = null;
                private Integer defaultRepeatSequenceCount = null;
                private Integer defaultRepeatCount = null;
                private Boolean defaultReverse = null;
                private boolean defaultShouldBeRelativeToLastValue = false;

                public GsonTypeAdapter setDefaultDelay(long j) {
                    this.defaultDelay = j;
                    return this;
                }

                public GsonTypeAdapter setDefaultDelta(Float f) {
                    this.defaultDelta = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultDuration(long j) {
                    this.defaultDuration = j;
                    return this;
                }

                public GsonTypeAdapter setDefaultEase(Ease ease) {
                    this.defaultEase = ease;
                    return this;
                }

                public GsonTypeAdapter setDefaultFromOrigin(boolean z) {
                    this.defaultFromOrigin = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultFromValue(Float f) {
                    this.defaultFromValue = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultPivot(Map<String, Float> map) {
                    this.defaultPivot = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultRepeatCount(Integer num) {
                    this.defaultRepeatCount = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultRepeatSequenceCount(Integer num) {
                    this.defaultRepeatSequenceCount = num;
                    return this;
                }

                public GsonTypeAdapter setDefaultReverse(Boolean bool) {
                    this.defaultReverse = bool;
                    return this;
                }

                public GsonTypeAdapter setDefaultShouldBeRelativeToLastValue(boolean z) {
                    this.defaultShouldBeRelativeToLastValue = z;
                    return this;
                }

                public GsonTypeAdapter setDefaultToValue(Float f) {
                    this.defaultToValue = f;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.fromValueAdapter = gson.getAdapter(Float.class);
                    this.toValueAdapter = gson.getAdapter(Float.class);
                    this.delayAdapter = gson.getAdapter(Long.class);
                    this.durationAdapter = gson.getAdapter(Long.class);
                    this.deltaAdapter = gson.getAdapter(Float.class);
                    this.fromOriginAdapter = gson.getAdapter(Boolean.class);
                    this.pivotAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Float.class));
                    this.easeAdapter = gson.getAdapter(Ease.class);
                    this.repeatSequenceCountAdapter = gson.getAdapter(Integer.class);
                    this.repeatCountAdapter = gson.getAdapter(Integer.class);
                    this.reverseAdapter = gson.getAdapter(Boolean.class);
                    this.shouldBeRelativeToLastValueAdapter = gson.getAdapter(Boolean.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, InteractiveAnimation interactiveAnimation) {
                    if (interactiveAnimation == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("fromValue");
                    this.fromValueAdapter.write(jsonWriter, interactiveAnimation.fromValue());
                    jsonWriter.name("toValue");
                    this.toValueAdapter.write(jsonWriter, interactiveAnimation.toValue());
                    jsonWriter.name("delay");
                    this.delayAdapter.write(jsonWriter, Long.valueOf(interactiveAnimation.delay()));
                    jsonWriter.name("duration");
                    this.durationAdapter.write(jsonWriter, Long.valueOf(interactiveAnimation.duration()));
                    jsonWriter.name("delta");
                    this.deltaAdapter.write(jsonWriter, interactiveAnimation.delta());
                    jsonWriter.name("fromOrigin");
                    this.fromOriginAdapter.write(jsonWriter, Boolean.valueOf(interactiveAnimation.fromOrigin()));
                    jsonWriter.name("pivot");
                    this.pivotAdapter.write(jsonWriter, interactiveAnimation.pivot());
                    jsonWriter.name("ease");
                    this.easeAdapter.write(jsonWriter, interactiveAnimation.ease());
                    jsonWriter.name("repeatSequenceCount");
                    this.repeatSequenceCountAdapter.write(jsonWriter, interactiveAnimation.repeatSequenceCount());
                    jsonWriter.name("repeatCount");
                    this.repeatCountAdapter.write(jsonWriter, interactiveAnimation.repeatCount());
                    jsonWriter.name("reverse");
                    this.reverseAdapter.write(jsonWriter, interactiveAnimation.reverse());
                    jsonWriter.name("shouldBeRelativeToLastValue");
                    this.shouldBeRelativeToLastValueAdapter.write(jsonWriter, Boolean.valueOf(interactiveAnimation.shouldBeRelativeToLastValue()));
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                public InteractiveAnimation read(JsonReader jsonReader) {
                    char c;
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    Float f = this.defaultFromValue;
                    Float f2 = this.defaultToValue;
                    long j = this.defaultDelay;
                    long j2 = this.defaultDuration;
                    Float f3 = this.defaultDelta;
                    boolean z = this.defaultFromOrigin;
                    Map<String, Float> map = this.defaultPivot;
                    Ease ease = this.defaultEase;
                    Integer num = this.defaultRepeatSequenceCount;
                    Integer num2 = this.defaultRepeatCount;
                    Float f4 = f;
                    Float f5 = f2;
                    long j3 = j;
                    long j4 = j2;
                    Float f6 = f3;
                    boolean z2 = z;
                    Map<String, Float> map2 = map;
                    Ease ease2 = ease;
                    Integer num3 = num;
                    Integer num4 = num2;
                    Boolean bool = this.defaultReverse;
                    boolean z3 = this.defaultShouldBeRelativeToLastValue;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        if (jsonReader.peek() == JsonToken.NULL) {
                            jsonReader.nextNull();
                        } else {
                            nextName.hashCode();
                            switch (nextName.hashCode()) {
                                case -1992012396:
                                    if (nextName.equals("duration")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1163499594:
                                    if (nextName.equals("toValue")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -737488909:
                                    if (nextName.equals("repeatSequenceCount")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 3105774:
                                    if (nextName.equals("ease")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 71812071:
                                    if (nextName.equals("fromValue")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 95467907:
                                    if (nextName.equals("delay")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 95468472:
                                    if (nextName.equals("delta")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 106679362:
                                    if (nextName.equals("pivot")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1099846370:
                                    if (nextName.equals("reverse")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1571519540:
                                    if (nextName.equals("repeatCount")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1904987294:
                                    if (nextName.equals("shouldBeRelativeToLastValue")) {
                                        c = '\n';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 2041367408:
                                    if (nextName.equals("fromOrigin")) {
                                        c = 11;
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
                                    j4 = this.durationAdapter.read(jsonReader).longValue();
                                    continue;
                                case 1:
                                    f5 = this.toValueAdapter.read(jsonReader);
                                    continue;
                                case 2:
                                    num3 = this.repeatSequenceCountAdapter.read(jsonReader);
                                    continue;
                                case 3:
                                    ease2 = this.easeAdapter.read(jsonReader);
                                    continue;
                                case 4:
                                    f4 = this.fromValueAdapter.read(jsonReader);
                                    continue;
                                case 5:
                                    j3 = this.delayAdapter.read(jsonReader).longValue();
                                    continue;
                                case 6:
                                    f6 = this.deltaAdapter.read(jsonReader);
                                    continue;
                                case 7:
                                    map2 = this.pivotAdapter.read(jsonReader);
                                    continue;
                                case '\b':
                                    bool = this.reverseAdapter.read(jsonReader);
                                    continue;
                                case '\t':
                                    num4 = this.repeatCountAdapter.read(jsonReader);
                                    continue;
                                case '\n':
                                    z3 = this.shouldBeRelativeToLastValueAdapter.read(jsonReader).booleanValue();
                                    continue;
                                case 11:
                                    z2 = this.fromOriginAdapter.read(jsonReader).booleanValue();
                                    continue;
                                default:
                                    jsonReader.skipValue();
                                    continue;
                            }
                        }
                    }
                    jsonReader.endObject();
                    return new AutoValue_InteractiveAnimation(f4, f5, j3, j4, f6, z2, map2, ease2, num3, num4, bool, z3);
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (fromValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(fromValue().floatValue());
        }
        if (toValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(toValue().floatValue());
        }
        parcel.writeLong(delay());
        parcel.writeLong(duration());
        if (delta() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeFloat(delta().floatValue());
        }
        parcel.writeInt(fromOrigin() ? 1 : 0);
        parcel.writeMap(pivot());
        parcel.writeParcelable(ease(), i);
        if (repeatSequenceCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(repeatSequenceCount().intValue());
        }
        if (repeatCount() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(repeatCount().intValue());
        }
        if (reverse() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(reverse().booleanValue() ? 1 : 0);
        }
        parcel.writeInt(shouldBeRelativeToLastValue() ? 1 : 0);
    }
}
