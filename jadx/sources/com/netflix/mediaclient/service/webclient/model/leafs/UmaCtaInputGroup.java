package com.netflix.mediaclient.service.webclient.model.leafs;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.webclient.model.leafs.AutoValue_UmaCtaInputGroup;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes.dex */
public abstract class UmaCtaInputGroup {
    public static final Companion Companion = new Companion(null);

    public static final TypeAdapter<UmaCtaInputGroup> typeAdapter(Gson gson) {
        return Companion.typeAdapter(gson);
    }

    public abstract String copy();

    public abstract String iconUrlHigh();

    public abstract String iconUrlLow();

    public abstract String iconUrlMedium();

    public abstract InputType inputType();

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final TypeAdapter<UmaCtaInputGroup> typeAdapter(Gson gson) {
            C8632dsu.c((Object) gson, "");
            return new AutoValue_UmaCtaInputGroup.GsonTypeAdapter(gson);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class InputType {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        @SerializedName("text")
        public static final InputType TEXT = new InputType("TEXT", 0);
        @SerializedName("select")
        public static final InputType SELECT = new InputType("SELECT", 1);
        @SerializedName("button")
        public static final InputType BUTTON = new InputType("BUTTON", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{TEXT, SELECT, BUTTON};
        }

        public static InterfaceC8598drn<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }

        private InputType(String str, int i) {
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }
}
