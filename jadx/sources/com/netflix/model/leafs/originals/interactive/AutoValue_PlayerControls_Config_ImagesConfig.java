package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_PlayerControls_Config_ImagesConfig extends C$AutoValue_PlayerControls_Config_ImagesConfig {
    public static final Parcelable.Creator<AutoValue_PlayerControls_Config_ImagesConfig> CREATOR = new Parcelable.Creator<AutoValue_PlayerControls_Config_ImagesConfig>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_Config_ImagesConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_Config_ImagesConfig createFromParcel(Parcel parcel) {
            return new AutoValue_PlayerControls_Config_ImagesConfig((Size) parcel.readParcelable(PlayerControls.Config.ImagesConfig.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(PlayerControls.Config.ImagesConfig.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerControls_Config_ImagesConfig[] newArray(int i) {
            return new AutoValue_PlayerControls_Config_ImagesConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_PlayerControls_Config_ImagesConfig(Size size, String str, Map<String, String> map) {
        new C$$AutoValue_PlayerControls_Config_ImagesConfig(size, str, map) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_Config_ImagesConfig

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_PlayerControls_Config_ImagesConfig$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<PlayerControls.Config.ImagesConfig> {
                private final TypeAdapter<Size> sizeAdapter;
                private final TypeAdapter<Map<String, String>> tokensAdapter;
                private final TypeAdapter<String> urlAdapter;
                private Size defaultSize = null;
                private String defaultUrl = null;
                private Map<String, String> defaultTokens = null;

                public GsonTypeAdapter setDefaultSize(Size size) {
                    this.defaultSize = size;
                    return this;
                }

                public GsonTypeAdapter setDefaultTokens(Map<String, String> map) {
                    this.defaultTokens = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultUrl(String str) {
                    this.defaultUrl = str;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.sizeAdapter = gson.getAdapter(Size.class);
                    this.urlAdapter = gson.getAdapter(String.class);
                    this.tokensAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, String.class));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, PlayerControls.Config.ImagesConfig imagesConfig) {
                    if (imagesConfig == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("size");
                    this.sizeAdapter.write(jsonWriter, imagesConfig.size());
                    jsonWriter.name(SignupConstants.Field.URL);
                    this.urlAdapter.write(jsonWriter, imagesConfig.url());
                    jsonWriter.name("tokens");
                    this.tokensAdapter.write(jsonWriter, imagesConfig.tokens());
                    jsonWriter.endObject();
                }

                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC] */
                @Override // com.google.gson.TypeAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.netflix.model.leafs.originals.interactive.PlayerControls.Config.ImagesConfig read(com.google.gson.stream.JsonReader r9) {
                    /*
                        r8 = this;
                        com.google.gson.stream.JsonToken r0 = r9.peek()
                        com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                        if (r0 != r1) goto Ld
                        r9.nextNull()
                        r9 = 0
                        return r9
                    Ld:
                        r9.beginObject()
                        com.netflix.model.leafs.originals.interactive.Size r0 = r8.defaultSize
                        java.lang.String r1 = r8.defaultUrl
                        java.util.Map<java.lang.String, java.lang.String> r2 = r8.defaultTokens
                    L16:
                        boolean r3 = r9.hasNext()
                        if (r3 == 0) goto L8b
                        java.lang.String r3 = r9.nextName()
                        com.google.gson.stream.JsonToken r4 = r9.peek()
                        com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.NULL
                        if (r4 != r5) goto L2c
                        r9.nextNull()
                        goto L16
                    L2c:
                        r3.hashCode()
                        int r4 = r3.hashCode()
                        r5 = -868186726(0xffffffffcc40859a, float:-5.0468456E7)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = 116079(0x1c56f, float:1.62661E-40)
                        if (r4 == r5) goto L50
                        r5 = 3530753(0x35e001, float:4.947639E-39)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "size"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "url"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "tokens"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L65
                    L63:
                        r3 = -1
                        goto L66
                    L65:
                        r3 = 0
                    L66:
                        if (r3 == 0) goto L82
                        if (r3 == r7) goto L79
                        if (r3 == r6) goto L70
                        r9.skipValue()
                        goto L16
                    L70:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.Size> r0 = r8.sizeAdapter
                        java.lang.Object r0 = r0.read(r9)
                        com.netflix.model.leafs.originals.interactive.Size r0 = (com.netflix.model.leafs.originals.interactive.Size) r0
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.lang.String> r1 = r8.urlAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.lang.String r1 = (java.lang.String) r1
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, java.lang.String>> r2 = r8.tokensAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.util.Map r2 = (java.util.Map) r2
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_Config_ImagesConfig r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_PlayerControls_Config_ImagesConfig
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_PlayerControls_Config_ImagesConfig.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.PlayerControls$Config$ImagesConfig");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(size(), i);
        if (url() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(url());
        }
        parcel.writeMap(tokens());
    }
}
