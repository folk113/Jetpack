/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.phubber.jetpack.ui.collection

import android.util.Log
import androidx.collection.arraySetOf
import androidx.lifecycle.ViewModel

class CollectionViewModel : ViewModel() {
    // Combine 2 ArraySets into 1.
    private val combinedArraySet = arraySetOf(1, 2, 3) + arraySetOf(4, 5, 6)
    // Combine with numbers to create a new sets.
    val newArraySet = combinedArraySet + 7 + 8
    fun print() {
        combinedArraySet.forEach {
            Log.d("abc", it.toString() + "");
        }
    }

}