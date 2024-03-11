package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_Audio extends C$AutoValue_Audio {
    public static final Parcelable.Creator<AutoValue_Audio> CREATOR = new Parcelable.Creator<AutoValue_Audio>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_Audio.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Audio createFromParcel(Parcel parcel) {
            return new AutoValue_Audio(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Audio[] newArray(int i) {
            return new AutoValue_Audio[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Audio(final String str, final float f, final float f2, final String str2) {
        new C$$AutoValue_Audio(str, f, f2, str2) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_Audio

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_Audio$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<Audio> {
                private final TypeAdapter<Float> delayAdapter;
                private final TypeAdapter<String> idAdapter;
                private final TypeAdapter<String> urlAdapter;
                private final TypeAdapter<Float> volumeAdapter;
                private String defaultId = null;
                private float defaultVolume = 0.0f;
                private float defaultDelay = 0.0f;
                private String defaultUrl = null;

                public GsonTypeAdapter setDefaultDelay(float f) {
                    this.defaultDelay = f;
                    return this;
                }

                public GsonTypeAdapter setDefaultId(String str) {
                    this.defaultId = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultUrl(String str) {
                    this.defaultUrl = str;
                    return this;
                }

                public GsonTypeAdapter setDefaultVolume(float f) {
                    this.defaultVolume = f;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.idAdapter = gson.getAdapter(String.class);
                    this.volumeAdapter = gson.getAdapter(Float.class);
                    this.delayAdapter = gson.getAdapter(Float.class);
                    this.urlAdapter = gson.getAdapter(String.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Audio audio) {
                    if (audio == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(SignupConstants.Field.LANG_ID);
                    this.idAdapter.write(jsonWriter, audio.id());
                    jsonWriter.name("volume");
                    this.volumeAdapter.write(jsonWriter, Float.valueOf(audio.volume()));
                    jsonWriter.name("delay");
                    this.delayAdapter.write(jsonWriter, Float.valueOf(audio.delay()));
                    jsonWriter.name(SignupConstants.Field.URL);
                    this.urlAdapter.write(jsonWriter, audio.url());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00a5 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x007a A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.Audio read(com.google.gson.stream.JsonReader r11) {
                    /*
                        r10 = this;
                        com.google.gson.stream.JsonToken r0 = r11.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r11.nextNull()
                        r11 = 0
                        return r11
                    Ld:
                        r11.beginObject()
                        java.lang.String r0 = r10.defaultId
                        float r1 = r10.defaultVolume
                        float r2 = r10.defaultDelay
                        java.lang.String r3 = r10.defaultUrl
                    L18:
                        boolean r4 = r11.hasNext()
                        if (r4 == 0) goto Lb3
                        java.lang.String r4 = r11.nextName()
                        com.google.gson.stream.JsonToken r5 = r11.peek()
                        com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                        if (r5 != r6) goto L2e
                        r11.nextNull()
                        goto L18
                    L2e:
                        r4.hashCode()
                        int r5 = r4.hashCode()
                        r6 = -810883302(0xffffffffcfaae71a, float:-5.7345444E9)
                        r7 = 3
                        r8 = 2
                        r9 = 1
                        if (r5 == r6) goto L6d
                        r6 = 3355(0xd1b, float:4.701E-42)
                        if (r5 == r6) goto L62
                        r6 = 116079(0x1c56f, float:1.62661E-40)
                        if (r5 == r6) goto L57
                        r6 = 95467907(0x5b0b983, float:1.6619107E-35)
                        if (r5 == r6) goto L4c
                        goto L75
                    L4c:
                        java.lang.String r5 = "delay"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L55
                        goto L75
                    L55:
                        r4 = r7
                        goto L78
                    L57:
                        java.lang.String r5 = "url"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L60
                        goto L75
                    L60:
                        r4 = r8
                        goto L78
                    L62:
                        java.lang.String r5 = "id"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L6b
                        goto L75
                    L6b:
                        r4 = r9
                        goto L78
                    L6d:
                        java.lang.String r5 = "volume"
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L77
                    L75:
                        r4 = -1
                        goto L78
                    L77:
                        r4 = 0
                    L78:
                        if (r4 == 0) goto La5
                        if (r4 == r9) goto L9b
                        if (r4 == r8) goto L91
                        if (r4 == r7) goto L84
                        r11.skipValue()
                        goto L18
                    L84:
                        com.google.gson.TypeAdapter<java.lang.Float> r2 = r10.delayAdapter
                        java.lang.Object r2 = r2.read(r11)
                        java.lang.Float r2 = (java.lang.Float) r2
                        float r2 = r2.floatValue()
                        goto L18
                    L91:
                        com.google.gson.TypeAdapter<java.lang.String> r3 = r10.urlAdapter
                        java.lang.Object r3 = r3.read(r11)
                        java.lang.String r3 = (java.lang.String) r3
                        goto L18
                    L9b:
                        com.google.gson.TypeAdapter<java.lang.String> r0 = r10.idAdapter
                        java.lang.Object r0 = r0.read(r11)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L18
                    La5:
                        com.google.gson.TypeAdapter<java.lang.Float> r1 = r10.volumeAdapter
                        java.lang.Object r1 = r1.read(r11)
                        java.lang.Float r1 = (java.lang.Float) r1
                        float r1 = r1.floatValue()
                        goto L18
                    Lb3:
                        r11.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_Audio r11 = new com.netflix.model.leafs.originals.interactive.AutoValue_Audio
                        r11.<init>(r0, r1, r2, r3)
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_Audio.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.Audio");
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
        parcel.writeFloat(volume());
        parcel.writeFloat(delay());
        if (url() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(url());
    }
}
