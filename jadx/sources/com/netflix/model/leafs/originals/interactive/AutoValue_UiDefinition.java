package com.netflix.model.leafs.originals.interactive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_UiDefinition extends C$AutoValue_UiDefinition {
    public static final Parcelable.Creator<AutoValue_UiDefinition> CREATOR = new Parcelable.Creator<AutoValue_UiDefinition>() { // from class: com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition createFromParcel(Parcel parcel) {
            return new AutoValue_UiDefinition(parcel.readHashMap(UiDefinition.class.getClassLoader()), parcel.readHashMap(UiDefinition.class.getClassLoader()), (UiDefinition.Config) parcel.readParcelable(UiDefinition.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UiDefinition[] newArray(int i) {
            return new AutoValue_UiDefinition[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_UiDefinition(Map<String, UiDefinition.Layout> map, Map<String, Style> map2, UiDefinition.Config config) {
        new C$$AutoValue_UiDefinition(map, map2, config) { // from class: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition

            /* renamed from: com.netflix.model.leafs.originals.interactive.$AutoValue_UiDefinition$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<UiDefinition> {
                private final TypeAdapter<UiDefinition.Config> configAdapter;
                private final TypeAdapter<Map<String, UiDefinition.Layout>> layoutsAdapter;
                private final TypeAdapter<Map<String, Style>> stylesAdapter;
                private Map<String, UiDefinition.Layout> defaultLayouts = null;
                private Map<String, Style> defaultStyles = null;
                private UiDefinition.Config defaultConfig = null;

                public GsonTypeAdapter setDefaultConfig(UiDefinition.Config config) {
                    this.defaultConfig = config;
                    return this;
                }

                public GsonTypeAdapter setDefaultLayouts(Map<String, UiDefinition.Layout> map) {
                    this.defaultLayouts = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultStyles(Map<String, Style> map) {
                    this.defaultStyles = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.layoutsAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, UiDefinition.Layout.class));
                    this.stylesAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, Style.class));
                    this.configAdapter = gson.getAdapter(UiDefinition.Config.class);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, UiDefinition uiDefinition) {
                    if (uiDefinition == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("layouts");
                    this.layoutsAdapter.write(jsonWriter, uiDefinition.layouts());
                    jsonWriter.name("styles");
                    this.stylesAdapter.write(jsonWriter, uiDefinition.styles());
                    jsonWriter.name("config");
                    this.configAdapter.write(jsonWriter, uiDefinition.config());
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
                public com.netflix.model.leafs.originals.interactive.UiDefinition read(com.google.gson.stream.JsonReader r9) {
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
                        java.util.Map<java.lang.String, com.netflix.model.leafs.originals.interactive.UiDefinition$Layout> r0 = r8.defaultLayouts
                        java.util.Map<java.lang.String, com.netflix.model.leafs.originals.interactive.Style> r1 = r8.defaultStyles
                        com.netflix.model.leafs.originals.interactive.UiDefinition$Config r2 = r8.defaultConfig
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
                        r5 = -1354792126(0xffffffffaf3f8342, float:-1.7417981E-10)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = -891774750(0xffffffffcad898e2, float:-7097457.0)
                        if (r4 == r5) goto L50
                        r5 = -41653623(0xfffffffffd846a89, float:-2.2001407E37)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "layouts"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "styles"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "config"
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
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, com.netflix.model.leafs.originals.interactive.UiDefinition$Layout>> r0 = r8.layoutsAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.util.Map r0 = (java.util.Map) r0
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, com.netflix.model.leafs.originals.interactive.Style>> r1 = r8.stylesAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.util.Map r1 = (java.util.Map) r1
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<com.netflix.model.leafs.originals.interactive.UiDefinition$Config> r2 = r8.configAdapter
                        java.lang.Object r2 = r2.read(r9)
                        com.netflix.model.leafs.originals.interactive.UiDefinition$Config r2 = (com.netflix.model.leafs.originals.interactive.UiDefinition.Config) r2
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition r9 = new com.netflix.model.leafs.originals.interactive.AutoValue_UiDefinition
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.C$AutoValue_UiDefinition.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.UiDefinition");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(layouts());
        parcel.writeMap(styles());
        parcel.writeParcelable(config(), i);
    }
}
