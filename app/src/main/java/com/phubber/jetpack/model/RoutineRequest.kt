/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.phubber.jetpack.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class RoutineRequest {

    suspend fun requestSync() {
        coroutineScope {

        }
    }

    suspend fun showSomeData() = coroutineScope {

        val data = async(Dispatchers.IO) { // <- extension on current scope
//            ... load some UI data for the Main thread ...
        }

        withContext(Dispatchers.Main) {
//            doSomeWork()
            val result = data.await()
//            display(result)
        }
    }

}