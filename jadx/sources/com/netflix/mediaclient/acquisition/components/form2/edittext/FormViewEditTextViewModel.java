package com.netflix.mediaclient.acquisition.components.form2.edittext;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import o.C8600drp;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public interface FormViewEditTextViewModel {
    AppView getAppView();

    Error getError();

    InputKind getInputKind();

    int getMaxLength();

    int getMinLength();

    String getValue();

    boolean isReadOnly();

    boolean isValid();

    void setValue(String str);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Error {
        private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error LENGTH = new Error("LENGTH", 0);
        public static final Error EMPTY = new Error("EMPTY", 1);
        public static final Error REGEX = new Error("REGEX", 2);

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{LENGTH, EMPTY, REGEX};
        }

        public static InterfaceC8598drn<Error> getEntries() {
            return $ENTRIES;
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }

        private Error(String str, int i) {
        }

        static {
            Error[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C8600drp.e($values);
        }
    }
}
