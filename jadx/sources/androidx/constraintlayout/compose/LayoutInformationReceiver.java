package androidx.constraintlayout.compose;

/* loaded from: classes.dex */
public interface LayoutInformationReceiver {
    int getForcedHeight();

    int getForcedWidth();

    LayoutInfoFlags getLayoutInformationMode();

    void setLayoutInformation(String str);
}
