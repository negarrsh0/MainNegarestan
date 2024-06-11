package com.example.mainnegarestan.screen.component_lists

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mainnegarestan.screen.component.Loading
import com.example.mainnegarestan.screen.list_items_screens.CarpetPanelListItem
import com.example.mainnegarestan.viewmodel.product.CarpetPanelViewModel

@Composable
fun CarpetPanelCategoryListView(viewModel: CarpetPanelViewModel= hiltViewModel()) {

    var dataList by remember { mutableStateOf(viewModel.dataList) }
    var isLoading by remember { mutableStateOf(viewModel.isLoading) }

    if (isLoading.value){
        Loading(width = 300.dp, 5)
    }else{
        LazyRow(){
            items(dataList.value.size){index ->
                CarpetPanelListItem(dataList.value[index])
            }
        }
    }
}