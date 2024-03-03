package com.mifos.mifosxdroid.online.groupslist

import com.mifos.objects.group.Group

/**
 * Created by Aditya Gupta on 08/08/23.
 */
sealed class GroupsListUiState {

    data class ShowLoadMoreGroups(val clients: List<Group>) : GroupsListUiState()

    data class ShowGroups(val clients: List<Group>) : GroupsListUiState()

    object UnregisterSwipeAndScrollListener : GroupsListUiState()

    data class ShowEmptyGroups(val image: Int) : GroupsListUiState()

    object ShowProgressbar : GroupsListUiState()

    data class ShowMessage(val message: Int) : GroupsListUiState()

    object ShowFetchingError : GroupsListUiState()
}