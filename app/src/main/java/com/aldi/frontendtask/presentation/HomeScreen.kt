package com.aldi.frontendtask.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api

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
import com.aldi.frontendtask.presentation.component.AnimeItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    anime: List<Anime> = DummyData.animeList,
)   {
    LazyColumn(
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(8.dp),
                modifier = modifier
            ) {
                items(anime, key = {it.id}) {
                    AnimeItemRow(anime = it) { animeId ->
                        navController.navigate(Screen.Detail.route + "/$animeId")
                    }
                }
            }
        }
        items(anime, key = {it.id}) {
            AnimeItem(anime = it) { animeId ->
                navController.navigate(Screen.Detail.route + "/$animeId")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    val navController = rememberNavController() // Initialize NavController for the preview
    HomeScreen(navController = navController, anime = DummyData.animeList)
}