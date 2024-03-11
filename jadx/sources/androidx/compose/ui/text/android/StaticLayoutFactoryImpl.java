package androidx.compose.ui.text.android;

import android.text.StaticLayout;

/* loaded from: classes.dex */
interface StaticLayoutFactoryImpl {
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z);
}
