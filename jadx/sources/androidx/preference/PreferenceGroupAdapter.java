package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener {
    private Handler mHandler;
    private PreferenceGroup mPreferenceGroup;
    private CollapsiblePreferenceGroupController mPreferenceGroupController;
    private List<PreferenceLayout> mPreferenceLayouts;
    private List<Preference> mPreferenceList;
    private List<Preference> mPreferenceListInternal;
    private Runnable mSyncRunnable;
    private PreferenceLayout mTempPreferenceLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PreferenceLayout {
        String mName;
        int mResId;
        int mWidgetResId;

        PreferenceLayout() {
        }

        PreferenceLayout(PreferenceLayout preferenceLayout) {
            this.mResId = preferenceLayout.mResId;
            this.mWidgetResId = preferenceLayout.mWidgetResId;
            this.mName = preferenceLayout.mName;
        }

        public boolean equals(Object obj) {
            if (obj instanceof PreferenceLayout) {
                PreferenceLayout preferenceLayout = (PreferenceLayout) obj;
                return this.mResId == preferenceLayout.mResId && this.mWidgetResId == preferenceLayout.mWidgetResId && TextUtils.equals(this.mName, preferenceLayout.mName);
            }
            return false;
        }

        public int hashCode() {
            int i = this.mResId;
            return ((((i + 527) * 31) + this.mWidgetResId) * 31) + this.mName.hashCode();
        }
    }

    public PreferenceGroupAdapter(PreferenceGroup preferenceGroup) {
        this(preferenceGroup, new Handler());
    }

    private PreferenceGroupAdapter(PreferenceGroup preferenceGroup, Handler handler) {
        this.mTempPreferenceLayout = new PreferenceLayout();
        this.mSyncRunnable = new Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                PreferenceGroupAdapter.this.syncMyPreferences();
            }
        };
        this.mPreferenceGroup = preferenceGroup;
        this.mHandler = handler;
        this.mPreferenceGroupController = new CollapsiblePreferenceGroupController(preferenceGroup, this);
        this.mPreferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.mPreferenceList = new ArrayList();
        this.mPreferenceListInternal = new ArrayList();
        this.mPreferenceLayouts = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.mPreferenceGroup;
        if (preferenceGroup2 instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup2).shouldUseGeneratedIds());
        } else {
            setHasStableIds(true);
        }
        syncMyPreferences();
    }

    void syncMyPreferences() {
        for (Preference preference : this.mPreferenceListInternal) {
            preference.setOnPreferenceChangeInternalListener(null);
        }
        ArrayList<Preference> arrayList = new ArrayList(this.mPreferenceListInternal.size());
        flattenPreferenceGroup(arrayList, this.mPreferenceGroup);
        final List<Preference> createVisiblePreferencesList = this.mPreferenceGroupController.createVisiblePreferencesList(this.mPreferenceGroup);
        final List<Preference> list = this.mPreferenceList;
        this.mPreferenceList = createVisiblePreferencesList;
        this.mPreferenceListInternal = arrayList;
        PreferenceManager preferenceManager = this.mPreferenceGroup.getPreferenceManager();
        if (preferenceManager != null && preferenceManager.getPreferenceComparisonCallback() != null) {
            final PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback = preferenceManager.getPreferenceComparisonCallback();
            DiffUtil.calculateDiff(new DiffUtil.Callback() { // from class: androidx.preference.PreferenceGroupAdapter.2
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return createVisiblePreferencesList.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceItemsTheSame((Preference) list.get(i), (Preference) createVisiblePreferencesList.get(i2));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceContentsTheSame((Preference) list.get(i), (Preference) createVisiblePreferencesList.get(i2));
                }
            }).dispatchUpdatesTo(this);
        } else {
            notifyDataSetChanged();
        }
        for (Preference preference2 : arrayList) {
            preference2.clearWasDetached();
        }
    }

    private void flattenPreferenceGroup(List<Preference> list, PreferenceGroup preferenceGroup) {
        preferenceGroup.sortPreferences();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            Preference preference = preferenceGroup.getPreference(i);
            list.add(preference);
            addPreferenceClassName(preference);
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.isOnSameScreenAsChildren()) {
                    flattenPreferenceGroup(list, preferenceGroup2);
                }
            }
            preference.setOnPreferenceChangeInternalListener(this);
        }
    }

    private PreferenceLayout createPreferenceLayout(Preference preference, PreferenceLayout preferenceLayout) {
        if (preferenceLayout == null) {
            preferenceLayout = new PreferenceLayout();
        }
        preferenceLayout.mName = preference.getClass().getName();
        preferenceLayout.mResId = preference.getLayoutResource();
        preferenceLayout.mWidgetResId = preference.getWidgetLayoutResource();
        return preferenceLayout;
    }

    private void addPreferenceClassName(Preference preference) {
        PreferenceLayout createPreferenceLayout = createPreferenceLayout(preference, null);
        if (this.mPreferenceLayouts.contains(createPreferenceLayout)) {
            return;
        }
        this.mPreferenceLayouts.add(createPreferenceLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mPreferenceList.size();
    }

    public Preference getItem(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.mPreferenceList.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (hasStableIds()) {
            return getItem(i).getId();
        }
        return -1L;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceChange(Preference preference) {
        int indexOf = this.mPreferenceList.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceHierarchyChange(Preference preference) {
        this.mHandler.removeCallbacks(this.mSyncRunnable);
        this.mHandler.post(this.mSyncRunnable);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceVisibilityChange(Preference preference) {
        if (this.mPreferenceListInternal.contains(preference) && !this.mPreferenceGroupController.onPreferenceVisibilityChange(preference)) {
            if (preference.isVisible()) {
                int i = -1;
                for (Preference preference2 : this.mPreferenceListInternal) {
                    if (preference.equals(preference2)) {
                        break;
                    } else if (preference2.isVisible()) {
                        i++;
                    }
                }
                int i2 = i + 1;
                this.mPreferenceList.add(i2, preference);
                notifyItemInserted(i2);
                return;
            }
            int size = this.mPreferenceList.size();
            int i3 = 0;
            while (i3 < size && !preference.equals(this.mPreferenceList.get(i3))) {
                if (i3 == size - 1) {
                    return;
                }
                i3++;
            }
            this.mPreferenceList.remove(i3);
            notifyItemRemoved(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        PreferenceLayout createPreferenceLayout = createPreferenceLayout(getItem(i), this.mTempPreferenceLayout);
        this.mTempPreferenceLayout = createPreferenceLayout;
        int indexOf = this.mPreferenceLayouts.indexOf(createPreferenceLayout);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.mPreferenceLayouts.size();
        this.mPreferenceLayouts.add(new PreferenceLayout(this.mTempPreferenceLayout));
        return size;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public PreferenceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PreferenceLayout preferenceLayout = this.mPreferenceLayouts.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(preferenceLayout.mResId, viewGroup, false);
        if (inflate.getBackground() == null) {
            ViewCompat.setBackground(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = preferenceLayout.mWidgetResId;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder, int i) {
        getItem(i).onBindViewHolder(preferenceViewHolder);
    }
}
