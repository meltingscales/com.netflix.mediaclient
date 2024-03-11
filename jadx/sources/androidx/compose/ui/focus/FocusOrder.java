package androidx.compose.ui.focus;

/* loaded from: classes.dex */
public final class FocusOrder {
    private final FocusProperties focusProperties;

    public FocusOrder(FocusProperties focusProperties) {
        this.focusProperties = focusProperties;
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
