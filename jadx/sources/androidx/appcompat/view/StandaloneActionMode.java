package androidx.appcompat.view;

import android.content.Context;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    private static int a = 1;
    private static int b = 0;
    private static byte e$ss2$188 = 24;
    private ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference<View> mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    @Override // androidx.appcompat.view.ActionMode
    public Menu getMenu() {
        return this.mMenu;
    }

    public StandaloneActionMode(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.mContext = context;
        this.mContextView = actionBarContextView;
        this.mCallback = callback;
        MenuBuilder defaultShowAsAction = new MenuBuilder(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.mMenu = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.mFocusable = z;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.mContextView.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.mContextView.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitle(int i) {
        int i2 = 2 % 2;
        String string = this.mContext.getString(i);
        if (string.startsWith("'!#+")) {
            int i3 = b + 37;
            a = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                c(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i4 = 82 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                c(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            int i5 = a + 27;
            b = i5 % 128;
            int i6 = i5 % 2;
        }
        setTitle(string);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setSubtitle(int i) {
        int i2 = 2 % 2;
        int i3 = a + 9;
        b = i3 % 128;
        if (i3 % 2 == 0) {
            String string = this.mContext.getString(i);
            if (!(!string.startsWith("'!#+"))) {
                int i4 = b + 7;
                a = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                c(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i6 = b + 105;
                a = i6 % 128;
                int i7 = i6 % 2;
            }
            setSubtitle(string);
            return;
        }
        this.mContext.getString(i).startsWith("'!#+");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.mContextView.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.ActionMode
    public boolean isTitleOptional() {
        return this.mContextView.isTitleOptional();
    }

    @Override // androidx.appcompat.view.ActionMode
    public void setCustomView(View view) {
        this.mContextView.setCustomView(view);
        this.mCustomView = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public void invalidate() {
        this.mCallback.onPrepareActionMode(this, this.mMenu);
    }

    @Override // androidx.appcompat.view.ActionMode
    public void finish() {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mCallback.onDestroyActionMode(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getTitle() {
        return this.mContextView.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public CharSequence getSubtitle() {
        return this.mContextView.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public View getCustomView() {
        WeakReference<View> weakReference = this.mCustomView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContextView.getContext());
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.mCallback.onActionItemClicked(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        invalidate();
        this.mContextView.showOverflowMenu();
    }

    private void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$188);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
