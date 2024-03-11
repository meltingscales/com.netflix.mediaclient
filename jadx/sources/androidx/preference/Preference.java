package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.PreferenceManager;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class Preference implements Comparable<Preference> {
    private static int a = 0;
    private static int e = 1;
    private static byte e$ss2$8840 = 24;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;
    private Context mContext;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private OnPreferenceChangeInternalListener mListener;
    private OnPreferenceChangeListener mOnChangeListener;
    private OnPreferenceClickListener mOnClickListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private PreferenceDataStore mPreferenceDataStore;
    private PreferenceManager mPreferenceManager;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(Preference preference);

        void onPreferenceHierarchyChange(Preference preference);

        void onPreferenceVisibilityChange(Preference preference);
    }

    /* loaded from: classes2.dex */
    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(Preference preference, Object obj);
    }

    /* loaded from: classes2.dex */
    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(Preference preference);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void assignParent(PreferenceGroup preferenceGroup) {
        this.mParentGroup = preferenceGroup;
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getFragment() {
        return this.mFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getId() {
        return this.mId;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    public PreferenceManager getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public CharSequence getSummary() {
        return this.mSummary;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean isEnabled() {
        return this.mEnabled && this.mDependencyMet && this.mParentDependencyMet;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onClick() {
    }

    protected Object onGetDefaultValue(TypedArray typedArray, int i) {
        return null;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected void onSetInitialValue(Object obj) {
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setLayoutResource(int i) {
        this.mLayoutResId = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnPreferenceChangeInternalListener(OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.mListener = onPreferenceChangeInternalListener;
    }

    public void setOnPreferenceChangeListener(OnPreferenceChangeListener onPreferenceChangeListener) {
        this.mOnChangeListener = onPreferenceChangeListener;
    }

    public void setOnPreferenceClickListener(OnPreferenceClickListener onPreferenceClickListener) {
        this.mOnClickListener = onPreferenceClickListener;
    }

    public void setPersistent(boolean z) {
        this.mPersistent = z;
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrder = Integer.MAX_VALUE;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        this.mLayoutResId = R.layout.preference;
        this.mClickListener = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.performClick(view);
            }
        };
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Preference, i, i2);
        this.mIconResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_icon, R.styleable.Preference_android_icon, 0);
        this.mKey = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_key, R.styleable.Preference_android_key);
        this.mTitle = TypedArrayUtils.getText(obtainStyledAttributes, R.styleable.Preference_title, R.styleable.Preference_android_title);
        this.mSummary = TypedArrayUtils.getText(obtainStyledAttributes, R.styleable.Preference_summary, R.styleable.Preference_android_summary);
        this.mOrder = TypedArrayUtils.getInt(obtainStyledAttributes, R.styleable.Preference_order, R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.mFragment = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_fragment, R.styleable.Preference_android_fragment);
        this.mLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_layout, R.styleable.Preference_android_layout, R.layout.preference);
        this.mWidgetLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.Preference_widgetLayout, R.styleable.Preference_android_widgetLayout, 0);
        this.mEnabled = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_enabled, R.styleable.Preference_android_enabled, true);
        this.mSelectable = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_selectable, R.styleable.Preference_android_selectable, true);
        this.mPersistent = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_persistent, R.styleable.Preference_android_persistent, true);
        this.mDependencyKey = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.Preference_dependency, R.styleable.Preference_android_dependency);
        int i3 = R.styleable.Preference_allowDividerAbove;
        this.mAllowDividerAbove = TypedArrayUtils.getBoolean(obtainStyledAttributes, i3, i3, this.mSelectable);
        int i4 = R.styleable.Preference_allowDividerBelow;
        this.mAllowDividerBelow = TypedArrayUtils.getBoolean(obtainStyledAttributes, i4, i4, this.mSelectable);
        if (obtainStyledAttributes.hasValue(R.styleable.Preference_defaultValue)) {
            this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, R.styleable.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(R.styleable.Preference_android_defaultValue)) {
            this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, R.styleable.Preference_android_defaultValue);
        }
        this.mShouldDisableView = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_shouldDisableView, R.styleable.Preference_android_shouldDisableView, true);
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.Preference_singleLineTitle);
        this.mHasSingleLineTitleAttr = hasValue;
        if (hasValue) {
            this.mSingleLineTitle = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_singleLineTitle, R.styleable.Preference_android_singleLineTitle, true);
        }
        this.mIconSpaceReserved = TypedArrayUtils.getBoolean(obtainStyledAttributes, R.styleable.Preference_iconSpaceReserved, R.styleable.Preference_android_iconSpaceReserved, false);
        int i5 = R.styleable.Preference_isPreferenceVisible;
        this.mVisible = TypedArrayUtils.getBoolean(obtainStyledAttributes, i5, i5, true);
        obtainStyledAttributes.recycle();
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context) {
        this(context, null);
    }

    public PreferenceDataStore getPreferenceDataStore() {
        PreferenceDataStore preferenceDataStore = this.mPreferenceDataStore;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        PreferenceManager preferenceManager = this.mPreferenceManager;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        preferenceViewHolder.itemView.setOnClickListener(this.mClickListener);
        preferenceViewHolder.itemView.setId(this.mViewId);
        TextView textView = (TextView) preferenceViewHolder.findViewById(16908310);
        if (textView != null) {
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                textView.setText(title);
                textView.setVisibility(0);
                if (this.mHasSingleLineTitleAttr) {
                    textView.setSingleLine(this.mSingleLineTitle);
                }
            } else {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = (TextView) preferenceViewHolder.findViewById(16908304);
        if (textView2 != null) {
            CharSequence summary = getSummary();
            if (!TextUtils.isEmpty(summary)) {
                textView2.setText(summary);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.findViewById(16908294);
        if (imageView != null) {
            if (this.mIconResId != 0 || this.mIcon != null) {
                if (this.mIcon == null) {
                    this.mIcon = ContextCompat.getDrawable(getContext(), this.mIconResId);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.mIcon != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        View findViewById = preferenceViewHolder.findViewById(R.id.icon_frame);
        if (findViewById == null) {
            findViewById = preferenceViewHolder.findViewById(16908350);
        }
        if (findViewById != null) {
            if (this.mIcon != null) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(this.mIconSpaceReserved ? 4 : 8);
            }
        }
        if (this.mShouldDisableView) {
            setEnabledStateOnViews(preferenceViewHolder.itemView, isEnabled());
        } else {
            setEnabledStateOnViews(preferenceViewHolder.itemView, true);
        }
        boolean isSelectable = isSelectable();
        preferenceViewHolder.itemView.setFocusable(isSelectable);
        preferenceViewHolder.itemView.setClickable(isSelectable);
        preferenceViewHolder.setDividerAllowedAbove(this.mAllowDividerAbove);
        preferenceViewHolder.setDividerAllowedBelow(this.mAllowDividerBelow);
    }

    private void setEnabledStateOnViews(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                setEnabledStateOnViews(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void setOrder(int i) {
        if (i != this.mOrder) {
            this.mOrder = i;
            notifyHierarchyChanged();
        }
    }

    public void setTitle(CharSequence charSequence) {
        if ((charSequence != null || this.mTitle == null) && (charSequence == null || charSequence.equals(this.mTitle))) {
            return;
        }
        this.mTitle = charSequence;
        notifyChanged();
    }

    public void setTitle(int i) {
        int i2 = 2 % 2;
        int i3 = a + 29;
        e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.mContext.getString(i).startsWith("'!#+");
            obj.hashCode();
            throw null;
        }
        String string = this.mContext.getString(i);
        if (string.startsWith("'!#+")) {
            int i4 = e + 63;
            a = i4 % 128;
            int i5 = i4 % 2;
            String substring = string.substring(4);
            if (i5 != 0) {
                Object[] objArr = new Object[1];
                l(substring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            l(substring, objArr2);
            string = ((String) objArr2[0]).intern();
        }
        setTitle(string);
    }

    public void setIcon(Drawable drawable) {
        if ((drawable != null || this.mIcon == null) && (drawable == null || this.mIcon == drawable)) {
            return;
        }
        this.mIcon = drawable;
        this.mIconResId = 0;
        notifyChanged();
    }

    public void setIcon(int i) {
        setIcon(ContextCompat.getDrawable(this.mContext, i));
        this.mIconResId = i;
    }

    public void setSummary(CharSequence charSequence) {
        if ((charSequence != null || this.mSummary == null) && (charSequence == null || charSequence.equals(this.mSummary))) {
            return;
        }
        this.mSummary = charSequence;
        notifyChanged();
    }

    public void setSummary(int i) {
        int i2 = 2 % 2;
        String string = this.mContext.getString(i);
        if (string.startsWith("'!#+")) {
            int i3 = e + 19;
            a = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            l(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = a + 7;
            e = i5 % 128;
            int i6 = i5 % 2;
        }
        setSummary(string);
    }

    public final void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.onPreferenceVisibilityChange(this);
            }
        }
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.mKey);
    }

    protected boolean shouldPersist() {
        return this.mPreferenceManager != null && isPersistent() && hasKey();
    }

    public boolean callChangeListener(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.mOnChangeListener;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.onPreferenceChange(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void performClick(View view) {
        performClick();
    }

    public void performClick() {
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled()) {
            onClick();
            OnPreferenceClickListener onPreferenceClickListener = this.mOnClickListener;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.mIntent != null) {
                    getContext().startActivity(this.mIntent);
                }
            }
        }
    }

    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.mPreferenceManager.getSharedPreferences();
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        int i = this.mOrder;
        int i2 = preference.mOrder;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceChange(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyHierarchyChanged() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.mListener;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceHierarchyChange(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAttachedToHierarchy(PreferenceManager preferenceManager) {
        this.mPreferenceManager = preferenceManager;
        if (!this.mHasId) {
            this.mId = preferenceManager.getNextId();
        }
        dispatchSetInitialValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAttachedToHierarchy(PreferenceManager preferenceManager, long j) {
        this.mId = j;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.mHasId = false;
        }
    }

    public void onAttached() {
        registerDependency();
    }

    public void onDetached() {
        unregisterDependency();
        this.mWasDetached = true;
    }

    private void registerDependency() {
        if (TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        Preference findPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (findPreferenceInHierarchy != null) {
            findPreferenceInHierarchy.registerDependent(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.mDependencyKey + "\" not found for preference \"" + this.mKey + "\" (title: \"" + ((Object) this.mTitle) + "\"");
    }

    private void unregisterDependency() {
        Preference findPreferenceInHierarchy;
        String str = this.mDependencyKey;
        if (str == null || (findPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null) {
            return;
        }
        findPreferenceInHierarchy.unregisterDependent(this);
    }

    protected Preference findPreferenceInHierarchy(String str) {
        PreferenceManager preferenceManager;
        if (TextUtils.isEmpty(str) || (preferenceManager = this.mPreferenceManager) == null) {
            return null;
        }
        return preferenceManager.findPreference(str);
    }

    private void registerDependent(Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void unregisterDependent(Preference preference) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void notifyDependencyChange(boolean z) {
        List<Preference> list = this.mDependents;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).onDependencyChanged(this, z);
        }
    }

    public void onDependencyChanged(Preference preference, boolean z) {
        if (this.mDependencyMet == z) {
            this.mDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onParentChanged(Preference preference, boolean z) {
        if (this.mParentDependencyMet == z) {
            this.mParentDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPrepareForRemoval() {
        unregisterDependency();
    }

    private void dispatchSetInitialValue() {
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.mDefaultValue);
        } else if (shouldPersist() && getSharedPreferences().contains(this.mKey)) {
            onSetInitialValue(true, null);
        } else {
            Object obj = this.mDefaultValue;
            if (obj != null) {
                onSetInitialValue(false, obj);
            }
        }
    }

    @Deprecated
    protected void onSetInitialValue(boolean z, Object obj) {
        onSetInitialValue(obj);
    }

    private void tryCommit(SharedPreferences.Editor editor) {
        if (this.mPreferenceManager.shouldCommit()) {
            editor.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistString(String str) {
        if (shouldPersist()) {
            if (TextUtils.equals(str, getPersistedString(null))) {
                return true;
            }
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putString(this.mKey, str);
            } else {
                SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
                editor.putString(this.mKey, str);
                tryCommit(editor);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getPersistedString(String str) {
        if (shouldPersist()) {
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                return preferenceDataStore.getString(this.mKey, str);
            }
            return this.mPreferenceManager.getSharedPreferences().getString(this.mKey, str);
        }
        return str;
    }

    public boolean persistStringSet(Set<String> set) {
        if (shouldPersist()) {
            if (set.equals(getPersistedStringSet(null))) {
                return true;
            }
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putStringSet(this.mKey, set);
            } else {
                SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
                editor.putStringSet(this.mKey, set);
                tryCommit(editor);
            }
            return true;
        }
        return false;
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (shouldPersist()) {
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                return preferenceDataStore.getStringSet(this.mKey, set);
            }
            return this.mPreferenceManager.getSharedPreferences().getStringSet(this.mKey, set);
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistInt(int i) {
        if (shouldPersist()) {
            if (i == getPersistedInt(~i)) {
                return true;
            }
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putInt(this.mKey, i);
            } else {
                SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
                editor.putInt(this.mKey, i);
                tryCommit(editor);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getPersistedInt(int i) {
        if (shouldPersist()) {
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                return preferenceDataStore.getInt(this.mKey, i);
            }
            return this.mPreferenceManager.getSharedPreferences().getInt(this.mKey, i);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean persistBoolean(boolean z) {
        if (shouldPersist()) {
            if (z == getPersistedBoolean(!z)) {
                return true;
            }
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                preferenceDataStore.putBoolean(this.mKey, z);
            } else {
                SharedPreferences.Editor editor = this.mPreferenceManager.getEditor();
                editor.putBoolean(this.mKey, z);
                tryCommit(editor);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getPersistedBoolean(boolean z) {
        if (shouldPersist()) {
            PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
            if (preferenceDataStore != null) {
                return preferenceDataStore.getBoolean(this.mKey, z);
            }
            return this.mPreferenceManager.getSharedPreferences().getBoolean(this.mKey, z);
        }
        return z;
    }

    public String toString() {
        return getFilterableStringBuilder().toString();
    }

    StringBuilder getFilterableStringBuilder() {
        StringBuilder sb = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb.append(title);
            sb.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb.append(summary);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void saveHierarchyState(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchSaveInstanceState(Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable onSaveInstanceState = onSaveInstanceState();
            if (!this.mBaseMethodCalled) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (onSaveInstanceState != null) {
                bundle.putParcelable(this.mKey, onSaveInstanceState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void restoreHierarchyState(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.mKey)) == null) {
            return;
        }
        this.mBaseMethodCalled = false;
        onRestoreInstanceState(parcelable);
        if (!this.mBaseMethodCalled) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* loaded from: classes2.dex */
    public static class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$8840);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
