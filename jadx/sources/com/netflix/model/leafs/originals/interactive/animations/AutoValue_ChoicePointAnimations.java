package com.netflix.model.leafs.originals.interactive.animations;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_ChoicePointAnimations extends C$AutoValue_ChoicePointAnimations {
    public static final Parcelable.Creator<AutoValue_ChoicePointAnimations> CREATOR = new Parcelable.Creator<AutoValue_ChoicePointAnimations>() { // from class: com.netflix.model.leafs.originals.interactive.animations.AutoValue_ChoicePointAnimations.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ChoicePointAnimations createFromParcel(Parcel parcel) {
            return new AutoValue_ChoicePointAnimations(parcel.readHashMap(ChoicePointAnimations.class.getClassLoader()), parcel.readHashMap(ChoicePointAnimations.class.getClassLoader()), parcel.readHashMap(ChoicePointAnimations.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ChoicePointAnimations[] newArray(int i) {
            return new AutoValue_ChoicePointAnimations[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ChoicePointAnimations(Map<String, List<InteractiveAnimation>> map, Map<String, List<InteractiveAnimation>> map2, Map<String, List<InteractiveAnimation>> map3) {
        new C$$AutoValue_ChoicePointAnimations(map, map2, map3) { // from class: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_ChoicePointAnimations

            /* renamed from: com.netflix.model.leafs.originals.interactive.animations.$AutoValue_ChoicePointAnimations$GsonTypeAdapter */
            /* loaded from: classes.dex */
            public static final class GsonTypeAdapter extends TypeAdapter<ChoicePointAnimations> {
                private final TypeAdapter<Map<String, List<InteractiveAnimation>>> hideAdapter;
                private final TypeAdapter<Map<String, List<InteractiveAnimation>>> hideSelectedAdapter;
                private final TypeAdapter<Map<String, List<InteractiveAnimation>>> showAdapter;
                private Map<String, List<InteractiveAnimation>> defaultShow = null;
                private Map<String, List<InteractiveAnimation>> defaultHide = null;
                private Map<String, List<InteractiveAnimation>> defaultHideSelected = null;

                public GsonTypeAdapter setDefaultHide(Map<String, List<InteractiveAnimation>> map) {
                    this.defaultHide = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultHideSelected(Map<String, List<InteractiveAnimation>> map) {
                    this.defaultHideSelected = map;
                    return this;
                }

                public GsonTypeAdapter setDefaultShow(Map<String, List<InteractiveAnimation>> map) {
                    this.defaultShow = map;
                    return this;
                }

                public GsonTypeAdapter(Gson gson) {
                    this.showAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, InteractiveAnimation.class).getType()));
                    this.hideAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, InteractiveAnimation.class).getType()));
                    this.hideSelectedAdapter = gson.getAdapter(TypeToken.getParameterized(Map.class, String.class, TypeToken.getParameterized(List.class, InteractiveAnimation.class).getType()));
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, ChoicePointAnimations choicePointAnimations) {
                    if (choicePointAnimations == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("show");
                    this.showAdapter.write(jsonWriter, choicePointAnimations.show());
                    jsonWriter.name(InteractiveAnimation.States.hide);
                    this.hideAdapter.write(jsonWriter, choicePointAnimations.hide());
                    jsonWriter.name("hideSelected");
                    this.hideSelectedAdapter.write(jsonWriter, choicePointAnimations.hideSelected());
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
                public com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations read(com.google.gson.stream.JsonReader r9) {
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
                        java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>> r0 = r8.defaultShow
                        java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>> r1 = r8.defaultHide
                        java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>> r2 = r8.defaultHideSelected
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
                        r5 = 3202370(0x30dd42, float:4.487476E-39)
                        r6 = 2
                        r7 = 1
                        if (r4 == r5) goto L5b
                        r5 = 3529469(0x35dafd, float:4.94584E-39)
                        if (r4 == r5) goto L50
                        r5 = 1753797117(0x6888d1fd, float:5.1689235E24)
                        if (r4 == r5) goto L45
                        goto L63
                    L45:
                        java.lang.String r4 = "hideSelected"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L4e
                        goto L63
                    L4e:
                        r3 = r6
                        goto L66
                    L50:
                        java.lang.String r4 = "show"
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L59
                        goto L63
                    L59:
                        r3 = r7
                        goto L66
                    L5b:
                        java.lang.String r4 = "hide"
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
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>>> r2 = r8.hideSelectedAdapter
                        java.lang.Object r2 = r2.read(r9)
                        java.util.Map r2 = (java.util.Map) r2
                        goto L16
                    L79:
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>>> r0 = r8.showAdapter
                        java.lang.Object r0 = r0.read(r9)
                        java.util.Map r0 = (java.util.Map) r0
                        goto L16
                    L82:
                        com.google.gson.TypeAdapter<java.util.Map<java.lang.String, java.util.List<com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation>>> r1 = r8.hideAdapter
                        java.lang.Object r1 = r1.read(r9)
                        java.util.Map r1 = (java.util.Map) r1
                        goto L16
                    L8b:
                        r9.endObject()
                        com.netflix.model.leafs.originals.interactive.animations.AutoValue_ChoicePointAnimations r9 = new com.netflix.model.leafs.originals.interactive.animations.AutoValue_ChoicePointAnimations
                        r9.<init>(r0, r1, r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.netflix.model.leafs.originals.interactive.animations.C$AutoValue_ChoicePointAnimations.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.netflix.model.leafs.originals.interactive.animations.ChoicePointAnimations");
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(show());
        parcel.writeMap(hide());
        parcel.writeMap(hideSelected());
    }
}
