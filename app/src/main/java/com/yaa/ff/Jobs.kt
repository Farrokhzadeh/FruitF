package com.yaa.ff

import android.database.Cursor

interface Jobs {
    fun addVersion (file2Write: String)
    fun gatherData(cur: Cursor, file2Write: String)
    fun saveData(zipUtils: ZipUtils)

}