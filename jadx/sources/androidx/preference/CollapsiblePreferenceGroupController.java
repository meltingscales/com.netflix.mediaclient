package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class CollapsiblePreferenceGroupController {
    private final Context mContext;
    private boolean mHasExpandablePreference = false;
    final PreferenceGroupAdapter mPreferenceGroupAdapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CollapsiblePreferenceGroupController(PreferenceGroup preferenceGroup, PreferenceGroupAdapter preferenceGroupAdapter) {
        this.mPreferenceGroupAdapter = preferenceGroupAdapter;
        this.mContext = preferenceGroup.getContext();
    }

    public List<Preference> createVisiblePreferencesList(PreferenceGroup preferenceGroup) {
        return createInnerVisiblePreferencesList(preferenceGroup);
    }

    private List<Preference> createInnerVisiblePreferencesList(PreferenceGroup preferenceGroup) {
        this.mHasExpandablePreference = false;
        boolean z = preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i = 0;
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            Preference preference = preferenceGroup.getPreference(i2);
            if (preference.isVisible()) {
                if (!z || i < preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList.add(preference);
                } else {
                    arrayList2.add(preference);
                }
                if (preference instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                    if (preferenceGroup2.isOnSameScreenAsChildren()) {
                        List<Preference> createInnerVisiblePreferencesList = createInnerVisiblePreferencesList(preferenceGroup2);
                        if (z && this.mHasExpandablePreference) {
                            throw new IllegalArgumentException("Nested expand buttons are not supported!");
                        }
                        for (Preference preference2 : createInnerVisiblePreferencesList) {
                            if (!z || i < preferenceGroup.getInitialExpandedChildrenCount()) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i++;
                        }
                    } else {
                        continue;
                    }
                } else {
                    i++;
                }
            }
        }
        if (z && i > preferenceGroup.getInitialExpandedChildrenCount()) {
            arrayList.add(createExpandButton(preferenceGroup, arrayList2));
        }
        this.mHasExpandablePreference |= z;
        return arrayList;
    }

    public boolean onPreferenceVisibilityChange(Preference preference) {
        if ((preference instanceof PreferenceGroup) || this.mHasExpandablePreference) {
            this.mPreferenceGroupAdapter.onPreferenceHierarchyChange(preference);
            return true;
        }
        return false;
    }

    private ExpandButton createExpandButton(final PreferenceGroup preferenceGroup, List<Preference> list) {
        ExpandButton expandButton = new ExpandButton(this.mContext, list, preferenceGroup.getId());
        expandButton.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() { // from class: androidx.preference.CollapsiblePreferenceGroupController.1
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(Preference preference) {
                preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
                CollapsiblePreferenceGroupController.this.mPreferenceGroupAdapter.onPreferenceHierarchyChange(preference);
                PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
                if (onExpandButtonClickListener != null) {
                    onExpandButtonClickListener.onExpandButtonClick();
                    return true;
                }
                return true;
            }
        });
        return expandButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ExpandButton extends Preference {
        private long mId;

        @Override // androidx.preference.Preference
        public long getId() {
            return this.mId;
        }

        ExpandButton(Context context, List<Preference> list, long j) {
            super(context);
            initLayout();
            setSummary(list);
            this.mId = j + 1000000;
        }

        private void initLayout() {
            setLayoutResource(R.layout.expand_button);
            setIcon(R.drawable.ic_arrow_down_24dp);
            setTitle(R.string.expand_button_title);
            setOrder(999);
        }

        private void setSummary(List<Preference> list) {
            ArrayList arrayList = new ArrayList();
            CharSequence charSequence = null;
            for (Preference preference : list) {
                CharSequence title = preference.getTitle();
                boolean z = preference instanceof PreferenceGroup;
                if (z && !TextUtils.isEmpty(title)) {
                    arrayList.add((PreferenceGroup) preference);
                }
                if (arrayList.contains(preference.getParent())) {
                    if (z) {
                        arrayList.add((PreferenceGroup) preference);
                    }
                } else if (!TextUtils.isEmpty(title)) {
                    charSequence = charSequence == null ? title : getContext().getString(R.string.summary_collapsed_preference_list, charSequence, title);
                }
            }
            setSummary(charSequence);
        }

        @Override // androidx.preference.Preference
        public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
            super.onBindViewHolder(preferenceViewHolder);
            preferenceViewHolder.setDividerAllowedAbove(false);
        }
    }
}