package com.mifos.mifosxdroid.online.datatable

import com.mifos.objects.noncore.DataTable
import rx.Observable

/**
 * Created by Aditya Gupta on 08/08/23.
 */
interface DataTableRepository {

    fun getDataTable(tableName: String?): Observable<List<DataTable>>

}