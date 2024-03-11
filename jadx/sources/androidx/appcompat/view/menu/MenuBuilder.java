package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {
    private static int c = 1;
    private static int e;
    private static byte e$ss2$8528;
    private static final int[] sCategoryToOrder;
    private Callback mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<MenuItemImpl> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<MenuItemImpl> mItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<MenuItemImpl> mActionItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* loaded from: classes.dex */
    public interface Callback {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    /* loaded from: classes.dex */
    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    static {
        a();
        sCategoryToOrder = new int[]{1, 4, 5, 3, 2, 0};
    }

    static void a() {
        e$ss2$8528 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getActionViewStatesKey() {
        return "android:menu:actionviewstates";
    }

    public Context getContext() {
        return this.mContext;
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    Resources getResources() {
        return this.mResources;
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public MenuBuilder setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public MenuBuilder(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.mPresenters.add(new WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter2 = next.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.mPresenters.remove(next);
            }
        }
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                menuPresenter.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder subMenuBuilder, MenuPresenter menuPresenter) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected(subMenuBuilder) : false;
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter2 = next.get();
            if (menuPresenter2 == null) {
                this.mPresenters.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = menuPresenter2.onSubMenuSelected(subMenuBuilder);
            }
        }
        return onSubMenuSelected;
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    protected MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        MenuItemImpl createNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.setMenuInfo(contextMenuInfo);
        }
        ArrayList<MenuItemImpl> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    private MenuItemImpl createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        int i2 = 2 % 2;
        String string = this.mResources.getString(i);
        if (string.startsWith("'!#+")) {
            int i3 = c + 17;
            e = i3 % 128;
            int i4 = i3 % 2;
            String substring = string.substring(4);
            if (i4 != 0) {
                Object[] objArr = new Object[1];
                b(substring, objArr);
                string = ((String) objArr[0]).intern();
                int i5 = 30 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                b(substring, objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        MenuItem addInternal = addInternal(0, 0, 0, string);
        int i6 = c + 57;
        e = i6 % 128;
        int i7 = i6 % 2;
        return addInternal;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        String string = this.mResources.getString(i4);
        if (!(!string.startsWith("'!#+"))) {
            int i6 = c + 39;
            e = i6 % 128;
            if (i6 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            b(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        MenuItem addInternal = addInternal(i, i2, i3, string);
        int i7 = c + 45;
        e = i7 % 128;
        int i8 = i7 % 2;
        return addInternal;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        String string;
        int i2;
        int i3 = 2 % 2;
        int i4 = e + 11;
        c = i4 % 128;
        int i5 = 1;
        if (i4 % 2 == 0) {
            string = this.mResources.getString(i);
            if (string.startsWith("'!#+")) {
                i2 = 1;
                int i6 = e + 117;
                c = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                i5 = i2;
            }
        } else {
            string = this.mResources.getString(i);
            if (string.startsWith("'!#+")) {
                i2 = 0;
                int i62 = e + 117;
                c = i62 % 128;
                int i72 = i62 % 2;
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                i5 = i2;
            } else {
                i5 = 0;
            }
        }
        return addSubMenu(i5, 0, 0, string);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        String string = this.mResources.getString(i4);
        if (string.startsWith("'!#+")) {
            int i6 = c + 33;
            e = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i8 = c + 107;
            e = i8 % 128;
            int i9 = i8 % 2;
        }
        return addSubMenu(i, i2, i3, string);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int findGroupIndex = findGroupIndex(i);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size - findGroupIndex && this.mItems.get(findGroupIndex).getGroupId() == i; i2++) {
                removeItemAtInt(findGroupIndex, false);
            }
            onItemsChanged(true);
        }
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.mExpandedItem;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                menuItemImpl.setCheckedInt(menuItemImpl == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setExclusiveCheckable(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration.get(r2.mContext), r2.mContext) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setShortcutsVisibleInner(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.setShortcutsVisibleInner(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.mCallback;
        return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
    }

    public void changeMenuMode() {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    private static int findInsertIndex(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl findItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    void findItemsWithShortcutForKey(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.mItems.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = isQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if ((modifiers & 69647) == ((isQwertyMode ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (isQwertyMode && alphabeticShortcut == '\b' && i == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<MenuItemImpl> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            if (isQwertyMode) {
                numericShortcut = menuItemImpl.getAlphabeticShortcut();
            } else {
                numericShortcut = menuItemImpl.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && numericShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }

    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean invoke = menuItemImpl.invoke();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.hasCollapsibleActionView()) {
            invoke |= menuItemImpl.expandActionView();
            if (invoke) {
                close(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                close(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.setSubMenu(new SubMenuBuilder(getContext(), this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z) {
                supportActionProvider.onPrepareSubMenu(subMenuBuilder);
            }
            invoke |= dispatchSubMenuSelected(subMenuBuilder, menuPresenter);
            if (!invoke) {
                close(true);
            }
        } else if ((i & 1) == 0) {
            close(true);
        }
        return invoke;
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                menuPresenter.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public void onItemsChanged(boolean z) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z);
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public ArrayList<MenuItemImpl> getVisibleItems() {
        if (this.mIsVisibleItemsStale) {
            this.mVisibleItems.clear();
            int size = this.mItems.size();
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl = this.mItems.get(i);
                if (menuItemImpl.isVisible()) {
                    this.mVisibleItems.add(menuItemImpl);
                }
            }
            this.mIsVisibleItemsStale = false;
            this.mIsActionItemsStale = true;
            return this.mVisibleItems;
        }
        return this.mVisibleItems;
    }

    public void flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(next);
                } else {
                    z |= menuPresenter.flagActionItems();
                }
            }
            if (z) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = visibleItems.get(i);
                    if (menuItemImpl.isActionButton()) {
                        this.mActionItems.add(menuItemImpl);
                    } else {
                        this.mNonActionItems.add(menuItemImpl);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList<MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r11 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        r12 = r1.getString(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r12.startsWith("'!#+") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        r15 = new java.lang.Object[1];
        b(r12.substring(4), r15);
        r12 = ((java.lang.String) r15[0]).intern();
        r11 = r1.getText(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        if ((r11 instanceof android.text.Spanned) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        r15 = new android.text.SpannableString(r12);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r11, 0, r12.length(), java.lang.Object.class, r15, 0);
        r11 = androidx.appcompat.view.menu.MenuBuilder.c + 125;
        androidx.appcompat.view.menu.MenuBuilder.e = r11 % 128;
        r11 = r11 % 2;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
        if (r12 == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        r10.mHeaderTitle = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
        if (r13 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        r10.mHeaderIcon = androidx.core.content.ContextCompat.getDrawable(getContext(), r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r14 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
        r10.mHeaderIcon = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
        r10.mHeaderView = null;
        r11 = androidx.appcompat.view.menu.MenuBuilder.e + 47;
        androidx.appcompat.view.menu.MenuBuilder.c = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r15 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r15 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        r10.mHeaderView = r15;
        r10.mHeaderTitle = null;
        r10.mHeaderIcon = null;
        r11 = androidx.appcompat.view.menu.MenuBuilder.e + 83;
        androidx.appcompat.view.menu.MenuBuilder.c = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setHeaderInternal(int r11, java.lang.CharSequence r12, int r13, android.graphics.drawable.Drawable r14, android.view.View r15) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.appcompat.view.menu.MenuBuilder.c
            int r1 = r1 + 117
            int r2 = r1 % 128
            androidx.appcompat.view.menu.MenuBuilder.e = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L1a
            android.content.res.Resources r1 = r10.getResources()
            r4 = 80
            int r4 = r4 / r3
            if (r15 == 0) goto L30
            goto L20
        L1a:
            android.content.res.Resources r1 = r10.getResources()
            if (r15 == 0) goto L30
        L20:
            r10.mHeaderView = r15
            r10.mHeaderTitle = r2
            r10.mHeaderIcon = r2
            int r11 = androidx.appcompat.view.menu.MenuBuilder.e
            int r11 = r11 + 83
            int r12 = r11 % 128
            androidx.appcompat.view.menu.MenuBuilder.c = r12
            int r11 = r11 % r0
            goto L9b
        L30:
            if (r11 <= 0) goto L7b
            java.lang.String r12 = r1.getString(r11)
            java.lang.String r15 = "'!#+"
            boolean r15 = r12.startsWith(r15)
            if (r15 == 0) goto L7d
            r15 = 4
            java.lang.String r12 = r12.substring(r15)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r10.b(r12, r15)
            r12 = r15[r3]
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = r12.intern()
            java.lang.CharSequence r11 = r1.getText(r11)
            boolean r15 = r11 instanceof android.text.Spanned
            if (r15 == 0) goto L7d
            android.text.SpannableString r15 = new android.text.SpannableString
            r15.<init>(r12)
            r4 = r11
            android.text.SpannedString r4 = (android.text.SpannedString) r4
            r5 = 0
            int r6 = r12.length()
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r11 = r15
            android.text.SpannableString r11 = (android.text.SpannableString) r11
            r9 = 0
            r8 = r15
            android.text.TextUtils.copySpansFrom(r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.view.menu.MenuBuilder.c
            int r11 = r11 + 125
            int r12 = r11 % 128
            androidx.appcompat.view.menu.MenuBuilder.e = r12
            int r11 = r11 % r0
            r12 = r15
            goto L7d
        L7b:
            if (r12 == 0) goto L7f
        L7d:
            r10.mHeaderTitle = r12
        L7f:
            if (r13 <= 0) goto L8c
            android.content.Context r11 = r10.getContext()
            android.graphics.drawable.Drawable r11 = androidx.core.content.ContextCompat.getDrawable(r11, r13)
            r10.mHeaderIcon = r11
            goto L90
        L8c:
            if (r14 == 0) goto L90
            r10.mHeaderIcon = r14
        L90:
            r10.mHeaderView = r2
            int r11 = androidx.appcompat.view.menu.MenuBuilder.e
            int r11 = r11 + 47
            int r12 = r11 % 128
            androidx.appcompat.view.menu.MenuBuilder.c = r12
            int r11 = r11 % r0
        L9b:
            r10.onItemsChanged(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.MenuBuilder.setHeaderInternal(int, java.lang.CharSequence, int, android.graphics.drawable.Drawable, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MenuBuilder setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> next = it.next();
            MenuPresenter menuPresenter = next.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(next);
            } else {
                z = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z) {
            this.mExpandedItem = menuItemImpl;
        }
        return z;
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == menuItemImpl) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<MenuPresenter>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> next = it.next();
                MenuPresenter menuPresenter = next.get();
                if (menuPresenter == null) {
                    this.mPresenters.remove(next);
                } else {
                    z = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (z) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z) {
                this.mExpandedItem = null;
            }
        }
        return z;
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$8528);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
