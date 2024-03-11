package androidx.compose.material;

/* loaded from: classes5.dex */
public interface SnackbarData {
    void dismiss();

    String getActionLabel();

    SnackbarDuration getDuration();

    String getMessage();

    void performAction();
}
