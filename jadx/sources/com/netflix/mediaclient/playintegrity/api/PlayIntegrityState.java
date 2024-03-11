package com.netflix.mediaclient.playintegrity.api;

import o.C8600drp;
import o.C8627dsp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PlayIntegrityState {
    private static final /* synthetic */ InterfaceC8598drn $ENTRIES;
    private static final /* synthetic */ PlayIntegrityState[] $VALUES;
    public static final e Companion;
    public static final PlayIntegrityState NOT_SUPPORTED = new PlayIntegrityState("NOT_SUPPORTED", 0);
    public static final PlayIntegrityState DISABLED = new PlayIntegrityState("DISABLED", 1);
    public static final PlayIntegrityState UNDEFINED = new PlayIntegrityState("UNDEFINED", 2);
    public static final PlayIntegrityState NOT_AVAILABLE = new PlayIntegrityState("NOT_AVAILABLE", 3);
    public static final PlayIntegrityState GETTING_NONCE_FROM_NETFLIX = new PlayIntegrityState("GETTING_NONCE_FROM_NETFLIX", 4);
    public static final PlayIntegrityState ERROR_FAILED_NONCE_FROM_NETFLIX = new PlayIntegrityState("ERROR_FAILED_NONCE_FROM_NETFLIX", 5);
    public static final PlayIntegrityState RECEIVED_NONCE_FROM_NETFLIX = new PlayIntegrityState("RECEIVED_NONCE_FROM_NETFLIX", 6);
    public static final PlayIntegrityState ERROR_RECEIVED_EMPTY_NONCE_FROM_NETFLIX = new PlayIntegrityState("ERROR_RECEIVED_EMPTY_NONCE_FROM_NETFLIX", 7);
    public static final PlayIntegrityState GETTING_METADATA_FROM_GOOGLE = new PlayIntegrityState("GETTING_METADATA_FROM_GOOGLE", 8);
    public static final PlayIntegrityState ERROR_FAILED_METADATA_FROM_GOOGLE = new PlayIntegrityState("ERROR_FAILED_METADATA_FROM_GOOGLE", 9);
    public static final PlayIntegrityState ERROR_INTERNAL_ERROR_FROM_GOOGLE = new PlayIntegrityState("ERROR_INTERNAL_ERROR_FROM_GOOGLE", 10);
    public static final PlayIntegrityState RECEIVED_METADATA_FROM_GOOGLE = new PlayIntegrityState("RECEIVED_METADATA_FROM_GOOGLE", 11);
    public static final PlayIntegrityState ERROR_RECEIVED_EMPTY_METADATA_FROM_GOOGLE = new PlayIntegrityState("ERROR_RECEIVED_EMPTY_METADATA_FROM_GOOGLE", 12);
    public static final PlayIntegrityState VERIFICATION_IN_PROGRESS = new PlayIntegrityState("VERIFICATION_IN_PROGRESS", 13);
    public static final PlayIntegrityState ERROR_FAILED_VERIFICATION = new PlayIntegrityState("ERROR_FAILED_VERIFICATION", 14);
    public static final PlayIntegrityState VERIFICATION_PASS = new PlayIntegrityState("VERIFICATION_PASS", 15);

    private static final /* synthetic */ PlayIntegrityState[] $values() {
        return new PlayIntegrityState[]{NOT_SUPPORTED, DISABLED, UNDEFINED, NOT_AVAILABLE, GETTING_NONCE_FROM_NETFLIX, ERROR_FAILED_NONCE_FROM_NETFLIX, RECEIVED_NONCE_FROM_NETFLIX, ERROR_RECEIVED_EMPTY_NONCE_FROM_NETFLIX, GETTING_METADATA_FROM_GOOGLE, ERROR_FAILED_METADATA_FROM_GOOGLE, ERROR_INTERNAL_ERROR_FROM_GOOGLE, RECEIVED_METADATA_FROM_GOOGLE, ERROR_RECEIVED_EMPTY_METADATA_FROM_GOOGLE, VERIFICATION_IN_PROGRESS, ERROR_FAILED_VERIFICATION, VERIFICATION_PASS};
    }

    public static InterfaceC8598drn<PlayIntegrityState> getEntries() {
        return $ENTRIES;
    }

    public static PlayIntegrityState valueOf(String str) {
        return (PlayIntegrityState) Enum.valueOf(PlayIntegrityState.class, str);
    }

    public static PlayIntegrityState[] values() {
        return (PlayIntegrityState[]) $VALUES.clone();
    }

    private PlayIntegrityState(String str, int i) {
    }

    static {
        PlayIntegrityState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C8600drp.e($values);
        Companion = new e(null);
    }

    /* loaded from: classes3.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }
}
