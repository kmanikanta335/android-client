package com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction

import com.mifos.objects.PaymentTypeOption
import com.mifos.objects.accounts.savings.SavingsAccountTransactionRequest
import com.mifos.objects.accounts.savings.SavingsAccountTransactionResponse
import rx.Observable

/**
 * Created by Aditya Gupta on 16/08/23.
 */
interface SyncSavingsAccountTransactionRepository {

    fun allSavingsAccountTransactions(): Observable<List<SavingsAccountTransactionRequest>>

    fun paymentTypeOption(): Observable<List<PaymentTypeOption>>

    fun processTransaction(
        savingsAccountType: String?, savingsAccountId: Int, transactionType: String?,
        request: SavingsAccountTransactionRequest
    ): Observable<SavingsAccountTransactionResponse>

    fun deleteAndUpdateTransactions(
        savingsAccountId: Int
    ): Observable<List<SavingsAccountTransactionRequest>>

    fun updateLoanRepaymentTransaction(
        savingsAccountTransactionRequest: SavingsAccountTransactionRequest
    ): Observable<SavingsAccountTransactionRequest>
}