package com.aldi.frontendtask.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aldi.frontendtask.R
import com.aldi.frontendtask.model.Anime

@Composable
fun AnimeItemRow(
    anime: Anime,
    modifier: Modifier = Modifier,
    onClick: (Int) -> Unit
) {
    Card (
        modifier = modifier
            .padding(8.dp)
            .clickable { onClick(anime.id) }
            .width(100.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(8.dp)
    ){
        Column(
            modifier = modifier
                .clickable {
                    onClick(anime.id)
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = anime.image),
                contentDescription = anime.title,
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(6.dp)),
                contentScale = ContentScale.Crop
            )

            Text(
                text = anime.title,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewAnimeItemRow() {
    AnimeItemRow(
        anime = Anime(
            id = 1,
            title = "Attack on Titan",
            description = "A thrilling story about humanity's struggle against giant titans.",
            image = R.drawable.aot,
            genre = "Action, Fantasy",
            episodes = 75,

        ),
        onClick = {}
    )
}