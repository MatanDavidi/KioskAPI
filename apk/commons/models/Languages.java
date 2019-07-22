package com.valora.kkiosk.commons.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo21489bv = {1, 0, 3}, mo21490d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo21491d2 = {"Lcom/valora/kkiosk/commons/models/Languages;", "", "Languages", "", "", "(Ljava/util/Map;)V", "getLanguages", "()Ljava/util/Map;", "getLanguageKeys", "", "app_release"}, mo21492k = 1, mo21493mv = {1, 1, 15})
/* compiled from: User.kt */
public final class Languages {
    @NotNull
    private final Map<String, String> Languages;

    public Languages(@NotNull Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "Languages");
        this.Languages = map;
    }

    @NotNull
    public final Map<String, String> getLanguages() {
        return this.Languages;
    }

    @NotNull
    public final List<String> getLanguageKeys() {
        Iterable<String> keySet = this.Languages.keySet();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
        for (String split$default : keySet) {
            arrayList.add((String) StringsKt.split$default((CharSequence) split$default, new String[]{"-"}, false, 0, 6, (Object) null).get(0));
        }
        return (List) arrayList;
    }
}
