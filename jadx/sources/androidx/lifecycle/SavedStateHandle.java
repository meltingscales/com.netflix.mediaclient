package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8812dzl;
import o.dpD;
import o.dqE;

/* loaded from: classes2.dex */
public final class SavedStateHandle {
    private final Map<String, InterfaceC8812dzl<Object>> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) {
        Map l;
        C8632dsu.c((Object) savedStateHandle, "");
        l = dqE.l(savedStateHandle.savedStateProviders);
        for (Map.Entry entry : l.entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(savedStateHandle.regular.get(str));
        }
        return BundleKt.bundleOf(dpD.a("keys", arrayList), dpD.a("values", arrayList2));
    }

    public SavedStateHandle(Map<String, ? extends Object> map) {
        C8632dsu.c((Object) map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(map);
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }

    public final <T> T get(String str) {
        C8632dsu.c((Object) str, "");
        try {
            return (T) this.regular.get(str);
        } catch (ClassCastException unused) {
            remove(str);
            return null;
        }
    }

    public final <T> void set(String str, T t) {
        C8632dsu.c((Object) str, "");
        if (!Companion.validateValue(t)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            C8632dsu.d(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t);
        } else {
            this.regular.put(str, t);
        }
        InterfaceC8812dzl<Object> interfaceC8812dzl = this.flows.get(str);
        if (interfaceC8812dzl == null) {
            return;
        }
        interfaceC8812dzl.d(t);
    }

    public final <T> T remove(String str) {
        C8632dsu.c((Object) str, "");
        T t = (T) this.regular.remove(str);
        SavingStateLiveData<?> remove = this.liveDatas.remove(str);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(str);
        return t;
    }

    /* loaded from: classes5.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                InterfaceC8812dzl interfaceC8812dzl = (InterfaceC8812dzl) savedStateHandle.flows.get(this.key);
                if (interfaceC8812dzl != null) {
                    interfaceC8812dzl.d(t);
                }
            }
            super.setValue(t);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    C8632dsu.a(str, "");
                    hashMap.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C8632dsu.d(obj);
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        public final boolean validateValue(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                C8632dsu.d(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
