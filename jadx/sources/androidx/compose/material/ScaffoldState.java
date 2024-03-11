package androidx.compose.material;

/* loaded from: classes5.dex */
public final class ScaffoldState {
    private final DrawerState drawerState;
    private final SnackbarHostState snackbarHostState;

    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public ScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        this.drawerState = drawerState;
        this.snackbarHostState = snackbarHostState;
    }
}
