package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class TextActionModeCallback {
    private final drO<dpR> onActionModeDestroy;
    private drO<dpR> onCopyRequested;
    private drO<dpR> onCutRequested;
    private drO<dpR> onPasteRequested;
    private drO<dpR> onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final void setOnCopyRequested(drO<dpR> dro) {
        this.onCopyRequested = dro;
    }

    public final void setOnCutRequested(drO<dpR> dro) {
        this.onCutRequested = dro;
    }

    public final void setOnPasteRequested(drO<dpR> dro) {
        this.onPasteRequested = dro;
    }

    public final void setOnSelectAllRequested(drO<dpR> dro) {
        this.onSelectAllRequested = dro;
    }

    public final void setRect(Rect rect) {
        this.rect = rect;
    }

    public TextActionModeCallback(drO<dpR> dro, Rect rect, drO<dpR> dro2, drO<dpR> dro3, drO<dpR> dro4, drO<dpR> dro5) {
        this.onActionModeDestroy = dro;
        this.rect = rect;
        this.onCopyRequested = dro2;
        this.onPasteRequested = dro3;
        this.onCutRequested = dro4;
        this.onSelectAllRequested = dro5;
    }

    public /* synthetic */ TextActionModeCallback(drO dro, Rect rect, drO dro2, drO dro3, drO dro4, drO dro5, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : dro, (i & 2) != 0 ? Rect.Companion.getZero() : rect, (i & 4) != 0 ? null : dro2, (i & 8) != 0 ? null : dro3, (i & 16) != 0 ? null : dro4, (i & 32) != 0 ? null : dro5);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.onCopyRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Copy);
                }
                if (this.onPasteRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Paste);
                }
                if (this.onCutRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.Cut);
                }
                if (this.onSelectAllRequested != null) {
                    addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
                    return true;
                }
                return true;
            }
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C8632dsu.d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            drO<dpR> dro = this.onCopyRequested;
            if (dro != null) {
                dro.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            drO<dpR> dro2 = this.onPasteRequested;
            if (dro2 != null) {
                dro2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            drO<dpR> dro3 = this.onCutRequested;
            if (dro3 != null) {
                dro3.invoke();
            }
        } else if (itemId != MenuItemOption.SelectAll.getId()) {
            return false;
        } else {
            drO<dpR> dro4 = this.onSelectAllRequested;
            if (dro4 != null) {
                dro4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final void onDestroyActionMode() {
        drO<dpR> dro = this.onActionModeDestroy;
        if (dro != null) {
            dro.invoke();
        }
    }

    public final void updateMenuItems$ui_release(Menu menu) {
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, drO<dpR> dro) {
        if (dro != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else if (dro != null || menu.findItem(menuItemOption.getId()) == null) {
        } else {
            menu.removeItem(menuItemOption.getId());
        }
    }
}
