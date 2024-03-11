package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class AndroidTextToolbar implements TextToolbar {
    private ActionMode actionMode;
    private final View view;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new drO<dpR>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        @Override // o.drO
        public /* bridge */ /* synthetic */ dpR invoke() {
            invoke2();
            return dpR.c;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidTextToolbar.this.actionMode = null;
        }
    }, null, null, null, null, null, 62, null);
    private TextToolbarStatus status = TextToolbarStatus.Hidden;

    @Override // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    public AndroidTextToolbar(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect, drO<dpR> dro, drO<dpR> dro2, drO<dpR> dro3, drO<dpR> dro4) {
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(dro);
        this.textActionModeCallback.setOnCutRequested(dro3);
        this.textActionModeCallback.setOnPasteRequested(dro2);
        this.textActionModeCallback.setOnSelectAllRequested(dro4);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }
}
