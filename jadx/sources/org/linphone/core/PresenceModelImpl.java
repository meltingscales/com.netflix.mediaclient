package org.linphone.core;

/* loaded from: classes6.dex */
public class PresenceModelImpl implements PresenceModel {
    private long mNativePtr;

    private native int addActivity(long j, long j2);

    private native int addNote(long j, String str, String str2);

    private native int addPerson(long j, long j2);

    private native int addService(long j, long j2);

    private native int clearActivities(long j);

    private native int clearNotes(long j);

    private native int clearPersons(long j);

    private native int clearServices(long j);

    private native Object getActivity(long j);

    private native int getBasicStatus(long j);

    private native String getContact(long j);

    private native long getNbActivities(long j);

    private native long getNbPersons(long j);

    private native long getNbServices(long j);

    private native Object getNote(long j, String str);

    private native Object getNthActivity(long j, long j2);

    private native Object getNthPerson(long j, long j2);

    private native Object getNthService(long j, long j2);

    private native long getTimestamp(long j);

    private native long newPresenceModelImpl();

    private native long newPresenceModelImpl(int i, String str);

    private native long newPresenceModelImpl(int i, String str, String str2, String str3);

    private native int setActivity(long j, int i, String str);

    private native int setBasicStatus(long j, int i);

    private native void setContact(long j, String str);

    private native void unref(long j);

    public long getNativePtr() {
        return this.mNativePtr;
    }

    protected PresenceModelImpl(long j) {
        this.mNativePtr = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PresenceModelImpl() {
        this.mNativePtr = newPresenceModelImpl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PresenceModelImpl(PresenceActivityType presenceActivityType, String str) {
        this.mNativePtr = newPresenceModelImpl(presenceActivityType.toInt(), str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PresenceModelImpl(PresenceActivityType presenceActivityType, String str, String str2, String str3) {
        this.mNativePtr = newPresenceModelImpl(presenceActivityType.toInt(), str, str2, str3);
    }

    protected void finalize() {
        unref(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public PresenceBasicStatus getBasicStatus() {
        return PresenceBasicStatus.fromInt(getBasicStatus(this.mNativePtr));
    }

    @Override // org.linphone.core.PresenceModel
    public int setBasicStatus(PresenceBasicStatus presenceBasicStatus) {
        return setBasicStatus(this.mNativePtr, presenceBasicStatus.toInt());
    }

    @Override // org.linphone.core.PresenceModel
    public long getTimestamp() {
        return getTimestamp(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public String getContact() {
        return getContact(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public void setContact(String str) {
        setContact(this.mNativePtr, str);
    }

    @Override // org.linphone.core.PresenceModel
    public PresenceActivity getActivity() {
        return (PresenceActivity) getActivity(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public int setActivity(PresenceActivityType presenceActivityType, String str) {
        return setActivity(this.mNativePtr, presenceActivityType.toInt(), str);
    }

    @Override // org.linphone.core.PresenceModel
    public long getNbActivities() {
        return getNbActivities(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public PresenceActivity getNthActivity(long j) {
        return (PresenceActivity) getNthActivity(this.mNativePtr, j);
    }

    @Override // org.linphone.core.PresenceModel
    public int addActivity(PresenceActivity presenceActivity) {
        return addActivity(this.mNativePtr, presenceActivity.getNativePtr());
    }

    @Override // org.linphone.core.PresenceModel
    public int clearActivities() {
        return clearActivities(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public PresenceNote getNote(String str) {
        return (PresenceNote) getNote(this.mNativePtr, str);
    }

    @Override // org.linphone.core.PresenceModel
    public int addNote(String str, String str2) {
        return addNote(this.mNativePtr, str, str2);
    }

    @Override // org.linphone.core.PresenceModel
    public int clearNotes() {
        return clearNotes(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public long getNbServices() {
        return getNbServices(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public PresenceService getNthService(long j) {
        return (PresenceService) getNthService(this.mNativePtr, j);
    }

    @Override // org.linphone.core.PresenceModel
    public int addService(PresenceService presenceService) {
        return addService(this.mNativePtr, presenceService.getNativePtr());
    }

    @Override // org.linphone.core.PresenceModel
    public int clearServices() {
        return clearServices(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public long getNbPersons() {
        return getNbPersons(this.mNativePtr);
    }

    @Override // org.linphone.core.PresenceModel
    public PresencePerson getNthPerson(long j) {
        return (PresencePerson) getNthPerson(this.mNativePtr, j);
    }

    @Override // org.linphone.core.PresenceModel
    public int addPerson(PresencePerson presencePerson) {
        return addPerson(this.mNativePtr, presencePerson.getNativePtr());
    }

    @Override // org.linphone.core.PresenceModel
    public int clearPersons() {
        return clearPersons(this.mNativePtr);
    }
}
