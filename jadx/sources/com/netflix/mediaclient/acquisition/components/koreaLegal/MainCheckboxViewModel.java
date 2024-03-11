package com.netflix.mediaclient.acquisition.components.koreaLegal;

import o.C8627dsp;

/* loaded from: classes3.dex */
public final class MainCheckboxViewModel {
    public static final int $stable = 8;
    private boolean isChecked;

    public MainCheckboxViewModel() {
        this(false, 1, null);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public MainCheckboxViewModel(boolean z) {
        this.isChecked = z;
    }

    public /* synthetic */ MainCheckboxViewModel(boolean z, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z);
    }
}
