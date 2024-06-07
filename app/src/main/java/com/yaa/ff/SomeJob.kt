package com.yaa.ff

import android.database.Cursor

class SomeJob : Thread(), Jobs {
    override fun addVersion(file2Write: String) {
        TODO("Not yet implemented")
    }

    override fun gatherData(cur: Cursor, file2Write: String) {
        TODO("Not yet implemented")
    }

    override fun saveData(zipUtils: ZipUtils) {
        zipUtils.makeZipFromFile()
        zipUtils.makeZipFromFolder()
    }

}