package com.aldi.frontendtask.data

import com.aldi.frontendtask.R
import com.aldi.frontendtask.model.Anime

object DummyData {
    val animeList = listOf(
        Anime(
            id = 1,
            title = "Attack on Titan",
            image = R.drawable.aot,
            description = "Eren and his friends join the Survey Corps to fight Titans and uncover secrets of their world.",
            genre = "Action, Dark Fantasy",
            episodes = 75,

        ),
        Anime(
            id = 2,
            title = "Demon Slayer",
            image = R.drawable.kny,
            description = "Tanjiro Kamado fights demons to save his sister and avenge his family.",
            genre = "Action, Adventure",
            episodes = 26,

        ),
        Anime(
            id = 3,
            title = "My Hero Academia",
            image = R.drawable.mha,
            description = "Izuku Midoriya, a boy born without superpowers, enrolls in a hero academy to become a pro hero.",
            genre = "Action, Superhero",
            episodes = 113,

        ),
        Anime(
            id = 4,
            title = "Naruto Shippuden",
            image = R.drawable.naruto,
            description = "Naruto Uzumaki strives to become the strongest ninja and protect his village.",
            genre = "Adventure, Martial Arts",
            episodes = 500,

        ),
        Anime(
            id = 5,
            title = "One Piece",
            image = R.drawable.onepiece,
            description = "Monkey D. Luffy and his pirate crew sail the seas in search of the legendary One Piece.",
            genre = "Adventure, Fantasy",
            episodes = 1000,

        ),
        Anime(
            id = 6,
            title = "Death Note",
            image = R.drawable.deathnote,
            description = "A high school student gains a notebook that grants him the power to kill anyone by writing their name.",
            genre = "Thriller, Supernatural",
            episodes = 37,

        ),
        Anime(
            id = 7,
            title = "Fullmetal Alchemist: Brotherhood",
            image = R.drawable.fma,
            description = "Two brothers search for the Philosopher's Stone to restore their bodies after a failed alchemy experiment.",
            genre = "Adventure, Fantasy",
            episodes = 64,

        ),
        Anime(
            id = 8,
            title = "Sword Art Online",
            image = R.drawable.sao,
            description = "Players get trapped in a virtual reality MMORPG where death in the game means death in real life.",
            genre = "Adventure, Sci-Fi",
            episodes = 96,

        ),
        Anime(
            id = 9,
            title = "Tokyo Ghoul",
            image = R.drawable.tokyoghoul,
            description = "Kaneki, a human-turned-ghoul, struggles to adapt to his new life and navigate between human and ghoul worlds.",
            genre = "Horror, Dark Fantasy",
            episodes = 24,

        ),
        Anime(
            id = 10,
            title = "Hunter x Hunter",
            image = R.drawable.hxh,
            description = "Gon Freecss sets out to become a Hunter to find his missing father.",
            genre = "Adventure, Fantasy",
            episodes = 148,

        )
    )


}