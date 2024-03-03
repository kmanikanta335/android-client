package com.mifos.mifosxdroid.online.clientlist

import com.mifos.objects.client.Client

/**
 * Created by Aditya Gupta on 08/08/23.
 */
sealed class ClientListUiState {

    data class ShowProgressbar(val state: Boolean) : ClientListUiState()

    data class ShowMessage(val message: Int) : ClientListUiState()

    object ShowError : ClientListUiState()

    object UnregisterSwipeAndScrollListener : ClientListUiState()

    data class ShowEmptyClientList(val message: Int) : ClientListUiState()

    data class ShowLoadMoreClients(val clients: List<Client>) : ClientListUiState()

    data class ShowClientList(val clients: List<Client>) : ClientListUiState()
}