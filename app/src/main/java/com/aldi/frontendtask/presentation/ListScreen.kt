package com.aldi.frontendtask.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.aldi.frontendtask.data.DummyData
import com.aldi.frontendtask.model.Anime
import com.aldi.frontendtask.navigation.Screen
import com.aldi.frontendtask.presentation.component.AnimeItemRow

@Composable
fun ListScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    animes: List<Anime> = DummyData.animeList
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(animes, key = {it.id}) {
            AnimeItemRow(anime = it) { animeId ->
                navController.navigate(Screen.Detail.route + "/$animeId")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ListScreenPreview() {
    ListScreen(animes = DummyData.animeList, navController = rememberNavController())
}